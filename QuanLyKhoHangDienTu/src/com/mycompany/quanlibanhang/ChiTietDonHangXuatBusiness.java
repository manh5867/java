/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlibanhang;

import java.sql.Connection;
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
public class ChiTietDonHangXuatBusiness {
    
    public List<ChiTietDonHangXuat> layDanhSach(String ID) {
        //Khai báo danh sách sv
        List<ChiTietDonHangXuat> lstChiTietDonHangXuat = new ArrayList();
        Connection conn = null;
        try {

            conn = DataProvider.ketNoi();

            String strSQL = "Select * from chitietdonhangxuat where EXPORT_ID='" + ID + "'";

            Statement comm = conn.createStatement();

            ResultSet rs = comm.executeQuery(strSQL);

            ChiTietDonHangXuat objCT;
            //Lấy dữ liệu từng dòng trong rs để đưa vào list
            while (rs.next()) {
                objCT = new ChiTietDonHangXuat();

                //Gán giá trị cho các thuộc tính
                objCT.setID(rs.getString("EXPORTDETAIL_ID"));
                objCT.setTenHang(rs.getString("PRODUCT_NAME"));
                objCT.setSoLuong(rs.getInt("QUANTITY_EXP"));
                objCT.setGiaTien(rs.getInt("PRICE_EXP"));
                objCT.setTongGiaTien(rs.getInt("TOTAL_PRICE_EXP"));
                
                

                //Thêm vào danh sách
                lstChiTietDonHangXuat.add(objCT);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CongTyBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                //Đóng kết nối
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(CongTyBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lstChiTietDonHangXuat;
    }
    
   
    
    public boolean themMoi(ChiTietDonHangXuat objKH)
    {
        Connection conn = null;
           
        try {
            
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();
            
            //Khai báo công việc
            String strInsert = "Insert into ChiTietDonHangXuat(EXPORTDETAIL_ID, PRODUCT_NAME, QUANTITY_EXP, PRICE_EXP, TOTAL_PRICE_EXP,EXPORT_ID "
                    + ") values("
                    + "?,?,?,?,?,?)";
            
            PreparedStatement comm = conn.prepareStatement(strInsert);
            
            //Thiết lập các giá trị cho tham số
            comm.setString(1, objKH.getID());
            comm.setString(2, objKH.getTenHang());
            comm.setInt(3, objKH.getSoLuong());
            comm.setInt(4, objKH.getGiaTien());
            comm.setInt(5, objKH.getTongGiaTien());
             comm.setString(6, objKH.getIdDonHangXuat());
            
           
            
               
                
                  
            
            
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
    public boolean themMoiTonKho(ChiTietDonHangXuat objNH)
    {
        Connection conn = null;
           
        try {
            int SoLuong=0;
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();
            
            //Khai báo công việc
            String strSQL = "Select * from HangHoa where PRODUCT_NAME='" + objNH.getTenHang()+ "'";

            Statement coa = conn.createStatement();

            ResultSet rs = coa.executeQuery(strSQL);   
            while (rs.next())
            {
                SoLuong=rs.getInt("PRODUCT_QUANTITY");
            }
              SoLuong-=objNH.getSoLuong();
            String strUpdate = "Update HangHoa set  PRODUCT_QUANTITY=?  where PRODUCT_NAME = ?";
            
             PreparedStatement comm = conn.prepareStatement(strUpdate);    
            comm.setInt(1, SoLuong);
            comm.setString(2, objNH.getTenHang());
                
                
             
                
                  
            
            
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
    public boolean capNhat(ChiTietDonHangXuat objKH)
    {
        Connection conn = null;
           
        try {
            
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();
            
            //Khai báo công việc
            String strUpdate = "Update ChiTietDonHangXuat set  QUANTITY_EXP = ?, PRICE_EXP = ?,TOTAL_PRICE_EXP=? "
                   
                    + "  where EXPORTDETAIL_ID = ?";
            
            PreparedStatement comm = conn.prepareStatement(strUpdate);
            
            //Thiết lập các giá trị cho tham số
            
          
            comm.setInt(1, objKH.getSoLuong());
            comm.setInt(2, objKH.getGiaTien());
            comm.setInt(3, objKH.getTongGiaTien());
             
            
                comm.setString(4, objKH.getID());
            
            
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
            String strDelete = "Delete from ChiTietDonHangXuat where EXPORTDETAIL_ID = ?";
            
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
    public boolean capNhatTonKho(ChiTietDonHangXuat objNH,int soLuongCu)
    {
        int soLuong=0;
        Connection conn = null;
           
        try {
            int SoLuong=0;
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();
            String strSQL = "Select * from HangHoa where PRODUCT_NAME='" + objNH.getTenHang()+ "'";

            Statement coa = conn.createStatement();

            ResultSet rs = coa.executeQuery(strSQL);   
            while (rs.next())
            {
                SoLuong=rs.getInt("PRODUCT_QUANTITY");
            }
            //Khai báo công việc
            
           
    

            

            
           
                SoLuong=SoLuong-objNH.getSoLuong()+soLuongCu;
            String strUpdate1 = "Update HangHoa set  PRODUCT_QUANTITY=?  where PRODUCT_NAME = ?";
            
            PreparedStatement comm = conn.prepareStatement(strUpdate1);    
            comm.setInt(1, SoLuong);
            comm.setString(2, objNH.getTenHang());            //Thực hiện công việc
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
    public boolean xoaTonKho(String tenHang,int soLuong)
    {
       Connection conn = null;
           
       
            
            //Khai báo công việc
           try {
            int SoLuong=0;
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();
           
          
            //Khai báo công việc
            String strSQL = "Select * from HangHoa where PRODUCT_NAME='" + tenHang+ "'";

            Statement coa = conn.createStatement();

            ResultSet rs = coa.executeQuery(strSQL);   
            while (rs.next())
            {
                SoLuong=rs.getInt("PRODUCT_QUANTITY");
            }
                SoLuong+=soLuong;
            String strUpdate = "Update HangHoa set  PRODUCT_QUANTITY=?  where PRODUCT_NAME = ?";
            
             PreparedStatement comm = conn.prepareStatement(strUpdate);    
            comm.setInt(1, SoLuong);
            comm.setString(2, tenHang);
                
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
            
            //Thực hiện công việc
           
        
        return false;
    }
}
