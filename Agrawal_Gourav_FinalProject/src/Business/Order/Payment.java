/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;


import java.sql.Timestamp;

/**
 *
 * @author gourav
 */
public class Payment {
    private String cardName;
    private int SecurityCode;
    private Timestamp ts;
    private double AmountReceived;
    private String paymentType;
    private String expirationMonth;
    private String cardNumber;

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getSecurityCode() {
        return SecurityCode;
    }

    public void setSecurityCode(int SecurityCode) {
        this.SecurityCode = SecurityCode;
    }

    public Timestamp getTs() {
        return ts;
    }

    public void setTs(Timestamp ts) {
        this.ts = ts;
    }

   

    public double getAmountReceived() {
        return AmountReceived;
    }

    public void setAmountReceived(double AmountReceived) {
        this.AmountReceived = AmountReceived;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(String expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
 
    
    
    
    
}
