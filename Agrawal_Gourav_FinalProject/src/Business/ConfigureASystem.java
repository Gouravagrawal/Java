/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CustomerOrganization;
import Business.Organization.InventoryOrganization;
import Business.Organization.Organization;
import Business.Product.Product;
import Business.Role.AmazonAdminRole;
import Business.Role.CustomerRole;
import Business.Role.InventoryManagerRole;
import Business.Role.RetailerAdminRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author gourav
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
  
        Employee employee = new Employee();
        employee.setName("Gourav Agrawal");
        
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("s");
        userAccount.setPassword("s");
        userAccount.setEmployee(employee);
        userAccount.setRole(new SystemAdminRole());
        //system.createAndAddNetwork("usa");
        
        
        system.getUserAccountDirectory().getUserAccountList().add(userAccount);
        
       String name ="usa";
        Network usa=system.createAndAddNetwork(name);
        Network ma= usa.CreateAndAddSubnetwork("ma");
        Network boston=ma.CreateAndAddSubnetwork("boston");
        
        
       
        
//        
//        for(Network country:system.getNetworkList()){
//            for(Network state: country.getSubnetworklist()){
//                for(Network city:state.getSubnetworklist()){
                    
       //Creating RetailerEnterprise 1  
        Enterprise e1=boston.getEnterpriseDirectory().createAndAddEnterprise("HP", Enterprise.EnterpriseType.RETAILER);
                
                    Employee hPEmployee=e1.getEmployeeDirectory().createEmployee("HPEmployee");
                    
                    UserAccount u1=e1.getUserAccountDirectory().createUserAccount();
                    u1.setEmployee(hPEmployee);
                    u1.setRole(new RetailerAdminRole());
                    u1.setUsername("hp");
                    u1.setPassword("hp");
                    
                     //Creating InventoryOrganization for the ReailerEnterprise1
                    Organization o1=e1.getOrganizationDirectory().createOrganization(Organization.Type.Inventory);
                    Employee oe1=o1.getEmployeeDirectory().createEmployee("IP1");
                    
                    UserAccount u2=o1.getUserAccountDirectory().createUserAccount();
                    u2.setEmployee(oe1);
                    u2.setPassword("hp1");
                    u2.setUsername("hp1");
                    u2.setRole(new InventoryManagerRole());               
                     
                                       
                    //Creating Product for the RetailerEnterprise1
                    InventoryOrganization io1=null;
                    io1=(InventoryOrganization)o1;
                    Product p1 =io1.getProductdirectory().addProduct();
                    p1.setName("Hp");
                    p1.setQuantity(Integer.parseInt("5"));
                    p1.setTargetP(Double.parseDouble("1000"));
                    p1.setTax(Double.parseDouble("80"));
                    p1.setEnterprise(e1);
                     
                    
                
              //  Creating RetailerEnterprise 2
              Enterprise e2=boston.getEnterpriseDirectory().createAndAddEnterprise("lenovo", Enterprise.EnterpriseType.RETAILER);
                
                    Employee lenovoEmployee=e2.getEmployeeDirectory().createEmployee("lenovoEmployee");
                    
                    UserAccount u3=e2.getUserAccountDirectory().createUserAccount();
                    u3.setEmployee(lenovoEmployee);
                    u3.setRole(new RetailerAdminRole());
                    u3.setUsername("le");
                    u3.setPassword("le");
                    
                      
                    //Creating InventoryOrganization for the ReailerEnterprise2
                    Organization o2=e2.getOrganizationDirectory().createOrganization(Organization.Type.Inventory);
                    Employee oe2=o2.getEmployeeDirectory().createEmployee("InventoryPerson");
                    
                    UserAccount u4=o2.getUserAccountDirectory().createUserAccount();
                    u4.setEmployee(oe2);
                    u4.setPassword("le1");
                    u4.setUsername("le1");
                    u4.setRole(new InventoryManagerRole());
                                              
                     //Creating Product for the RetailerEnterprise2
                     InventoryOrganization io2=null;
                    io2=(InventoryOrganization)o2;
                    Product p2 =io2.getProductdirectory().addProduct();
                    p2.setName("Lenovo");
                    p2.setQuantity(Integer.parseInt("3"));
                    p2.setTargetP(Double.parseDouble("1200"));
                    p2.setTax(Double.parseDouble("96"));
                    p2.setEnterprise(e2);
                    ////////////////////////////////
                    
                    
                    
        String name1 ="India";
        Network india=system.createAndAddNetwork(name1);
        Network mp= india.CreateAndAddSubnetwork("mp");
        Network Indore=mp.CreateAndAddSubnetwork("Indore");
        
        
       
        

                    
       //Creating RetailerEnterprise 1  
        Enterprise ee1=Indore.getEnterpriseDirectory().createAndAddEnterprise("samsung", Enterprise.EnterpriseType.RETAILER);
                
                    Employee SAmEmployee=ee1.getEmployeeDirectory().createEmployee("SamEmployee");
                    
                    UserAccount ua1=ee1.getUserAccountDirectory().createUserAccount();
                    ua1.setEmployee(SAmEmployee);
                    ua1.setRole(new RetailerAdminRole());
                    ua1.setUsername("sam");
                    ua1.setPassword("sam");
                    
                     //Creating InventoryOrganization for the ReailerEnterprise1
                    Organization oo1=ee1.getOrganizationDirectory().createOrganization(Organization.Type.Inventory);
                    Employee ooEmployee1=oo1.getEmployeeDirectory().createEmployee("InvPerson");
                    
                    UserAccount uua1=oo1.getUserAccountDirectory().createUserAccount();
                    uua1.setEmployee(ooEmployee1);
                    uua1.setPassword("sam1");
                    uua1.setUsername("sam1");
                    uua1.setRole(new InventoryManagerRole());               
                     
                                       
                    //Creating Product for the RetailerEnterprise1
                    InventoryOrganization inventoryOrg1=null;
                    inventoryOrg1=(InventoryOrganization)oo1;
                    Product p3 =inventoryOrg1.getProductdirectory().addProduct();
                    p3.setName("Samsung 1z");
                    p3.setQuantity(Integer.parseInt("3"));
                    p3.setTargetP(Double.parseDouble("800"));
                    p3.setTax(Double.parseDouble("40"));
                    p3.setEnterprise(ee1);
                     
                    
                
              //  Creating RetailerEnterprise 2
              Enterprise eee1=Indore.getEnterpriseDirectory().createAndAddEnterprise("Nokia", Enterprise.EnterpriseType.RETAILER);
                
                    Employee NokiaEmployee=eee1.getEmployeeDirectory().createEmployee("NokiaEmployee");
                    
                    UserAccount uaa2=eee1.getUserAccountDirectory().createUserAccount();
                    uaa2.setEmployee(lenovoEmployee);
                    uaa2.setRole(new RetailerAdminRole());
                    uaa2.setUsername("nn");
                    uaa2.setPassword("nn");
                    
                      
                    //Creating InventoryOrganization for the ReailerEnterprise2
                    Organization ooo1=eee1.getOrganizationDirectory().createOrganization(Organization.Type.Inventory);
                    Employee oooEmployee1=ooo1.getEmployeeDirectory().createEmployee("InPerson");
                    
                    UserAccount uuaa3=ooo1.getUserAccountDirectory().createUserAccount();
                    uuaa3.setEmployee(oooEmployee1);
                    uuaa3.setPassword("nn1");
                    uuaa3.setUsername("nn1");
                    uuaa3.setRole(new InventoryManagerRole());
                                              
                     //Creating Product for the RetailerEnterprise2
                     InventoryOrganization inOrg3=null;
                    inOrg3=(InventoryOrganization)ooo1;
                    Product pp2 =inOrg3.getProductdirectory().addProduct();
                    pp2.setName("nokia 120");
                    pp2.setQuantity(Integer.parseInt("4"));
                    pp2.setTargetP(Double.parseDouble("1100")); 
                    pp2.setTax(Double.parseDouble("55"));
                    pp2.setEnterprise(eee1);
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                               
                      //Creating AmamzonEnterprise 1 
              Enterprise amazonEnt=usa.getEnterpriseDirectory().createAndAddEnterprise("AmazonUSA", Enterprise.EnterpriseType.AMAZON);
                
                    Employee amazonEmployee=amazonEnt.getEmployeeDirectory().createEmployee("amazonEmployee");
                    
                    UserAccount uaaa=amazonEnt.getUserAccountDirectory().createUserAccount();
                    uaaa.setEmployee(amazonEmployee);
                    uaaa.setRole(new AmazonAdminRole());
                    uaaa.setUsername("ae");
                    uaaa.setPassword("ae");
                    
              Organization co=amazonEnt.getOrganizationDirectory().createOrganization(Organization.Type.Customer);
                    CustomerOrganization corg=null;
                    corg=(CustomerOrganization)co;
              
                   Customer cc=corg.getCustomerDirectory().addCustomer();
                   
                    UserAccount uuaaa=corg.getUserAccountDirectory().createUserAccount();
                    //uuaaa.setEmployee(amazonEmployee);
                    uuaaa.setRole(new CustomerRole());
                    uuaaa.setCustomer(cc);
                    uuaaa.setUsername("cc");
                    uuaaa.setPassword("cc");
                       
                
                
        
        return system;
    }
    
}
