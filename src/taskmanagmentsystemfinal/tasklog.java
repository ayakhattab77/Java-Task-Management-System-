/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskmanagmentsystemfinal;



import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class tasklog extends javax.swing.JFrame {

    /**
     * Creates new form tasklog
     */
    public tasklog() {
        initComponents();
        jTextField6.setText(alog.getUsern());
     
        tasks(alog.getUsern());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        code = new javax.swing.JComboBox<>();
        day1 = new javax.swing.JComboBox<>();
        m1 = new javax.swing.JComboBox<>();
        year1 = new javax.swing.JComboBox<>();
        hours = new javax.swing.JComboBox<>();
        min1 = new javax.swing.JComboBox<>();
        time = new javax.swing.JComboBox<>();
        hours1 = new javax.swing.JComboBox<>();
        min2 = new javax.swing.JComboBox<>();
        time2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel1.setText("task log");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 240, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setText(" From time");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 140, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel3.setText(" To  time");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 261, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 190, 40));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 96, -1, -1));

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel8.setText("Task code");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 140, -1));

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel9.setText("User name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 140, -1));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 140, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel5.setText("Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 140, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel1.add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 140, -1));

        day1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        day1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day1ActionPerformed(evt);
            }
        });
        jPanel1.add(day1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 50, -1));

        m1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        jPanel1.add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 50, -1));

        year1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", "2023", "2024", "2025" }));
        jPanel1.add(year1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 60, -1));

        hours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        jPanel1.add(hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 60, -1));

        min1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", " " }));
        jPanel1.add(min1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 60, -1));

        time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM", " " }));
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 60, -1));

        hours1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        jPanel1.add(hours1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 60, -1));

        min2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", " " }));
        jPanel1.add(min2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 60, -1));

        time2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM", " " }));
        jPanel1.add(time2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, 60, -1));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 930, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 try {

            String user = jTextField6.getText();
            String code1 = code.getSelectedItem().toString();
            String date =day1.getSelectedItem().toString()+"/"+m1.getSelectedItem().toString()+"/"+year1.getSelectedItem().toString();
            String from = hours.getSelectedItem().toString()+" : "+min1.getSelectedItem().toString()+" "+time.getSelectedItem().toString();
            String to =hours1.getSelectedItem().toString()+" : "+min2.getSelectedItem().toString()+" "+time2.getSelectedItem().toString();

            Database db = new Database();
            if (db.ValidTask(code1,user)) {
                if (db.createTaskLog(user, code1, date, from, to)) {
                    JOptionPane.showMessageDialog(null, "Task log Added Successfully");
                    backPress();
                } else {
                    JOptionPane.showMessageDialog(null, "Error in adding task log");
                }
            } else {
                JOptionPane.showMessageDialog(null, "task doesn't exist");
            }

        } catch (Exception e) {
            System.out.println("SQL Exception: " + e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
       backPress();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void day1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_day1ActionPerformed
private void backPress()
    {
          emp_dis_log   employee  = new  emp_dis_log();
        employee .setVisible(true);
        this.setVisible(false);
    }
private void tasks(String y)
    {try {
           ResultSet rs;
          DatabaseFunction db = new DatabaseFunction();
            Connection con = db.getconnection();
          String s = "select * from tasks where [employee]='"+y+"'";
         rs=db.combobox(s);
        while(rs.next())
        {
            code.addItem(rs.getString("code"));
        }
         } catch (Exception e) {
            System.out.println("SQL Exception: " + e.toString());
          
        }
    }
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
            java.util.logging.Logger.getLogger(tasklog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tasklog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tasklog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tasklog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tasklog().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> code;
    private javax.swing.JComboBox<String> day1;
    private javax.swing.JComboBox<String> hours;
    private javax.swing.JComboBox<String> hours1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JComboBox<String> m1;
    private javax.swing.JComboBox<String> min1;
    private javax.swing.JComboBox<String> min2;
    private javax.swing.JComboBox<String> time;
    private javax.swing.JComboBox<String> time2;
    private javax.swing.JComboBox<String> year1;
    // End of variables declaration//GEN-END:variables
}
