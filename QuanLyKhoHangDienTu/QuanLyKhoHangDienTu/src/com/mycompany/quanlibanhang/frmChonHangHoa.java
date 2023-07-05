/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.quanlibanhang;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author My HP
 */
public class frmChonHangHoa extends javax.swing.JFrame {

    /**
     * Creates new form frmChonHangHoa
     */
    private static String tenHangHoa;
    private static String maHangHoa;

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    /**
     *
     * @param tenHangHoa
     */
    public static void setTenHangHoa(String tenHangHoa) {
        frmChonHangHoa.tenHangHoa = tenHangHoa;
    }

    public String getMaHangHoa() {
        return maHangHoa;
    }

    public static void setMaHangHoa(String maHangHoa) {
        frmChonHangHoa.maHangHoa = maHangHoa;
    }
    public frmChonHangHoa() {
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

        jPanel14 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        txtTimKiemID2 = new javax.swing.JTextField();
        btnTimKiem2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        txtGiaVon = new javax.swing.JTextField();
        txtGiaBan = new javax.swing.JTextField();
        txtViTri = new javax.swing.JTextField();
        txtMoTa = new javax.swing.JTextField();
        btnDong2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableHangHoa = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtMaHang = new javax.swing.JTextField();
        txtTenHang = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtDinhMucTon = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtTonKho = new javax.swing.JTextField();
        lbDonViTinh = new javax.swing.JLabel();
        txtNhomHang = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnChon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSoLuongXuat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel26.setText("Giá vốn:");

        jLabel27.setText("Giá bán:");

        jLabel28.setText("Vị trí:");

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm hàng hóa"));

        jLabel29.setText("Từ khóa:");

        txtTimKiemID2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemID2ActionPerformed(evt);
            }
        });

        btnTimKiem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/com/stanford/j0622/qlsinhvien/images/search.png"))); // NOI18N
        btnTimKiem2.setText("Tìm kiếm");

        jLabel2.setText("Nhóm hàng:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel29)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, 0, 149, Short.MAX_VALUE)
                            .addComponent(txtTimKiemID2)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnTimKiem2)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(txtTimKiemID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btnTimKiem2)
                .addGap(16, 16, 16))
        );

        jLabel30.setText("Mô tả:");

        btnDong2.setText("Đóng");
        btnDong2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDong2ActionPerformed(evt);
            }
        });

        jTableHangHoa.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableHangHoa.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTableHangHoaComponentAdded(evt);
            }
        });
        jTableHangHoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableHangHoaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableHangHoa);

        jLabel34.setText("Mã hàng:");

        jLabel35.setText("Tên hàng:");

        jLabel36.setText("Nhóm hàng:");

        jLabel37.setText("Định mức tồn:");

        jLabel38.setText("Tồn kho:");

        lbDonViTinh.setText("đơn vị");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Xuất hàng"));

        btnChon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/com/stanford/j0622/qlsinhvien/images/accept.png"))); // NOI18N
        btnChon.setText("Chọn");
        btnChon.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonActionPerformed(evt);
            }
        });

        jLabel1.setText("Số lượng cần xuất:");

        txtSoLuongXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(btnChon, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(txtSoLuongXuat))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtSoLuongXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnChon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addComponent(jLabel28)
                            .addComponent(jLabel36)
                            .addComponent(jLabel38))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(txtTonKho, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbDonViTinh))
                            .addComponent(txtMaHang, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(txtTenHang)
                            .addComponent(txtViTri, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNhomHang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(254, 254, 254))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGiaVon, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtGiaBan, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                        .addComponent(txtDinhMucTon)
                                        .addComponent(txtMoTa)))
                                .addGap(53, 53, 53)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDong2)
                        .addGap(12, 12, 12))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel34)
                                    .addComponent(txtMaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26)
                                    .addComponent(txtGiaVon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel35)
                                            .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel27))
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel14Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel36)
                                                    .addComponent(jLabel37)
                                                    .addComponent(txtNhomHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                                        .addComponent(txtViTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                                        .addComponent(jLabel30)
                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                            .addGroup(jPanel14Layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                                        .addComponent(jLabel28)
                                                        .addGap(32, 32, 32)
                                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel38)
                                                            .addComponent(txtTonKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(lbDonViTinh)))
                                                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap())))
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(txtDinhMucTon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnDong2)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(392, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static void hienThiDanhSachHangHoa()
    {
        //Khai báo 1 tiêu đề
        String colTieuDe[] = new String[]{"Mã hàng", "Tên hàng", "Nhóm hàng", "Vị trí", "Tồn kho"};
        
        //Khai báo đối tượng để thiển thị lên table
        DefaultTableModel model = new DefaultTableModel(colTieuDe, 0);
        
        //Lấy danh sách sv
        List<HangHoa> lstHangHoa = DataProvider.getHangHoaBus().layDanhSach();
        
        Object row[] = null;
        
        //Duyệt để đưa vào model
        for(HangHoa kh : lstHangHoa)
        {
            //Khởi tạo mảng
            row = new Object[5];
            
            row[0] = kh.getMaHang();
            row[1] = kh.getTenHang();
            row[2] = kh.getMaNhomHang();
            row[3] = kh.getViTri();
            row[4] = kh.getTonKho();
            
            //Thêm vào model
            model.addRow(row);
        }
        
        //Hiển thị lên table
        jTableHangHoa.setModel(model);        
    }
    private void txtTimKiemID2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemID2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemID2ActionPerformed

    private void btnDong2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDong2ActionPerformed
        // TODO add your handling code he
    }//GEN-LAST:event_btnDong2ActionPerformed

    private void jTableHangHoaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTableHangHoaComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableHangHoaComponentAdded

    private void jTableHangHoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHangHoaMouseClicked
        // TODO add your handling code here:
        int dongChon = 0;

        dongChon = jTableHangHoa.getSelectedRow();

        String ID = "";

        //Lấy mã sv của dòng chọn trên jtable
        ID = "" + jTableHangHoa.getValueAt(dongChon, 0);
        HangHoa objKH = DataProvider.getHangHoaBus().layChiTietTheoMa(ID);

        if(objKH != null)
        {
            txtMaHang.setText(ID);
            txtMaHang.setEditable(false);
            txtTenHang.setText(objKH.getTenHang());

            txtViTri.setText(objKH.getViTri());
            txtTonKho.setText(Integer.toString(objKH.getTonKho()));
            txtGiaBan.setText(Integer.toString(objKH.getGiaBan()));
            txtNhomHang.setText(objKH.getMaNhomHang());

            txtGiaVon.setText(Integer.toString(objKH.getGiaVon()));
            lbDonViTinh.setText(objKH.getDonViTinh());
            txtDinhMucTon.setText(objKH.getMinTonKho()+" < "+ objKH.getMaxTonKho());

        }
    }//GEN-LAST:event_jTableHangHoaMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        hienThiDanhSachHangHoa();
    }//GEN-LAST:event_formWindowOpened

    private void btnChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
        
        frmNhapHangAdd.setTenHangHoa(txtTenHang.getText());
         frmNhapHangAdd.setMaHangHoa(txtMaHang.getText());
         frmHoaDonAdd.setTenHangHoa(txtTenHang.getText());
         frmHoaDonAdd.setMaHangHoa(txtMaHang.getText());
         
    }//GEN-LAST:event_btnChonActionPerformed

    private void txtSoLuongXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongXuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongXuatActionPerformed

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
            java.util.logging.Logger.getLogger(frmChonHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmChonHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmChonHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmChonHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmChonHangHoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChon;
    private javax.swing.JButton btnDong2;
    private javax.swing.JButton btnTimKiem2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JScrollPane jScrollPane3;
    private static javax.swing.JTable jTableHangHoa;
    private javax.swing.JLabel lbDonViTinh;
    private javax.swing.JTextField txtDinhMucTon;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtGiaVon;
    private javax.swing.JTextField txtMaHang;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtNhomHang;
    private javax.swing.JTextField txtSoLuongXuat;
    private javax.swing.JTextField txtTenHang;
    private javax.swing.JTextField txtTimKiemID2;
    private javax.swing.JTextField txtTonKho;
    private javax.swing.JTextField txtViTri;
    // End of variables declaration//GEN-END:variables
}
