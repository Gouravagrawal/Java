/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.InventoryOrganization;
//import Business.Organization.RetailerFinanceOrganization;
import Business.Organization.RetailerOrderOrganization;
import Business.Organization.ShipmentOrganization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class RetailerEnterprise extends Enterprise {
     private String city;
     private String retailerName;
     private InventoryOrganization inventoryOrganization;
     //private RetailerFinanceOrganization retFinanceOrg;
     private RetailerOrderOrganization retOrderORganization;
     private ShipmentOrganization shipmentOrganization;

    public InventoryOrganization getInventoryOrganization() {
        return inventoryOrganization;
    }

    public void setInventoryOrganization(InventoryOrganization inventoryOrganization) {
        this.inventoryOrganization = inventoryOrganization;
    }
    
    
     public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRetailerName() {
        return retailerName;
    }

    public void setRetailerName(String retailerName) {
        this.retailerName = retailerName;
    }

//    public RetailerFinanceOrganization getRetFinanceOrg() {
//        return retFinanceOrg;
//    }
//
//    public void setRetFinanceOrg(RetailerFinanceOrganization retFinanceOrg) {
//        this.retFinanceOrg = retFinanceOrg;
//    }

    public RetailerOrderOrganization getRetOrderORganization() {
        return retOrderORganization;
    }

    public void setRetOrderORganization(RetailerOrderOrganization retOrderORganization) {
        this.retOrderORganization = retOrderORganization;
    }

    public ShipmentOrganization getShipmentOrganization() {
        return shipmentOrganization;
    }

    public void setShipmentOrganization(ShipmentOrganization shipmentOrganization) {
        this.shipmentOrganization = shipmentOrganization;
    }

        
    public RetailerEnterprise(String name){
        super(name,EnterpriseType.RETAILER);
    //inventoryOrganization=new InventoryOrganization();
}

    @Override
    public ArrayList<Role> getSupportedRole() {
       // ArrayList<Role> roles=new ArrayList<>();
       // roles.add(new RetailerAdminRole());
        return null;
        
    }
    
}
