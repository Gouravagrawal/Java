/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Invoice;

import Business.Order.Order;
import Business.Order.Payment;
import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class Invoice {
    private int invoiceNumber;
    //private RetailerEnterprise retEnterprise;
    private Order order;
    private static int count=0;
    private ArrayList<Payment> paymentList;
    private String invoicestatus;

   
    public Invoice(){
        count++;
        invoiceNumber=count;
        paymentList=new ArrayList<>();
                
    }
    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getInvoicestatus() {
        return invoicestatus;
    }

    public void setInvoicestatus(String invoicestatus) {
        this.invoicestatus = invoicestatus;
    }
    

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = count;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

   

    public ArrayList<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(ArrayList<Payment> paymentList) {
        this.paymentList = paymentList;
    }
@Override
public String toString(){  
    
    return String.valueOf(invoiceNumber);
}
    
public Payment addPayment(){
    Payment p=new Payment();
        return p;
}
   
    
        
    
}
