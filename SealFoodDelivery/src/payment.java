import javax.swing.JOptionPane;
public class payment extends javax.swing.JFrame {
    userpage a = new userpage();
    int price;  
    int totalprice;
    String numcard = "1234-1234-1234-5678";
    String numdate = "09/28";
    String numcvv  = "123";
    
   
    
    
    public payment() {
        initComponents();
        price = a.showtotalprice();
        lbl_totalprice.setText(""+price);
        totalprice = a.showtotalprice();
        totalprice = totalprice+10;
        lbl_totalpricepayment1.setText(""+totalprice);
        
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        lbl_totalprice = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        lbl_totalpricepayment1 = new javax.swing.JLabel();
        lbl_00001 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 700, 160, 40));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        jButton2.setText("Pay");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 700, 160, 40));

        jTextField1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 470, 50));

        jTextField2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jTextField2.setToolTipText("");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 220, 50));

        jTextField3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 270, 50));

        jTextField5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 650, 270, 40));

        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jButton3.setText("Enter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 650, 100, 40));

        lbl_totalprice.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        lbl_totalprice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_totalprice.setText("0");
        getContentPane().add(lbl_totalprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 150, -1));

        jTextField4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 350, 50));

        jComboBox1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cash", "credit card" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 220, 40));

        lbl_totalpricepayment1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_totalpricepayment1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_totalpricepayment1.setText("-");
        getContentPane().add(lbl_totalpricepayment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 540, 180, -1));

        lbl_00001.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        lbl_00001.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_00001.setText("+    10");
        lbl_00001.setToolTipText("");
        getContentPane().add(lbl_00001, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/05payment.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new userpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    if(jTextField5.getText().equals("MAY25")){    
        double A = Integer.parseInt(lbl_totalprice.getText()); 
        double B;
        B = A*0.75; 
        lbl_totalprice.setText(""+B);
        
        double C;
        C = B+10;
        lbl_totalpricepayment1.setText(""+C);
    
    
    JOptionPane.showMessageDialog(null,"Your oder has been discounted ");
    }
    else {
        JOptionPane.showMessageDialog(null,"Error!");
    }
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jComboBox1.getSelectedItem().equals("cash")){
            String name = jTextField4.getText();
            JOptionPane.showMessageDialog(null,"Thank you "+name);
            
        }
        else if(jComboBox1.getSelectedItem().equals("credit card")){
            String card = jTextField1.getText();
            String date = jTextField3.getText();
            String cvv  = jTextField2.getText();
            String name = jTextField4.getText();
            
            if(card.equals(numcard)&&date.equals(numdate)&&cvv.equals(numcvv)){
                JOptionPane.showMessageDialog(null,"Thank you "+name);
               
                
                 
            }
            else {
                JOptionPane.showMessageDialog(null,"Error!");
            }
            
            
            
            
            
        }
        
  
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment().setVisible(true);
            }
        });
    }
        
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lbl_00001;
    private javax.swing.JLabel lbl_totalprice;
    private javax.swing.JLabel lbl_totalpricepayment1;
    // End of variables declaration//GEN-END:variables

    
}
