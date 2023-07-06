/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.impl;

import DomainModels.CTSP;
import DomainModels.ChiTietSP;
import DomainModels.Loai;
import DomainModels.MauSac;
import DomainModels.NhaCungCap;
import DomainModels.SanPham;
import Repositories.IRepositorySanPham;
import Utilies.HibernateUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.NoResultException;
import javax.swing.TransferHandler;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class RepositorySanPham implements IRepositorySanPham {

//    private Session ss = HibernateUtil.getSession();
    @Override
    public List<SanPham> AllListSP() {
        Session session = HibernateUtil.getSession();
        Query query = session.createQuery("From SanPham order by Ma asc", SanPham.class);
        List<SanPham> list = query.getResultList();
        session.close();

        return list;
    }

    @Override
    public void them(SanPham sp) {
        Transaction tran = null;
        try (Session session = HibernateUtil.getSession()) {
            tran = session.beginTransaction();
            session.save(sp);
            tran.commit();
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<SanPham> checkMa(String ma) {
        Session session = HibernateUtil.getSession();
        Query query = session.createQuery("From SanPham where MA = :MA");
        query.setParameter("MA", ma);
        return query.getResultList();
    }
//    @Override
//    public SanPham checkMa(String ma) {
//        Session session = HibernateUtil.getSession();
//        Query query = session.createQuery("From SanPham where MA = :MA");
//        query.setParameter("MA", ma);
//        try {
//            if (query.getResultList() != null) {
//                return (SanPham) query.getSingleResult();
//            }
//        } catch (NoResultException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }

    @Override
    public Boolean update(SanPham sp) {
        try {
            Session session = HibernateUtil.getSession();
            Transaction tran = session.beginTransaction();
            Query query = session.createQuery("update SanPham set Ten = :Ten where Ma = :Ma ");
            query.setParameter("Ten", sp.getTen());
            query.setParameter("Ma", sp.getMa());
            query.executeUpdate();
            tran.commit();
            session.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean themCTSP(CTSP ctsp, String ma) {
        int check = 0;
        String query = "begin\n"
                + "	declare @id_sp varchar(50), @id_ncc varchar(50), @id_Loai varchar(50), @id_MauSac varchar(50)\n"
                + "	set @id_sp = (select id from SanPham where Ma = ? )\n"
                + "	set @id_ncc = (select id from NhaCungCap where Ten = ? )\n"
                + "	set @id_Loai = (select id from Loai where Ten = ? )\n"
                + "	set @id_MauSac = (select id from MauSac where Ten = ? )\n"
                + "	insert into ChiTietSP(ma,Id_sp,Id_Loai,Id_MauSac,Id_ncc,KichCo,SoLuong,GiaBan,UrlAnh)\n"
                + "	values(?,@id_sp,@id_Loai,@id_MauSac,@id_ncc,?,?,?,?)\n"
                + "	if(?>0)\n"
                + "		begin\n"
                + "			update SanPham set TrangThai = 0 where id = @id_sp\n"
                + "		end\n"
                + "	else\n"
                + "		begin\n"
                + "			update SanPham set TrangThai = 1 where id = @id_sp\n"
                + "		end \n"
                + "\n"
                + "end";
        try (Connection conn = HibernateUtil.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ma);
            ps.setObject(2, ctsp.getNhaCC());
            ps.setObject(3, ctsp.getLoai());
            ps.setObject(4, ctsp.getMau());
            ps.setObject(5, ctsp.getMa());
            ps.setObject(6, ctsp.getKichCo());
            ps.setObject(7, ctsp.getSoLuong());
            ps.setObject(8, ctsp.getGiaBan());
            ps.setObject(9, ctsp.getUrlAnh());
            ps.setObject(10, ctsp.getSoLuong());
            check = ps.executeUpdate();

            return check > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public ArrayList<NhaCungCap> AllListNCC() {
        Session session = HibernateUtil.getSession();
        ArrayList<NhaCungCap> list = (ArrayList<NhaCungCap>) session.createCriteria(NhaCungCap.class).list();

        return list;
    }

    @Override
    public ArrayList<CTSP> getCTSP(String ma) {
        ArrayList<CTSP> list = new ArrayList<>();
        String query = "select a.Ma,c.Ten,d.Ten,e.Ten,a.SoLuong,a.GiaBan,a.KichCo,a.UrlAnh from ChiTietSP a inner join SanPham b on a.Id_sp = b.Id\n"
                + "inner join Loai c on a.Id_Loai = c.Id\n"
                + "inner join MauSac d on a.Id_MauSac = d.Id\n"
                + "inner join NhaCungCap e on a.Id_ncc = e.Id\n"
                + "where b.Ma = ?";
        try (Connection conn = HibernateUtil.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CTSP ct = new CTSP();
                ct.setMa(rs.getString(1));
                ct.setLoai(rs.getString(2));
                ct.setMau(rs.getString(3));
                ct.setNhaCC(rs.getString(4));
                ct.setSoLuong(rs.getInt(5));
                ct.setGiaBan(rs.getBigDecimal(6));
                ct.setKichCo(rs.getInt(7));
                ct.setUrlAnh(rs.getString(8));

                list.add(ct);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Boolean updateCTSP(CTSP ctsp, String ma) {
        int check = 0;
        String query = "begin\n"
                + "	declare @id_sp varchar(50),@id_loai varchar(50),@id_ms varchar(50),@id_ncc varchar(50)\n"
                + "	set @id_sp = (select Id_sp from ChiTietSP where ma = ?)\n"
                + "	set @id_loai = (select id from Loai where ten = ?)\n"
                + "	set @id_ms = (select id from MauSac where ten = ?)\n"
                + "	set @id_ncc = (select id from NhaCungCap where ten = ?)\n"
                + "	update ChiTietSP set Id_Loai = @id_loai, Id_MauSac = @id_ms, @id_ncc = @id_ncc, SoLuong = ?, GiaBan = ?, KichCo = ?,UrlAnh = ? where ma = ?\n"
                + "	if(?>0)\n"
                + "		begin\n"
                + "			update SanPham set TrangThai = 0 where Id = @id_sp\n"
                + "		end\n"
                + "	else\n"
                + "		begin\n"
                + "			update SanPham set TrangThai = 1 where Id = @id_sp\n"
                + "		end\n"
                + "\n"
                + "end";
        try (Connection conn = HibernateUtil.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ma);
            ps.setObject(2, ctsp.getLoai());
            ps.setObject(3, ctsp.getMau());
            ps.setObject(4, ctsp.getNhaCC());
            ps.setObject(5, ctsp.getSoLuong());
            ps.setObject(6, ctsp.getGiaBan());
            ps.setObject(7, ctsp.getKichCo());
            ps.setObject(8, ctsp.getUrlAnh());
            ps.setObject(9, ma);
            ps.setObject(10, ctsp.getSoLuong());

            check = ps.executeUpdate();
            return check > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<MauSac> getlistMS() {
        Session ss = HibernateUtil.getSession();
        Query query = ss.createQuery("From MauSac order by Ten asc", MauSac.class);
        List<MauSac> list = query.getResultList();
        ss.close();
        return list;

    }

    @Override
    public Boolean themMauSac(MauSac ms) {
        try {
            Session ss = HibernateUtil.getSession();
            Transaction tran = ss.beginTransaction();
            ss.save(ms);
            tran.commit();
            ss.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Boolean updateMauSac(MauSac ms) {
        try {
            Session ss = HibernateUtil.getSession();
            Transaction tran = ss.beginTransaction();
            Query query = ss.createQuery("Update MauSac set Ten = :Ten where Ma = :Ma");
            query.setParameter("Ten", ms.getTen());
            query.setParameter("Ma", ms.getMa());
            query.executeUpdate();
            tran.commit();
            ss.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Loai> getlistLoai() {
        Session ss = HibernateUtil.getSession();
        Query query = ss.createQuery("From Loai order by Ten asc", Loai.class);
        List<Loai> list = query.getResultList();
        ss.close();
        return list;
    }

    @Override
    public Boolean themLoai(Loai loai) {
        try {
            Session ss = HibernateUtil.getSession();
            Transaction tran = ss.beginTransaction();
            ss.save(loai);
            tran.commit();
            ss.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Boolean updateLoai(Loai loai) {
        try {
            Session ss = HibernateUtil.getSession();
            Transaction tran = ss.beginTransaction();
            Query query = ss.createQuery("Update Loai set Ten = :Ten where Ma = :Ma");
            query.setParameter("Ten", loai.getTen());
            query.setParameter("Ma", loai.getMa());
            query.executeUpdate();
            tran.commit();
            ss.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<CTSP> allListCTSP(String ma) {
        List<CTSP> list = new ArrayList<>();

        String query = "Select ma from ChiTietSP where ma = ? ";
        try (Connection conn = HibernateUtil.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CTSP ctsp = new CTSP();
                ctsp.setMa(rs.getString(1));

                list.add(ctsp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
