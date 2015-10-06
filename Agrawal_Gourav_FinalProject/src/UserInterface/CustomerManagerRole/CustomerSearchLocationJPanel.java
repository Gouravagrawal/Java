/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerManagerRole;

import Business.Customer.BrowseProductsJPanel;
import Business.EcoSystem;
import Business.Enterprise.AmazonEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RetailerEnterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author gourav
 */
public class CustomerSearchLocationJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
private UserAccount userAccount;
private EcoSystem sys;
private AmazonEnterprise aee;
    /**
     * Creates new form CustomerSearchLocationJPanel
     */
    public CustomerSearchLocationJPanel(JPanel userProcessContainer, UserAccount userAccount,EcoSystem sys,AmazonEnterprise aee) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.sys=sys;
        this.aee=aee;
        
        CountryJComboBox.removeAllItems();
        stateJComboBox.removeAllItems();
        cityJComboBox2.removeAllItems();
         //CustomerNameJLabel.setText(userAccount.getCustomer().getFirstName());
         
         populateCountryCombo();
    }
 private void populateCountryCombo()
    {
        CountryJComboBox.removeAllItems();
        for (Network country : sys.getNetworkList())
        {
            CountryJComboBox.addItem(country);
        }
    }
    
    private void populateStateCombo(Network net)
    {
        stateJComboBox.removeAllItems();
        for (Network state : net.getSubnetworklist())
        {
            stateJComboBox.addItem(state);
        }
    }
    
    private void populateCityCombo(Network net)
    {
        cityJComboBox2.removeAllItems();
        for (Network city : net.getSubnetworklist())
        {
            cityJComboBox2.addItem(city);
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

        brwseProductJBUtton = new javax.swing.JButton();
        cityJComboBox2 = new javax.swing.JComboBox();
        stateJComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        CountryJComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brwseProductJBUtton.setText("Browse Product Catalog>>");
        brwseProductJBUtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brwseProductJBUttonActionPerformed(evt);
            }
        });
        add(brwseProductJBUtton, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 223, -1, -1));

        cityJComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cityJComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityJComboBox2ActionPerformed(evt);
            }
        });
        add(cityJComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 158, 116, -1));

        stateJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        stateJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateJComboBoxActionPerformed(evt);
            }
        });
        add(stateJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 104, 116, -1));

        jLabel6.setText("City");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 161, -1, -1));

        CountryJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CountryJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountryJComboBoxActionPerformed(evt);
            }
        });
        add(CountryJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 62, 116, -1));

        jLabel5.setText("State");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 114, -1, -1));

        jLabel1.setText("Select Country");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 72, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setText("CUSTOMER LOCATION");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 11, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void brwseProductJBUttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brwseProductJBUttonActionPerformed
        // TODO add your handling code here:
       String country =(String.valueOf(CountryJComboBox.getSelectedItem()));
        
        String state =(String.valueOf(stateJComboBox.getSelectedItem()));
        
        String city =(String.valueOf(cityJComboBox2.getSelectedItem()));
        
        RetailerEnterprise REnt= null;
        
        Network n = sys.searchName(country, state, city);
        
        for(Enterprise enterprise : n.getEnterpriseDirectory().getEnterpriseList())
            if(enterprise instanceof RetailerEnterprise){
                
                REnt =(RetailerEnterprise) enterprise;
                
                if(n.getNetworkname().equalsIgnoreCase(String.valueOf(cityJComboBox2.getSelectedItem()))){
                    
                   
        BrowseProductsJPanel bpjp = new BrowseProductsJPanel(userProcessContainer,userAccount,sys,aee,n,REnt);
        userProcessContainer.add("BrowseProductsJPanel",bpjp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
                    
                }
                
            } 
        
    }//GEN-LAST:event_brwseProductJBUttonActionPerformed

    private void cityJComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityJComboBox2ActionPerformed
        // TODO add your handling code here:

      

    }//GEN-LAST:event_cityJComboBox2ActionPerformed

    private void stateJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateJComboBoxActionPerformed
        // TODO add your handling code here:

        cityJComboBox2.removeAll();
        Network n=(Network)stateJComboBox.getSelectedItem();
        if(n!=null){

            populateCityCombo(n);
        }

    }//GEN-LAST:event_stateJComboBoxActionPerformed

    private void CountryJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountryJComboBoxActionPerformed
        // TODO add your handling code here:
        //stateJComboBox.setEnabled(true);
        stateJComboBox.removeAllItems();

        Network n=(Network)CountryJComboBox.getSelectedItem();
        if(n!=null){

            populateStateCombo(n);
        }

    }//GEN-LAST:event_CountryJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CountryJComboBox;
    private javax.swing.JButton brwseProductJBUtton;
    private javax.swing.JComboBox cityJComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox stateJComboBox;
    // End of variables declaration//GEN-END:variables
}
