/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicies;

import DomainModels.ChiTietSP;
import DomainModels.HoaDon;
import DomainModels.HoaDonCT;
import DomainModels.KhachHang;
import ViewsModels.BanHang.DonHangRespone;
import ViewsModels.BanHang.GioHangInRespone;
import ViewsModels.BanHang.GioHangRespone;
import ViewsModels.BanHang.HoaDonBanHangRespone;
import ViewsModels.BanHang.KhachHangResponBanHang;
import ViewsModels.BanHang.SanPhamBanHangResponse;
import ViewsModels.BanHang.khachHangBanHangRespone;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 *
 * @author ADMIN
 */
public interface IServiceBanHang {

    public List<HoaDonBanHangRespone> getALLHoaDonBanHang();

    public List<HoaDonBanHangRespone> getALLHoaDonChoThanhToan();

    public List<HoaDonBanHangRespone> getALLHoaDonDaThanhToan();

    public List<HoaDonBanHangRespone> getALLHoaDonDaHuy();

    public DonHangRespone getDonHang(String id);

    public List<GioHangRespone> getAllGH(String id);

    public List<GioHangRespone> getAllGHByMaHD(String Ma);

    public khachHangBanHangRespone getkh(UUID id);

    public List<SanPhamBanHangResponse> getAllSpBh();

    public boolean thanhToan(DonHangRespone dh);

    public boolean unGH(String Ma, int sl, String mahd);

    public boolean updateHuy(String maHD);

    public boolean updateHD(String maHD, double tt);

    public void UpdateSanPhamBan(String maCTSP, int sl);

    public void updateSanPhamMua(String Ma, int sl);

    public khachHangBanHangRespone getkhachHang(String maKH);

    public boolean createHoaDon(UUID idNV, String maKH, int ltt);

    public List<UUID> SelectAllMaCTSP();

    public List<UUID> SelectAllMaHD();

    public HoaDon SelectHoaDonByMa(String Ma);

    public ChiTietSP SelectCTSPByMa(String Ma);

    public HoaDonCT SelectHoaDonCTByMa(String Ma);

    public KhachHang SelectKHByMa(String ma);

    public boolean createHoaDonCT(String maHD, String maCTSP, int sl);

    public void themHDCT(HoaDonCT hdct);

    public ArrayList<HoaDonBanHangRespone> listHoaDonBanHang();

    public ArrayList<SanPhamBanHangResponse> listSanPhamBanHang();

    public ArrayList<GioHangRespone> listGioHangBanHang();

    public void INSERT(String idhd, ArrayList<GioHangInRespone> lstgh);

    public boolean InsertkhachHangBanHangRespone(KhachHangResponBanHang nhanVien);
}
