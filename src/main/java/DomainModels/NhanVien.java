package DomainModels;

import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Nationalized;

@Entity // đánh dấu là 1 thực thể
@Table(name = "NhanVien") // đánh dấu table trong database
@AllArgsConstructor// contructor có tham số
@NoArgsConstructor // contructor ko tham số
@Data

public class NhanVien {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private UUID Id;

    @Column(name = "Ma")
    private String Ma;

    @Column(name = "Ten")
    @Nationalized
    private String Ten;

    @Column(name = "GioiTinh")
    private int GioiTinh;

    @Column(name = "NgaySinh")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date NgaySinh;
    
    @Column(name = "CCCD")
    private String CCCD;

    @Column(name = "Sdt")
    private String Sdt;

    @Column(name = "MatKhau")
    private String MatKhau;

    @Column(name = "Email")
    private String Email;

    @Column(name = "DiaChi")
    @Nationalized
    private String DiaChi;

    @Column(name = "_Role")
    private int _Role;

    @Column(name = "TrangThai")
    private int TrangThai;

}
