/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;
//import Business.Customer.Customer;
//import Business.Customer.CustomerDirectory;
//import Business.Employee.Employee;
import Business.EcoSystem;
import Business.Enterprise.AmazonEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.Role.CustomerRole;
//import Business.Role.AmazonAdminRole;
//import Business.Role.CustomerRole;
//import Business.CustomerUserAccount.CustomerUserAccount;
//import Business.CustomerUserAccount.CustomerUserAccountDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
//import Business.UserAccount.UserAccountDirectory;
import javax.swing.JPanel;

/**
 *
 * @author gourav
 */
public class RegisterPersonJPanel extends javax.swing.JPanel {

   // private CustomerDirectory cusDirectory;
    private JPanel userProcessContainer;
    private EcoSystem system;

    //private Organization co;
   // private CustomerOrganization corg;
    /**
     * Creates new form RegisterPersonJPanel
     */
    public RegisterPersonJPanel(JPanel upc,EcoSystem system) {
        initComponents();
       // populateComboBoxes();
        
        this.userProcessContainer=upc;
        this.system=system;
       
        
    
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        registerPersonJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        passwordJTextField = new javax.swing.JPasswordField();
        NameJTextFIeld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addressJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("REGISTER PERSON INFORMATION");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 11, -1, -1));

        registerPersonJButton.setText("Register");
        registerPersonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerPersonJButtonActionPerformed(evt);
            }
        });
        add(registerPersonJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 223, -1, -1));

        jLabel3.setText("UserName");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 68, -1, -1));
        add(usernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 65, 156, -1));

        backJButton.setText("<<Back");
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 276, -1, -1));

        jLabel16.setText("Password");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 106, -1, -1));
        add(passwordJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 103, 156, -1));
        add(NameJTextFIeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 141, 156, -1));

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 144, -1, -1));
        add(addressJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 185, 156, -1));

        jLabel6.setText("Address");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 188, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void registerPersonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerPersonJButtonActionPerformed
        // TODO add your handling code here:
      // String e= enailJTextField.getText();
     //  String fn=firstNameJTextFIeld.getText();
     //  String ln=lastNameJTextField.getText();
     //  int zp=Integer.valueOf(zipCodeJTextField.getText());
       String un=usernameJTextField.getText();
       String p=passwordJTextField.getText();
       String adress=addressJTextField.getText();
       String name=NameJTextFIeld.getText();
       
        
//         if(un.equals("")||un.equals(" ")){
//            JOptionPane.showMessageDialog(null, "Please Enter the User name");
//            return; 
//         }
//        
//        else if(p.equals("")||p.equals(" ")){
//            JOptionPane.showMessageDialog(null, "Please Enter the Password ");
//            return; 
//         }
//         else if(un.equalsIgnoreCase("s")){
//            JOptionPane.showMessageDialog(null, "UserName already Exists");
//            return; 
//         }
//         
//           else if(adress.equals("")||adress.equals(" ")){
//            JOptionPane.showMessageDialog(null, "Please Enter the address ");
//            return; 
//         }
//         
//           else if(name.equals("")||name.equals(" ")){
//            JOptionPane.showMessageDialog(null, "Please Enter the Name ");
//            return; 
//         }
       
       
       if (usernameJTextField.getText().trim().isEmpty() || passwordJTextField.getText().trim().isEmpty() ||addressJTextField.getText().trim().isEmpty()||NameJTextFIeld.getText().trim().isEmpty())
       {
            JOptionPane.showMessageDialog(null,"INVALID ENTRY");
       }
       
//       for(Network nn:system.getNetworkList()){
//           for(Enterprise en:nn.getEnterpriseDirectory().getEnterpriseList()){
//               for(UserAccount uuaa:en.getUserAccountDirectory().getUserAccountList()){
//                   if(uuaa.getUsername().equalsIgnoreCase(un)){
//                    JOptionPane.showMessageDialog(null, "UserName already Exists");
//            return; 
//               }
//               
//           }
//           }  
//       }
//      // String cntry=String.valueOf(countryComboBox.getSelectedItem());
//             
//         for(Network nnn:system.getNetworkList()){
//           for(Enterprise enn:nnn.getEnterpriseDirectory().getEnterpriseList()){
//              for(Organization og:enn.getOrganizationDirectory().getOrganizationList()){           
//               for(UserAccount uuaa:og.getUserAccountDirectory().getUserAccountList()){
//                   if(uuaa.getUsername().equalsIgnoreCase(un)){
//                    JOptionPane.showMessageDialog(null, "UserName already Exists");
//            return; 
//               }
//               
//           }
//           
//       }
//           }
//           }
       
       //Customer customer =new CustomerOrganization();
       
   for(Network count:system.getNetworkList()){
         for (Enterprise enterprise : count.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof AmazonEnterprise) {
                    AmazonEnterprise ent=(AmazonEnterprise)enterprise;
                    for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof CustomerOrganization) {
                                
                                
                                CustomerOrganization cooo= (CustomerOrganization)organization;
                                
                               Customer customer= cooo.getCustomerDirectory().addCustomer();
                                
                                
                                customer.setName(name);
                                customer.setAddress(adress);
                                //customer.getPassword()
                                
                              UserAccount ua = new UserAccount();
                            //UserAccount ua = customerOrganization.getUserAccountDirectory().createUserAccount(username, password, null, null)
                            ua.setCustomer(customer);
                            ua.setPassword(p);
                            ua.setUsername(un);
                            ua.setRole(new CustomerRole());
                            cooo.getUserAccountDirectory().getUserAccountList().add(ua);
         
                            }
         
         
         
                    }
                }
         }
   }
         
         
         
         
         
//        AmazonEnterprise az=null;
//           outer: for(Network n :system.getNetworkList())
//           {
//          if(n.getNetworkname().equalsIgnoreCase("USA"))
//          {
//        for(Enterprise ee:n.getEnterpriseDirectory().getEnterpriseList())
//           {
//            if(ee instanceof AmazonEnterprise)
//            {
//                az=(AmazonEnterprise)ee;
//                
//          for(Organization o:az.getOrganizationDirectory().getOrganizationList())
//            {  
//              if( o instanceof CustomerOrganization)
//              {
//                    CustomerOrganization co=(CustomerOrganization)o;
//          
//                    Customer customer= az.getCustomerOrganization().getCustomerDirectory().addCustomer();
//             customer.setPassword(p);
//            customer.setUserName(un);
//            customer.setAddress(adress);
//            customer.setName(name);
//        
//                    UserAccount ua = co.getUserAccountDirectory().createUserAccount();  
//                    ua.setCustomer(customer);
//                    ua.setPassword(p);
//                    ua.setUsername(un);
//                    ua.setRole(new CustomerRole());
//                    break outer;
//              }
//           
//          }
//            }
//        }
//          }}
//    }
                
                            
                    

    }//GEN-LAST:event_registerPersonJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NameJTextFIeld;
    private javax.swing.JTextField addressJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField passwordJTextField;
    private javax.swing.JButton registerPersonJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
