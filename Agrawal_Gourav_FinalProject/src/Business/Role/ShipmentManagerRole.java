/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RetailerEnterprise;
import Business.Organization.Organization;
import Business.Organization.ShipmentOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.ShipmentManagerRole.ShipmentWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author gourav
 */
public class ShipmentManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ShipmentWorkAreaJPanel(userProcessContainer, account,(ShipmentOrganization)organization, (RetailerEnterprise)enterprise,business);
    }
    
    
}
