/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.EcoSystem;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.OrderManagerRole.AmazonOrderManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author gourav
 */
public class AmazonOrderManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AmazonOrderManagerWorkAreaJPanel(userProcessContainer, account, organization,enterprise, business);
    }
    
}
