package ViewsModels.ThongKe;

import DomainModels.HoaDon;
import DomainModels.HoaDonCT;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ThongKeViewModels {

    private String maHD;
    private String maNV;
    private String maKH;
    private int sl;
    private BigDecimal tongTien;
    private Date ngayTao;

    public ThongKeViewModels(HoaDon h, List<HoaDonCT> lsthdct) {
        this.maHD = h.getMa();
        this.maNV = h.getId_NV().getMa();
        this.maKH = h.getId_KH().getMa();
        
        BigDecimal tong = null;
        int soluong = 0;
        for (HoaDonCT s : lsthdct) {
            soluong += s.getSoLuong();
            tong.add(s.getDonGia().abs().multiply(BigDecimal.valueOf(sl)));
        }
        this.sl = soluong;
        this.tongTien = tong;
        this.ngayTao = h.getNgayTao();
    }

}
