import javax.swing.table.*;
public class menulo05 extends javax.swing.JFrame {
         public static int count_menu05 = 0;
        public static String[][]menu05 = new String[10][2];

    
    public menulo05() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        bt_addmenu01 = new javax.swing.JButton();
        txt_addprice01 = new javax.swing.JTextField();
        bt_clear01 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_menu01 = new javax.swing.JTable();
        txt_menu01 = new javax.swing.JTextField();
        restaurant1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jButton1.setText("close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 710, 100, 40));

        bt_addmenu01.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        bt_addmenu01.setText("add");
        bt_addmenu01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addmenu01ActionPerformed(evt);
            }
        });
        getContentPane().add(bt_addmenu01, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 90, 38));

        txt_addprice01.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        getContentPane().add(txt_addprice01, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 240, 38));

        bt_clear01.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        bt_clear01.setText("clear");
        bt_clear01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_clear01ActionPerformed(evt);
            }
        });
        getContentPane().add(bt_clear01, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 90, 38));

        jTable_menu01.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jTable_menu01.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Menu", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable_menu01);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 420, 210));

        txt_menu01.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        txt_menu01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_menu01ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_menu01, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 240, 38));

        restaurant1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        restaurant1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        restaurant1.setText("-");
        getContentPane().add(restaurant1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 390, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/03menu5.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_addmenu01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addmenu01ActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTable_menu01.getModel();
        menu05[count_menu05][0] = txt_menu01.getText();
        menu05[count_menu05][1] = txt_addprice01.getText();
        for (int i = count_menu05;i <= count_menu05; i++){
            String row[] = new String[menu05[i].length];
            for (int j=0; j<menu05[i].length; j++){
                row[j] = menu05[i][j];
            }
            model.addRow(row);
        }
        count_menu05 = count_menu05+1;

    }//GEN-LAST:event_bt_addmenu01ActionPerformed

    private void bt_clear01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_clear01ActionPerformed
        txt_menu01.setText("");
        txt_addprice01.setText("");
    }//GEN-LAST:event_bt_clear01ActionPerformed

    private void txt_menu01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_menu01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_menu01ActionPerformed

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
            java.util.logging.Logger.getLogger(menulo05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menulo05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menulo05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menulo05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menulo05().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addmenu01;
    private javax.swing.JButton bt_clear01;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_menu01;
    private javax.swing.JLabel restaurant1;
    private javax.swing.JTextField txt_addprice01;
    private javax.swing.JTextField txt_menu01;
    // End of variables declaration//GEN-END:variables
}
