package ViewsModels.SanPhamAndChiTietSP;

import DomainModels.ChiTietSP;
import java.math.BigDecimal;

public class ChiTietSPRepons {

    private String id;
    private String ma;
    private String maSP;
    private String maNCC;
    private String tenSP;
    private String loai;
    private String mauSac;
    private int kichCo;
    private int soLuong;
    private BigDecimal donGia;
    private int trangThai;

    public ChiTietSPRepons(ChiTietSP ctsp) {
        this.id = ctsp.getId_sp().toString();
        this.ma = ctsp.getId_sp().getMa();
        this.maSP = ctsp.getId_ncc().getMa();
        this.maNCC = ctsp.getId_ncc().getMa();
        this.tenSP = ctsp.getId_sp().getTen();
        this.loai = ctsp.getId_Loai().getMa();
        this.mauSac = ctsp.getId_MauSac().getMa();
        this.kichCo = ctsp.getKichCo();
        this.soLuong = ctsp.getSoLuong();
        this.donGia = ctsp.getGiaBan();
        this.trangThai = ctsp.getId_sp().getTrangThai();
    }

    public Object[] toDataRow() {
        int i = 1;
        return new Object[]{i++, maSP, maNCC, tenSP, trangThai};
    }
}
