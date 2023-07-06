/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewsModels.BanHang;

import DomainModels.ChiTietSP;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class SanPhamBanHangResponse {

    private String id;
    private String maSP;
    private String tenSP;
    private String loai;
    private String mauSac;
    private int kichCo;
    private int soLuong;
    private BigDecimal giaBan;

    public SanPhamBanHangResponse(ChiTietSP ctsp) {
        this.id = ctsp.getId().toString();
        this.maSP = ctsp.getMa();
        this.tenSP = ctsp.getId_sp().getTen();
        this.loai = ctsp.getId_Loai().getTen();
        this.mauSac = ctsp.getId_MauSac().getTen();
        this.kichCo = ctsp.getKichCo();
        this.soLuong = ctsp.getSoLuong();
        this.giaBan = ctsp.getGiaBan();
    }

    public Object[] toDataRow() {
        return new Object[]{maSP, tenSP, loai, mauSac, kichCo, soLuong, giaBan};
    }
}
