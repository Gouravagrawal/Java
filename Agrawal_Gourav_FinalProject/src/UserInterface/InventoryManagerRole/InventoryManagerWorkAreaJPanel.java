/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.InventoryManagerRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.RetailerEnterprise;
//import Business.Retailer.X____Retailer;
import Business.Organization.InventoryOrganization;
//import Business.Product.Product;
import Business.UserAccount.UserAccount;
import UserInterface.EnterpriseAdministrativeRole.ManageProductCatalogJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
//import Business.Product.ProductDirectory;


/**
 *
 * @author gourav
 */
public class InventoryManagerWorkAreaJPanel extends javax.swing.JPanel {
  private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private InventoryOrganization iog;
    private RetailerEnterprise ent;
    private Employee empp;
  
    
    /**
     * Creates new form InventoryManagerWorkAreaJPanel
     */
    public InventoryManagerWorkAreaJPanel(JPanel userProcessContainer,Employee emp,RetailerEnterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
       // this.u = account;
        this.business = business;
        //this.iog = (InventoryOrganization)organization;
        this.ent=enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageProductCatalog = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        manageProductCatalog.setText("ManageProduct Catalog");
        manageProductCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProductCatalogActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("INVENTORY MANAGER WORK AREA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(manageProductCatalog))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addGap(45, 45, 45)
                .addComponent(manageProductCatalog)
                .addContainerGap(218, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageProductCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProductCatalogActionPerformed
        // TODO add your handling code here:
        ManageProductCatalogJPanel mpcjp = new ManageProductCatalogJPanel(userProcessContainer, ent);
        userProcessContainer.add(" ManageProductCatalogJPanel",mpcjp);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_manageProductCatalogActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton manageProductCatalog;
    // End of variables declaration//GEN-END:variables
}
