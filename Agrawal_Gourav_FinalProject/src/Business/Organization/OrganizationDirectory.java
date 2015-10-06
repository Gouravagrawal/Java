/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Customer.getValue())){
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.AmazonFinance.getValue())){
            organization = new AmazonFinanceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.AmazonOrder.getValue())){
            organization = new AmazonOrderOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Inventory.getValue())){
            organization = new InventoryOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Shipment.getValue())){
            organization = new ShipmentOrganization();
            organizationList.add(organization);
        }
        
         else if (type.getValue().equals(Type.RetailerFinance.getValue())){
            organization = new RetailerFinanceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.RetailerOrder.getValue())){
            organization = new RetailerOrderOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}