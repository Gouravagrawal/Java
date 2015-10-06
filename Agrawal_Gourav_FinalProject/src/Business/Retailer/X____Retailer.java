/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Retailer;

import Business.Product.ProductDirectory;

/**
 *
 * @author gourav
 */
public class X____Retailer {
    private String name;
    private String city;
    private int supplierID;
    private static int count = 0;
    private ProductDirectory productDirectory;
    
    public X____Retailer(){
        count++;
        productDirectory = new ProductDirectory();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID() {
        this.supplierID = count;
    }     

    public ProductDirectory getProductDirectory() {
        return productDirectory;
    }
    public void setProductDirectory(ProductDirectory productDirectory) {
        this.productDirectory = productDirectory;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
     
    
    @Override
    public String toString(){
        return name;
    }
}
