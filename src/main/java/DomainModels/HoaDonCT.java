package DomainModels;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // đánh dấu là 1 thực thể
@Table(name = "HoaDonCT") // đánh dấu table trong database
@IdClass(HoaDonCTID.class)
@AllArgsConstructor// contructor có tham số
@NoArgsConstructor // contructor ko tham số
@Data

public class HoaDonCT implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private UUID Id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_hd", referencedColumnName = "Id")
    private HoaDon Id_hd;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_ctsp", referencedColumnName = "Id")
    private ChiTietSP Id_ctsp;

    @Column(name = "soLuong")
    private int soLuong;

    @Column(name = "donGia")
    private BigDecimal donGia;
}
