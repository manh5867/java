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
public class HangHoaBusiness {
    
/**
 *
 * @author My HP
 */

     private List<HangHoa> lstHangHoa = new ArrayList<HangHoa>();
    
    /**
     * Hàm lấy danh sách sinh viên từ db
     * @return 
     */
    public List<HangHoa> layDanhSach() {
        //Khai báo danh sách sv
        List<HangHoa> lstHangHoa = new ArrayList();
        Connection conn = null;
        try {

            conn = DataProvider.ketNoi();

            String strSQL = "Select * from HangHoa";

            Statement comm = conn.createStatement();

            ResultSet rs = comm.executeQuery(strSQL);

            HangHoa objHH;
            //Lấy dữ liệu từng dòng trong rs để đưa vào list
            while (rs.next()) {
                objHH = new HangHoa();

                //Gán giá trị cho các thuộc tính
                objHH.setMaHang(rs.getString("MaHang"));
                objHH.setTenHang(rs.getString("TenHang"));
                objHH.setGiaVon(rs.getInt("GiaVon"));
                objHH.setGiaBan(rs.getInt("GiaBan"));
                objHH.setMaNhomHang(rs.getString("NhomHang"));
                objHH.setTonKho(rs.getInt("TonKho"));
                objHH.setViTri(rs.getString("ViTri"));

                //Thêm vào danh sách
                lstHangHoa.add(objHH);
            }

        } catch (SQLException ex) {
            Logger.getLogger(HangHoaBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                //Đóng kết nối
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(HangHoaBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lstHangHoa;
    }
    public List<HangHoa> timKiemHangHoa(String tuKhoa, String nhomHang) {
        //Khai báo danh sách sv
        List<HangHoa> lstHangHoa = new ArrayList();
        Connection conn = null;
        try {

            conn = DataProvider.ketNoi();

            String strSQL = "Select * from HangHoa where 1=1";
            
            if(!tuKhoa.isEmpty())
            {
                strSQL += " AND (MaHang = '" + tuKhoa  + "%' OR tenHang like '%"
                        + tuKhoa + "%')";
            }
            
            if(!nhomHang.isEmpty())
            {
                strSQL += " AND NhomHang = '" + nhomHang + "'";
            }

            Statement comm = conn.createStatement();

            ResultSet rs = comm.executeQuery(strSQL);

            HangHoa objHH;
            //Lấy dữ liệu từng dòng trong rs để đưa vào list
            while (rs.next()) {
                objHH = new HangHoa();

                //Gán giá trị cho các thuộc tính
               objHH.setMaHang(rs.getString("MaHang"));
                objHH.setTenHang(rs.getString("TenHang"));
                objHH.setGiaVon(rs.getInt("GiaVon"));
                objHH.setGiaBan(rs.getInt("GiaBan"));
                objHH.setMaNhomHang(rs.getString("NhomHang"));
                objHH.setTonKho(rs.getInt("TonKho"));
                objHH.setViTri(rs.getString("ViTri"));

                //Thêm vào danh sách
                lstHangHoa.add(objHH);
            }

        } catch (SQLException ex) {
            Logger.getLogger(HangHoaBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                //Đóng kết nối
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(HangHoaBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lstHangHoa;
    }
    public HangHoa layChiTietTheoMa(String maHang)
    {
        HangHoa objHH = null;
        
        Connection conn = null;
        try {

            conn = DataProvider.ketNoi();

            String strSQL = "Select * from HangHoa where maHang='" + maHang + "'";

            Statement comm = conn.createStatement();

            ResultSet rs = comm.executeQuery(strSQL);

            //Lấy dữ liệu từng dòng trong rs để đưa vào list
            while (rs.next()) {
                objHH = new HangHoa();

                //Gán giá trị cho các thuộc tính
                objHH.setMaHang(rs.getString("MaHang"));
                objHH.setTenHang(rs.getString("TenHang"));
                objHH.setGiaVon(rs.getInt("GiaVon"));
                objHH.setGiaBan(rs.getInt("GiaBan"));
                objHH.setMaNhomHang(rs.getString("NhomHang"));
                objHH.setTonKho(rs.getInt("TonKho"));
                 objHH.setViTri(rs.getString("ViTri"));
                 objHH.setTrongLuong(rs.getInt("TrongLuong"));
                 objHH.setMinTonKho(rs.getInt("MinTonKho"));
                 objHH.setMaxTonKho(rs.getInt("MaxTonKho"));
                 objHH.setMoTa(rs.getString("MoTa"));
                 objHH.setDonViTinh(rs.getString("DonViTinh"));
                 
                
                
                
                
                
                //Thêm vào danh sách
                lstHangHoa.add(objHH);
            }

        } catch (SQLException ex) {
            Logger.getLogger(HangHoaBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                //Đóng kết nối
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(HangHoaBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return objHH;
    }

    public HangHoaBusiness() {
    }
    public boolean themMoi(HangHoa objHH)
    {
        Connection conn = null;
           
        try {
            
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();
            
            //Khai báo công việc
            String strInsert = "Insert into HangHoa(MaHang, TenHang, NhomHang, GiaVon, "
                    + "GiaBan, ViTri,TrongLuong,TonKho,MinTonKho,MaxTonKho,MoTa,DonViTinh) values("
                    + "?,?,?,?,?, ?, ?, ?,?,?,?,?)";
            
            PreparedStatement comm = conn.prepareStatement(strInsert);
            
            //Thiết lập các giá trị cho tham số
            comm.setString(1, objHH.getMaHang());
            comm.setString(2, objHH.getTenHang());
            comm.setString(3, objHH.getMaNhomHang());
            comm.setInt(4, objHH.getGiaVon());
            comm.setInt(5, objHH.getGiaBan());
            comm.setString(6, objHH.getViTri());
            comm.setInt(7, objHH.getTrongLuong());
            comm.setInt(8, objHH.getTonKho());
             comm.setInt(9, objHH.getMinTonKho());
              comm.setInt(10, objHH.getMaxTonKho());
               comm.setString(11, objHH.getMoTa());
                comm.setString(12, objHH.getDonViTinh());
                
                  
            
            
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
     * @param objHH
     * @return 
     */
    public boolean capNhat(HangHoa objHH)
    {
        Connection conn = null;
           
        try {
            
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();
            
            //Khai báo công việc
            String strUpdate = "Update HangHoa set TenHang=?, NhomHang = ?, GiaVon= ?, "
                    + "GiaBan = ?, ViTri = ?, "
                    + "TrongLuong = ?, TonKho=?,MinTonKho=?, MaxTonKho= ?, MoTa=?,DonViTinh = ? where MaHang = ?";
            
            PreparedStatement comm = conn.prepareStatement(strUpdate);
            
            //Thiết lập các giá trị cho tham số
            
            
            comm.setString(1, objHH.getTenHang());
            comm.setString(2, objHH.getMaNhomHang());
            comm.setInt(3, objHH.getGiaVon());
            comm.setInt(4, objHH.getGiaBan());
            comm.setString(5, objHH.getViTri());
            comm.setInt(6, objHH.getTrongLuong());
            comm.setInt(7, objHH.getTonKho());
             comm.setInt(8, objHH.getMinTonKho());
              comm.setInt(9, objHH.getMaxTonKho());
               comm.setString(10, objHH.getMoTa());
                comm.setString(11, objHH.getDonViTinh());
                comm.setString(12, objHH.getMaHang());
            
            
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
    public boolean xoa(String MaHang)
    {
       Connection conn = null;
           
        try {
            
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();
            
            //Khai báo công việc
            String strDelete = "Delete from HangHoa where MaHang = ?";
            
            PreparedStatement comm = conn.prepareStatement(strDelete);
            
            //Thiết lập các giá trị cho tham số
            
            comm.setString(1, MaHang);
            
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
