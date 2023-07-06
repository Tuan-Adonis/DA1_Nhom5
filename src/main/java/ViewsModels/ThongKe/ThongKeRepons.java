/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewsModels.ThongKe;

import DomainModels.HoaDon;
import DomainModels.HoaDonCT;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ThongKeRepons {

    private String tenKH;
    private int soLuong;
    private BigDecimal tongTien;

    public ThongKeRepons(String tenkh,  int sl, BigDecimal tong) {
        this.tenKH = tenkh;
        this.soLuong = sl;
        this.tongTien = tong;
    }
}
