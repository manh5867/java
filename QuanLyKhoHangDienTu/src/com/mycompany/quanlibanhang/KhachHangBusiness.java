/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlibanhang;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author My HP
 */
public class KhachHangBusiness {
     private List<KhachHang> lstKhachHang = new ArrayList<KhachHang>();
    
    /**
     * Hàm lấy danh sách sinh viên từ db
     * @return 
     */
    public List<KhachHang> layDanhSach() {
        //Khai báo danh sách sv
        List<KhachHang> lstKhachHang = new ArrayList();
        Connection conn = null;
        try {

            conn = DataProvider.ketNoi();

            String strSQL = "Select * from KhachHang";

            Statement comm = conn.createStatement();

            ResultSet rs = comm.executeQuery(strSQL);

            KhachHang objKH;
            //Lấy dữ liệu từng dòng trong rs để đưa vào list
            while (rs.next()) {
                objKH = new KhachHang();

                //Gán giá trị cho các thuộc tính
                objKH.setId(rs.getString("ID"));
                objKH.setHoTen(rs.getString("HoTen"));
                objKH.setDienThoai(rs.getString("DienThoai"));
                objKH.setEmail(rs.getString("Email"));
                objKH.setDiaChi(rs.getString("DiaChi"));

                //Thêm vào danh sách
                lstKhachHang.add(objKH);
            }

        } catch (SQLException ex) {
            Logger.getLogger(KhachHangBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                //Đóng kết nối
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(KhachHangBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lstKhachHang;
    }
    
     public List<KhachHang> timKiemKhachHang(String tuKhoa) {
        //Khai báo danh sách sv
        List<KhachHang> lstKhachHang = new ArrayList();
        Connection conn = null;
        try {

            conn = DataProvider.ketNoi();

            String strSQL = "Select * from KhachHang where 1=1";
            
            if(!tuKhoa.isEmpty())
            {
                strSQL += " AND (ID = '" + tuKhoa + "'  OR HoTen like '%" + 
                        tuKhoa + "%' OR DienThoai like '%"
                        + tuKhoa + "%')";
            }
            
            
            Statement comm = conn.createStatement();

            ResultSet rs = comm.executeQuery(strSQL);

            KhachHang objSV;
            //Lấy dữ liệu từng dòng trong rs để đưa vào list
            while (rs.next()) {
                objSV = new KhachHang();

                //Gán giá trị cho các thuộc tính
                objSV.setId(rs.getString("ID"));
                objSV.setHoTen(rs.getString("HoTen"));
                objSV.setDienThoai(rs.getString("DienThoai"));
                objSV.setEmail(rs.getString("Email"));
                objSV.setDiaChi(rs.getString("DiaChi"));

                //Thêm vào danh sách
                lstKhachHang.add(objSV);
            }

        } catch (SQLException ex) {
            Logger.getLogger(KhachHangBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                //Đóng kết nối
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(KhachHangBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lstKhachHang;
    }
    public KhachHang layChiTietTheoMa(String ID)
    {
        KhachHang objKH = null;
        
        Connection conn = null;
        try {

            conn = DataProvider.ketNoi();

            String strSQL = "Select * from KhachHang where ID='" + ID + "'";

            Statement comm = conn.createStatement();

            ResultSet rs = comm.executeQuery(strSQL);

            //Lấy dữ liệu từng dòng trong rs để đưa vào list
            while (rs.next()) {
                objKH = new KhachHang();

                //Gán giá trị cho các thuộc tính
                objKH.setId(rs.getString("ID"));
                objKH.setHoTen(rs.getString("HoTen"));
                objKH.setDienThoai(rs.getString("DienThoai"));
                objKH.setEmail(rs.getString("Email"));
                objKH.setDiaChi(rs.getString("DiaChi"));
                objKH.setGioiTinh(rs.getInt("GioiTinh"));
                objKH.setNgaySinh(rs.getDate("NgaySinh"));
                objKH.setCongTyId(rs.getString("CongTyID"));
                objKH.setGhiChu(rs.getString("GhiChu"));
                objKH.setCMT(rs.getString("CMT"));
                objKH.setNgayCap(rs.getDate("NgayCapCMT"));
                objKH.setNoiCap(rs.getString("NoiCapCMT"));
                //Thêm vào danh sách
                lstKhachHang.add(objKH);
            }

        } catch (SQLException ex) {
            Logger.getLogger(KhachHangBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                //Đóng kết nối
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(KhachHangBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return objKH;
    }
    public boolean themMoi(KhachHang objKH)
    {
        Connection conn = null;
           
        try {
            
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();
            
            //Khai báo công việc
            String strInsert = "Insert into KhachHang(ID, HoTen, DienThoai, Email, DiaChi, "
                    + "GioiTinh, NgaySinh,GhiChu,CMT,NgayCapCMT,NoiCapCMT,CongTyID) values("
                    + "?,?,?,?,?, ?, ?, ?,?,?,?,?)";
            
            PreparedStatement comm = conn.prepareStatement(strInsert);
            
            //Thiết lập các giá trị cho tham số
            comm.setString(1, objKH.getId());
            comm.setString(2, objKH.getHoTen());
            comm.setString(3, objKH.getDienThoai());
            comm.setString(4, objKH.getEmail());
            comm.setString(5, objKH.getDiaChi());
            comm.setInt(6, objKH.getGioiTinh());
            comm.setDate(7, new Date(objKH.getNgaySinh().getTime()));
            comm.setString(8, objKH.getGhiChu());
             comm.setString(9, objKH.getCMT());
              comm.setDate(10, new Date( objKH.getNgayCap().getTime()));
               comm.setString(11, objKH.getNoiCap());
                comm.setString(12, objKH.getCongTyId());
                
                  
            
            
            //Thực hiện công việc
           return (comm.executeUpdate() > 0);
           
        } catch (SQLException ex) {
            System.err.println("Co loi xay ra trong qua trinh them thong tin. "
                    + "Chi tiet: " + ex.getMessage());
        }
        finally
        {
             try {
                if(conn != null){
                //Đóng kết nối
                conn.close();
                }
            } catch (SQLException ex) {
                System.err.println("Co loi xay ra. Chi tiet: " + ex.getMessage());
            }
        }
        
        return false;
    }
    
    /**
     * Hàm cập nhật thông tin sinh viên mới
     * @param objKH
     * @return 
     */
    public boolean capNhat(KhachHang objKH)
    {
        Connection conn = null;
           
        try {
            
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();
            
            //Khai báo công việc
            String strUpdate = "Update KhachHang set HoTen=?, DienThoai = ?, Email = ?, "
                    + "DiaChi = ?, GioiTinh = ?, "
                    + "NgaySinh = ?, GhiChu=?,CMT=?, NgayCapCMT = ?, NoiCapCMT=?,CongTyID = ? where ID = ?";
            
            PreparedStatement comm = conn.prepareStatement(strUpdate);
            
            //Thiết lập các giá trị cho tham số
            
           comm.setString(1, objKH.getHoTen());
            comm.setString(2, objKH.getDienThoai());
            comm.setString(3, objKH.getEmail());
            comm.setString(4, objKH.getDiaChi());
            comm.setInt(5, objKH.getGioiTinh());
            comm.setDate(6, new Date(objKH.getNgaySinh().getTime()));
            comm.setString(7, objKH.getGhiChu());
             comm.setString(8, objKH.getCMT());
              comm.setDate(9, new Date( objKH.getNgayCap().getTime()));
               comm.setString(10, objKH.getNoiCap());
                comm.setString(11, objKH.getCongTyId());
                comm.setString(12, objKH.getId());
            
            
            //Thực hiện công việc
           return (comm.executeUpdate() > 0);
           
        } catch (SQLException ex) {
            System.err.println("Co loi xay ra trong qua trinh cap nhat thong tin. "
                    + "Chi tiet: " + ex.getMessage());
        }
        finally
        {
             try {
                if(conn != null){
                //Đóng kết nối
                conn.close();
                }
            } catch (SQLException ex) {
                System.err.println("Co loi xay ra. Chi tiet: " + ex.getMessage());
            }
        }
        
        return false;
    }
    
    /**
     * Xóa sinh viên trong hệ thống
     * @param ID
     * @return 
     */
    public boolean xoa(String ID)
    {
       Connection conn = null;
           
        try {
            
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();
            
            //Khai báo công việc
            String strDelete = "Delete from KhachHang where ID = ?";
            
            PreparedStatement comm = conn.prepareStatement(strDelete);
            
            //Thiết lập các giá trị cho tham số
            
            comm.setString(1, ID);
            
            //Thực hiện công việc
           return (comm.executeUpdate() > 0);
           
        } catch (SQLException ex) {
            System.err.println("Co loi xay ra trong qua trinh cap nhat thong tin. "
                    + "Chi tiet: " + ex.getMessage());
        }
        finally
        {
             try {
                if(conn != null){
                //Đóng kết nối
                conn.close();
                }
            } catch (SQLException ex) {
                System.err.println("Co loi xay ra. Chi tiet: " + ex.getMessage());
            }
        }
        
        return false;
    }
    
    
}
