package DomainModels;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ChiTietSPID implements Serializable {

    private NhaCungCap Id_ncc;
    private SanPham Id_sp;
    private Loai Id_Loai;
    private MauSac Id_MauSac;
}
