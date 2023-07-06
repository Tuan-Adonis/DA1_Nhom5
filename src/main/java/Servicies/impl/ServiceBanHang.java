package Servicies.impl;

import DomainModels.ChiTietSP;
import DomainModels.HoaDon;
import DomainModels.HoaDonCT;
import DomainModels.KhachHang;
import Repositories.impl.RepositoryBanHang;
import Servicies.IServiceBanHang;
import ViewsModels.BanHang.DonHangRespone;
import ViewsModels.BanHang.GioHangInRespone;
import ViewsModels.BanHang.GioHangRespone;
import ViewsModels.BanHang.HoaDonBanHangRespone;
import ViewsModels.BanHang.HoaDonBanHangViewModels;
import ViewsModels.BanHang.KhachHangResponBanHang;
import ViewsModels.BanHang.SanPhamBanHangResponse;
import ViewsModels.BanHang.khachHangBanHangRespone;
import ViewsModels.ThongKe.ThongKeRepons;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class ServiceBanHang implements IServiceBanHang {

    RepositoryBanHang repo;

    public ServiceBanHang() {
        this.repo = new RepositoryBanHang();
    }

    @Override
    public List<HoaDonBanHangRespone> getALLHoaDonBanHang() {
        List<HoaDonBanHangRespone> lstHd = new ArrayList<>();
        List<HoaDon> hds = repo.getHD();
        lstHd = hds.stream().map(HoaDonBanHangRespone::new).collect(Collectors.toList());
        List<HoaDonBanHangRespone> lstHDBH = new ArrayList<>();
        for (HoaDonBanHangRespone s : lstHd) {
            HoaDonBanHangRespone hd = new HoaDonBanHangRespone();
            try {
                hd = s;
            } catch (Exception e) {
            }
            lstHDBH.add(hd);
        }
        return lstHDBH;
    }

    @Override
    public List<HoaDonBanHangRespone> getALLHoaDonChoThanhToan() {
        List<HoaDonBanHangRespone> lstHd = new ArrayList<>();
        List<HoaDon> hds = repo.getHDCTT();
        lstHd = hds.stream().map(HoaDonBanHangRespone::new).collect(Collectors.toList());
        List<HoaDonBanHangRespone> lstHDBH = new ArrayList<>();
        for (HoaDonBanHangRespone s : lstHd) {
            HoaDonBanHangRespone hd = new HoaDonBanHangRespone();
            try {
                hd = s;
            } catch (Exception e) {
            }
            lstHDBH.add(hd);
        }
        return lstHDBH;
    }

    @Override
    public List<HoaDonBanHangRespone> getALLHoaDonDaThanhToan() {
        List<HoaDonBanHangRespone> lstHd = new ArrayList<>();
        List<HoaDon> hds = repo.getHDDTT();
        lstHd = hds.stream().map(HoaDonBanHangRespone::new).collect(Collectors.toList());
        List<HoaDonBanHangRespone> lstHDBH = new ArrayList<>();
        for (HoaDonBanHangRespone s : lstHd) {
            HoaDonBanHangRespone hd = new HoaDonBanHangRespone();
            try {
                hd = s;
            } catch (Exception e) {
            }
            lstHDBH.add(hd);
        }
        return lstHDBH;
    }

    @Override
    public List<HoaDonBanHangRespone> getALLHoaDonDaHuy() {
        List<HoaDonBanHangRespone> lstHd = new ArrayList<>();
        List<HoaDon> hds = repo.getHDDH();
        lstHd = hds.stream().map(HoaDonBanHangRespone::new).collect(Collectors.toList());
        List<HoaDonBanHangRespone> lstHDBH = new ArrayList<>();
        for (HoaDonBanHangRespone s : lstHd) {
            HoaDonBanHangRespone hd = new HoaDonBanHangRespone();
            try {
                hd = s;
            } catch (Exception e) {
            }
            lstHDBH.add(hd);
        }
        return lstHDBH;
    }

    @Override
    public DonHangRespone getDonHang(String id) {
        HoaDon hd = repo.SelectHoaDonById(id);
        DonHangRespone dh = new DonHangRespone(hd);
        return dh;
    }

    @Override
    public List<GioHangRespone> getAllGH(String id) {
        HoaDon hd = repo.SelectHoaDonById(id);
        List<HoaDonCT> hdcts = repo.SelectByHoaDonCTID(hd.getId());
        List<GioHangRespone> gh = hdcts.stream().map(GioHangRespone::new).collect(Collectors.toList());
        return gh;
    }

    @Override
    public List<GioHangRespone> getAllGHByMaHD(String Ma) {
        HoaDon hd = repo.SelectHoaDonByMa(Ma);
        List<HoaDonCT> hdcts = repo.SelectByHoaDonCTMa(hd.getMa());
        List<GioHangRespone> gh = hdcts.stream().map(GioHangRespone::new).collect(Collectors.toList());
        return gh;
    }

    @Override
    public khachHangBanHangRespone getkh(UUID id) {
        return new khachHangBanHangRespone(repo.SelectKhachHangById(id));
    }

    @Override
    public List<SanPhamBanHangResponse> getAllSpBh() {
        List<ChiTietSP> ctsp = repo.getSP();
        List<SanPhamBanHangResponse> spbh = ctsp.stream().map(SanPhamBanHangResponse::new).collect(Collectors.toList());
        List<SanPhamBanHangResponse> lstSP = new ArrayList<>();
        for (SanPhamBanHangResponse s : spbh) {
            SanPhamBanHangResponse sp = new SanPhamBanHangResponse();
            try {
                sp = s;
            } catch (Exception e) {
            }
            lstSP.add(sp);
        }
        return lstSP;
    }

    @Override
    public boolean thanhToan(DonHangRespone dh) {
        try {
            HoaDon hd = repo.SelectHoaDonById(dh.getMaHD());
            hd.setId_KH(repo.SelectKhachHangById(dh.getIdKH()));
            hd.setId_NV(repo.SelectTaiKhoanById(dh.getIdNV()));
            hd.setMa(dh.getMaHD());
            hd.setNgayTao(new Date());
            hd.setSdt_KH(dh.getSdtKH());
            hd.setDiaChi(dh.getDiaChi());
            hd.setLoaiThanhToan(dh.getHinhThuc());
            hd.setTongTien(dh.getTongTien());
            hd.setTinhTrang(0);
            return repo.UpdateHoaDon(hd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean unGH(String Ma, int sl, String mahd) {
        HoaDon idHD = repo.SelectHoaDonByMa(mahd);
        repo.updateSanPhamBan(Ma, sl);
        repo.delete(String.valueOf(idHD.getId()));
        return true;
    }

    @Override
    public boolean updateHuy(String maHD) {
        HoaDon hd = repo.SelectHoaDonByMa(maHD);
        hd.setTinhTrang(2);
        return repo.UpdateHoaDon(hd);
    }

    @Override
    public boolean updateHD(String maHD, double tt) {
        HoaDon hd = repo.SelectHoaDonByMa(maHD);
        hd.setTinhTrang(1);
        hd.setTongTien(BigDecimal.valueOf(tt));
        return repo.UpdateHoaDon(hd);
    }

    @Override
    public void UpdateSanPhamBan(String maCTSP, int sl) {
        repo.updateSanPhamBan(maCTSP, sl);
    }

    @Override
    public void updateSanPhamMua(String Ma, int sl) {
        repo.updateSanPhamMua(Ma, sl);
    }

    @Override
    public khachHangBanHangRespone getkhachHang(String maKH) {
        KhachHang kh = repo.SelectKHByMa(maKH);
        khachHangBanHangRespone dh = new khachHangBanHangRespone(kh);
        return dh;
    }

    @Override
    public boolean createHoaDon(UUID idNV, String maKH, int ltt) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        KhachHang kh = repo.SelectKHByMa(maKH);
        HoaDon hd = new HoaDon();
        try {
            String maHD = "HD" + sdf.format(new Date());
            hd.setMa(maHD);
            hd.setId_NV(repo.SelectTaiKhoanById(idNV));
            hd.setId_KH(repo.SelectKhachHangById(kh.getId()));
            hd.setTinhTrang(0);
            hd.setSdt_KH(kh.getSdt());
            hd.setNgayTao(new Date());
            hd.setDiaChi("Tại cửa hàng");
            hd.setTongTien(new BigDecimal(0));
            hd.setLoaiThanhToan(ltt);
            repo.InsertHoaDon(hd);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<UUID> SelectAllMaCTSP() {
        return repo.SelectAllMaCTSP();
    }

    @Override
    public List<UUID> SelectAllMaHD() {
        return repo.selectAllUUIDHD();
    }

    @Override
    public HoaDon SelectHoaDonByMa(String Ma) {
        return repo.SelectHoaDonByMa(Ma);
    }

    @Override
    public ChiTietSP SelectCTSPByMa(String Ma) {
        return repo.SelectCTSPByMa(Ma);
    }

    @Override
    public HoaDonCT SelectHoaDonCTByMa(String Ma) {
        return repo.SelectHoaDonCTByMa(Ma);
    }

    @Override
    public KhachHang SelectKHByMa(String ma) {
        return repo.SelectKHByMa(ma);
    }

    @Override
    public boolean createHoaDonCT(String maHD, String maCTSP, int sl) {
        HoaDonCT hdct = new HoaDonCT();
        HoaDon hd = repo.SelectHoaDonByMa(maHD);
        ChiTietSP ctsp = repo.SelectCTSPByMa(maHD);
        try {
            hdct.setId_hd(repo.SelectHDById(hd.getId()));
            hdct.setId_ctsp(repo.SelectCTSPById(ctsp.getId()));
            hdct.setSoLuong(sl);
            hdct.setDonGia(ctsp.getGiaBan());
            repo.InsertHoaDonCT(hdct);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void themHDCT(HoaDonCT hdct) {
        repo.themHDCT(hdct);
    }

    @Override
    public ArrayList<HoaDonBanHangRespone> listHoaDonBanHang() {
        return repo.listHoaDonBanHang();
    }

    @Override
    public ArrayList<SanPhamBanHangResponse> listSanPhamBanHang() {
        return repo.listSanPhamBanHang();
    }

    @Override
    public ArrayList<GioHangRespone> listGioHangBanHang() {
        return repo.listGioHangBanHang();
    }

    @Override
    public void INSERT(String idhd, ArrayList<GioHangInRespone> lstgh) {
        repo.insert(idhd, lstgh);

    }

    @Override
    public boolean InsertkhachHangBanHangRespone(KhachHangResponBanHang nhanVien) {
        KhachHang nvrp = new KhachHang();
        nvrp.setMa(nhanVien.getMaKH());
        nvrp.setHoTen(nhanVien.getTenKH());
        nvrp.setSdt(nhanVien.getSDT());
        return repo.InsertKhachHangResponBanHang(nvrp);
    }

    public boolean updateKhachHang(String maKH, int lkh) {
        KhachHang kh = repo.SelectKHByMa(maKH);
        kh.setLoaiKH(lkh);
        return repo.UpdateKhachHang(kh);
    }

    public ChiTietSP SelectCTSPByQRcode(String MaQR) {
        return repo.SelectCTSPByQRcode(MaQR);
    }
    
     public ArrayList<ThongKeRepons> listTop5() {
          return repo.listTop5();
      }
}
