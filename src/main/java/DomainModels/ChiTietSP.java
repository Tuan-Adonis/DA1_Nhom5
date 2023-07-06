package DomainModels;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // đánh dấu là 1 thực thể
@Table(name = "ChiTietSP") // đánh dấu table trong database
@AllArgsConstructor // contructor có tham số
@NoArgsConstructor // contructor ko tham số
@Data // getter setter tostring

public class ChiTietSP implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private UUID Id;

    @Column(name = "Ma")
    private String Ma;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_ncc", referencedColumnName = "Id")
    private NhaCungCap Id_ncc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_sp", referencedColumnName = "Id")
    private SanPham Id_sp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_Loai", referencedColumnName = "Id")
    private Loai Id_Loai;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_MauSac", referencedColumnName = "Id")
    private MauSac Id_MauSac;

    @Column(name = "KichCo")
    private int KichCo;

    @Column(name = "SoLuong")
    private int SoLuong;

    @Column(name = "GiaBan")
    private BigDecimal GiaBan;

    @Column(name = "UrlAnh")
    private String UrlAnh;

    @Column(name = "MaQR")
    private String MaQR;
}
