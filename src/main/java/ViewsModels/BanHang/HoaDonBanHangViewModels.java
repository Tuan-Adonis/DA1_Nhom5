package ViewsModels.BanHang;

import java.util.Date;

public class HoaDonBanHangViewModels {

    private String maHD;
    private String maNV;
    private String maKH;
    private Date ngayTao;
    private int hinhThuc;
    private int tinhTrang;

    public HoaDonBanHangViewModels() {
    }

    public HoaDonBanHangViewModels(String maHD, String maNV, String maKH, Date ngayTao, int hinhThuc, int tinhTrang) {
        this.maHD = maHD;
        this.maNV = maNV;
        this.maKH = maKH;
        this.ngayTao = ngayTao;
        this.hinhThuc = hinhThuc;
        this.tinhTrang = tinhTrang;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getHinhThuc() {
        return hinhThuc;
    }

    public void setHinhThuc(int hinhThuc) {
        this.hinhThuc = hinhThuc;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

}
