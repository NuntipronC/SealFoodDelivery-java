
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {   
    final String username_admin = "admin";
    final String password_admin = "admin";
    final String username_user = "user1";
    final String password_user = "user1"; 
    
    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        jButton1.setText("login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 650, 140, 51));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 650, 140, 51));

        txt_username.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 390, 54));

        txt_password.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 390, 54));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/02login.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new welcome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username = txt_username.getText();
        String password = txt_password.getText();
        
        // check admin
        if(username.equals(username_admin)&&(password.equals(password_admin))){
            JOptionPane.showMessageDialog(null,"Welcome to Admin page.");
            new adminpage().setVisible(true);
            this.setVisible(false);
        }
        //check user
        else if (username.equals(username_user)&&(password.equals(password_user))){
            JOptionPane.showMessageDialog(null,"Welcome to Seal food.");
            new userpage().setVisible(true); 
            this.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(null,"Error!");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
