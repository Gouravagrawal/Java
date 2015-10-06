/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Invoice.Invoice;
import Business.Order.OrderItem;
import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class OrderWorkRequest extends WorkRequest{
    
   private Enterprise enterprise;
   private ArrayList<OrderItem> orderItemList;
   private String productID;
   private String productName;
   private String customer;
   private Invoice invoice;
   
   public OrderWorkRequest(){
       
       this.orderItemList=new ArrayList<>();
   }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    
    
    @Override
    public String toString(){
        return productName;
    }
    
}
