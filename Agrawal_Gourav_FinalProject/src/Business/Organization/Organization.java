/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    
    
    public enum Type{
        Admin("Admin Organization"), AmazonOrder("AmazonOrder Organization"), Customer("Customer Organization"),
        Inventory("Inventory Organization"),Shipment("Shipment Organization"),AmazonFinance("AmazonFinance Organization"),
        RetailerAdmin("RetailerAdmin Organization"),RetailerOrder("RetailerOrder Organization"),RetailerFinance("RetailerFinance Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
       // organizationID = counter;
       // ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

 //   public int getOrganizationID() {
 //       return organizationID;
 //   }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public UserAccount authenticateUser(String username, String password){
        return this.userAccountDirectory.authenticateUser(username, password);
    }
     public UserAccount chekAccount (String username){
        return this.userAccountDirectory.chekAccount(username);
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
