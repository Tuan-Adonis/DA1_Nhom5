/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.impl;

import DomainModels.HoaDon;
import ViewsModels.SanPhamAndChiTietSP.HDCTRepo;
import Repositories.IRepositoryHoaDon;
import Utilies.HibernateUtil;
import com.google.zxing.Result;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.TemporalType;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author ADMIN
 */
public class RepositoryHoaDon implements IRepositoryHoaDon {

    @Override
    public List<HoaDon> getListHD() {
        Session ss = HibernateUtil.getSession();
        Query query = ss.createQuery("From HoaDon order by ma asc");
        List<HoaDon> list = query.getResultList();
        return list;
    }

    @Override
    public List<HDCTRepo> getListHDCT(String ma) {
        List<HDCTRepo> list = new ArrayList<>();
        String query = "select b.Ma,d.Ma,a.soLuong,a.donGia from HoaDonCT a inner join HoaDon b on a.Id_hd = b.Id\n"
                + "inner join ChiTietSP c on a.Id_ctsp = c.id\n"
                + "inner join SanPham d on c.Id_sp = d.Id\n"
                + "where b.Ma = ?\n"
                + "order by b.Ma asc";
        try (Connection conn = HibernateUtil.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HDCTRepo hdct = new HDCTRepo();
                hdct.setMaHD(rs.getString(1));
                hdct.setMaSP(rs.getString(2));
                hdct.setSoLuong(rs.getInt(3));
                hdct.setDonGia(rs.getBigDecimal(4));

                list.add(hdct);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public List<ViewsModels.SanPhamAndChiTietSP.HoaDon> getListHDByNgay(String ngayBD, String ngayKT) {
        List<ViewsModels.SanPhamAndChiTietSP.HoaDon> list = new ArrayList<>();
        String query = "select ma,ngayTao,Sdt_KH,diaChi,LoaiThanhToan,TongTien,TinhTrang from HoaDon where NgayTao between ? and ?";
        try (Connection conn = HibernateUtil.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ngayBD);
            ps.setObject(2, ngayKT);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ViewsModels.SanPhamAndChiTietSP.HoaDon hd = new ViewsModels.SanPhamAndChiTietSP.HoaDon();
                hd.setMa(rs.getString(1));
                hd.setNgayTao(rs.getString(2));
                hd.setSDT(rs.getString(3));
                hd.setDiaChi(rs.getString(4));
                hd.setLoaiTT(rs.getString(5));
                hd.setTongTien(rs.getString(6));
                hd.setTinhTrang(rs.getString(7));
                
                list.add(hd);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<HDCTRepo> getListHDCTByMaSP(String ma, String maHD) {
        List<HDCTRepo> list = new ArrayList<>();
        String query = "select b.Ma,d.Ma,a.soLuong,a.donGia from HoaDonCT a inner join HoaDon b on a.Id_hd = b.Id\n"
                + "inner join ChiTietSP c on a.Id_ctsp = c.id\n"
                + "inner join SanPham d on c.Id_sp = d.Id\n"
                + "where d.Ma = ? and b.Ma = ?\n"
                + "order by b.Ma asc";
        try (Connection conn = HibernateUtil.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ma);
            ps.setObject(2, maHD);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HDCTRepo hdct = new HDCTRepo();
                hdct.setMaHD(rs.getString(1));
                hdct.setMaSP(rs.getString(2));
                hdct.setSoLuong(rs.getInt(3));
                hdct.setDonGia(rs.getBigDecimal(4));

                list.add(hdct);
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    

}
