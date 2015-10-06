/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Invoice.InvoiceDirectory;
import Business.Role.AmazonFinanceManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class AmazonFinanceOrganization extends Organization{
    private InvoiceDirectory invoiceDirectory;

    public InvoiceDirectory getInvoiceDirectory() {
        return invoiceDirectory;
    }

    public void setInvoiceDirectory(InvoiceDirectory invoiceDirectory) {
        this.invoiceDirectory = invoiceDirectory;
    }
    
    public AmazonFinanceOrganization(){
        super(Organization.Type.AmazonFinance.getValue());
        
        invoiceDirectory=new InvoiceDirectory();
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AmazonFinanceManagerRole());
        return roles;
}
    
}
