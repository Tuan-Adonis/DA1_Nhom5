/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicies.impl;

import DomainModels.CTSP;
import DomainModels.Loai;
import DomainModels.MauSac;
import DomainModels.NhaCungCap;
import DomainModels.SanPham;
import Repositories.IRepositorySanPham;
import Repositories.impl.RepositorySanPham;
import Servicies.IServiceSanPham;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ServiceSanPham implements IServiceSanPham {

    private IRepositorySanPham Irepo = new RepositorySanPham();

    @Override
    public List<SanPham> getListSP() {
        return Irepo.AllListSP();
    }

    @Override
    public void themSp(SanPham sp) {
        this.Irepo.them(sp);
    }

    @Override
    public List<SanPham> checkMa(String ma) {
        return this.Irepo.checkMa(ma);
    }

    @Override
    public String themSPCT(CTSP ctsp,String ma) {
        if (this.Irepo.themCTSP(ctsp,ma)) {
            return "Thêm thành công!";
        } else {
            return "Thêm thất bại!";
        }
    }

    @Override
    public String update(SanPham sp) {
        if (this.Irepo.update(sp)) {
            return "Update thành công!";
        } else {
            return "Update thất bại!";
        }
    }

    @Override
    public ArrayList<NhaCungCap> getListNCC() {
        return this.Irepo.AllListNCC();
    }

    @Override
    public ArrayList<CTSP> getListCTSP(String ma) {
        return this.Irepo.getCTSP(ma);
    }

    @Override
    public String updateCTSP(CTSP ctsp, String ma) {
        if (this.Irepo.updateCTSP(ctsp, ma)) {
            return "Update thành công!";
        } else {
            return "Update thất bại!";
        }
    }

    @Override
    public List<MauSac> getListMS() {
        return this.Irepo.getlistMS();
    }

    @Override
    public String themMauSac(MauSac ms) {
        if (this.Irepo.themMauSac(ms)) {
            return "Thêm thành công!";
        } else {
            return "Thêm thất bại!";
        }
    }

    @Override
    public String updateMauSac(MauSac ms) {
        if (this.Irepo.updateMauSac(ms)) {
            return "Update thành công!";
        } else {
            return "Update thất bại!";
        }
    }

    @Override
    public List<Loai> getListLoai() {
        return this.Irepo.getlistLoai();
    }

    @Override
    public String themLoai(Loai loai) {
        if (this.Irepo.themLoai(loai)) {
            return "Thêm thành công!";
        } else {
            return "Thêm thất bại!";
        }
    }

    @Override
    public String updateLoai(Loai loai) {
        if (this.Irepo.updateLoai(loai)) {
            return "Update thành công!";
        } else {
            return "Update thất bại!";
        }
    }

    @Override
    public List<CTSP> getAllCTSP(String ma) {
        return this.Irepo.allListCTSP(ma);
    }

    
}
