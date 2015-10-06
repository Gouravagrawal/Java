/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Invoice.Invoice;
import Business.Order.OrderItem;
import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class ShippingOrderWorkRequest extends WorkRequest {
    
    
    private Invoice invoice;
    
    private ArrayList<OrderItem> shipmentItemList;
    
    public ShippingOrderWorkRequest(){
        
        this.shipmentItemList=new ArrayList<>();
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public ArrayList<OrderItem> getShipmentItemList() {
        return shipmentItemList;
    }

    public void setShipmentItemList(ArrayList<OrderItem> shipmentItemList) {
        this.shipmentItemList = shipmentItemList;
    }
    
}
