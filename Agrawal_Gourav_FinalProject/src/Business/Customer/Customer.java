/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.Order;
import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class Customer {
    
 private int customerID;
    private String Name;
   
    private String userName;
    private String password;
   
    private String address;
    
    private ArrayList<Order> orderList;
    private static int count = 0;
    
    public Customer(){
        count++;
        this.orderList = new ArrayList<>();
    }
    
    public int getCustomerID(){
        return this.customerID;
    }
    public void setCustomerID(){
        customerID = count;
    }

   

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   
    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
        
    
 
    
    @Override
    public String toString(){
        return Name;
    }
    
}
