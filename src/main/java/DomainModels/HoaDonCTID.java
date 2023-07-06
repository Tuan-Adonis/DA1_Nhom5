package DomainModels;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public class HoaDonCTID implements Serializable {

    private HoaDon Id_hd;
    private ChiTietSP Id_ctsp;
}
