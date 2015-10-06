/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;



/**
 *
 * @author gourav
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem system;
    private ArrayList<Network> networkList;
    
    public static EcoSystem getInstance(){
        if (system == null){
            system = new EcoSystem();
        }
        return system;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    

   // public ArrayList<Network> getNetworkList() {
  //      return networkList;
  //  }
    
    public Network searchName(String countryName, String stateName, String cityName){
        
        for(Network country : getNetworkList())
            for(Network state: country.getSubnetworklist())
                for(Network city : state.getSubnetworklist()){
                    
                    if( cityName.equalsIgnoreCase(city.getNetworkname()))
                        return city;
                }
        
        return null;
        
        
    }
    
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        SystemAdminRole role = new SystemAdminRole();
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(role);
        return roleList;
    }

    public Network createAndAddNetwork(String name){
        Network network = new Network();
        network.setNetworkname(name);
        networkList.add(network);
        return network;
    }
    
}