/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Invoice;

import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class InvoiceDirectory {
    
    
private ArrayList<Invoice> invoiceList;
    
    public InvoiceDirectory(){
        this.invoiceList = new ArrayList<>();
    }

    public ArrayList<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(ArrayList<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }
    
   
    
   public void addInvoice(Invoice invoice){
       //Invoice invoice=new Invoice();        
        invoiceList.add(invoice);        
       
    }
   }
    
    
    

