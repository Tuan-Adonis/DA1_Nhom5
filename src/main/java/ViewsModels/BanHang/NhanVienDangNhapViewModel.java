package ViewsModels.BanHang;

import DomainModels.NhanVien;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NhanVienDangNhapViewModel {

    private UUID id;
    private String ma;
    private String hoTen;
    private String email;
    private String matKhau;
    private int vaiTro;
    private int trangThai;

    public NhanVienDangNhapViewModel(NhanVien nv) {
        this.id = nv.getId();
        this.ma = nv.getMa();
        this.hoTen = nv.getTen();
        this.email = nv.getEmail();
        this.matKhau = nv.getMatKhau();
        this.vaiTro = nv.get_Role();
        this.trangThai = nv.getTrangThai();
    }
}
