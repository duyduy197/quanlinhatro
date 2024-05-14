/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

/**
 *
 * @author user
 */
public class NhaTro {
    String MaPhong ;
    String GiaPhong;
    String SoLuong;
    String DienTich;
    String DichVu;
    private int hiddenState; 
   

    public NhaTro(String MaPhong, String GiaPhong, String SoLuong, String DienTich, String DichVu) {
        this.MaPhong = MaPhong;
        this.GiaPhong = GiaPhong;
        this.SoLuong = SoLuong;
        this.DienTich = DienTich;
        this.DichVu = DichVu;
        this.hiddenState = hiddenState;
    }
    
    
    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getGiaPhong() {
        return GiaPhong;
    }

    public void setGiaPhong(String GiaPhong) {
        this.GiaPhong = GiaPhong;
    }

    public String getSoLuong() {
        return SoLuong;
    }
     public int getHiddenState() {
        return hiddenState;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getDienTich() {
        return DienTich;
    }

    public void setDienTich(String DienTich) {
        this.DienTich = DienTich;
    }

    public String getDichVu() {
        return DichVu;
    }

    public void setDichVu(String DichVu) {
        this.DichVu = DichVu;
    }
    public void setHiddenState(int hiddenState) {
        this.hiddenState = hiddenState;
    }
  
}
