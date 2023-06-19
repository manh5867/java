/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.quanlibanhang;

import javax.swing.JOptionPane;

/**
 *
 * @author My HP
 */
public class frmNhapHangAdd extends javax.swing.JFrame {

     private static String tenHangHoa;
    private static String maHangHoa;
     private static String nhaCungCap;
     private String maNhapHang;

    public String getMaNhapHang() {
        return maNhapHang;
    }

    public void setMaNhapHang(String maNhapHang) {
        this.maNhapHang = maNhapHang;
    }

    public static String getTenHangHoa() {
        return tenHangHoa;
    }

    public static void setTenHangHoa(String tenHangHoa) {
        frmNhapHangAdd.tenHangHoa = tenHangHoa;
    }

    public static String getMaHangHoa() {
        return maHangHoa;
    }

    public static void setMaHangHoa(String maHangHoa) {
        frmNhapHangAdd.maHangHoa = maHangHoa;
    }

    public static String getNhaCungCap() {
        return nhaCungCap;
    }

    public static void setNhaCungCap(String nhaCungCap) {
        frmNhapHangAdd.nhaCungCap = nhaCungCap;
    }
    

    

    

   
    
    /**
     * Creates new form frmNhapHangAdd
     */
    public frmNhapHangAdd() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaNhapHang = new javax.swing.JTextField();
        txtNhaCungCap = new javax.swing.JTextField();
        txtTongTienNhap = new javax.swing.JTextField();
        btnChonNhaCungCap = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nhập hàng hóa"));

        jLabel3.setText("Mã nhập hàng:");

        jLabel5.setText("Nhà cung cấp (*):");

        jLabel6.setText("Ngày nhập:");

        jLabel7.setText("Tổng tiền nhập (*):");

        btnChonNhaCungCap.setText("Chọn nhà cung cấp");
        btnChonNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonNhaCungCapActionPerformed(evt);
            }
        });

        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/com/stanford/j0622/qlsinhvien/images/save.png"))); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/com/stanford/j0622/qlsinhvien/images/cancel.gif"))); // NOI18N
        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Thêm hàng hóa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sửa thông tin");

        jButton3.setText("Xóa hàng hóa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTongTienNhap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                        .addComponent(txtTrangThai, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMaNhapHang)
                                .addComponent(txtTenHang)
                                .addComponent(txtMaHang)
                                .addComponent(txtSoLuong)
                                .addComponent(txtNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                            .addGap(60, 60, 60)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnChonHangHoa)
                                .addComponent(btnChonNhaCungCap)))))
                .addContainerGap(38, Short.MAX_VALUE))
=======
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(67, 67, 67)
                                .addComponent(txtMaNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(btnChonNhaCungCap)))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCapNhat)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(26, 26, 26)
                                .addComponent(txtTongTienNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132)
                                .addComponent(jButton1)
                                .addGap(99, 99, 99)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))))
