/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import Business.Enterprise.Enterprise;

/**
 *
 * @author gourav
 */
public class Product {
    private String productID;
    private String name;
    private float retailP;
    private double targetP;
    private static int count = 0;
    private int quantity;
    private String rname;
    private double tax;
    private Enterprise enterprise;
    
    public Product(){
        count++;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

   

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
    
    

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

   
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRetailP() {
        return retailP;
    }

    public void setRetailP(float retailP) {
        this.retailP = retailP;
    }

    public double getTargetP() {
        return targetP;
    }

    public void setTargetP(double targetP) {
        this.targetP = targetP;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }
      
    @Override
    public String toString(){
        return name;
    }
    
}
