package DomainModels;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Nationalized;

@Entity // đánh dấu là 1 thực thể
@Table(name = "HoaDon") // đánh dấu table trong database
@AllArgsConstructor// contructor có tham số
@NoArgsConstructor // contructor ko tham số
@Data

public class HoaDon {

    @Id
    @Column(name = "Id")
    @GeneratedValue
    private UUID Id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_KH", referencedColumnName = "Id")
    private KhachHang Id_KH;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_NV", referencedColumnName = "Id")
    private NhanVien Id_NV;

    @Column(name = "Ma")
    private String Ma;

    @Column(name = "NgayTao")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date NgayTao;

    @Column(name = "Sdt_KH")
    private String Sdt_KH;

    @Column(name = "DiaChi")
    @Nationalized
    private String DiaChi;

    @Column(name = "LoaiThanhToan")
    private int LoaiThanhToan;

    @Column(name = "TongTien")
    private BigDecimal TongTien;

    @Column(name = "TinhTrang")
    private int TinhTrang;

}
