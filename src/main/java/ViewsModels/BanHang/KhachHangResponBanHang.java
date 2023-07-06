package ViewsModels.BanHang;

import DomainModels.KhachHang;
import java.util.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class KhachHangResponBanHang {

    private String maKH;
    private String tenKH;
    private String SDT;
    private String diaChi;
    private Date ns;

    public KhachHangResponBanHang(KhachHang kh) {
        this.maKH = kh.getMa();
        this.tenKH = kh.getHoTen();
        this.SDT = kh.getSdt();
        this.diaChi = "Hà Nội";
        this.ns = new Date();
    }
}
