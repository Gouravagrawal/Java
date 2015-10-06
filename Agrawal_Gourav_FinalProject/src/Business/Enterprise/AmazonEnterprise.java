/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.AmazonFinanceOrganization;
import Business.Organization.CustomerOrganization;
import Business.Organization.AmazonOrderOrganization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class AmazonEnterprise extends Enterprise{
 private CustomerOrganization customerOrganization;
 private AmazonOrderOrganization orderOrg;
 private AmazonFinanceOrganization adminFinanceOrg;
    
    
    public AmazonEnterprise(String name) {
        super(name, EnterpriseType.AMAZON);
        
         //customerOrganization=new CustomerOrganization();
         //orderOrg=new AmazonOrderOrganization();
    }

    public CustomerOrganization getCustomerOrganization() {
        return customerOrganization;
    }

    public void setCustomerOrganization(CustomerOrganization customerOrganization) {
        this.customerOrganization = customerOrganization;
    }

    public AmazonOrderOrganization getOrderOrg() {
        return orderOrg;
    }

    public void setOrderOrg(AmazonOrderOrganization orderOrg) {
        this.orderOrg = orderOrg;
    }

    public AmazonFinanceOrganization getAdminFinanceOrg() {
        return adminFinanceOrg;
    }

    public void setAdminFinanceOrg(AmazonFinanceOrganization adminFinanceOrg) {
        this.adminFinanceOrg = adminFinanceOrg;
    }


     
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
   
    
}
 