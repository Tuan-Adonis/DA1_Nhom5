/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.math.BigDecimal;

/**
 *
 * @author MINH DUC
 */
public class CTSP {
    private String id,ma,id_ncc,id_sp,loai,mau,NhaCC;
    private int kichCo, soLuong;
    private BigDecimal giaBan;
    private String urlAnh;

    public CTSP() {
    }

    public CTSP(String id, String ma, String id_ncc, String id_sp, String loai, String mau, String NhaCC, int kichCo, int soLuong, BigDecimal giaBan, String urlAnh) {
        this.id = id;
        this.ma = ma;
        this.id_ncc = id_ncc;
        this.id_sp = id_sp;
        this.loai = loai;
        this.mau = mau;
        this.NhaCC = NhaCC;
        this.kichCo = kichCo;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        this.urlAnh = urlAnh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getId_ncc() {
        return id_ncc;
    }

    public void setId_ncc(String id_ncc) {
        this.id_ncc = id_ncc;
    }

    public String getId_sp() {
        return id_sp;
    }

    public void setId_sp(String id_sp) {
        this.id_sp = id_sp;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getNhaCC() {
        return NhaCC;
    }

    public void setNhaCC(String NhaCC) {
        this.NhaCC = NhaCC;
    }

    public int getKichCo() {
        return kichCo;
    }

    public void setKichCo(int kichCo) {
        this.kichCo = kichCo;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }

    public String getUrlAnh() {
        return urlAnh;
    }

    public void setUrlAnh(String urlAnh) {
        this.urlAnh = urlAnh;
    }

    
}
