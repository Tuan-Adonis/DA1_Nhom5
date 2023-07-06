/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.ChiTietSP;
import DomainModels.HoaDon;
import DomainModels.HoaDonCT;
import DomainModels.KhachHang;
import DomainModels.NhanVien;
import Repositories.impl.RepositoryBanHang;
import Utilies.HibernateUtil;
import ViewsModels.BanHang.GioHangInRespone;
import ViewsModels.BanHang.GioHangRespone;
import ViewsModels.BanHang.HoaDonBanHangRespone;
import ViewsModels.BanHang.SanPhamBanHangResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ADMIN
 */
public interface IRepositoryBanHang {

    public List<HoaDon> getHD();

    public List<HoaDon> getHDCTT();

    public List<HoaDon> getHDDTT();

    public List<HoaDon> getHDDH();

    public HoaDon SelectHoaDonById(String Id);

    public HoaDon SelectHoaDonByMa(String Ma);

    public ChiTietSP SelectCTSPByMa(String Ma);

    public HoaDonCT SelectHoaDonCTByMa(String Ma);

    public List<HoaDonCT> SelectByHoaDonCTID(UUID Id_hd);

    public List<HoaDonCT> SelectByHoaDonCTMa(String Ma);

    public KhachHang SelectKhachHangById(UUID Id);

    public HoaDon SelectHDById(UUID Id);

    public ChiTietSP SelectCTSPById(UUID Id);

    public List<ChiTietSP> getSP();

    public NhanVien SelectTaiKhoanById(UUID Id);

    public Boolean UpdateHoaDon(HoaDon hd);

    public Boolean UpdateSanPham(ChiTietSP hd);

    public ChiTietSP SelectChiTietSPById(UUID Id);

    public Boolean UpdateChiTietSP(ChiTietSP ctsp);

    public KhachHang SelectKHByMa(String ma);

    public Boolean InsertHoaDon(HoaDon hd);

    public List<UUID> SelectAllMaCTSP();

    public List<UUID> selectAllUUIDHD();

    public Boolean InsertHoaDonCT(HoaDonCT hdct);

    public void themHDCT(HoaDonCT hdct);

    public ArrayList<HoaDonBanHangRespone> listHoaDonBanHang();

    public ArrayList<SanPhamBanHangResponse> listSanPhamBanHang();

    public ArrayList<GioHangRespone> listGioHangBanHang();

    public void delete(String id);

    public void updateSanPhamBan(String Ma, int sl);

    public void updateSanPhamMua(String Ma, int sl);

    public void insert(String idhd, ArrayList<GioHangInRespone> lstgh);

    public Boolean InsertKhachHangResponBanHang(KhachHang tk);
}
