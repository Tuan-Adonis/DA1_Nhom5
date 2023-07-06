package Repositories.impl;

import DomainModels.HoaDon;
import DomainModels.HoaDonCT;
import Utilies.HibernateUtil;
import ViewsModels.ThongKe.ThongKeRepons;
import ViewsModels.ThongKe.ThongKeViewModels;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

public class RepositoryHoaDonChiTiet {

    private Session session = HibernateUtil.getSession();

    public ArrayList<ThongKeViewModels> listHDCTTK() {
        ArrayList<ThongKeViewModels> listHD = new ArrayList<>();

        try {
            Connection conn = HibernateUtil.getConnection();
            String sql = """
                          select h.Ma, n.Ma, k.Ma, sum(hdct.soLuong) as SoLuongBan, sum(hdct.soLuong*hdct.donGia) as TongTienBan, h.NgayTao
                          from HoaDon h join NhanVien n on h.Id_NV = n.Id
                          join KhachHang k on h.Id_KH = k.Id
                          join HoaDonCT hdct on hdct.Id_hd = h.Id
                          where h.TinhTrang = 1
                          group by h.Ma, n.Ma, k.Ma, h.NgayTao
                          order by h.Ma desc
                         """;

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                ThongKeViewModels tkvm = new ThongKeViewModels();
                tkvm.setMaHD(rs.getString(1));
                tkvm.setMaNV(rs.getString(2));
                tkvm.setMaKH(rs.getString(3));
                tkvm.setSl(rs.getInt(4));
                tkvm.setTongTien(rs.getBigDecimal(5));
                tkvm.setNgayTao(rs.getDate(6));

                listHD.add(tkvm);
            }
        } catch (SQLException e) {
        } catch (Exception ex) {
            Logger.getLogger(RepositoryBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listHD;
    }

    public List<ThongKeViewModels> sortTienTang() {
        List<ThongKeViewModels> listHD = new ArrayList<>();

        try {
            Connection conn = HibernateUtil.getConnection();
            String sql = """
                           select h.Ma, n.Ma, k.Ma, sum(hdct.soLuong) as SoLuongBan, sum(hdct.soLuong*hdct.donGia) as TongTienBan, h.NgayTao
                            from HoaDon h join NhanVien n on h.Id_NV = n.Id
                            join KhachHang k on h.Id_KH = k.Id
                            join HoaDonCT hdct on hdct.Id_hd = h.Id
                            where h.TinhTrang = 1
                            group by h.Ma, n.Ma, k.Ma, h.NgayTao
                            order by sum(hdct.soLuong*hdct.donGia) asc
                         """;

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                ThongKeViewModels tkvm = new ThongKeViewModels();
                tkvm.setMaHD(rs.getString(1));
                tkvm.setMaNV(rs.getString(2));
                tkvm.setMaKH(rs.getString(3));
                tkvm.setSl(rs.getInt(4));
                tkvm.setTongTien(rs.getBigDecimal(5));
                tkvm.setNgayTao(rs.getDate(6));

                listHD.add(tkvm);
            }
        } catch (SQLException e) {
        } catch (Exception ex) {
            Logger.getLogger(RepositoryBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listHD;
    }

    public List<ThongKeViewModels> sortTienGiam() {
        List<ThongKeViewModels> listHD = new ArrayList<>();

        try {
            Connection conn = HibernateUtil.getConnection();
            String sql = """
                           select h.Ma, n.Ma, k.Ma, sum(hdct.soLuong) as SoLuongBan, sum(hdct.soLuong*hdct.donGia) as TongTienBan, h.NgayTao
                            from HoaDon h join NhanVien n on h.Id_NV = n.Id
                            join KhachHang k on h.Id_KH = k.Id
                            join HoaDonCT hdct on hdct.Id_hd = h.Id
                            where h.TinhTrang = 1
                            group by h.Ma, n.Ma, k.Ma, h.NgayTao
                            order by sum(hdct.soLuong*hdct.donGia) desc
                         """;

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                ThongKeViewModels tkvm = new ThongKeViewModels();
                tkvm.setMaHD(rs.getString(1));
                tkvm.setMaNV(rs.getString(2));
                tkvm.setMaKH(rs.getString(3));
                tkvm.setSl(rs.getInt(4));
                tkvm.setTongTien(rs.getBigDecimal(5));
                tkvm.setNgayTao(rs.getDate(6));

                listHD.add(tkvm);
            }
        } catch (SQLException e) {
        } catch (Exception ex) {
            Logger.getLogger(RepositoryBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listHD;
    }

    public List<ThongKeViewModels> sortSLTang() {
        List<ThongKeViewModels> listHD = new ArrayList<>();

        try {
            Connection conn = HibernateUtil.getConnection();
            String sql = """
                           select h.Ma, n.Ma, k.Ma, sum(hdct.soLuong) as SoLuongBan, sum(hdct.soLuong*hdct.donGia) as TongTienBan, h.NgayTao
                            from HoaDon h join NhanVien n on h.Id_NV = n.Id
                            join KhachHang k on h.Id_KH = k.Id
                            join HoaDonCT hdct on hdct.Id_hd = h.Id
                            where h.TinhTrang = 1
                            group by h.Ma, n.Ma, k.Ma, h.NgayTao
                            order by sum(hdct.soLuong) asc
                         """;

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                ThongKeViewModels tkvm = new ThongKeViewModels();
                tkvm.setMaHD(rs.getString(1));
                tkvm.setMaNV(rs.getString(2));
                tkvm.setMaKH(rs.getString(3));
                tkvm.setSl(rs.getInt(4));
                tkvm.setTongTien(rs.getBigDecimal(5));
                tkvm.setNgayTao(rs.getDate(6));

                listHD.add(tkvm);
            }
        } catch (SQLException e) {
        } catch (Exception ex) {
            Logger.getLogger(RepositoryBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listHD;
    }

    public List<ThongKeViewModels> sortSLGiam() {
        List<ThongKeViewModels> listHD = new ArrayList<>();

        try {
            Connection conn = HibernateUtil.getConnection();
            String sql = """
                          select h.Ma, n.Ma, k.Ma, sum(hdct.soLuong) as SoLuongBan, sum(hdct.soLuong*hdct.donGia) as TongTienBan, h.NgayTao
                            from HoaDon h join NhanVien n on h.Id_NV = n.Id
                            join KhachHang k on h.Id_KH = k.Id
                             join HoaDonCT hdct on hdct.Id_hd = h.Id
                             where h.TinhTrang = 1
                            group by h.Ma, n.Ma, k.Ma, h.NgayTao
                            order by sum(hdct.soLuong) desc
                         """;

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                ThongKeViewModels tkvm = new ThongKeViewModels();
                tkvm.setMaHD(rs.getString(1));
                tkvm.setMaNV(rs.getString(2));
                tkvm.setMaKH(rs.getString(3));
                tkvm.setSl(rs.getInt(4));
                tkvm.setTongTien(rs.getBigDecimal(5));
                tkvm.setNgayTao(rs.getDate(6));

                listHD.add(tkvm);
            }
        } catch (SQLException e) {
        } catch (Exception ex) {
            Logger.getLogger(RepositoryBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listHD;
    }

    public ArrayList<ThongKeViewModels> listHDCTTKByDate(Date from, Date to) {
        ArrayList<ThongKeViewModels> listHD = new ArrayList<>();

        try {
            session = HibernateUtil.getSession();
            NativeQuery query = session.createNativeQuery("""
            select h.Ma, n.Ma, k.Ma, sum(hdct.soLuong) as SoLuongBan, sum(hdct.soLuong*hdct.donGia) as TongTienBan, h.NgayTao
            from HoaDon h join NhanVien n on h.Id_NV = n.Id
            join KhachHang k on h.Id_KH = k.Id
            join HoaDonCT hdct on hdct.Id_hd = h.Id
            where h.NgayTao between :from and :to
            group by h.Ma, n.Ma, k.Ma, h.NgayTao
            order by h.Ma""");
            query.setParameter("from", from.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            query.setParameter("to", to.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            List<Object[]> lsto = query.getResultList();
            for (Object[] o : lsto) {
                String MaHD = o[0].toString();
                String MaNV = o[1].toString();
                String MaKH = o[2].toString();
                String sl = o[3].toString();
                String tongTien = o[4].toString();
                String ngayTao = o[5].toString();
                listHD.add(new ThongKeViewModels());
            }

        } catch (Exception ex) {
        }

        return listHD;
    }

    public List<HoaDonCT> getHDByDate(Date from, Date to) {
        List<HoaDonCT> list = new ArrayList<>();
        try {
            session = HibernateUtil.getSession();
            Query query = session.createQuery("from HoaDonCT where Id_hd in (Select Id from HoaDon where NgayTao between :from and :to and TinhTrang = 1)", HoaDonCT.class);
            query.setParameter("from", from);
            query.setParameter("to", to);
            if (query.getResultList() != null && !query.getResultList().isEmpty()) {
                list = query.getResultList();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<HoaDonCT> SelectByHoaDonCTID(UUID id) {
        List<HoaDonCT> listHoaDonChiTiet = new ArrayList<>();
        try {
            session = HibernateUtil.getSession();
            Query query = session.createQuery("FROM HoaDonCT where Id_hd = :id", HoaDonCT.class);
            query.setParameter("id", id);
            if (query.getResultList() != null && !query.getResultList().isEmpty()) {
                listHoaDonChiTiet = query.getResultList();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDonChiTiet;
    }

    public List<ThongKeViewModels> listHDByNgay(String date1, String date2) {
        List<ThongKeViewModels> listHD = new ArrayList<>();

        try {
            Connection conn = HibernateUtil.getConnection();
            String sql = """
                          select h.Ma, n.Ma, k.Ma, sum(hdct.soLuong) as SoLuongBan, sum(hdct.soLuong*hdct.donGia) as TongTienBan, h.NgayTao
                            from HoaDon h join NhanVien n on h.Id_NV = n.Id
                            join KhachHang k on h.Id_KH = k.Id
                             join HoaDonCT hdct on hdct.Id_hd = h.Id
                             where h.TinhTrang = 1 and h.NgayTao between ? and ?
                            group by h.Ma, n.Ma, k.Ma, h.NgayTao
                            order by h.Ma desc
                         """;

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, date1);
            ps.setString(2, date2);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                ThongKeViewModels tkvm = new ThongKeViewModels();
                tkvm.setMaHD(rs.getString(1));
                tkvm.setMaNV(rs.getString(2));
                tkvm.setMaKH(rs.getString(3));
                tkvm.setSl(rs.getInt(4));
                tkvm.setTongTien(rs.getBigDecimal(5));
                tkvm.setNgayTao(rs.getDate(6));

                listHD.add(tkvm);
            }
        } catch (SQLException e) {
        } catch (Exception ex) {
            Logger.getLogger(RepositoryBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listHD;
    }
    
    
     public ArrayList<ThongKeRepons> listTop5() {
        ArrayList<ThongKeRepons> listHD = new ArrayList<>();

        try {
            Connection conn = HibernateUtil.getConnection();
            String sql = """
                          select top(5) k.HoTen, sum(hdct.soLuong) as SoLuongBan, sum(hdct.soLuong*hdct.donGia) as TongTienBan
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
