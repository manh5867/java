/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlibanhang;

import java.util.Date;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;


/**
 *
 * @author My HP
 */
public class KhachHang {
    
    private String Id;
    private String hoTen;
    private int gioiTinh;
    private Date ngaySinh;
    private String dienThoai;
    private String email;
    private String diaChi;
    private String ghiChu;
    private String congTyId;
    private String CMT;
    private String noiCap;
    private Date ngayCap;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getCongTyId() {
        return congTyId;
    }

    public void setCongTyId(String congTyId) {
        this.congTyId = congTyId;
    }

    public String getCMT() {
        return CMT;
    }

    public void setCMT(String CMT) {
        this.CMT = CMT;
    }

    public String getNoiCap() {
        return noiCap;
    }

    public void setNoiCap(String noiCap) {
        this.noiCap = noiCap;
    }

    public Date getNgayCap() {
        return ngayCap;
    }

    public void setNgayCap(Date ngayCap) {
        this.ngayCap = ngayCap;
    }
    
    public KhachHang(String Id)
    {
        this.Id=Id;
    }
     public KhachHang()  
     {
         
     }
     // ham tra ve ten va id tien hanh set
      public  ArrayList<String> getlistID(){
        ArrayList<String> list=new ArrayList<>();
          try{
           Connection c = ketnoi.lienket();
           Statement d=c.createStatement();
           ResultSet rs=d.executeQuery("SELECT CUSTOMER_ID FROM khachhang");
           while(rs.next()){
           
              String id=rs.getString("CUSTOMER_ID");
              list.add(id);
           
           }
           ketnoi.dongketnoi(c);
          }catch(SQLException e){e.printStackTrace();}    
       return list;
      }     
      public ArrayList<String> getten(){
       ArrayList<String> list=new ArrayList<>();
          try{
           Connection c = ketnoi.lienket();
           Statement d=c.createStatement();
           ResultSet rs=d.executeQuery("SELECT CUSTOMER_NAME FROM khachhang");
           while(rs.next()){
           
              String ten=rs.getString("CUSTOMER_NAME");
              list.add(ten);
           
           }
           ketnoi.dongketnoi(c);
          }catch(SQLException e){e.printStackTrace();}    
       return list;
      
      
      }
      public  ArrayList<String> getds(){
        ArrayList<String>list=new ArrayList<>();
        ArrayList<String>list1=new ArrayList<>();
      list=this.getten();
       for(String i:list ){
       
        String s = i.substring(i.lastIndexOf(" ")+1);
        list1.add(s);
       }
       return list1;
      }
      public static void main(String[] args){
       KhachHang a = new KhachHang();
         ArrayList<String> list = new ArrayList<>();
         list=a.getds();
         for(String id:list){
          System.out.println(id+" ");
         
         }
         /*String id1="2";
         if(list.contains(id1)==true){
         
         System.out.println("co ton tai ");
         }*/
      }
     
    
}
