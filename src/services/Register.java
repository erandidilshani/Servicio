package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Register extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    
    String user_id;

    public void Random() {
        Random rd = new Random();
        user_id = "" + rd.nextInt(10000 + 1);
    }
    public void nextpage(   ){
        setVisible(false);
        service_shedule ob = new service_shedule();
        ob.setVisible(true);
    }

    public Register() {
        super("Register");
        initComponents();
        conn = ConnectionConfigeration.getConnection();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblmilege = new javax.swing.JLabel();
        lblvno = new javax.swing.JLabel();
        btnclear = new javax.swing.JButton();
        lbldate = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtmilege = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        txtvno = new javax.swing.JTextField();
        btnservice = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Services\\src\\services\\resources\\bike-background-wallpaper.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setPreferredSize(new java.awt.Dimension(800, 650));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 600));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jPanel2.setEnabled(false);
        jPanel2.setFocusCycleRoot(true);
        jPanel2.setFocusable(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 650));
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 140));

        jLabel1.setBackground(new java.awt.Color(51, 102, 255));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("           Bike Service Centre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(68, 49, 670, 110);

        lblname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setText("Name");
        jPanel2.add(lblname);
        lblname.setBounds(117, 224, 62, 29);

        lblmilege.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblmilege.setForeground(new java.awt.Color(255, 255, 255));
        lblmilege.setText("Current mileage [km]");
        jPanel2.add(lblmilege);
        lblmilege.setBounds(117, 503, 227, 29);

        lblvno.setBackground(new java.awt.Color(153, 153, 153));
        lblvno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblvno.setForeground(new java.awt.Color(255, 255, 255));
        lblvno.setText("Vehicle number");
        jPanel2.add(lblvno);
        lblvno.setBounds(117, 352, 163, 29);

        btnclear.setBackground(new java.awt.Color(102, 102, 102));
        btnclear.setFont(new java.awt.Font("Swis721 Hv BT", 3, 18)); // NOI18N
        btnclear.setForeground(new java.awt.Color(0, 51, 204));
        btnclear.setText("clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel2.add(btnclear);
        btnclear.setBounds(400, 570, 120, 40);

        lbldate.setBackground(new java.awt.Color(255, 255, 255));
        lbldate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbldate.setForeground(new java.awt.Color(255, 255, 255));
        lbldate.setText("Last service date");
        jPanel2.add(lbldate);
        lbldate.setBounds(117, 422, 181, 29);

        lblemail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblemail.setForeground(new java.awt.Color(255, 255, 255));
        lblemail.setText("E mail");
        jPanel2.add(lblemail);
        lblemail.setBounds(117, 285, 109, 29);

        txtemail.setBackground(new java.awt.Color(204, 204, 204));
        txtemail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel2.add(txtemail);
        txtemail.setBounds(386, 282, 374, 35);

        txtmilege.setBackground(new java.awt.Color(204, 204, 204));
        txtmilege.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(txtmilege);
        txtmilege.setBounds(386, 500, 198, 35);

        txtname.setBackground(new java.awt.Color(204, 204, 204));
        txtname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel2.add(txtname);
        txtname.setBounds(386, 218, 374, 35);

        date.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(date);
        date.setBounds(386, 414, 198, 37);

        txtvno.setBackground(new java.awt.Color(204, 204, 204));
        txtvno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(txtvno);
        txtvno.setBounds(386, 352, 198, 35);

        btnservice.setBackground(new java.awt.Color(102, 102, 102));
        btnservice.setFont(new java.awt.Font("Swis721 Hv BT", 3, 18)); // NOI18N
        btnservice.setForeground(new java.awt.Color(0, 51, 255));
        btnservice.setText("service");
        btnservice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnserviceActionPerformed(evt);
            }
        });
        jPanel2.add(btnservice);
        btnservice.setBounds(169, 573, 120, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtname.setText("");
        txtemail.setText("");
        txtvno.setText("");
        txtmilege.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    @SuppressWarnings("empty-statement")
    private void btnserviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnserviceActionPerformed

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        LocalDate d1 = null;
        LocalDate today = LocalDate.now();
        Random();
        String info[]=new String[5];
        
        try {
            d1 = LocalDate.parse(format.format(date.getDate()));
            LocalDate checkdate720 = today.minusDays(720);
            LocalDate checkdate540 = today.minusDays(540);
            LocalDate checkdate360 = today.minusDays(360);
            LocalDate checkdate180 = today.minusDays(180);
            LocalDate checkdate30 = today.minusDays(30);

            String x = txtmilege.getText();
            int y = Integer.parseInt(x);
            
            if (y >= 20000 || d1.isAfter(checkdate720)) {
                setVisible(false);
                String a1 = txtvno.getText();
                String a2 = "5";
                 info[0] = a1;
                 info[1] = a2;
                // System.out.println(info[0]);
                service_shedule ob = new service_shedule(info);
                ob.setVisible(true);

                //service 5
                // jTextArea1.setText(rs.getString("serviceA"));
            } else if (y >= 15000 || d1.isAfter(checkdate540)) {
                setVisible(false);
                String a1 = txtvno.getText();
                String a2 = "4";
                 info[0] = a1;
                 info[1] = a2;
                // System.out.println(info[0]);
                service_shedule ob = new service_shedule(info);
                ob.setVisible(true);
               /* setVisible(false);
                service_schedule1 ob = new service_schedule1();
                ob.setVisible(true);*/
                //service 4
                // jTextArea1.setText(rs.getString("serviceB"));
            } else if (y >= 10000 || d1.isAfter(checkdate360)) {
                setVisible(false);
                String a1 = txtvno.getText();
                String a2 = "3";
                 info[0] = a1;
                 info[1] = a2;
                // System.out.println(info[0]);
                service_shedule ob = new service_shedule(info);
                ob.setVisible(true);
                //service 3                // jTextArea1.setText(rs.getString("serviceC"));
            } else if (y >= 5000 || d1.isAfter(checkdate180)) {
                setVisible(false);
                String a1 = txtvno.getText();
                String a2 = "2";
                 info[0] = a1;
                 info[1] = a2;
                service_shedule ob = new service_shedule(info);
                // System.out.println(info[0]);
                ob.setVisible(true);
                //Service 2
                // jTextArea1.setText(rs.getString("serviceD"));
            } else if (y >= 1000 ||d1.isAfter(checkdate30)) {
                setVisible(false);
                String a1 = txtvno.getText();
                String a2 = "1";
                 info[0] = a1;
                 info[1] = a2;
                 
                service_shedule ob = new service_shedule(info);
                ob.setVisible(true);
                //Service 1
                // jTextArea1.setText(rs.getString("serviceE"));
            } else {
               JOptionPane.showMessageDialog(this,"No need a service see you in next time");
            }
            
            
            String sql = "Insert into users(user_id,name,email,vno)Values(?,?,?,?)";

            pst = conn.prepareStatement(sql);
            pst.setString(1, user_id);
            pst.setString(2, txtname.getText());
            pst.setString(3, txtemail.getText());
            pst.setString(4, txtvno.getText());

            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();
                clearall();

            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_btnserviceActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnservice;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblmilege;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblvno;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmilege;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtvno;
    // End of variables declaration//GEN-END:variables

    private void clearall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setUpLoading() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setText(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
