/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ControlDb {
     private Dbsql dBSQLSever;
    private Connection connection;

    public ControlDb() {
        dBSQLSever = new Dbsql();
        connection = dBSQLSever.openConnection();
    }
    
    
    public ArrayList<NhaTro> getlist(){
        ArrayList<NhaTro> list = new ArrayList<>();
        try {
            String sql = "select * from QuanLyNhaTro where trangThai=1 ";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            list.clear();
            while (rs.next()) {
                String maphong = rs.getString(1);
                String giaphong = rs.getString(2);
                String soluong = rs.getString(3);
                String dientich = rs.getString(4);
                String dichvu = rs.getString(5);
                NhaTro nt = new NhaTro(maphong,giaphong,soluong,dientich,dichvu);
                list.add(nt);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return  list;
    }
    public boolean update(String maphong,String giaphong,String soluong,String dientich,String dichvu){
        try {
            String sql = "update QuanLyNhaTro set GiaPhong = ? , SoLuong = ? , DienTich = ?, " + " DichVu = ? where MaPhong= ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(5, maphong);
            st.setString(1, giaphong);
            st.setString(2, soluong);
            st.setString(3, dientich);
            st.setString(4, dichvu);
            if (st.executeUpdate() > 0) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return  false;
    } 
    public boolean hide(String maphong) {
        try {
            String sql = "update QuanLyNhaTro set trangThai=0 where MaPhong = ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, maphong);
            return st.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    public boolean save(String maphong , String giaphong , String soluog , String dientich , String dichvu){
        try {
            String sql = "INSERT INTO QuanLyNhaTro(MaPhong, GiaPhong, SoLuong, DienTich, DichVu , trangThai)\n" +"VALUES" + " (?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, maphong);
            ps.setString(2, giaphong);
            ps.setString(3, soluog);
            ps.setString(4, dientich);
            ps.setString(5, dichvu); 
            ps.setInt(6, 1);
            if (ps.executeUpdate() > 0) {            
                return true;               
            }          
        } catch (Exception e) {
            System.out.println(e);            
        }
        return false;
    }
    }
