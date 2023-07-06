/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.impl;

import DomainModels.KhachHang;
import DomainModels.SanPham;
import Repositories.IRepositoryKhachHang;
import java.util.ArrayList;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import Utilies.HibernateUtil;
import java.util.List;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author ADMIN
 */
public class RepositoryKhachHang implements IRepositoryKhachHang {

    @Override
    public List<KhachHang> listKhachHang() {
        Session session = HibernateUtil.getSession();
        Query query = session.createQuery("From KhachHang", KhachHang.class);
        List<KhachHang> list = query.getResultList();

        return list;
    }

    @Override
    public void add(KhachHang khachHang) {
        KhachHang kh = new KhachHang();
        kh.setMa(khachHang.getMa());
        kh.setHoTen(khachHang.getHoTen());
        kh.setGioiTinh(kh.getGioiTinh());
        kh.setSdt(khachHang.getSdt());
        kh.setDiaChi(khachHang.getDiaChi());
        kh.setNgaySinh(khachHang.getNgaySinh());
        kh.setTrangThai(khachHang.getTrangThai());

        Transaction tran = null;
        try (Session ss = HibernateUtil.getSession()) {
            tran = ss.beginTransaction();
            ss.save(kh);
            tran.commit();
            ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(KhachHang khachHang) {
        try (Session ss = HibernateUtil.getSession()) {
            Transaction tran = ss.beginTransaction();
            Query query = ss.createQuery("update KhachHang set HoTen = :HoTen, GioiTinh = :GioiTinh, Sdt = :Sdt, "
                    + "DiaChi = :DiaChi, NgaySinh = :NgaySinh, TrangThai = :TrangThai where Ma = :Ma");
            query.setParameter("HoTen", khachHang.getHoTen());
            query.setParameter("GioiTinh", khachHang.getGioiTinh());
            query.setParameter("Sdt", khachHang.getSdt());
            query.setParameter("DiaChi", khachHang.getDiaChi());
            query.setParameter("NgaySinh", khachHang.getNgaySinh());
            query.setParameter("TrangThai", khachHang.getTrangThai());
            query.setParameter("Ma", khachHang.getMa());
            query.executeUpdate();
            tran.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<KhachHang> checkMa(String ma) {
        Session session = HibernateUtil.getSession();
        Query query = session.createQuery("From KhachHang where Ma = :Ma");
        query.setParameter("Ma", ma);
        return query.getResultList();
    }
    
    
    //add excel
    @Override
    public void insert(List<KhachHang> listkH) {
        try {
            Session session = HibernateUtil.getSession();
            Transaction tran = session.beginTransaction();
            for (KhachHang k : listkH) {
                session.saveOrUpdate(k);
            }
            tran.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
