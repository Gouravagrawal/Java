/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import Business.EcoSystem;
import Business.WorkQueue.NewAccountWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gourav
 */
public class ViewStatusJPanel extends javax.swing.JPanel {
 private JPanel userProcessContainer;
    private EcoSystem system;
    private String nn;
    private String pp;
    
    /**
     * Creates new form ViewStatusJPanel
     */
    public ViewStatusJPanel(JPanel upc,EcoSystem system,String nn) {
        initComponents();
          this.userProcessContainer=upc;
        this.system=system;
        this.nn=nn;
        this.pp=pp;
        
        
        userNameJTextField.setText(nn);
        //passwordJTextField.setText(pp);
    }
    
    public void populate(WorkRequest workRequest)
    {

        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);

         Object obj[] = new Object[3];
         obj[0] = workRequest.getMessage();
         
         obj[1] = workRequest.getStatus();
         obj[2] = ((NewAccountWorkRequest)workRequest).getTestResult();
        model.addRow(obj);
            }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        inventoryManagerRole1 = new Business.Role.InventoryManagerRole();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        IDJTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        searchJButton = new javax.swing.JButton();
        userNameJTextField = new javax.swing.JTextField();

        jButton1.setText("<<Back");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 302, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setText("VIEW STATUS WORK AREA");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 11, -1, -1));

        jLabel1.setText("ID:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 58, 29, -1));
        add(IDJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 55, 54, -1));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 95, 375, 97));

        jLabel2.setText("UserName:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 213, -1, -1));

        searchJButton.setText("Search>>");
        searchJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJButtonActionPerformed(evt);
            }
        });
        add(searchJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 54, -1, -1));

        userNameJTextField.setEditable(false);
        userNameJTextField.setEnabled(false);
        add(userNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 210, 94, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed

        int ID = Integer.parseInt(IDJTextField.getText());
      /*  for(Organization organization: business.getOrganizationDirectory().getOrganizationList()){
            WorkRequest workRequest =  organization.getWorkQueue().searchByID(ID);
*/
           
        
        WorkRequest workRequest=system.getWorkQueue().searchByID(ID);
         if(workRequest!=null)
            {
                userNameJTextField.setText(workRequest.getUsername());
                //passwordJTextField.setText(workRequest.getPassword());
                populate(workRequest);
            }
         else{
             
             JOptionPane.showMessageDialog(null, "Sorry..Invalid ID");
            return; 
         }


        // TODO add your handling code here:
    }//GEN-LAST:event_searchJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDJTextField;
    private Business.Role.InventoryManagerRole inventoryManagerRole1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchJButton;
    private javax.swing.JTextField userNameJTextField;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}