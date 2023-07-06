/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewsModels.BanHang;

import DomainModels.KhachHang;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class khachHangBanHangRespone {

    private UUID id;
    private String ten;
    private String ma;
    private String sdt;
    private int LoaiKH;

    public khachHangBanHangRespone(KhachHang kh) {
        this.id = kh.getId();
        this.ten = kh.getHoTen();
        this.ma = kh.getMa();
        this.sdt = kh.getSdt();
        this.LoaiKH = kh.getLoaiKH();
    }
}
