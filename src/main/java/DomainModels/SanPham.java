package DomainModels;

import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Entity // đánh dấu là 1 thực thể
@Table(name = "SanPham") // đánh dấu table trong database
@AllArgsConstructor// contructor có tham số
@NoArgsConstructor // contructor ko tham số
@Data

public class SanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private UUID Id;

    @Column(name = "Ma")
    private String Ma;

    @Column(name = "Ten")
    @Nationalized
    private String Ten;

    @Column(name = "TrangThai")
    private int TrangThai;
    

}
