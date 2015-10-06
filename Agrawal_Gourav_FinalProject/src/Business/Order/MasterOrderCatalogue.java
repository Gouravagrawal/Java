/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class MasterOrderCatalogue {
    
 private ArrayList<Order> orderList;
    
    public MasterOrderCatalogue(){
       this.orderList = new ArrayList<>();
    }
    
    public ArrayList<Order> getOrderList(){
        return orderList;
    }
    public void setOrderList(ArrayList<Order> orderList){
        this.orderList = orderList;
    }
    
    public void addOrder(Order order){
        
        orderList.add(order);
        
    }
    public void removeOrder(Order order){
        orderList.remove(order);     
    }
    
    
}