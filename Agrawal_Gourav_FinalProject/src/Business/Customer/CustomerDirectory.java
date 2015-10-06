/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class CustomerDirectory {
    
private ArrayList<Customer> customerList;
    
    public CustomerDirectory(){
        this.customerList = new ArrayList<>();
    }
    
    public ArrayList<Customer> getCustomerList(){
        return this.customerList;
    }
    public void setCustomerList(ArrayList<Customer> customerList){
        this.customerList = customerList;
    }
    
    public Customer addCustomer(){
        Customer customer = new Customer();
        customerList.add(customer);
        return customer;
    }
    
    public void removeCustomer(Customer customer){
        customerList.remove(customer);
    }
    
    //public UserAccount authenticateUserAccount(String username,String password){
  //  for(Customer customer:customerList){
 //           if(customer.getUserName().equalsIgnoreCase(username)&&customer.getPassword().equalsIgnoreCase(password)){
 //               return customer;
        
        
       
        
        
 //   }
 //   }
 //   }
    public Customer searchCustomer(int customerID){        
        for(Customer customer:customerList){
            if(customer.getCustomerID()== customerID){
                return customer;
            }
       }
        return null;
    }
}