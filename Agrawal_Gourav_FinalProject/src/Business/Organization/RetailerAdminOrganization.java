/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.RetailerAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class RetailerAdminOrganization extends Organization{

    public RetailerAdminOrganization(){
        
        super(Type.RetailerAdmin.getValue());
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList<>();
        roles.add(new RetailerAdminRole());
        return roles;
       
    }
    
    
    
    
}
