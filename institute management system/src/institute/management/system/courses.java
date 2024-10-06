/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package institute.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WW
 */
public class courses extends javax.swing.JFrame {

    /**
     * Creates new form courses
     */
    public courses() {
        initComponents();
        connect();
        courses_load();
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel d;
    
    
    //make connection
     public void connect()  {
        try{
        Class.forName("com.mysql.jdbc.Driver");
         this.con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/institute db","root","");
        } catch (SQLException e) {
            System.out.println("error");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(students.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
     
     //enter database data to ctable 
     public void courses_load(){
     int c;
    
        try {
            //select statement
            pst = con.prepareStatement("select * from courses");
            rs = pst.executeQuery();//execute sqlquery
            
            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            
            d = (DefaultTableModel)ctable.getModel();
            d.setRowCount(0);
            
            while(rs.next()){
            
                Vector v2 = new Vector();
                
                for(int i=1; i<=c;i++){
                v2.add(rs.getString("id"));
                v2.add(rs.getString("Name"));
                v2.add(rs.getString("Faculty"));
                v2.add(rs.getString("Medium"));
                v2.add(rs.getString("Duration"));
                v2.add(rs.getString("Fee"));
                }
                d.addRow(v2);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(students.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        cfac = new javax.swing.JComboBox<>();
        rdbeng = new javax.swing.JRadioButton();
        rdbsin = new javax.swing.JRadioButton();
        cdu = new javax.swing.JTextField();
        cfee = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ctable = new javax.swing.JTable();
        btnsave = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Courses");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Name :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Faculty :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Medium :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Duration :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Fee :");

        cname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnameActionPerformed(evt);
            }
        });

        cfac.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cfac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "computing", "management", "language" }));

        rdbeng.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdbeng.setText("English");
        rdbeng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbengActionPerformed(evt);
            }
        });

        rdbsin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdbsin.setText("Sinhala");
        rdbsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbsinActionPerformed(evt);
            }
        });

        cdu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cfee.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdbeng)
                        .addGap(39, 39, 39)
                        .addComponent(rdbsin)
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addComponent(cfac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cdu)
                    .addComponent(cfee)
                    .addComponent(cname))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cfac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdbeng)
                    .addComponent(rdbsin))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        ctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Name", "Faculty", "Medium", "Duration", "Fee"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ctable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ctableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ctable);

        btnsave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnclear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btndel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btndel.setText("Delete");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        btnedit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnsave)
                        .addGap(7, 7, 7)
                        .addComponent(btnclear)
                        .addGap(7, 7, 7)
                        .addComponent(btndel)
                        .addGap(8, 8, 8)
                        .addComponent(btnedit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnback))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsave)
                            .addComponent(btnclear)
                            .addComponent(btndel)
                            .addComponent(btnedit)
                            .addComponent(btnback))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnameActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
       this.hide();//for hide this frame
       home h1 =new home();//home object create
       h1.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
       
        try {
            //get data in text fieds
            String Name = cname.getText();
            String Faculty = cfac.getSelectedItem().toString();
            String Duration = cdu.getText();
            String Fee = cfee.getText();
            
            
            pst = con.prepareStatement("insert into courses(Name,Faculty,medium,duration,fee)values(?,?,?,?,?)");
            //set data to database table coloms
            pst.setString(1, Name);
            pst.setString(2, Faculty);
            pst.setString(3, Medium);
            pst.setString(4, Duration);
            pst.setString(5, Fee);
          
            pst.executeUpdate();//for executed
            JOptionPane.showMessageDialog(this, "updated ");//massage box
            //for clear text fiels
            cname.setText("");
            cfac.setSelectedIndex(-1);
            cdu.setText("");
            cfee.setText("");
            
            cname.requestFocus();//curser go to cname textfield
            courses_load();
        } catch (SQLException ex) {
            Logger.getLogger(courses.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
        
     
        
        
        
        
        
        
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
     
            btnsave.setEnabled(true);
            cname.setText("");
            cfac.setSelectedIndex(-1);
            cdu.setText("");
            cfee.setText("");
            
            cname.requestFocus();//curser go to cname textfield
            courses_load();
    }//GEN-LAST:event_btnclearActionPerformed
//for get table datat to fields
    private void ctableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ctableMouseClicked
        d=(DefaultTableModel)ctable.getModel();
        int selectIndex =ctable.getSelectedRow();
        
        String id = d.getValueAt(selectIndex, 0).toString();
        cname.setText(d.getValueAt(selectIndex,1 ).toString());
        cfac.setSelectedItem(d.getValueAt(selectIndex,2 ).toString());
        cdu.setText(d.getValueAt(selectIndex,4 ).toString());
        cfee.setText(d.getValueAt(selectIndex,5 ).toString());
       
        
        btnsave.setEnabled(false);
    }//GEN-LAST:event_ctableMouseClicked

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
      try {
           d=(DefaultTableModel)ctable.getModel();
           int selectIndex = ctable.getSelectedRow();
        
             String id = d.getValueAt(selectIndex, 0).toString();
                        
            
            
            pst = con.prepareStatement("delete from courses where id =?");
            //set data to database table coloms
            pst.setString(1, id);
           
          
            pst.executeUpdate();//for executed
            JOptionPane.showMessageDialog(this, "deleted");//massage box
            btnsave.setEnabled(true);
            //for clear text fiels
            cname.setText("");
            cfac.setSelectedIndex(-1);
           
            cdu.setText("");
            cfee.setText("");
            
            cname.requestFocus();//curser go to cname textfield
            courses_load();
        } catch (SQLException ex) {
            Logger.getLogger(students.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_btndelActionPerformed
 private  String Medium ;
    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        try {
            d=(DefaultTableModel)ctable.getModel();
            int selectIndex = ctable.getSelectedRow();
        
            String id = d.getValueAt(selectIndex, 0).toString();
            
            //get data in text fieds
            String Name = cname.getText();
            String Faculty = cfac.getSelectedItem().toString();
            String Duration = cdu.getText();
            String Fee = cfee.getText();
            
            
            pst = con.prepareStatement("update courses set Name = ?,Faculty = ?,medium = ?,duration = ?,fee = ? where id = ?");
            //set data to database table coloms
            pst.setString(1, Name);
            pst.setString(2, Faculty);
          
            pst.setString(3, Medium);
            pst.setString(4, Duration);
            pst.setString(5, Fee);
            pst.setString(6, id);
           
          
            pst.executeUpdate();//for executed
            JOptionPane.showMessageDialog(this, "edited ");//massage box
            btnsave.setEnabled(true);
            //for clear text fiels
            cname.setText("");
            cfac.setSelectedIndex(-1);
            cdu.setText("");
            cfee.setText("");
            
            cname.requestFocus();//curser go to cname textfield
            courses_load();
        } catch (SQLException ex) {
            Logger.getLogger(students.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
        
        
    }//GEN-LAST:event_btneditActionPerformed

    private void rdbengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbengActionPerformed
        // TODO add your handling code here:
        Medium="English";
    }//GEN-LAST:event_rdbengActionPerformed

    private void rdbsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbsinActionPerformed
        // TODO add your handling code here:
        Medium="Sinhala";
    }//GEN-LAST:event_rdbsinActionPerformed

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
            java.util.logging.Logger.getLogger(courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new courses().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnsave;
    private javax.swing.JTextField cdu;
    private javax.swing.JComboBox<String> cfac;
    private javax.swing.JTextField cfee;
    private javax.swing.JTextField cname;
    private javax.swing.JTable ctable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbeng;
    private javax.swing.JRadioButton rdbsin;
    // End of variables declaration//GEN-END:variables
}
