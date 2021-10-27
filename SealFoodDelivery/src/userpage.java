import java.util.HashSet;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class userpage extends javax.swing.JFrame {
        methodgraph graph = new methodgraph();
        adminpage admin = new adminpage();
        public static int total_price = 0;
        int T;   
        String timelegth;
        
        public int showtotalprice(){
            return total_price;
        }

        
        

       

    
    public userpage() {
        initComponents();        
        jComboBox_001.addItem(adminpage.location[0][0]);
        jComboBox_001.addItem(adminpage.location[1][0]);
        jComboBox_001.addItem(adminpage.location[2][0]);
        jComboBox_001.addItem(adminpage.location[3][0]);
        jComboBox_001.addItem(adminpage.location[4][0]);   
        jComboBox_002.addItem(adminpage.location[0][0]);
        jComboBox_002.addItem(adminpage.location[1][0]);
        jComboBox_002.addItem(adminpage.location[2][0]);
        jComboBox_002.addItem(adminpage.location[3][0]);
        jComboBox_002.addItem(adminpage.location[4][0]); 
        
        graph.addVertex(adminpage.location[0][0]);//0
	graph.addVertex(adminpage.location[1][0]);//1
	graph.addVertex(adminpage.location[2][0]);//2
	graph.addVertex(adminpage.location[3][0]);//3
	graph.addVertex(adminpage.location[4][0]);//4
        
        
}
       

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jComboBox_001 = new javax.swing.JComboBox<>();
        jComboBox_002 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bt_addtocart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        lbl_totalprice = new javax.swing.JLabel();
        lbl_showtime = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 680, 170, 50));

        jComboBox_001.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jComboBox_001.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "." }));
        jComboBox_001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_001ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_001, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 310, 50));

        jComboBox_002.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jComboBox_002.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "." }));
        jComboBox_002.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_002ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_002, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 370, 50));

        jTable1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Menu", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 380, 410));

        bt_addtocart.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        bt_addtocart.setText("add to cart");
        bt_addtocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addtocartActionPerformed(evt);
            }
        });
        getContentPane().add(bt_addtocart, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 130, 40));

        jTable2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Menu", "Price"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 410, 180));

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 430, -1, -1));

        lbl_totalprice.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 48)); // NOI18N
        lbl_totalprice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_totalprice.setText("-");
        getContentPane().add(lbl_totalprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 560, 130, 40));

        lbl_showtime.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 48)); // NOI18N
        lbl_showtime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_showtime.setText("-");
        getContentPane().add(lbl_showtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 550, 120, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        jButton2.setText("Payment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 680, 170, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/04user.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new welcome().setVisible(true);
        //new payment().setVisible(true);        
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_addtocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addtocartActionPerformed
        
        TableModel model1 = jTable1.getModel();
        int[] indexs = jTable1.getSelectedRows();
        Object[] row = new Object[2];
        DefaultTableModel model2 = (DefaultTableModel)jTable2.getModel();
        for (int i = 0;i <= indexs.length-1; i++){
            row[0] = model1.getValueAt(indexs[i], 0);
            row[1] = model1.getValueAt(indexs[i], 1);
            
            }
            model2.addRow(row);
            
        total_price =0;    
        for (int i2=0; i2< jTable2.getRowCount();i2++){
        total_price=total_price+ Integer.parseInt(jTable2.getValueAt(i2, 1).toString());
        }
       lbl_totalprice.setText(Integer.toString(total_price));
       
    

    }//GEN-LAST:event_bt_addtocartActionPerformed

    private void jComboBox_001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_001ActionPerformed
        DefaultTableModel model1 = (DefaultTableModel)jTable1.getModel();
        //clear
        model1.setRowCount(0);
        if(jComboBox_001.getSelectedItem().equals(adminpage.location[0][0])){          
      
        for (int i = 0;i <= menulo01.menu01.length-1; i++){
            String row[] = new String[menulo01.menu01[i].length];
            for (int j=0; j<menulo01.menu01[i].length; j++){
                row[j] = menulo01.menu01[i][j];
            }
            model1.addRow(row);
        }                      
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[1][0])){
        
        for (int i = 0;i <= menulo02.menu02.length-1; i++){
            String row[] = new String[menulo02.menu02[i].length];
                for (int j=0; j<menulo02.menu02[i].length; j++){
                    row[j] = menulo02.menu02[i][j];
            }
            model1.addRow(row);
        }
        } 
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[2][0])){
        
        for (int i = 0;i <= menulo03.menu03.length-1; i++){
            String row[] = new String[menulo03.menu03[i].length];
                for (int j=0; j<menulo03.menu03[i].length; j++){
                    row[j] = menulo03.menu03[i][j];
            }
            model1.addRow(row);
        }
        } 
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[3][0])){
        
        for (int i = 0;i <= menulo04.menu04.length-1; i++){
            String row[] = new String[menulo04.menu04[i].length];
                for (int j=0; j<menulo04.menu04[i].length; j++){
                    row[j] = menulo04.menu04[i][j];
            }
            model1.addRow(row);
        }
        } 
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[4][0])){
        
        for (int i = 0;i <= menulo05.menu05.length-1; i++){
            String row[] = new String[menulo05.menu05[i].length];
                for (int j=0; j<menulo05.menu05[i].length; j++){
                    row[j] = menulo05.menu05[i][j];
            }
            model1.addRow(row);
        }
        } 
        
        if(jComboBox_001.getSelectedItem().equals(adminpage.location[0][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[1][0])){
            int t=Integer.parseInt(admin.time[0][2]);  
            graph.addEdge(0, 1, t);
            int[] time = {0,1}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
            
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[0][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[2][0])){
            int t=Integer.parseInt(admin.time[1][2]); 
            graph.addEdge(0, 2, t);
            int[] time = {0,2}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[0][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[3][0])){
            int t=Integer.parseInt(admin.time[2][2]); 
            graph.addEdge(0, 3, t);
            int[] time = {0,3}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[0][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[4][0])){
            int t=Integer.parseInt(admin.time[3][2]); 
            graph.addEdge(0, 4, t);
            int[] time = {0,4}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[1][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[0][0])){
            int t=Integer.parseInt(admin.time[4][2]); 
            graph.addEdge(1, 0, t);
            int[] time = {1,0}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[1][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[2][0])){
            int t=Integer.parseInt(admin.time[5][2]); 
            graph.addEdge(1, 2, t);
            int[] time = {1,2}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[1][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[3][0])){
            int t=Integer.parseInt(admin.time[6][2]); 
            graph.addEdge(1, 3, t);
            int[] time = {1,3}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[1][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[4][0])){
            int t=Integer.parseInt(admin.time[7][2]); 
            graph.addEdge(1, 4, t);
            int[] time = {1,4}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[2][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[0][0])){
            int t=Integer.parseInt(admin.time[8][2]); 
            graph.addEdge(2, 0, t);
            int[] time = {2,0}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[2][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[1][0])){
            int t=Integer.parseInt(admin.time[9][2]); 
            graph.addEdge(2, 1, t);
            int[] time = {2,1}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[2][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[3][0])){
            int t=Integer.parseInt(admin.time[10][2]); 
            graph.addEdge(2, 3, t);
            int[] time = {2,3}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[2][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[4][0])){
            int t=Integer.parseInt(admin.time[11][2]); 
            graph.addEdge(2, 4, t);
            int[] time = {2,4}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[3][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[0][0])){
            int t=Integer.parseInt(admin.time[12][2]); 
            graph.addEdge(3, 0, t);
            int[] time = {3,0}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[3][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[1][0])){
            int t=Integer.parseInt(admin.time[13][2]); 
            graph.addEdge(3, 1, t);
            int[] time = {3,1}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[3][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[2][0])){
            int t=Integer.parseInt(admin.time[14][2]); 
            graph.addEdge(3, 2, t);
            int[] time = {3,2}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[3][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[4][0])){
            int t=Integer.parseInt(admin.time[15][2]); 
            graph.addEdge(3, 4, t);
            int[] time = {3,4}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[4][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[0][0])){
            int t=Integer.parseInt(admin.time[16][2]); 
            graph.addEdge(4, 0, t);
            int[] time = {4,0}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[4][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[1][0])){
            int t=Integer.parseInt(admin.time[17][2]); 
            graph.addEdge(4, 1, t);
            int[] time = {4,1}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[4][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[2][0])){
            int t=Integer.parseInt(admin.time[18][2]); 
            graph.addEdge(4, 2, t);
            int[] time = {4,2}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[4][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[3][0])){
            int t=Integer.parseInt(admin.time[19][2]); 
            graph.addEdge(4, 3, t);
            int[] time = {4,3}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        
        

        
        
    }//GEN-LAST:event_jComboBox_001ActionPerformed

    private void jComboBox_002ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_002ActionPerformed
        if(jComboBox_001.getSelectedItem().equals(adminpage.location[0][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[1][0])){
            int t=Integer.parseInt(admin.time[0][2]);  
            graph.addEdge(0, 1, t);
            int[] time = {0,1}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[0][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[2][0])){
            int t=Integer.parseInt(admin.time[1][2]); 
            graph.addEdge(0, 2, t);
            int[] time = {0,2}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[0][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[3][0])){
            int t=Integer.parseInt(admin.time[2][2]); 
            graph.addEdge(0, 3, t);
            int[] time = {0,3}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[0][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[4][0])){
            int t=Integer.parseInt(admin.time[3][2]); 
            graph.addEdge(0, 4, t);
            int[] time = {0,4}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[1][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[0][0])){
            int t=Integer.parseInt(admin.time[4][2]); 
            graph.addEdge(1, 0, t);
            int[] time = {1,0}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[1][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[2][0])){
            int t=Integer.parseInt(admin.time[5][2]); 
            graph.addEdge(1, 2, t);
            int[] time = {1,2}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[1][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[3][0])){
            int t=Integer.parseInt(admin.time[6][2]); 
            graph.addEdge(1, 3, t);
            int[] time = {1,3}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[1][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[4][0])){
            int t=Integer.parseInt(admin.time[7][2]); 
            graph.addEdge(1, 4, t);
            int[] time = {1,4}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[2][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[0][0])){
            int t=Integer.parseInt(admin.time[8][2]); 
            graph.addEdge(2, 0, t);
            int[] time = {2,0}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[2][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[1][0])){
            int t=Integer.parseInt(admin.time[9][2]); 
            graph.addEdge(2, 1, t);
            int[] time = {2,1}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[2][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[3][0])){
            int t=Integer.parseInt(admin.time[10][2]); 
            graph.addEdge(2, 3, t);
            int[] time = {2,3}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[2][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[4][0])){
            int t=Integer.parseInt(admin.time[11][2]); 
            graph.addEdge(2, 4, t);
            int[] time = {2,4}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[3][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[0][0])){
            int t=Integer.parseInt(admin.time[12][2]); 
            graph.addEdge(3, 0, t);
            int[] time = {3,0}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[3][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[1][0])){
            int t=Integer.parseInt(admin.time[13][2]); 
            graph.addEdge(3, 1, t);
            int[] time = {3,1}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[3][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[2][0])){
            int t=Integer.parseInt(admin.time[14][2]); 
            graph.addEdge(3, 2, t);
            int[] time = {3,2}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[3][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[4][0])){
            int t=Integer.parseInt(admin.time[15][2]); 
            graph.addEdge(3, 4, t);
            int[] time = {3,4}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[4][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[0][0])){
            int t=Integer.parseInt(admin.time[16][2]); 
            graph.addEdge(4, 0, t);
            int[] time = {4,0}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[4][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[1][0])){
            int t=Integer.parseInt(admin.time[17][2]); 
            graph.addEdge(4, 1, t);
            int[] time = {4,1}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[4][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[2][0])){
            int t=Integer.parseInt(admin.time[18][2]); 
            graph.addEdge(4, 2, t);
            int[] time = {4,2}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
        else if(jComboBox_001.getSelectedItem().equals(adminpage.location[4][0])&&
            jComboBox_002.getSelectedItem().equals(adminpage.location[3][0])){
            int t=Integer.parseInt(admin.time[19][2]); 
            graph.addEdge(4, 3, t);
            int[] time = {4,3}; 
            T = graph.findtimeLength(time);
            String timelegth  = Integer.toString(T);
            lbl_showtime.setText(timelegth);
        }
    }//GEN-LAST:event_jComboBox_002ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new payment().setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(userpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addtocart;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JComboBox<String> jComboBox_001;
    public javax.swing.JComboBox<String> jComboBox_002;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbl_showtime;
    private javax.swing.JLabel lbl_totalprice;
    // End of variables declaration//GEN-END:variables
}
