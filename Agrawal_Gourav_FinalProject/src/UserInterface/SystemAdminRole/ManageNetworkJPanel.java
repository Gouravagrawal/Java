/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminRole;

import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author gourav
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Network network;

    /**
     * Creates new form ManageNetworkJPanel
     */
    public ManageNetworkJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateNetworkTree();
    }

    private void populateNetworkTree() {

        DefaultTreeModel tree = (DefaultTreeModel) networkJTree.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) tree.getRoot();

        root.removeAllChildren();

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode stateNode;
        DefaultMutableTreeNode cityNode;

        ArrayList<Network> networkList = system.getNetworkList();

        for (int i = 0; i < networkList.size(); i++) {
           
            
            Network country = networkList.get(i);
            
            
            networkNode = new DefaultMutableTreeNode(country.getNetworkname());
            root.insert(networkNode, i);

            ArrayList<Network> stateList = country.subNetworkList31();

            DefaultMutableTreeNode enterpriseNode;
            for (int j = 0; j < stateList.size(); j++) {
                Network state = stateList.get(j);
                stateNode = new DefaultMutableTreeNode(state.getNetworkname());
                networkNode.insert(stateNode, j);

                ArrayList<Network> cityList = state.subNetworkList31();
                for (int k = 0; k < cityList.size(); k++) {
                    Network city = cityList.get(k);
                    cityNode = new DefaultMutableTreeNode(city.getNetworkname());
                    stateNode.insert(cityNode, k);
                }
            }
        }
        tree.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        networkNameJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkJTree = new javax.swing.JTree();
        refreshjButon = new javax.swing.JButton();

        jLabel1.setText("Network Name");

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() | java.awt.Font.BOLD, 21));
        jLabel2.setText("MANAGE NETWORK");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("System");
        networkJTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        networkJTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                networkJTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(networkJTree);

        refreshjButon.setText("refresh");
        refreshjButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshjButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backJButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(submitJButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(networkNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(refreshjButon))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(networkNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshjButon))
                .addGap(35, 35, 35)
                .addComponent(submitJButton)
                .addGap(51, 51, 51)
                .addComponent(backJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        String name = networkNameJTextField.getText();

//        if (name.equals("") || name.equals("      ")) {
//            JOptionPane.showMessageDialog(null, "Please Enter the Network name");
//            return;
//        }
//         if(networkNameJTextField.getText().length()==0||networkNameJTextField.getText()==null){
//             
//           JOptionPane.showMessageDialog(null, "Please Enter the Network name");
//            return;
//           if (usernameJTextField.getText().trim().isEmpty() && passwordJPasswordField.getText().trim().isEmpty() && nameJTextField.getText().trim().isEmpty()) {
            if (networkNameJTextField.getText().trim().isEmpty())
                    {
            JOptionPane.showMessageDialog(null,"INVALID ENTRY");
                    }
//        }
        if (network == null) {

            system.createAndAddNetwork(name);

        }
        
        else 
        {
            for(Network n:system.getNetworkList()){
                
               
          
                if(n.getNetworkname().equalsIgnoreCase(name))
           {
                JOptionPane.showMessageDialog(null, " Network already exists");
                 return;   
           }
//       }
            network.CreateAndAddSubnetwork(name);
        }
//       
        //system.createAndAddNetwork(name);
        populateNetworkTree();
        networkNameJTextField.setText("");
        }

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void networkJTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_networkJTreeValueChanged
        // TODO add your handling code here:
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) networkJTree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            for (Network country : system.getNetworkList()) {
                if (selectedNode.toString().equalsIgnoreCase((country.getNetworkname()))) {
                    network = country;
                    break;
                }
                for (Network state : country.getSubnetworklist()) {
                    if (selectedNode.toString().equalsIgnoreCase((state.getNetworkname()))) {
                        network = state;
                        break;
                    }
                }
            }
        } else {
            network = null;
        }





    }//GEN-LAST:event_networkJTreeValueChanged

    private void refreshjButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButonActionPerformed
        // TODO add your handling code here:

        populateNetworkTree();
    }//GEN-LAST:event_refreshjButonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree networkJTree;
    private javax.swing.JTextField networkNameJTextField;
    private javax.swing.JButton refreshjButon;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
