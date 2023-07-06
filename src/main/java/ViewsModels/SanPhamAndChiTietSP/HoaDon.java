/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewsModels.SanPhamAndChiTietSP;

/**
 *
 * @author MINH DUC
 */
public class HoaDon {
    private String ma,ngayTao,SDT,diaChi,LoaiTT,TongTien,TinhTrang; 

    public HoaDon() {
    }

    public HoaDon(String ma, String ngayTao, String SDT, String diaChi, String LoaiTT, String TongTien, String TinhTrang) {
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.SDT = SDT;
        this.diaChi = diaChi;
        this.LoaiTT = LoaiTT;
        this.TongTien = TongTien;
        this.TinhTrang = TinhTrang;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiTT() {
        return LoaiTT;
    }

    public void setLoaiTT(String LoaiTT) {
        this.LoaiTT = LoaiTT;
    }

    public String getTongTien() {
        return TongTien;
    }

    public void setTongTien(String TongTien) {
        this.TongTien = TongTien;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
}
