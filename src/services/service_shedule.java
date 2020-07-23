package services;

import java.awt.SystemColor;
import static java.awt.SystemColor.info;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.*;
import static services.ConnectionConfigeration.getConnection;






public class service_shedule extends javax.swing.JFrame {
    
    
    
    public static String vno;
    public static String typ;
    public static Connection con=null;
    private int type;
    int total=1200;
    int inde;
    ArrayList<Integer> num = new ArrayList<Integer>();
    /*
     * Creates new form service_shedule
     */
    
    
    
    public service_shedule(String[] args) {
        initComponents();
        con=getConnection();
        vno = args[0];
        typ = args[1];
        type = Integer.parseInt(typ);   
    }
    
    public service_shedule() {
        initComponents();
        con=getConnection();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        txtServices = new javax.swing.JTextArea();
        lblDefault = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listservice1 = new javax.swing.JList<>();
        btnadd = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listService2 = new javax.swing.JList<>();
        btnOther = new javax.swing.JButton();
        btnAddAll = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbldiscount = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setResizable(false);

        txtServices.setColumns(20);
        txtServices.setRows(5);
        txtServices.setText("Fluid Check\nCoolant Check \nLubricant Check \nTire Check \nDrive Check \nExhaust Check \nBrake Check \nClutch Check\nBody Wash\nSide Sstand Check\nBattery Check\nTurn Signal Check\n\n\t");
        jScrollPane2.setViewportView(txtServices);

        lblDefault.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDefault.setText("Default Services:");

        listservice1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listservice1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listservice1);

        btnadd.setText("Add to the bill");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        listService2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listService2ValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listService2);

        btnOther.setText("Other services");
        btnOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtherActionPerformed(evt);
            }
        });

        btnAddAll.setText("Add all");
        btnAddAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAllActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("1200");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Total :");

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Discount :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("-0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(66, 66, 66)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbldiscount.setBackground(new java.awt.Color(255, 255, 51));

        jLabel5.setText("10% discount for Full Package");

        javax.swing.GroupLayout lbldiscountLayout = new javax.swing.GroupLayout(lbldiscount);
        lbldiscount.setLayout(lbldiscountLayout);
        lbldiscountLayout.setHorizontalGroup(
            lbldiscountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbldiscountLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lbldiscountLayout.setVerticalGroup(
            lbldiscountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbldiscountLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        btnNext.setLabel("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDefault)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOther, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(39, 39, 39)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddAll)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lbldiscount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(79, 79, 79))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext)
                .addGap(195, 195, 195))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOther)
                    .addComponent(lblDefault))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnadd)
                            .addComponent(btnAddAll))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbldiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addComponent(btnNext)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        btnNext.getAccessibleContext().setAccessibleName("jButton4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void listadd(){
         try{
         
        Statement stmt=con.createStatement();
        ResultSet rs;
        //System.out.println(type);
                if(type==1){

                     rs=stmt.executeQuery("SELECT s_name,cost FROM category INNER JOIN service ON service.service_id = category.service_id WHERE cat_id=1");  

                }else if(type==2){

                     rs=stmt.executeQuery("SELECT s_name,cost FROM category INNER JOIN service ON service.service_id = category.service_id WHERE cat_id=2");  

                }else if(type==3){

                     rs=stmt.executeQuery("SELECT s_name,cost FROM category INNER JOIN service ON service.service_id = category.service_id WHERE cat_id=3");  

                }else if(type==4){

                     rs=stmt.executeQuery("SELECT s_name,cost FROM category INNER JOIN service ON service.service_id = category.service_id WHERE cat_id=4");  

                }else{

                     rs=stmt.executeQuery("SELECT s_name,cost FROM category INNER JOIN service ON service.service_id = category.service_id WHERE cat_id=5");  

                }
        
        
        DefaultListModel dlm = new DefaultListModel();
        DefaultListModel dlm2 = new DefaultListModel();
        
        listservice1.setModel(dlm);
        listService2.setModel(dlm2);
        
        while(rs.next()) {
            dlm.addElement(rs.getString(1));
            dlm2.addElement(rs.getInt(2));
            num.add(rs.getInt(2));
            inde++;
        } 
            con.close();
        }catch(Exception e){ System.out.println(e);}
         
         
         //System.out.println(vno);
    }
    
    
     
    private void btnOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtherActionPerformed
        
        listadd();
             
    }//GEN-LAST:event_btnOtherActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        
        int index=listservice1.getSelectedIndex();
       
          //System.out.println(index);
          
        total=total+num.get(index);
        String tot=String.valueOf(total);
        
        jLabel1.setText(tot);
     
        
        DefaultListModel model1 =  (DefaultListModel) listservice1.getModel();
        model1.removeElementAt(index);
        DefaultListModel model2 =  (DefaultListModel) listService2.getModel();
        model2.removeElementAt(index);
       
        //discount(total);
        
    }//GEN-LAST:event_btnaddActionPerformed

    private void listservice1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listservice1ValueChanged

        listService2.setSelectedIndex(listservice1.getSelectedIndex());

    }//GEN-LAST:event_listservice1ValueChanged

    private void listService2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listService2ValueChanged
       
        listservice1.setSelectedIndex(listService2.getSelectedIndex());

    }//GEN-LAST:event_listService2ValueChanged

    private void btnAddAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAllActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(this, "");
        String tot = null ;
        
        int index=listservice1.getLastVisibleIndex();
        
        for(int z=0;z<=index;z++){
            total=total+num.get(z);
            tot=String.valueOf(total);
        }
        
        jLabel1.setText(tot);
     
        
        DefaultListModel model1 =  (DefaultListModel) listservice1.getModel();
         model1.removeAllElements();
        DefaultListModel model2 =  (DefaultListModel) listService2.getModel();
         model2.removeAllElements();
         
         discount(total);
    }//GEN-LAST:event_btnAddAllActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        String discount = String.valueOf(Integer.parseInt(jLabel1.getText()) - Integer.parseInt(jLabel6.getText()));

        new Report(discount).setVisible(true);
    }//GEN-LAST:event_btnNextActionPerformed

    private void discount(int total1){
        int dis=total1/10;
        
    if(type==1 && total==2100){
        jLabel6.setText(dis+"");
    }else if(type==2 && total==9900){
        jLabel6.setText(dis+"");
    }else if(type==3 && total==12100){
        jLabel6.setText(dis+"");
    }else if(type==4 && total==11100){
        jLabel6.setText(dis+"");
    }else{
        jLabel6.setText(dis+"");
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
                new service_shedule().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAll;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOther;
    private javax.swing.JButton btnadd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDefault;
    private javax.swing.JPanel lbldiscount;
    private javax.swing.JList<String> listService2;
    private javax.swing.JList<String> listservice1;
    private javax.swing.JTextArea txtServices;
    // End of variables declaration//GEN-END:variables
}
