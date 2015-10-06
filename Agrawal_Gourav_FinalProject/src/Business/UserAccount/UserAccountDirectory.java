/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;


import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(){
        UserAccount userAccount = new UserAccount();
       //if(userAccount.getUsername().equalsIgnoreCase(username))
        userAccountList.add(userAccount);
        return userAccount;
    }
    public UserAccount chekAccount(String username){
         for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username)){
                return ua;
            }
        return null;
        
    }
}
