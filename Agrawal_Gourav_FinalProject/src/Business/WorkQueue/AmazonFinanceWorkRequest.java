/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Invoice.Invoice;

/**
 *
 * @author gourav
 */
public class AmazonFinanceWorkRequest extends WorkRequest{
    
    private String testResult;
    private Invoice invoice;

    public String getTestResult() {
        return testResult;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    
}
