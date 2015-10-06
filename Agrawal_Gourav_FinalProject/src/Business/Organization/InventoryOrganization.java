/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Product.ProductDirectory;
import Business.Role.InventoryManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class InventoryOrganization extends Organization {
   private ProductDirectory productdirectory;
    
    public InventoryOrganization(){
        super(Type.Inventory.getValue());
        productdirectory=new ProductDirectory();
    }

    public ProductDirectory getProductdirectory() {
        return productdirectory;
    }

    public void setProductdirectory(ProductDirectory productdirectory) {
        this.productdirectory = productdirectory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InventoryManagerRole());
        return roles;
    }
    
}
