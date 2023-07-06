/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewsModels.BanHang;

import java.math.BigDecimal;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bridj.ann.Constructor;

/**
 *
 * @author LiamTrieu
 */
@Getter
@Setter
@NoArgsConstructor
public class GioHangInRespone {
    
    private String idCTSP;
    private String maSP;
    private String tenSP;
    private int soLuong;
    private BigDecimal donGia;
    private String maQR;
    private BigDecimal thanhTien;
    
    public GioHangInRespone(String idCTSP, String maSP, String tenSP, int soLuong, BigDecimal donGia) {
        this.idCTSP = idCTSP;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    
    public BigDecimal getThanhtien() {
        return donGia.multiply(BigDecimal.valueOf(soLuong));
    }
    
}
