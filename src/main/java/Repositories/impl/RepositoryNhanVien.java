package Repositories.impl;

import DomainModels.NhanVien;
import Repositories.IRepositoryNhanVien;
import Utilies.HibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RepositoryNhanVien implements IRepositoryNhanVien{

    private Session session = HibernateUtil.getSession();

    public NhanVien DangNhap(String Email, String MatKhau) {
        session = HibernateUtil.getSession();
        Query query = session.createQuery("FROM NhanVien WHERE Email = :Email and MatKhau = :MatKhau");
        query.setParameter("Email", Email);
        query.setParameter("MatKhau", MatKhau);
        try {
            return (NhanVien) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public UUID checkEmail(String Email) {
        session = HibernateUtil.getSession();
        Query query = session.createQuery("FROM NhanVien WHERE Email = :Email", NhanVien.class);
        query.setParameter("Email", Email);
        NhanVien result = new NhanVien();
        try {
            return ((NhanVien) query.getSingleResult()).getId();
        } catch (NoResultException e) {
            return null;
        }
    }

    public NhanVien checkVaiTro(String Email) {
        session = HibernateUtil.getSession();
        Query query = session.createQuery("FROM NhanVien WHERE Email = :Email AND _Role = 1");
        query.setParameter("Email", Email);
        NhanVien result = new NhanVien();
        try {
            return (NhanVien) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public NhanVien checkEmailNhanVien(String Email) {
        session = HibernateUtil.getSession();
        Query query = session.createQuery("FROM NhanVien WHERE Email = :Email");
        query.setParameter("Email", Email);
        try {
            return (NhanVien) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public String checkMatKhau(String Email) {
        session = HibernateUtil.getSession();
        Query query = session.createQuery("FROM NhanVien WHERE Email = :Email");
        query.setParameter("Email", Email);
        try {
            return ((NhanVien) query.getSingleResult()).getMatKhau();
        } catch (NoResultException e) {
            return null;
        }
    }

    public boolean UpdateTaiKhoan(NhanVien nv) {
        try {
            session = HibernateUtil.getSession();
            Transaction tran = session.getTransaction();
            tran.begin();
            session.saveOrUpdate(nv);
            tran.commit();
            return true;
        } catch (Exception e) {
        }
        return false;
    }
    
    public Boolean UpdateNhanVienHBN(NhanVien tk) {
        Transaction tran = null;
        try {
            session = HibernateUtil.getSession();
            tran = session.beginTransaction();
            session.saveOrUpdate(tk);
            tran.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<NhanVien> getAllNV() {
        List<NhanVien> listNV = new ArrayList<>();
        try {
            session = HibernateUtil.getSession();
            Query query = session.createQuery("FROM NhanVien", NhanVien.class);
            if (query.getResultList() != null && !query.getResultList().isEmpty()) {
                listNV = query.getResultList();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNV;
    }

    public Boolean InsertTaiKhoan(NhanVien tk) {
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

    @Override
    public List<NhanVien> listNv() {
        Session session = HibernateUtil.getSession();
        Query query = session.createQuery("From NhanVien", NhanVien.class);
        List<NhanVien> list = query.getResultList();

        return list;
    }

    @Override
    public void addNhanVien(NhanVien nv) {
        NhanVien n = new NhanVien();
        
        n.setMa(nv.getMa());
        n.setTen(nv.getTen());
        n.setGioiTinh(nv.getGioiTinh());
        n.setNgaySinh(nv.getNgaySinh());
        n.setSdt(nv.getSdt());
        n.setMatKhau(nv.getMatKhau());
        n.setEmail(nv.getEmail());
        n.setDiaChi(nv.getDiaChi());
        n.set_Role(nv.get_Role());
        n.setTrangThai(nv.getTrangThai());

        Transaction tran = null;
        try (Session ss = HibernateUtil.getSession()) {
            tran = ss.beginTransaction();
            ss.save(nv);
            tran.commit();
            ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateNhanVien(NhanVien nv) {
        try (Session ss = HibernateUtil.getSession()) {
            Transaction tran = ss.beginTransaction();
            Query query = ss.createQuery("update NhanVien set Ten = :Ten, GioiTinh = :GioiTinh, "
                    + "NgaySinh = :NgaySinh, Sdt = :Sdt, MatKhau = :MatKhau, Email = :Email, DiaChi = :DiaChi,"
                    + "_Role = :_Role, TrangThai = :TrangThai where Ma = :Ma");
            
            query.setParameter("Ten", nv.getTen());
            query.setParameter("GioiTinh", nv.getGioiTinh());
            query.setParameter("NgaySinh", nv.getNgaySinh());
            query.setParameter("Sdt", nv.getSdt());
            query.setParameter("MatKhau", nv.getMatKhau());
            query.setParameter("Email", nv.getEmail());
            query.setParameter("DiaChi", nv.getDiaChi());
            query.setParameter("_Role", nv.get_Role());
            query.setParameter("TrangThai", nv.getTrangThai());
            query.setParameter("Ma", nv.getMa());
            query.executeUpdate();
            tran.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateMKNhanVien(NhanVien nv, String matKhau) {
        try (Session ss = HibernateUtil.getSession()) {
            Transaction tran = ss.beginTransaction();
            Query query = ss.createQuery("update NhanVien set MatKhau = :MatKhau where Email = :Email");
            
           
            query.setParameter("MatKhau", matKhau);
            query.setParameter("Email", nv.getEmail());
            query.executeUpdate();
            tran.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     public List<NhanVien> listKhachHang() {
        Session session = HibernateUtil.getSession();
        Query query = session.createQuery("From NhanVien", NhanVien.class);
        List<NhanVien> list = query.getResultList();

        return list;
    }
    
    
}
