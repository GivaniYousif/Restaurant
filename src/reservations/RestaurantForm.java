/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 *
 * @author givani.yousif
 */
import java.util.Random;


public class RestaurantForm extends javax.swing.JFrame {

    Customer queue = new Customer();

    public RestaurantForm() {
        initComponents();
    }

    int Highest = 0;
    int Wait = 0;
    private static int totalWaitTime = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTotalWaitTimes = new javax.swing.JLabel();
        btnAddParty = new javax.swing.JButton();
        btnDisplayInfo = new javax.swing.JButton();
        lstWaitingList = new java.awt.List();
        txtPartyName = new javax.swing.JTextField();
        txtPartySize = new javax.swing.JTextField();
        lblAvgWaitTime = new javax.swing.JLabel();
        lblEnterInfo = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTotalWaitTimes.setBorder(javax.swing.BorderFactory.createTitledBorder("Total Wait Times"));

        btnAddParty.setText("Add to Waiting List");
        btnAddParty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPartyActionPerformed(evt);
            }
        });

        btnDisplayInfo.setText("Display Waiting List Information");
        btnDisplayInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayInfoActionPerformed(evt);
            }
        });

        lstWaitingList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstWaitingListActionPerformed(evt);
            }
        });

        txtPartyName.setBorder(javax.swing.BorderFactory.createTitledBorder("Party Name"));
        txtPartyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPartyNameActionPerformed(evt);
            }
        });

        txtPartySize.setBorder(javax.swing.BorderFactory.createTitledBorder("Party Size"));
        txtPartySize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPartySizeActionPerformed(evt);
            }
        });

        lblAvgWaitTime.setBorder(javax.swing.BorderFactory.createTitledBorder("Average Wait Time"));

        lblEnterInfo.setText("Enter info here:");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEnterInfo)
                        .addGap(0, 696, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddParty)
                            .addComponent(txtPartySize, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAvgWaitTime, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(txtPartyName, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalWaitTimes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnDisplayInfo)
                                .addGap(220, 220, 220))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lstWaitingList, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEnterInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPartyName, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPartySize, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(btnAddParty, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtTotalWaitTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAvgWaitTime, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDisplayInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lstWaitingList, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPartyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPartyActionPerformed

        Random rand = new Random();

        String partyName = txtPartyName.getText();

        int sizeOfQueue = (queue.size()) + 1;
        
        int waitTime = rand.nextInt(30) + 1;

        totalWaitTime += waitTime; 

        int partySize = Integer.parseInt(txtPartySize.getText());
        
        int average = totalWaitTime/sizeOfQueue;

        txtTotalWaitTimes.setText(String.valueOf(totalWaitTime + " minutes."));
        lblAvgWaitTime.setText(String.valueOf("The average waiting time is currently: " + average + " minutes."));
        String result = "Party Name: " + partyName + "      Party Size: " + partySize + "      Wait Time: " + waitTime + " minutes.";

        queue.enqueue(result);
        Wait++;

    }//GEN-LAST:event_btnAddPartyActionPerformed

    private void btnDisplayInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayInfoActionPerformed
        
        String result;
        int i;
        int size = queue.size();
        lstWaitingList.removeAll();
        for (i = 0; i < size; i++) {
            result = (String) queue.dequeue();
            lstWaitingList.add(result);

        }
    }//GEN-LAST:event_btnDisplayInfoActionPerformed

    private void txtPartyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPartyNameActionPerformed
    }//GEN-LAST:event_txtPartyNameActionPerformed

    private void txtPartySizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPartySizeActionPerformed
    }//GEN-LAST:event_txtPartySizeActionPerformed

    private void lstWaitingListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstWaitingListActionPerformed
    }//GEN-LAST:event_lstWaitingListActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RestaurantForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurantForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurantForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurantForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurantForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddParty;
    private javax.swing.JButton btnDisplayInfo;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel lblAvgWaitTime;
    private javax.swing.JLabel lblEnterInfo;
    private java.awt.List lstWaitingList;
    private javax.swing.JTextField txtPartyName;
    private javax.swing.JTextField txtPartySize;
    private javax.swing.JLabel txtTotalWaitTimes;
    // End of variables declaration//GEN-END:variables
}
