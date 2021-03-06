/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RetailerEnterprise;
import Business.Organization.Organization;
import Business.Organization.RetailerOrderOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.ShipmentManagerRole.RetailerOrderWorkAreaJPanel;

import javax.swing.JPanel;

/**
 *
 * @author gourav
 */
public class RetailerOrderManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new RetailerOrderWorkAreaJPanel(userProcessContainer, account, (RetailerOrderOrganization)organization,(RetailerEnterprise)enterprise, business);
    }
}
