
package ViewsModels.BanHang;

import DomainModels.HoaDonCT;
import java.math.BigDecimal;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class GioHangRespone {
    private String maSP;
    private String tenSP;
    private int soLuong;
    private BigDecimal giaBan;
    private BigDecimal thanhTien;
    
    public GioHangRespone(HoaDonCT hdct) {
        this.maSP = hdct.getId_ctsp().getMa();
        this.tenSP = hdct.getId_ctsp().getId_sp().getTen();
        this.soLuong = hdct.getSoLuong();
        this.giaBan = hdct.getId_ctsp().getGiaBan();
        this.thanhTien = giaBan.multiply(BigDecimal.valueOf(soLuong));
    }
    
    public Object[] toDataRow(){
        return new Object[]{maSP,tenSP,soLuong,giaBan,thanhTien};
    }
}
