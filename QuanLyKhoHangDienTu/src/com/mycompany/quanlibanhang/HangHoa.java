/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlibanhang;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import javax.swing.JTable;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author My HP
 */
public class HangHoa {
    
    
    private String maHang;
    private String tenHang;
    private int giaVon;
    private int giaBan;
    private int tonKho;
    private int trongLuong;
    private String moTa;
    private String xuatXu;
    private String viTri;
    private String maNhomHang;
    private String tenNhomHang;

    public String getTenNhomHang() {
        return tenNhomHang;
    }

    public void setTenNhomHang(String tenNhomHang) {
        this.tenNhomHang = tenNhomHang;
    }

    public String getMaNhomHang() {
        return maNhomHang;
    }

    public void setMaNhomHang(String maNhomHang) {
        this.maNhomHang = maNhomHang;
    }
    private String donViTinh;

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getGiaVon() {
        return giaVon;
    }

    public void setGiaVon(int giaVon) {
        this.giaVon = giaVon;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getTonKho() {
        return tonKho;
    }

    public void setTonKho(int tonKho) {
        this.tonKho = tonKho;
    }

    public int getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(int trongLuong) {
        this.trongLuong = trongLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    
    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public int getMinTonKho() {
        return minTonKho;
    }

    public void setMinTonKho(int minTonKho) {
        this.minTonKho = minTonKho;
    }

    public int getMaxTonKho() {
        return maxTonKho;
    }

    public void setMaxTonKho(int maxTonKho) {
        this.maxTonKho = maxTonKho;
    }

   
    private int minTonKho;
    private int maxTonKho;

   
    public HangHoa()
    {
        
    }
    public HangHoa(String maHang)
    {
        this.maHang=maHang;
    }
    
    public ArrayList<String> getlistid(){
      ArrayList<String> list= new ArrayList<>();
      try{
      Connection c = ketnoi.lienket();
      Statement d = c.createStatement();
      ResultSet rs= d.executeQuery("SELECT * FROM sanpham");
      while(rs.next()){
      list.add(rs.getString("PRODUCT_ID"));
     
      }
      
       ketnoi.dongketnoi(c);
      }catch(SQLException e){e.printStackTrace();}
      return list;
    
    }
    public ArrayList<String> getlistten(){
      ArrayList<String> list= new ArrayList<>();
      try{
      Connection c = ketnoi.lienket();
      Statement d = c.createStatement();
      ResultSet rs= d.executeQuery("SELECT * FROM sanpham");
      while(rs.next()){
      list.add(rs.getString("PRODUCT_NAME"));
     
      }
      
       ketnoi.dongketnoi(c);
      }catch(SQLException e){e.printStackTrace();}
      return list;
    
    }
    
}
