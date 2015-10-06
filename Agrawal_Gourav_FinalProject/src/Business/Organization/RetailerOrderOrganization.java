/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Order.MasterOrderCatalogue;
import Business.Role.RetailerOrderManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class RetailerOrderOrganization extends Organization{
    private MasterOrderCatalogue masterordercatlog;

    public MasterOrderCatalogue getMasterordercatlog() {
        return masterordercatlog;
    }
    
    
    public RetailerOrderOrganization() {
        super(Organization.Type.RetailerOrder.getValue());
        masterordercatlog=new MasterOrderCatalogue();
    }

     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RetailerOrderManagerRole());
        return roles;
    }

   
     
    
}
