/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Product.Product;

/**
 *
 * @author gourav
 */
public class OrderItem {
    
     private Product product;
    private int quantity;
    private double sellingP;
     private String status;
    private double balancedue;
    

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getBalancedue() {
        return balancedue;
    }

    public void setBalancedue(double balancedue) {
        this.balancedue = balancedue;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSellingP() {
        return sellingP;
    }

    public void setSellingP(double sellingP) {
        this.sellingP = sellingP;
    }
    
    
    
    public double getOrderItemPrice(){
        double itemPrice;
        
        itemPrice = getQuantity() * getSellingP();
        return itemPrice;
    }
    
    
    
    
    
    @Override
    public String toString(){
        return product.toString();
    }
    
    
}
