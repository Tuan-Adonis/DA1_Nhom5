
package ViewsModels.SanPhamAndChiTietSP;

import DomainModels.SanPham;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
public class SanPhamRepons {
    
    private UUID idSP;
    private String maSP;
    private String tenSP;
    private int trangThai;

    public SanPhamRepons(SanPham sp) {
        this.idSP = sp.getId();
        this.maSP = sp.getMa();
        this.tenSP = sp.getTen();
        this.trangThai = sp.getTrangThai();
    }
    
    public Object[] toDataRow(){
        int i = 1;
        return new Object[]{i++,maSP,tenSP,trangThai};
    }
}
