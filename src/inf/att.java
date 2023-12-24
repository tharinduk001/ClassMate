
package inf;

import com.database.DbConnect;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;



public class att extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public att() {
        initComponents();
        conn = DbConnect.connect();
        displayTime();
        tableload();
      //  stutable();
    }
    
    
    public void displayTime(){
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
               java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("HH:mm:ss");
               
               String text_displayTime = simpleDateFormat.format(new Date());
               
               String text_displayDate = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH).format(new Date());
               
               Timelabel.setText(text_displayTime);
               Datelabel.setText(text_displayDate);
               
            }
        }).start();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Datelabel = new javax.swing.JLabel();
        Timelabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idin = new javax.swing.JTextField();
        stateb = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        updatebtn = new javax.swing.JButton();
        delbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        testtable = new javax.swing.JTable();
        testbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Attendance Marking Window");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(22, 33, 41));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Attendance Marking...");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, -1));

        Datelabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Datelabel.setForeground(new java.awt.Color(255, 255, 255));
        Datelabel.setText("jLabel4");
        jPanel1.add(Datelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 130, -1));

        Timelabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Timelabel.setForeground(new java.awt.Color(255, 255, 255));
        Timelabel.setText("jLabel5");
        jPanel1.add(Timelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("State :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 30));

        idin.setBackground(new java.awt.Color(107, 106, 88));
        idin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idin.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(idin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 70, 30));

        stateb.setBackground(new java.awt.Color(107, 106, 88));
        stateb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stateb.setForeground(new java.awt.Color(255, 255, 255));
        stateb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "0" }));
        jPanel1.add(stateb, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 70, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 30));

        table2.setBackground(new java.awt.Color(70, 70, 68));
        table2.setForeground(new java.awt.Color(255, 255, 255));
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        table2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table2KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 560, 450));

        updatebtn.setBackground(new java.awt.Color(14, 187, 15));
        updatebtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("Update");
        updatebtn.setMaximumSize(new java.awt.Dimension(72, 27));
        updatebtn.setMinimumSize(new java.awt.Dimension(72, 27));
        updatebtn.setPreferredSize(new java.awt.Dimension(89, 26));
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 160, 40));

        delbtn.setBackground(new java.awt.Color(14, 187, 15));
        delbtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        delbtn.setForeground(new java.awt.Color(255, 255, 255));
        delbtn.setText("Delete");
        delbtn.setMaximumSize(new java.awt.Dimension(72, 27));
        delbtn.setMinimumSize(new java.awt.Dimension(72, 27));
        delbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtnActionPerformed(evt);
            }
        });
        jPanel1.add(delbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 160, 40));

        jButton2.setBackground(new java.awt.Color(255, 64, 64));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Main Window");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 160, 40));

        jScrollPane2.setEnabled(false);
        jScrollPane2.setFocusable(false);

        testtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(testtable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 0));

        testbtn.setBackground(new java.awt.Color(0, 120, 137));
        testbtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        testbtn.setForeground(new java.awt.Color(255, 255, 255));
        testbtn.setText("Mark");
        testbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testbtnActionPerformed(evt);
            }
        });
        jPanel1.add(testbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 500));

        setSize(new java.awt.Dimension(842, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void inst(){
        
        String iddd = idin.getText();
        if(iddd.isEmpty()){
            JOptionPane.showMessageDialog(null, "ID IS NULL");
        }else{
          String idd = idin.getText();
          String flag = stateb.getSelectedItem().toString();
          String date = Datelabel.getText();
          
            try {
            String sqll = "INSERT INTO attendance(id,date,state) VALUES ('"+idd+"', '"+date+"', '"+flag+"' )";
            pst = conn.prepareStatement(sqll);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Marked Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Marking Failed");
        }
            tableload();
            clr();  
        }
        
          
        
    }
    
    public void update(){
        String idd = idin.getText();
        String flag = stateb.getSelectedItem().toString();
        String date = Datelabel.getText();
         int r = table2.getSelectedRow();    
         String dateee = table2.getValueAt(r, 1).toString();
            try {
            String sql = "UPDATE attendance SET state = '"+flag+"' WHERE id = '"+idd+"' AND date = '"+dateee+"' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
            tableload();
            clr();
    }
    
    public void del(){
         int r = table2.getSelectedRow();    
         String date = table2.getValueAt(r, 1).toString();
        
         String idd = idin.getText();
         try {
            String sql = "DELETE FROM attendance WHERE id = '"+idd+"' AND date = '"+date+"' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
         tableload();
         clr();
    }
            
    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
    tabledata();
    }//GEN-LAST:event_table2MouseClicked

    private void table2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table2KeyReleased
     tabledata();
    }//GEN-LAST:event_table2KeyReleased

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
          String idd = idin.getText();
        if(idd.isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter ID");
        }else{
          update();
        }
        
    }//GEN-LAST:event_updatebtnActionPerformed

    private void delbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtnActionPerformed
         String idd = idin.getText();
        if(idd.isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter ID");
        }else{
           del();
        }
        
      
    }//GEN-LAST:event_delbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mainframe mf = new mainframe();
        mf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void testbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testbtnActionPerformed
   //    testtable.setVisible(false);
        String p = "PAID";
   //     String sql2 = "SELECT * FROM feedata WHERE paystate = '"+p+"'";   // CHANGED THIS LINE ON 2023/01/06 delete this if wanted
        String sql2 = "SELECT * FROM feedata WHERE paystate = '"+p+"'"; 
        try {  
            //String sql2 = "SELECT * FROM student";
            pst = conn.prepareStatement(sql2);
            rs =  pst.executeQuery();
            testtable.setModel(DbUtils.resultSetToTableModel(rs));
          //  JOptionPane.showMessageDialog(null, "Marked");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
      
      int count = testtable.getRowCount();
      int r = count;
      
        for (int i = 0; i < r; i++) {
         String val = testtable.getValueAt(i, 0).toString();   
         String id = idin.getText();
         if(id.equals(val)){
             //JOptionPane.showMessageDialog(null, "Identified");
             inst();
         }else{
            // JOptionPane.showMessageDialog(null, "Unidentified");  
         }} 
        
        
        
        //second to not mark not paid students with a error message
        
          String sql10 = "SELECT * FROM feedata WHERE paystate != '"+p+"'"; 
        try {  
            //String sql2 = "SELECT * FROM student";
            pst = conn.prepareStatement(sql10);
            rs =  pst.executeQuery();
            testtable.setModel(DbUtils.resultSetToTableModel(rs));
          //  JOptionPane.showMessageDialog(null, "Marked");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
      
      int countt = testtable.getRowCount();
      int m = countt;
      
        for (int i = 0; i < m; i++) {
         String val = testtable.getValueAt(i, 0).toString();   
         String id = idin.getText();
         if(id.equals(val)){
             //JOptionPane.showMessageDialog(null, "Identified");
              JOptionPane.showMessageDialog(null, "Class Fees Are Not Paid.");
                int check = JOptionPane.showConfirmDialog(null, "Do you sure to want mark this student because the class fees are not paid.");
                if(check == 0){ 
                    try{
                         inst();
                    } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Unable to mark.");
         }
                }else{
                      JOptionPane.showMessageDialog(null, "Not Marked.");
                }
         }else{
            // JOptionPane.showMessageDialog(null, "Unidentified");  
         }} 
            
    }//GEN-LAST:event_testbtnActionPerformed


    
      
    
    public void tabledata(){
        int r = table2.getSelectedRow();   
        String id = table2.getValueAt(r, 0).toString();
        String st = table2.getValueAt(r, 2).toString();
        
       idin.setText(id);
       stateb.setSelectedItem(st);
    }
    
    
    
    
    public void tableload(){
            String sql = "SELECT * FROM attendance";
        
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void clr(){
        idin.setText("");
    }
    
    
    
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
            java.util.logging.Logger.getLogger(att.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(att.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(att.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(att.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new att().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Datelabel;
    private javax.swing.JLabel Timelabel;
    private javax.swing.JButton delbtn;
    private javax.swing.JTextField idin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> stateb;
    private javax.swing.JTable table2;
    private javax.swing.JButton testbtn;
    private javax.swing.JTable testtable;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
