/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Retailer;

import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class X____RetailerDirectory {
    private ArrayList<X____Retailer> supplierList;
    
    public X____RetailerDirectory(){
        this.supplierList = new ArrayList<>();
    }

    public ArrayList<X____Retailer> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<X____Retailer> supplierList) {
        this.supplierList = supplierList;
    }
    
    public X____Retailer addSupplier(){
        X____Retailer supplier = new X____Retailer();
        supplierList.add(supplier);
        return supplier;
    }    
    public void removeSupplier(X____Retailer supplier){
        supplierList.remove(supplier);
    }
    
}

