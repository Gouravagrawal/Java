/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Invoice.InvoiceDirectory;
import Business.Role.AmazonFinanceManagerRole;
import Business.Role.RetailerFinanceManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class RetailerFinanceOrganization extends Organization{
    
    private InvoiceDirectory invoiceDIrectory;
    
    public RetailerFinanceOrganization(){
        
           super(Organization.Type.RetailerFinance.getValue());
        
        this.invoiceDIrectory=new InvoiceDirectory();
    }

    public InvoiceDirectory getInvoiceDIrectory() {
        return invoiceDIrectory;
    }

    
    
    
    
     @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RetailerFinanceManagerRole());
        return roles;
}
    
}
