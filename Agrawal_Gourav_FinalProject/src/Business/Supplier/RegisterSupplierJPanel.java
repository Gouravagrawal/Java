/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author gourav
 */
public class RegisterSupplierJPanel extends javax.swing.JPanel {
  private JPanel userProcessContainer;
    private EcoSystem system;
    /**
     * Creates new form RegisterSupplierJPanel
     */
    public RegisterSupplierJPanel(JPanel upc,EcoSystem system) {
        initComponents();
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

        requestAccountJButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestAccountJButton.setText("Request An Account");
        requestAccountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestAccountJButtonActionPerformed(evt);
            }
        });
        add(requestAccountJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setText("REGISTER SUPPLIER");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestAccountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestAccountJButtonActionPerformed
        // TODO add your handling code here:
        
       String firstName= "gourav" ;

int nameLength= firstName.length(); 
int letterOneNumber= 0+ (int) (Math.random()*nameLength); 
int letterTwoNumber= 0+ (int) (Math.random()*nameLength); 
int letterThreeNumber= 0+ (int) (Math.random()*nameLength); 

char letterOne= firstName.charAt(letterOneNumber); 
char letterTwo= firstName.charAt(letterTwoNumber); 
char letterThree= firstName.charAt(letterThreeNumber); 

String letterOneRego= Character.toString(letterOne); 
String letterTwoRego= Character.toString(letterTwo); 
String letterThreeRego= Character.toString(letterThree); 

String letterOneRegistration= letterOneRego.toUpperCase(); 
String letterTwoRegistration= letterTwoRego.toUpperCase(); 
String letterThreeRegistration= letterThreeRego.toUpperCase(); 

String registrationLetters= letterOneRegistration+letterTwoRegistration ;
int licensePlateNumber = 100 + (int) (Math.random()*999); 

String ss=(registrationLetters + licensePlateNumber);

    
         RequestAccountJPanel rajp = new RequestAccountJPanel(userProcessContainer,system,ss);
        userProcessContainer.add("RequestAccountJPanel", rajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestAccountJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JButton requestAccountJButton;
    // End of variables declaration//GEN-END:variables
}
