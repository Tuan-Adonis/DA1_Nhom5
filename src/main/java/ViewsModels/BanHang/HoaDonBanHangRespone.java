/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewsModels.BanHang;

import DomainModels.HoaDon;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class HoaDonBanHangRespone {

    private String id;
    private String ma;
    private String nguoiTao;
    private String khachHang;
    private Date ngayTao;
    private int hinhThuc;
    private int trangThai;

    public HoaDonBanHangRespone(HoaDon hd) {
        try {
            this.id = hd.getId().toString();
            this.ma = hd.getMa();
            this.ngayTao = hd.getNgayTao();
            this.nguoiTao = hd.getId_NV().getMa();
            this.khachHang = hd.getId_KH().getMa();
            this.hinhThuc = hd.getLoaiThanhToan();
            this.trangThai = hd.getTinhTrang();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object[] toDataRow() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return new Object[]{
            ma,
            nguoiTao,
            khachHang,
            sdf.format(ngayTao),
            hinhThuc == 0 ? "Tiền mặt" : "Chuyển khoản",
            trangThai == 0 ? "chờ thanh toán" : (trangThai == 1 ? "Đã thanh toán" : "Đã hủy")
        };
    }
}
