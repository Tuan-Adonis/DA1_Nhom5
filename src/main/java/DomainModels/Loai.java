/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Nationalized;

/**
 *
 * @author MINH DUC
 */

@Entity // đánh dấu là 1 thực thể
@Table(name = "Loai") // đánh dấu table trong database
@AllArgsConstructor// contructor có tham số
@NoArgsConstructor // contructor ko tham số
@Data
public class Loai {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private UUID Id;

    @Column(name = "Ma")
    private String Ma;

    @Column(name = "Ten")
    @Nationalized
    private String Ten;
}
