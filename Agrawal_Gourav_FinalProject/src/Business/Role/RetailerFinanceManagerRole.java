/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RetailerEnterprise;
import Business.Organization.Organization;
import Business.Organization.RetailerFinanceOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.FinanceManagerRole.RetailerFinanceManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author gourav
 */
public class RetailerFinanceManagerRole extends Role{

    @Override
   public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
       return new RetailerFinanceManagerWorkAreaJPanel(userProcessContainer, account,(RetailerFinanceOrganization)organization, (RetailerEnterprise)enterprise);
       
    }
    
}
