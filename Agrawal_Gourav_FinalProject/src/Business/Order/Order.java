/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer.Customer;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class Order {
 private ArrayList<OrderItem> orderItemList;
    private int orderID;
    private static int count;
    private double totalAmount;
    private Customer customer;
    private Timestamp timestamp;
    
    
    
    public Order(){
        this.orderItemList = new ArrayList<>();
        count++;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderID() {
        return orderID;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public void setOrderID() {
        this.orderID = count;
    }
    
    public OrderItem addOrderItem(){
        OrderItem orderItem = new OrderItem();
        orderItemList.add(orderItem);
        return orderItem;
    }
    
    public void removeOrderItem(OrderItem orderItem){
        orderItemList.remove(orderItem);
    } 
    
    public double getTotal(){
        double sum = 0;
      
        for(OrderItem oi : orderItemList){
            double ss= (oi.getProduct().getTargetP()*oi.getQuantity());
            double kk=(oi.getProduct().getTax()*oi.getQuantity());
        
            sum = (sum +ss+kk);
        }
        return sum;
    }
    
}