>>>>>>> 4fc65b743d2ba7fdc09102c14349cf5cad2ab2ff
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtMaNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnChonHangHoa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtMaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChonNhaCungCap))
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtTongTienNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
=======
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnChonNhaCungCap)
                        .addComponent(jLabel6))
                    .addComponent(dtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
>>>>>>> 4fc65b743d2ba7fdc09102c14349cf5cad2ab2ff
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTongTienNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDong)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
      
        if(!maNhapHang.isEmpty())//TH sửa
        {
            this.setTitle("Sửa thông tin nhập hàng");
            
            //Hiển thị chi tiết sinh viên trước khi sửa
            hienThiChiTiet();
        }
        else
        {
            this.setTitle("Thêm mới thông tin nhập hàng");
        }
    }//GEN-LAST:event_formWindowOpened

     private void hienThiChiTiet()
    {
        NhapHang objNH = DataProvider.getNhapHangBus().layChiTietTheoMa(maNhapHang);
        
        if(objNH != null)
        {
            txtMaNhapHang.setText(maNhapHang);
            txtMaNhapHang.setEditable(false);
            txtMaHang.setText(objNH.getMaHang());
            txtTenHang.setText(objNH.getTenHang());
            txtSoLuong.setText(Integer.toString(objNH.getSoLuong()));
            txtTongTienNhap.setText(Integer.toString(objNH.getTongTienHang()));
            
            
            txtGhiChu.setText(objNH.getGhiChu());
           
            txtNhaCungCap.setText(objNH.getTenNhaCungCap());
          
            txtTrangThai.setText(objNH.getTrangThai());
            dtNgayNhap.setDate(objNH.getNgayNhap());
            
        }
        
    }
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        txtTenHang.setText(tenHangHoa);
        txtMaHang.setText(maHangHoa);
        txtNhaCungCap.setText(nhaCungCap);
    }//GEN-LAST:event_formWindowActivated

    private void btnChonNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonNhaCungCapActionPerformed
        // TODO add your handling code here:
        frmChonNhaCungCap frmChon = new frmChonNhaCungCap();
        frmChon.setVisible(true);
    }//GEN-LAST:event_btnChonNhaCungCapActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        
        NhapHang objNH = new NhapHang();
        

        String maHang = "", tenHang = "", ghiChu = "", maNhapHang = "", trangThai = "",nhaCungCap="",strSoLuong="",strTongTienNhap="";

        int soLuong=0,tongTienNhap=0;
        

        maHang = txtMaHang.getText();
        tenHang = txtTenHang.getText();
        ghiChu = txtGhiChu.getText();
        nhaCungCap = txtNhaCungCap.getText();
        maNhapHang = txtMaNhapHang.getText();
        strSoLuong=txtSoLuong.getText();
        strTongTienNhap=txtTongTienNhap.getText();
        trangThai=txtTrangThai.getText();
        //Gán giá trị cho các thuộc tính
        if(tenHang.trim().length() == 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần phải chọn hàng hóa");
            
            return;
        }
        if(nhaCungCap.trim().length() == 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần phải chọn nhà cung cấp ");
            
            return;
        }
        if(strSoLuong.trim().length() ==0)
        {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần phải nhập số lượng");
            txtSoLuong.requestFocus();
            return;
        }
        if(strTongTienNhap.trim().length() == 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần phải nhập tổng tiền nhập");
            txtTongTienNhap.requestFocus();
            return;
        }
        try
        {
            soLuong=Integer.parseInt(strSoLuong);
        }
        catch(NumberFormatException ex)    
        {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần phải nhập số lượng là kiểu số.Chi tiết lỗi: "+ ex.getMessage());
            txtSoLuong.requestFocus();
            return;
        }
        try
        {
            tongTienNhap=Integer.parseInt(strTongTienNhap);
        }
        catch(NumberFormatException ex)    
        {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần phải nhập tổng tiền nhập là kiểu số.Chi tiết lỗi: "+ ex.getMessage());
            txtTongTienNhap.requestFocus();
            return;
        }
        
        objNH.setTenHang(tenHang);
        if(maNhapHang.length()!=0)
        {
            objNH.setMaNhap(maNhapHang);
        
        }
        objNH.setMaHang(maHang);
        objNH.setGhiChu(ghiChu);
        objNH.setTrangThai(trangThai);
        objNH.setNgayNhap(dtNgayNhap.getDate());
        objNH.setTenNhaCungCap(nhaCungCap);
        objNH.setTrangThai(trangThai);
        objNH.setSoLuong(soLuong);
        objNH.setTongTienHang(tongTienNhap);
                

        
        boolean ketQua = false;
         boolean ketQua1 = false;

        //Khai báo 1 đối tượng
        NhapHangBusiness sinhVienBus = new NhapHangBusiness();
        if(!maNhapHang.isEmpty())//TH sửa
        {
            ketQua1 = sinhVienBus.capNhat1(objNH);
            ketQua = sinhVienBus.capNhat(objNH);
            

        }
        else
        {
            //Thực hiện thêm mới
             ketQua1 = sinhVienBus.themMoi1(objNH);
            ketQua = sinhVienBus.themMoi(objNH);
           
        }

        if(ketQua)//true
        {
            JOptionPane.showMessageDialog(rootPane, "Thực hiện cập nhật nhập hàng thành công");
            //Reload lại danh sách
            GiaoDienChinh.hienThiDanhSachNhapHang();
        }

    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnDongActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmNhapHangAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNhapHangAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNhapHangAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNhapHangAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNhapHangAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnChonNhaCungCap;
    private javax.swing.JButton btnDong;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
=======
    private com.toedter.calendar.JDateChooser dtNgayNhap;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
>>>>>>> 4fc65b743d2ba7fdc09102c14349cf5cad2ab2ff
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtMaNhapHang;
    private javax.swing.JTextField txtNhaCungCap;
    private javax.swing.JTextField txtTongTienNhap;
    // End of variables declaration//GEN-END:variables
}
