/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class Network {

    private String Networkname;
    private EnterpriseDirectory enterpriseDirectory;
    private ArrayList<Network> subnetworklist;

    public Network() {
        subnetworklist=new ArrayList<>();
                
        enterpriseDirectory = new EnterpriseDirectory();
    }
    
    public ArrayList<Network> subNetworkList31(){
        return subnetworklist;
        
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public ArrayList<Network> getSubnetworklist() {
        return subnetworklist;
    }

    public void setSubnetworklist(ArrayList<Network> subnetworklist) {
        this.subnetworklist = subnetworklist;
    }

   

   

    public String getNetworkname() {
        return Networkname;
    }

    public void setNetworkname(String Networkname) {
        this.Networkname = Networkname;
    }

   
public Network CreateAndAddSubnetwork(String name){
   Network network =new Network();
   network.setNetworkname(name);
   subnetworklist.add(network);
   return network;
   
} 

@Override
    public String toString() {
        return Networkname;
    }

    
    
}