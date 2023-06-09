/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.quanlibanhang;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author My HP
 */
public class frmHangHoaAdd extends javax.swing.JFrame {
    
    private boolean ThongTin;

    public void setThongTin(boolean ThongTin) {
        this.ThongTin = ThongTin;
    }

    private String maHangHoa = "";

    public String getMaHangHoa() {
        return maHangHoa;
    }

    public void setMaHangHoa(String maHangHoa) {
        this.maHangHoa = maHangHoa;
    }

   
    /**
     * Creates new form frmHangHoaAdd
     */
    public frmHangHoaAdd() {
        initComponents();
    }
    private void hienThiChiTiet()
    {
        HangHoa objHH = DataProvider.getHangHoaBus().layChiTietTheoMa(maHangHoa);
        
        if(objHH != null)
        {
            txtMaHang.setText(maHangHoa);
            txtMaHang.setEditable(false);
            txtTenHang.setText(objHH.getTenHang());
            txtGiaBan.setText(Integer.toString(objHH.getGiaBan()));
            
            
            txtMoTa.setText(objHH.getMoTa());
            
            txtViTri.setText(objHH.getViTri());
            
            txtTonKho.setText(Integer.toString(objHH.getTonKho()));
            
            
            if(!objHH.getMaNhomHang().isEmpty())
            {
                NhomHangBusiness bus = new NhomHangBusiness();
                
                NhomHang objNH = bus.layChiTietTheoMa(objHH.getMaNhomHang());
                
                if(objNH != null)
                {
                    cboNhomHang.getModel().setSelectedItem(objNH);
                }
            }
            
        }
        
    }
    private void hienThiDanhSachNH()
    {
        NhomHangBusiness nhomNHBusiness = new NhomHangBusiness();
        
        //Lấy danh sách
        List<NhomHang> lstNH = nhomNHBusiness.layDanhSach();
        
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        
        for(NhomHang objNH : lstNH)
        {
            model.addElement(objNH);
        }
        
        //Sửa lại nội dung cần hiển thị ra trên combobox
        cboNhomHang.setRenderer(new NhomHangRender());
        
        cboNhomHang.setModel(model);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // </editor-fold>                        

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        
    }                                     

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        this.setVisible(false);
    }
    // TODO add your handling code here:



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtMaHang = new javax.swing.JTextField();
        txtTenHang = new javax.swing.JTextField();
        txtViTri = new javax.swing.JTextField();
        txtGiaBan = new javax.swing.JTextField();
        txtTonKho = new javax.swing.JTextField();
        cboNhomHang = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtMoTa = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnThemNhomHang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin hàng hóa"));

        jLabel32.setText("Mã hàng (*):");

        jLabel33.setText("Tên hàng (*):");

        jLabel34.setText("Nhóm hàng:");

        jLabel35.setText("Vị trí:");

        jLabel38.setText("Tồn kho (*):");

        jLabel41.setText("Giá hàng (*):");

        cboNhomHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Mô tả:");

        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/com/stanford/j0622/qlsinhvien/images/save.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/com/stanford/j0622/qlsinhvien/images/cancel.gif"))); // NOI18N
        jButton2.setText("Đóng");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("VND");

        btnThemNhomHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/com/stanford/j0622/qlsinhvien/images/add-icon.png"))); // NOI18N
        btnThemNhomHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNhomHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaHang)
                            .addComponent(txtTenHang)
                            .addComponent(cboNhomHang, 0, 164, Short.MAX_VALUE)
                            .addComponent(txtViTri))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThemNhomHang)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel38))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGiaBan)
                            .addComponent(txtTonKho, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel4)))
                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLuu)
                .addGap(36, 36, 36)
                .addComponent(jButton2)
                .addGap(78, 78, 78))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(txtMaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41)
                            .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel33)
                                .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel40))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel34)
                                .addComponent(cboNhomHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnThemNhomHang))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(txtViTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(txtTonKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu)
                    .addComponent(jButton2))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        hienThiDanhSachNH();
        if (ThongTin==true)
        {
            hienThiChiTiet();
            this.setTitle("Thông tin khách hàng");
            btnLuu.setVisible(false);
            
        }
        if(!maHangHoa.isEmpty())//TH sửa
        {
            this.setTitle("Sửa thông tin khách hàng");
            
            
            //Hiển thị chi tiết sinh viên trước khi sửa
            hienThiChiTiet();
        }
        else
        {
            this.setTitle("Thêm mới thông tin khách hàng");
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        
        HangHoa objHH = new HangHoa();

        String maHang = "", tenHang = "", moTa = "", donViTinh = "", viTri = "";

        int giaBan=0,giaVon=0,trongLuong=0,minTonKho=0,maxTonKho=0,tonKho=0;

        maHang = txtMaHang.getText();
        tenHang = txtTenHang.getText();
        moTa = txtMoTa.getText();
        
        viTri = txtViTri.getText();
        giaBan=Integer.parseInt(txtGiaBan.getText());
       
        tonKho=Integer.parseInt(txtTonKho.getText());
        

        //Gán giá trị cho các thuộc tính
        objHH.setMaHang(maHang);
        
        objHH.setTenHang(tenHang);
        objHH.setMoTa(moTa);
        objHH.setDonViTinh(donViTinh);
        objHH.setViTri(viTri);
        objHH.setGiaBan(giaBan);
        objHH.setGiaVon(giaVon);
        objHH.setTrongLuong(trongLuong);
        objHH.setTonKho( tonKho);
        objHH.setMinTonKho(minTonKho);
        objHH.setMaxTonKho(maxTonKho);
        NhomHang objNH = (NhomHang)cboNhomHang.getSelectedItem();

        if(objNH != null)
        {
            objHH.setMaNhomHang(objNH.getMaNhomHang());
        }

        boolean ketQua = false;

        //Khai báo 1 đối tượng
        HangHoaBusiness sinhVienBus = new HangHoaBusiness();

        if(!maHangHoa.isEmpty())//TH sửa
        {
            ketQua = sinhVienBus.capNhat(objHH);

        }
        else
        {
            //Thực hiện thêm mới
            ketQua = sinhVienBus.themMoi(objHH);
        }

        if(ketQua)//true
        {
            JOptionPane.showMessageDialog(rootPane, "Thực hiện cập nhật khách hàng thành công");
            //Reload lại danh sách
            GiaoDienChinh.hienThiDanhSachHangHoa();
        }

    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnThemNhomHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNhomHangActionPerformed
        // TODO add your handling code here:
        frmNhomHangAdd frmThemMoi = new frmNhomHangAdd();
        frmThemMoi.setVisible(true);
        hienThiDanhSachNH();
        
    }//GEN-LAST:event_btnThemNhomHangActionPerformed

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
            java.util.logging.Logger.getLogger(frmHangHoaAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHangHoaAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHangHoaAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHangHoaAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHangHoaAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThemNhomHang;
    private javax.swing.JComboBox<String> cboNhomHang;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtMaHang;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtTenHang;
    private javax.swing.JTextField txtTonKho;
    private javax.swing.JTextField txtViTri;
    // End of variables declaration//GEN-END:variables
}
