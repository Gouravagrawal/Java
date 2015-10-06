/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FinanceManagerRole;

import Business.EcoSystem;
import Business.Enterprise.AmazonEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RetailerEnterprise;
import Business.Network.Network;
import Business.Order.OrderItem;
import Business.Organization.AmazonFinanceOrganization;
import Business.Organization.Organization;
import Business.Organization.RetailerFinanceOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AmazonFinanceWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gourav
 */
public class AmazonPaymentDivisonJPanel extends javax.swing.JPanel {

     private JPanel userProcessContainer;
    private AmazonFinanceOrganization org;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    /**
     * Creates new form AmazonPaymentDivisonJPanel
     */
    public AmazonPaymentDivisonJPanel(JPanel userProcessContainer,UserAccount userAccount,AmazonFinanceOrganization org,AmazonEnterprise enterprise,EcoSystem ecosystem) {
        initComponents();
          this.userProcessContainer = userProcessContainer;
        this.org = org;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.system=ecosystem;
        
        populateAccountTable();
        }
    
    private void populateAccountTable(){
     
     DefaultTableModel model = (DefaultTableModel)PaymentDivisionTable.getModel();
        model.setRowCount(0);
        
        AmazonFinanceWorkRequest afwr=null;

        
        for(WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()){
            
            if( wr instanceof AmazonFinanceWorkRequest){
                
                
                 afwr = (AmazonFinanceWorkRequest)wr;
                 
                double commision=afwr.getInvoice().getOrder().getTotal()*0.10;
              for(  OrderItem oi: afwr.getInvoice().getOrder().getOrderItemList()){
                 
                  Enterprise ent= oi.getProduct().getEnterprise();
                  double total=oi.getProduct().getTargetP()*oi.getQuantity();
              
                
             Object[] row = new Object[4];
            row[0] = afwr;
            row[1]= total;
            row[2] = commision;
            row[3] = ent;
          
            model.addRow(row);
                
                
                }
                
                
            }
                
        }

        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        PaymentDivisionTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        PaymentDivisionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Invoice Number", "Total Price", "Retailer Commision", "Retailer Name"
            }
        ));
        jScrollPane1.setViewportView(PaymentDivisionTable);

        jButton1.setText("Process Payment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("AMAZON PAYMENT DIVISION WORK AREA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(88, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow= PaymentDivisionTable.getSelectedRow();
        if(selectedRow<0){
            return;
        }
        
          AmazonFinanceWorkRequest aa=(AmazonFinanceWorkRequest)PaymentDivisionTable.getValueAt(selectedRow, 0);
          
          RetailerEnterprise smm= null;
          
          for(Network net : system.getNetworkList()){
              for(Network state : net.getSubnetworklist()){
                  for(Network city : state.getSubnetworklist()){
                      
                      for(Enterprise ent : city.getEnterpriseDirectory().getEnterpriseList()){
                if( ent instanceof RetailerEnterprise){
                    
                   smm = (RetailerEnterprise)ent;
                    
                    RetailerFinanceOrganization rfo = null;
                    for(Organization org: smm.getOrganizationDirectory().getOrganizationList()){
                            
                        if(org instanceof RetailerFinanceOrganization){
                            rfo=(RetailerFinanceOrganization)org;
                            
                            aa.setStatus("Payment Send");
                            rfo.getWorkQueue().addWorkRequest(aa);
                            
                        }
                    }
                }
                      }
                  }
                      }
                  }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PaymentDivisionTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
