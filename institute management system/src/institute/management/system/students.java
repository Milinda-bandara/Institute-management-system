/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package institute.management.system;

import java.sql.DriverManager;
import java.sql.*;
import java.util.Vector;
import java.util.jar.Attributes.Name;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WW
 */
public class students extends javax.swing.JFrame {

    /**
     * Creates new form students
     */
    public students() {
        initComponents();
        connect();
        students_load();
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel d;
    
    
    
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
    
    public void students_load(){
    int c;
    
        try {
            pst = con.prepareStatement("select * from students");
            rs = pst.executeQuery();
            
            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            
            d = (DefaultTableModel)sttable.getModel();
            d.setRowCount(0);
            
            while(rs.next()){
            
                Vector v2 = new Vector();
                
                for(int i=1; i<=c;i++){
                v2.add(rs.getString("id"));
                v2.add(rs.getString("Name"));
                v2.add(rs.getString("Contact_no"));
                v2.add(rs.getString("Address"));
                v2.add(rs.getString("Batch"));
                v2.add(rs.getString("Course"));
                v2.add(rs.getString("Gender"));
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        stcon = new javax.swing.JTextField();
        stname = new javax.swing.JTextField();
        stadd = new javax.swing.JTextField();
        stcourse = new javax.swing.JComboBox<>();
        stbat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rdbmal = new javax.swing.JRadioButton();
        rdbfmal = new javax.swing.JRadioButton();
        btnback = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sttable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Students");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Name :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Contact no :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Address :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Batch :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Course :");

        stcon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        stname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        stadd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        stcourse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        stcourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "software", "management" }));

        stbat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Gender :");

        rdbmal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdbmal.setText("Male");
        rdbmal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbmalActionPerformed(evt);
            }
        });

        rdbfmal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdbfmal.setText("Female");
        rdbfmal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbfmalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stname, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(stadd)
                        .addComponent(stcourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stbat)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(rdbmal)
                            .addGap(46, 46, 46)
                            .addComponent(rdbfmal))
                        .addComponent(stcon, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stcon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stadd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stbat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(stcourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rdbmal)
                    .addComponent(rdbfmal))
                .addGap(22, 22, 22))
        );

        btnback.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnedit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnclear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnsave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndeleteMouseClicked(evt);
            }
        });
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        sttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Contact no", "Address", "Batch", "Course", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        sttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sttable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnsave)
                                .addGap(18, 18, 18)
                                .addComponent(btndelete)
                                .addGap(18, 18, 18)
                                .addComponent(btnclear)
                                .addGap(18, 18, 18)
                                .addComponent(btnedit)
                                .addGap(18, 18, 18)
                                .addComponent(btnback))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnback)
                    .addComponent(btnedit)
                    .addComponent(btnclear)
                    .addComponent(btnsave)
                    .addComponent(btndelete))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.hide();
        home h1=new home();
        h1.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed
 private String Gender;
    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
       
        try {
            String Name = stname.getText();
            String Contact_no = stcon.getText();
            String Address = stadd.getText();
            String Batch = stbat.getText();
            String Course = stcourse.getSelectedItem().toString();
            
            
            
            pst = con.prepareStatement("insert into students(Name,Contact_no,Address,Batch,Course,Gender)values(?,?,?,?,?,?)");
            
            pst.setString(1, Name);
            pst.setString(2, Contact_no);
            pst.setString(3, Address);
            pst.setString(4,Batch);
            pst.setString(5, Course);
            
            pst.setString(6, Gender);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "updated ");
            
            stname.setText("");
            stcon.setText("");
            stadd.setText("");
            stbat.setText("");
            stcourse.setSelectedIndex(-1);
            
            stname.requestFocus();
            students_load();
        } catch (SQLException ex) {
            Logger.getLogger(students.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
        
     
        
    }//GEN-LAST:event_btnsaveActionPerformed

    private void rdbmalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbmalActionPerformed
        Gender="male";
    }//GEN-LAST:event_rdbmalActionPerformed

    private void rdbfmalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbfmalActionPerformed
        Gender="female";
    }//GEN-LAST:event_rdbfmalActionPerformed

    private void btndeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeleteMouseClicked
        
    }//GEN-LAST:event_btndeleteMouseClicked

    private void sttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sttableMouseClicked
        d=(DefaultTableModel)sttable.getModel();
        int selectIndex = sttable.getSelectedRow();
        
        String id = d.getValueAt(selectIndex, 0).toString();
        stname.setText(d.getValueAt(selectIndex,1 ).toString());
        stcon.setText(d.getValueAt(selectIndex,2 ).toString());
        stadd.setText(d.getValueAt(selectIndex,3 ).toString());
        stbat.setText(d.getValueAt(selectIndex,4 ).toString());
        stcourse.setSelectedItem(d.getValueAt(selectIndex,5 ).toString());
        btnsave.setEnabled(false);
        
        
        
    }//GEN-LAST:event_sttableMouseClicked

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        try {
            d=(DefaultTableModel)sttable.getModel();
            int selectIndex = sttable.getSelectedRow();
        
             String id = d.getValueAt(selectIndex, 0).toString();
            
            
            
            String Name = stname.getText();
            String Contact_no = stcon.getText();
            String Address = stadd.getText();
            String Batch = stbat.getText();
            String Course = stcourse.getSelectedItem().toString();
            
            
            
            pst = con.prepareStatement("update students set Name = ?,Contact_no = ?,Batch = ?,Address = ?,Course = ?, Gender = ? where id =?");
            
            pst.setString(1, Name);
            pst.setString(2, Contact_no);
            pst.setString(3, Address);
            pst.setString(4,Batch);
            pst.setString(5, Course);
            
            pst.setString(6, Gender);
            pst.setString(7, id);
           
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "edited ");
            btnsave.setEnabled(true);
            stname.setText("");
            stcon.setText("");
            stadd.setText("");
            stbat.setText("");
            stcourse.setSelectedIndex(-1);
            
            stname.requestFocus();
            students_load();
            
        } catch (SQLException ex) {
            Logger.getLogger(students.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btneditActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
       btnsave.setEnabled(true);
            stname.setText("");
            stcon.setText("");
            stadd.setText("");
            stbat.setText("");
            stcourse.setSelectedIndex(-1);
            
            stname.requestFocus();
            students_load();
            
    }//GEN-LAST:event_btnclearActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try {
            d=(DefaultTableModel)sttable.getModel();
            int selectIndex = sttable.getSelectedRow();
        
             String id = d.getValueAt(selectIndex, 0).toString();
                        
            pst = con.prepareStatement("delete from students where id = ?");
            
            
            pst.setString(1, id);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "deleted ");
            btnsave.setEnabled(true);
            stname.setText("");
            stcon.setText("");
            stadd.setText("");
            stbat.setText("");
            stcourse.setSelectedIndex(-1);
            
            stname.requestFocus();
            students_load();
            
        } catch (SQLException ex) {
            Logger.getLogger(students.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_btndeleteActionPerformed

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
            java.util.logging.Logger.getLogger(students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new students().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbfmal;
    private javax.swing.JRadioButton rdbmal;
    private javax.swing.JTextField stadd;
    private javax.swing.JTextField stbat;
    private javax.swing.JTextField stcon;
    private javax.swing.JComboBox<String> stcourse;
    private javax.swing.JTextField stname;
    private javax.swing.JTable sttable;
    // End of variables declaration//GEN-END:variables

    

   
}
