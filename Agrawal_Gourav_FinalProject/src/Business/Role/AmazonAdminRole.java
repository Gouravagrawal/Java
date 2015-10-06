/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.EcoSystem;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.EnterpriseAdministrativeRole.AmazonAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author gourav
 */
public class AmazonAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AmazonAdminWorkAreaJPanel(userProcessContainer, enterprise);
    }

    
    
}
