package Repositories.impl;

import DomainModels.ChiTietSP;
import DomainModels.HoaDon;
import DomainModels.HoaDonCT;
import DomainModels.KhachHang;
import DomainModels.NhanVien;
import Repositories.IRepositoryBanHang;
import Utilies.HibernateUtil;
import ViewsModels.BanHang.GioHangInRespone;
import ViewsModels.BanHang.GioHangRespone;
import ViewsModels.BanHang.HoaDonBanHangRespone;
import ViewsModels.BanHang.HoaDonBanHangViewModels;
import ViewsModels.BanHang.SanPhamBanHangResponse;
import ViewsModels.ThongKe.ThongKeRepons;
import ViewsModels.ThongKe.ThongKeViewModels;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

public class RepositoryBanHang implements IRepositoryBanHang {

    private Session session = HibernateUtil.getSession();

    @Override
    public List<HoaDon> getHD() {
        List<HoaDon> listHoaDon = new ArrayList<>();
        try {
            session = HibernateUtil.getSession();
            Query query = session.createQuery("FROM HoaDon where TinhTrang in (0,1,2) order by ma desc", HoaDon.class);
            if (query.getResultList() != null && !query.getResultList().isEmpty()) {
                listHoaDon = query.getResultList();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }

    @Override
    public List<HoaDon> getHDCTT() {
        List<HoaDon> listHoaDon = new ArrayList<>();
        try {
            session = HibernateUtil.getSession();
            Query query = session.createQuery("FROM HoaDon where TinhTrang = 0 order by ma desc", HoaDon.class);
            if (query.getResultList() != null && !query.getResultList().isEmpty()) {
                listHoaDon = query.getResultList();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }

    @Override
    public List<HoaDon> getHDDTT() {
        List<HoaDon> listHoaDon = new ArrayList<>();
        try {
            session = HibernateUtil.getSession();
            Query query = session.createQuery("FROM HoaDon where TinhTrang = 1 order by ma desc", HoaDon.class);
            if (query.getResultList() != null && !query.getResultList().isEmpty()) {
                listHoaDon = query.getResultList();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }

    @Override
    public List<HoaDon> getHDDH() {
        List<HoaDon> listHoaDon = new ArrayList<>();
        try {
            session = HibernateUtil.getSession();
            Query query = session.createQuery("FROM HoaDon where TinhTrang = 2 order by ma desc", HoaDon.class);
            if (query.getResultList() != null && !query.getResultList().isEmpty()) {
                listHoaDon = query.getResultList();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }

    @Override
    public HoaDon SelectHoaDonById(String Id) {
        HoaDon hd = new HoaDon();
        try {
            session = HibernateUtil.getSession();
            Query query = session.createQuery("FROM HoaDon where Id = :Id", HoaDon.class);
            query.setParameter("Id", Id);
            hd = (HoaDon) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hd;
    }

    @Override
    public HoaDon SelectHoaDonByMa(String Ma) {
        HoaDon hd = new HoaDon();
        try {
            session = HibernateUtil.getSession();
            Query query = session.createQuery("FROM HoaDon where Ma = :Ma", HoaDon.class);
            query.setParameter("Ma", Ma);
            hd = (HoaDon) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hd;
    }

    @Override
    public ChiTietSP SelectCTSPByMa(String Ma) {
        ChiTietSP hd = new ChiTietSP();
        try {
            session = HibernateUtil.getSession();
            Query query = session.createQuery("FROM ChiTietSP where Ma = :Ma", ChiTietSP.class);
            query.setParameter("Ma", Ma);
            hd = (ChiTietSP) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hd;
    }

    @Override
    public HoaDonCT SelectHoaDonCTByMa(String Ma) {
        HoaDonCT hd = new HoaDonCT();
        try {
            session = HibernateUtil.getSession();
            Query query = session.createQuery("FROM HoaDonCT where Ma = :Ma", HoaDonCT.class);
            query.setParameter("Ma", Ma);
            hd = (HoaDonCT) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hd;
    }

    @Override
    public List<HoaDonCT> SelectByHoaDonCTID(UUID Id_hd) {
        List<HoaDonCT> listHoaDonChiTiet = new ArrayList<>();
        try {
            session = HibernateUtil.getSession();
            Query query = session.createQuery("FROM HoaDonCT where Id_hd = :Id_hd", HoaDonCT.class);
            query.setParameter("Id_hd", Id_hd);
            if (query.getResultList() != null && !query.getResultList().isEmpty()) {
                listHoaDonChiTiet = query.getResultList();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDonChiTiet;
    }

    @Override
    public List<HoaDonCT> SelectByHoaDonCTMa(String Ma) {
        List<HoaDonCT> listHoaDonChiTiet = new ArrayList<>();
        try {
            session = HibernateUtil.getSession();
            Query query = session.createQuery("FROM HoaDonCT where Id_hd in(select id from HoaDon where Ma = :Ma)", HoaDonCT.class);
            query.setParameter("Ma", Ma);
            if (query.getResultList() != null && !query.getResultList().isEmpty()) {
                listHoaDonChiTiet = query.getResultList();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDonChiTiet;
    }

    @Override
    public KhachHang SelectKhachHangById(UUID Id) {
        KhachHang kh = new KhachHang();
        try {
            session = HibernateUtil.getSession();
            org.hibernate.query.Query query = session.createQuery("FROM KhachHang where id = :Id", KhachHang.class);
            query.setParameter("Id", Id);
            kh = (KhachHang) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kh;
    }

    @Override
    public HoaDon SelectHDById(UUID Id) {
        HoaDon kh = new HoaDon();
        try {
            session = HibernateUtil.getSession();
            org.hibernate.query.Query query = session.createQuery("FROM HoaDon where id = :Id", HoaDon.class);
            query.setParameter("Id", Id);
            kh = (HoaDon) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kh;
    }

    @Override
    public ChiTietSP SelectCTSPById(UUID Id) {
        ChiTietSP kh = new ChiTietSP();
        try {
            session = HibernateUtil.getSession();
            org.hibernate.query.Query query = session.createQuery("FROM ChiTietSP where id = :Id", ChiTietSP.class);
            query.setParameter("Id", Id);
            kh = (ChiTietSP) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kh;
    }

    @Override
    public List<ChiTietSP> getSP() {
        List<ChiTietSP> listChiTietSP = new ArrayList<>();
        try {
            session = HibernateUtil.getSession();
            Query query = session.createQuery("FROM ChiTietSP Where soLuong > 0", ChiTietSP.class);
            if (query.getResultList() != null) {
                listChiTietSP = query.getResultList();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listChiTietSP;
    }

    @Override
    public NhanVien SelectTaiKhoanById(UUID Id) {
        NhanVien tk = new NhanVien();
        try {
            session = HibernateUtil.getSession();
            Query query = session.createQuery("FROM NhanVien where Id = :Id", NhanVien.class);
            query.setParameter("Id", Id);
            tk = (NhanVien) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tk;
    }

    @Override
    public Boolean UpdateHoaDon(HoaDon hd) {
        Transaction tran = null;
        try {
            session = HibernateUtil.getSession();
            tran = session.beginTransaction();
            session.saveOrUpdate(hd);
            tran.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean UpdateSanPham(ChiTietSP hd) {
        Transaction tran = null;
        try {
            session = HibernateUtil.getSession();
            tran = session.beginTransaction();
            session.saveOrUpdate(hd);
            tran.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ChiTietSP SelectChiTietSPById(UUID Id) {
        ChiTietSP ctsp = new ChiTietSP();
        try {
            session = HibernateUtil.getSession();
            Query query = session.createQuery("FROM ChiTietSP where Id = :Id", ChiTietSP.class);
            query.setParameter("Id", Id);
            if (query.getSingleResult() != null) {
                ctsp = (ChiTietSP) query.getSingleResult();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ctsp;
    }

    @Override
    public Boolean UpdateChiTietSP(ChiTietSP ctsp) {
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(ctsp);
            transaction.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public KhachHang SelectKHByMa(String ma) {
        KhachHang kh = new KhachHang();
        try {
            session = HibernateUtil.getSession();
            Query query = session.createQuery("FROM KhachHang WHERE Ma = :ma", KhachHang.class);
            query.setParameter("ma", ma);
            kh = (KhachHang) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kh;
    }

    @Override
    public Boolean InsertHoaDon(HoaDon hd) {
        try {
            session = HibernateUtil.getSession();
            Transaction tran = session.getTransaction();
            tran.begin();
            session.save(hd);
            tran.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<UUID> SelectAllMaCTSP() {
        List<UUID> ctsp = new ArrayList<>();
        try {
            session = HibernateUtil.getSession();
            Query query = session.createQuery("FROM ChiTietSP", ChiTietSP.class);
            ctsp = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ctsp;
    }

    @Override
    public List<UUID> selectAllUUIDHD() {
        List<UUID> listHoaDon = new ArrayList<>();
        try {
            session = HibernateUtil.getSession();
            Query query = session.createQuery("FROM HoaDon where TinhTrang = 0", HoaDon.class);
            listHoaDon = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }

    @Override
    public Boolean InsertHoaDonCT(HoaDonCT hdct) {
        try {
            session = HibernateUtil.getSession();
            Transaction tran = session.getTransaction();
            tran.begin();
            session.save(hdct);
            tran.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void themHDCT(HoaDonCT hdct) {
        Transaction tran = null;
        try (Session ss = HibernateUtil.getSession()) {
            tran = ss.beginTransaction();
            ss.save(hdct);
            tran.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<HoaDonBanHangRespone> listHoaDonBanHang() {
        ArrayList<HoaDonBanHangRespone> listHD = new ArrayList<>();

        try {
            Connection conn = HibernateUtil.getConnection();
            String sql = """
                         select  h.Ma, n.Ma, k.Ma, h.NgayTao, h.LoaiThanhToan, h.TinhTrang, h.Id
                         from HoaDon h join KhachHang k on h.Id_KH = k.Id
                         join NhanVien n on h.Id_NV = n.Id""";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                HoaDonBanHangRespone hdvm = new HoaDonBanHangRespone();

                hdvm.setMa(rs.getString(1));
                hdvm.setNguoiTao(rs.getString(2));
                hdvm.setKhachHang(rs.getString(3));
                hdvm.setNgayTao(rs.getDate(4));
                hdvm.setHinhThuc(rs.getInt(5));
                hdvm.setTrangThai(rs.getInt(6));
                hdvm.setId(rs.getString(7));

                listHD.add(hdvm);
            }
        } catch (SQLException e) {
        } catch (Exception ex) {
            Logger.getLogger(RepositoryBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listHD;
    }

    @Override
    public ArrayList<SanPhamBanHangResponse> listSanPhamBanHang() {
        ArrayList<SanPhamBanHangResponse> listHD = new ArrayList<>();

        try {
            Connection conn = HibernateUtil.getConnection();
            String sql = """
                          select c.Ma, s.Ten, l.Ten, m.Ten, c.KichCo, c.SoLuong, c.GiaBan, c.Id
                          from ChiTietSP c
                          join SanPham s on c.Id_sp = s.Id
                          join MauSac m on c.Id_MauSac = m.Id
                          join Loai l on c.Id_Loai = l.Id
                         """;

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                SanPhamBanHangResponse hdvm = new SanPhamBanHangResponse();

                hdvm.setMaSP(rs.getString(1));
                hdvm.setTenSP(rs.getString(2));
                hdvm.setLoai(rs.getString(3));
                hdvm.setMauSac(rs.getString(4));
                hdvm.setKichCo(rs.getInt(5));
                hdvm.setSoLuong(rs.getInt(6));
                hdvm.setGiaBan(rs.getBigDecimal(7));
                hdvm.setId(rs.getString(8));
                listHD.add(hdvm);
            }
        } catch (SQLException e) {
        } catch (Exception ex) {
            Logger.getLogger(RepositoryBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listHD;
    }

    @Override
    public ArrayList<GioHangRespone> listGioHangBanHang() {
        ArrayList<GioHangRespone> listHD = new ArrayList<>();

        try {
            Connection conn = HibernateUtil.getConnection();
            String sql = """
                         select  h.Ma, n.Ma, k.Ma, h.NgayTao, h.LoaiThanhToan, h.TinhTrang, h.Id
                         from HoaDon h join KhachHang k on h.Id_KH = k.Id
                         join NhanVien n on h.Id_NV = n.Id""";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                GioHangRespone hdvm = new GioHangRespone();

                hdvm.setMaSP(rs.getString(1));
                hdvm.setTenSP(rs.getString(2));
                hdvm.setSoLuong(rs.getInt(3));
                hdvm.setGiaBan(rs.getBigDecimal(4));
                hdvm.setThanhTien(rs.getBigDecimal(5));

                listHD.add(hdvm);
            }
        } catch (SQLException e) {
        } catch (Exception ex) {
            Logger.getLogger(RepositoryBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listHD;
    }

    @Override
    public void delete(String id) {

        try {
            Connection conn = HibernateUtil.getConnection();
            String sql = "Delete From HoaDonCT where Id_HD =  ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.execute();

        } catch (SQLException e) {
        } catch (Exception ex) {
            Logger.getLogger(RepositoryBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void updateSanPhamBan(String Ma, int sl) {

        try {
            Connection conn = HibernateUtil.getConnection();
            String sql = "Update ChiTietSP Set SoLuong = SoLuong - ? Where Ma = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, sl);
            ps.setString(2, Ma);
            ps.execute();

        } catch (SQLException e) {
        } catch (Exception ex) {
            Logger.getLogger(RepositoryBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateSanPhamMua(String Ma, int sl) {

        try {
            Connection conn = HibernateUtil.getConnection();
            String sql = "Update ChiTietSP Set SoLuong = SoLuong + ? Where Ma = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, sl);
            ps.setString(2, Ma);
            ps.execute();

        } catch (SQLException e) {
        } catch (Exception ex) {
            Logger.getLogger(RepositoryBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insert(String idhd, ArrayList<GioHangInRespone> lstgh) {
        try {
            Connection con = HibernateUtil.getConnection();
            String query = "insert into HoaDonCT (Id_hd, Id_ctsp, soLuong, donGia) values(?,?,?,?)";
            PreparedStatement pre = con.prepareStatement(query);
            for (GioHangInRespone x : lstgh) {
                pre.setString(1, idhd);
                pre.setString(2, x.getIdCTSP());
                pre.setInt(3, x.getSoLuong());
                pre.setBigDecimal(4, x.getDonGia());
                pre.execute();
            }

        } catch (SQLException e) {
        } catch (Exception ex) {
            Logger.getLogger(RepositoryBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Boolean InsertKhachHangResponBanHang(KhachHang tk) {
        try {
            session = HibernateUtil.getSession();
            Transaction tran = session.getTransaction();
            tran.begin();
            session.save(tk);
            tran.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean UpdateKhachHang(KhachHang kh) {
        Transaction tran = null;
        try {
            session = HibernateUtil.getSession();
            tran = session.beginTransaction();
            session.saveOrUpdate(kh);
            tran.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ChiTietSP SelectCTSPByQRcode(String MaQR) {
        ChiTietSP hd = new ChiTietSP();
        try {
            session = HibernateUtil.getSession();
            Query query = session.createQuery("FROM ChiTietSP where MaQR = :MaQR", ChiTietSP.class);
            query.setParameter("MaQR", MaQR);
            hd = (ChiTietSP) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hd;
    }
    
    public ArrayList<ThongKeRepons> listTop5() {
        ArrayList<ThongKeRepons> listHD = new ArrayList<>();

        try {
            Connection conn = HibernateUtil.getConnection();
            String sql = """
                          select k.HoTen, sum(hdct.soLuong) as SoLuongBan, sum(hdct.soLuong*hdct.donGia) as TongTienBan
                          from HoaDon h join KhachHang k on h.Id_KH = k.Id
                          join HoaDonCT hdct on hdct.Id_hd = h.Id
                          where h.TinhTrang = 1
                          group by k.HoTen
                          order by sum(hdct.soLuong*hdct.donGia) desc
                         """;

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                ThongKeRepons tkrp = new ThongKeRepons();
                tkrp.setTenKH(rs.getString(1));
                tkrp.setSoLuong(rs.getInt(2));
                tkrp.setTongTien(rs.getBigDecimal(3));

                listHD.add(tkrp);
            }
        } catch (SQLException e) {
        } catch (Exception ex) {
            Logger.getLogger(RepositoryBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listHD;
    }
}
