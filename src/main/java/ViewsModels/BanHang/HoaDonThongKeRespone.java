/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewsModels.BanHang;

import DomainModels.HoaDon;
import DomainModels.HoaDonCT;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class HoaDonThongKeRespone {
    
     private String maHD;
    private String maNV;
    private String maKH;
    private int sl;
    private BigDecimal tongTien;

    public HoaDonThongKeRespone(HoaDon h, List<HoaDonCT> lsthdct) {
        this.maHD = h.getMa();
        this.maNV = h.getId_NV().getMa();
        this.maKH = h.getId_KH().getMa();
        int soluong = 0;
        for (HoaDonCT s : lsthdct) {
            soluong += s.getSoLuong();
        }
        this.sl = soluong;
        this.tongTien = h.getTongTien();
    }
}
