/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlkhohang;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import qlkhohang.nhacungcap;
import java.sql.ResultSet;

/**
 *
 * @author dminh
 */
public class donhangnhapform extends javax.swing.JFrame {

    /**
     * Creates new form donhangnhapform
     */
    public donhangnhapform() {
        initComponents();
        showCombodata();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textid = new javax.swing.JTextField();
        textorder = new javax.swing.JTextField();
        textdelivery = new javax.swing.JTextField();
        textcost = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bangthem = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        textnhacungcap = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("IMPORT_ID");

        jLabel2.setText("ORDER_TIME_IMP");

        jLabel3.setText("DELIVERY_IMP");

        jLabel4.setText("TOTAL_COST_IMP");

        jLabel5.setText("SUPPLIER_ID");

        textorder.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textorder.setText("yyyy-mm-dd");
        textorder.setToolTipText("");

        textdelivery.setText("yyyy-mm-dd");

        bangthem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IMPORT_ID", "ORDER_TIME_IMP", "DELIVERY_IMP", "TOTAL_COST_IMP", "SUPPLIER_ID"
            }
        ));
        jScrollPane1.setViewportView(bangthem);

        jButton1.setText("Them");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sua");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xoa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Tim kiem");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        textnhacungcap.setEditable(true);
        textnhacungcap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnhacungcapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(43, 43, 43)
                                .addComponent(textid, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textorder)
                                    .addComponent(textdelivery)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textcost)
                                    .addComponent(textnhacungcap, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textdelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(textcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(textnhacungcap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textnhacungcapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnhacungcapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnhacungcapActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //
        // them vao combobox
        try{
        Connection c = ketnoi.lienket();
        Statement d = c.createStatement();
        DefaultTableModel model =(DefaultTableModel) bangthem.getModel();
        model.setRowCount(0);
        bangthem.setModel(model);
        int ID= Integer.parseInt(textid.getText());
        String order= textorder.getText();
        String delivery= textdelivery.getText();
        String total = textcost.getText();
        int ID1= Integer.parseInt(textnhacungcap.getSelectedItem().toString());
        d.executeUpdate("INSERT INTO quanlibanhang.donhangnhap(IMPORT_ID,ORDER_TIME_IMP,DELIVERY_IMP,TOTAL_COST_IMP,SUPPLIER_ID) VALUES ("+ID+",'"+order+"','"+delivery+"','"+total+"','"+ID1+"')");
        Object rowdata[]={ID,order,delivery,total,ID1};
        model.addRow(rowdata);
        bangthem.setModel(model);
        ketnoi.dongketnoi(c);
        
        } catch(SQLException e){
        e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         try{
        Connection c = ketnoi.lienket();
        Statement d = c.createStatement();
        DefaultTableModel model =(DefaultTableModel) bangthem.getModel();
        model.setRowCount(0);
        bangthem.setModel(model);
        int ID= Integer.parseInt(textid.getText());
        String order= textorder.getText();
        String delivery= textdelivery.getText();
        String total = textcost.getText();
        int ID1= Integer.parseInt(textnhacungcap.getSelectedItem().toString());
        d.executeUpdate("UPDATE quanlibanhang.donhangnhap SET ORDER_TIME_IMP ='"+order+"',DELIVERY_IMP='"+delivery+"',TOTAL_COST_IMP='"+total+"',SUPPLIER_ID="+ID1);
        Object rowdata[]={ID,order,delivery,total,ID1};
        model.addRow(rowdata);
        bangthem.setModel(model);
        ketnoi.dongketnoi(c);
        
        } catch(SQLException e){
        e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
         Connection c = ketnoi.lienket();
         int ID = Integer.parseInt(textid.getText());
          Statement d = c.createStatement();
          d.executeUpdate("DELETE quanlibanhang.donhangnhap WHERE IMPORT_ID="+ID);
              
         ketnoi.dongketnoi(c);}
        catch(SQLException e){
        e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        // tim kiem cung vay
         try {
         Connection c = ketnoi.lienket();
         Statement d = c.createStatement();
         DefaultTableModel model = (DefaultTableModel) bangthem.getModel();
         model.setRowCount(0);
         bangthem.setModel(model);
         int ID = Integer.parseInt(textid.getText());
         ResultSet rs = d.executeQuery("SELECT * FROM quanlibanhang.donhangnhap WHERE IMPORT_ID = "+ID);
         while(rs.next()){
          String order = rs.getString("ORDER_TIME_IMP");
          String delivery= rs.getString("DELIVERY_IMP");
          String total= rs.getString("TOTAL_COST_IMP");
          int ID1= Integer.parseInt(rs.getString("SUPPLIER_ID"));
          Object rowdata[]={ID,order,delivery,total,ID1};
          model.addRow(rowdata);
          bangthem.setModel(model);
         }
         ketnoi.dongketnoi(c);
         }
         catch(SQLException e){
         e.printStackTrace();
         }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(donhangnhapform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(donhangnhapform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(donhangnhapform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(donhangnhapform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new donhangnhapform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bangthem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textcost;
    private javax.swing.JTextField textdelivery;
    private javax.swing.JTextField textid;
    private javax.swing.JComboBox<String> textnhacungcap;
    private javax.swing.JTextField textorder;
    // End of variables declaration//GEN-END:variables

    private void showCombodata() {
        
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   nhacungcap a = new nhacungcap();      
   ArrayList<Integer> list = a.danhsachid();
   for(int i: list){
   textnhacungcap.addItem(Integer.toString(i));
   }
    }
}
