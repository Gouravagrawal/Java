/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.AmazonEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.CustomerManagerRole.CustomerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author gourav
 */
public class CustomerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CustomerWorkAreaJPanel(userProcessContainer, account,business,(AmazonEnterprise)enterprise);
    }
    
}
