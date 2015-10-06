/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.AmazonFinanceOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author gourav
 */
public abstract class Enterprise extends Organization{

    private OrganizationDirectory organizationDirectory;
    private AmazonFinanceOrganization financeOrganization;
   
    
    public enum EnterpriseType{
        AMAZON("Amazon"),RETAILER("Retailer");
        
        private String type;

        private EnterpriseType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
        
        public String toString(){
            return type;
        }
    }
    
    private EnterpriseType enterpriseType;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
       
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public AmazonFinanceOrganization getFinanceOrganization() {
        return financeOrganization;
    }

    public void setFinanceOrganization(AmazonFinanceOrganization financeOrganization) {
        this.financeOrganization = financeOrganization;
    }

    
    
    
}
