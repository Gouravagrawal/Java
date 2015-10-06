/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.ShipmentManagerRole;
import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class ShipmentOrganization extends Organization{

    public ShipmentOrganization(){
        
        super(Organization.Type.Shipment.getValue());
                }
    @Override
    public ArrayList<Role> getSupportedRole() {
        
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ShipmentManagerRole());
        return roles;
    
    }
}