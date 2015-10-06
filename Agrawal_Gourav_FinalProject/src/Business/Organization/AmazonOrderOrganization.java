/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Order.MasterOrderCatalogue;
import Business.Role.AmazonOrderManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class AmazonOrderOrganization extends Organization{
    private MasterOrderCatalogue masterordercatlog;

    public MasterOrderCatalogue getMasterordercatlog() {
        return masterordercatlog;
    }

    public void setMasterordercatlog(MasterOrderCatalogue masterordercatlog) {
        this.masterordercatlog = masterordercatlog;
    }

    
    public AmazonOrderOrganization() {
        super(Organization.Type.AmazonOrder.getValue());
        masterordercatlog=new MasterOrderCatalogue();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AmazonOrderManagerRole());
        return roles;
    }
     
   
    
    
}
