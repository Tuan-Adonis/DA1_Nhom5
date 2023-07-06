/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewsModels.BanHang;

import DomainModels.HoaDon;
import java.math.BigDecimal;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DonHangRespone {

    private UUID id;
    private UUID idNV;
    private UUID idKH;
    private String maKH;
    private String tenkhachHang;
    private String sdtKH;
    private String maHD;
    private String maNV;
    private String diaChi;
    private BigDecimal tongTien;
    private int hinhThuc;
    private int trangThai;

    public DonHangRespone(HoaDon h) {
        this.id = h.getId();
        this.idKH = h.getId_KH().getId();
        this.idNV = h.getId_NV().getId();
        this.maKH = h.getId_KH().getMa();
        this.tenkhachHang = h.getId_KH().getHoTen();
        this.sdtKH = h.getId_KH().getSdt();
        this.maHD = h.getMa();
        this.maNV = h.getId_NV().getMa();
        this.diaChi = h.getDiaChi();
        this.tongTien = h.getTongTien();
        this.hinhThuc = h.getLoaiThanhToan();
        this.trangThai = h.getTinhTrang();
    }
}
