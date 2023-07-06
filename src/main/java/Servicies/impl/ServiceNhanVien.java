package Servicies.impl;

import DomainModels.NhanVien;
import Repositories.impl.RepositoryNhanVien;
import Servicies.IServiceNhanVien;
import ViewsModels.BanHang.NhanVienDangNhapViewModel;
import ViewsModels.NhanVien.NhanVienViewModels;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class ServiceNhanVien implements IServiceNhanVien {
    
    RepositoryNhanVien repo;
    
    public ServiceNhanVien() {
        this.repo = new RepositoryNhanVien();
    }
    
    public NhanVienDangNhapViewModel dangNhap(String Email, String MatKhau) {
        NhanVienDangNhapViewModel user = new NhanVienDangNhapViewModel(this.repo.DangNhap(Email, MatKhau));
        if (user.getTrangThai() == 0) {
            return user;
        }
        return null;
    }
    
    public UUID checkEmail(String Email) {
        return this.repo.checkEmail(Email);
    }
    
    public NhanVien checkEmailNhanVien(String Email) {
        return this.repo.checkEmailNhanVien(Email);
    }
    
    public String checkMatKhau(String MatKhau) {
        return this.repo.checkMatKhau(MatKhau);
    }
    
    public boolean UpdateTaiKhoan(NhanVienDangNhapViewModel nvvm) {
        NhanVien nv = new NhanVien();
        nv.setMatKhau(nvvm.getMatKhau());
        return this.repo.UpdateTaiKhoan(nv);
    }
    
    public List<NhanVienViewModels> getAllNV() {
        try {
            List<NhanVien> lst = repo.getAllNV();
            return lst.stream().map(NhanVienViewModels::new).collect(Collectors.toList());
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
    
    public boolean Insert(NhanVienViewModels nhanVien) {
        SimpleDateFormat sdf = new SimpleDateFormat("yMMddHHmmssSSS");
        NhanVien nvrp = new NhanVien();
        nvrp.setMa(nhanVien.getMaNV());
        nvrp.setTen(nhanVien.getTenNV());
        nvrp.setGioiTinh(nhanVien.getGioiTinh());
        nvrp.setNgaySinh(nhanVien.getNgaySinh());
        nvrp.setCCCD(String.valueOf(sdf.format(new Date())));
        nvrp.setSdt(nhanVien.getSDT());
        nvrp.setMatKhau(nhanVien.getMatKhau());
        nvrp.setEmail(nhanVien.getEmail());
        nvrp.setDiaChi(nhanVien.getDiaChi());
        nvrp.set_Role(nhanVien.getVaiTro());
        nvrp.setTrangThai(nhanVien.getTrangThai());
        return repo.InsertTaiKhoan(nvrp);
    }
    
    public boolean Update(NhanVienViewModels nhanVien) {
        NhanVien nvrp = new NhanVien();
        nvrp.setTen(nhanVien.getTenNV());
        nvrp.setGioiTinh(nhanVien.getGioiTinh());
        nvrp.setNgaySinh(nhanVien.getNgaySinh());
        nvrp.setSdt(nhanVien.getSDT());
        nvrp.setMatKhau(nhanVien.getMatKhau());
        nvrp.setDiaChi(nhanVien.getDiaChi());
        nvrp.set_Role(nhanVien.getVaiTro());
        nvrp.setTrangThai(nhanVien.getTrangThai());
        return repo.UpdateNhanVienHBN(nvrp);
    }
    
    @Override
    public void addNhanVien(NhanVien nv) {
        this.repo.addNhanVien(nv);
    }
    
    @Override
    public void updateNhanVien(NhanVien nv) {
        this.repo.updateNhanVien(nv);
    }
    
    public void updateMKNhanVien(NhanVien nv, String matKhau) {
        this.repo.updateMKNhanVien(nv, matKhau);
    }
    
    @Override
    public List<NhanVien> listNv() {
        return this.repo.listNv();
    }
    
    public List<NhanVien> listNhanVien() {
        return repo.listKhachHang();
    }
}
