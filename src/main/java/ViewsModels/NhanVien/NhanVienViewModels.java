package ViewsModels.NhanVien;

import DomainModels.NhanVien;
import java.util.Date;
import java.time.LocalDate;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NhanVienViewModels {

    private UUID id;
    private String maNV;
    private String tenNV;
    private int gioiTinh;
    private Date ngaySinh;
    private String SDT;
    private String matKhau;
    private String Email;
    private String diaChi;
    private int vaiTro;
    private int TrangThai;

    public NhanVienViewModels(NhanVien nv) {
        this.id = nv.getId();
        this.maNV = nv.getMa();
        this.tenNV = nv.getTen();
        this.gioiTinh = nv.getGioiTinh();
        this.ngaySinh = nv.getNgaySinh();
        this.SDT = nv.getSdt();
        this.matKhau = nv.getMatKhau();
        this.Email = nv.getEmail();
        this.diaChi = nv.getDiaChi();
        this.vaiTro = nv.get_Role();
        this.TrangThai = nv.getTrangThai();
    }

    public Object[] toDataRow() {
        return new Object[]{
            maNV,
            tenNV,
            gioiTinh == 0 ? "Nam" : "Nữ",
            ngaySinh,
            SDT,
            matKhau,
            Email,
            diaChi,
            vaiTro == 0 ? "Quản Lý" : "Nhân Viên",
            TrangThai == 0 ? "Đang làm" : "Nghỉ làm"};
    }
}
