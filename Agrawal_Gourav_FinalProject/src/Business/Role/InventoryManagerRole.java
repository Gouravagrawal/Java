/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RetailerEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.InventoryManagerRole.InventoryManagerWorkAreaJPanel;
import javax.swing.JPanel;


/**
 *
 * @author gourav
 */
public class InventoryManagerRole extends Role {

   @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
      return new InventoryManagerWorkAreaJPanel(userProcessContainer, account.getEmployee(),(RetailerEnterprise)enterprise, business);
              
    

}
}