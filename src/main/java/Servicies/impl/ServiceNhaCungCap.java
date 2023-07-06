/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicies.impl;

import DomainModels.NhaCungCap;
import Servicies.IServiceNhaCungCap;
import Repositories.IRepositoryNhaCungCap;
import Repositories.impl.RepositoryNhaCungCap;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ServiceNhaCungCap implements IServiceNhaCungCap {

    private IRepositoryNhaCungCap NCCRepo = new RepositoryNhaCungCap();

    @Override
    public List<NhaCungCap> getListNCC() {
        return this.NCCRepo.getNCC();
    }

    @Override
    public List<NhaCungCap> checkMa(String ma) {
        return this.NCCRepo.checkMa(ma);
    }

    @Override
    public String themNCC(NhaCungCap ncc) {
        if (this.NCCRepo.themNCC(ncc)) {
            return "Thêm thành công!";
        } else {
            return "Thêm thất bại!";
        }
    }

    @Override
    public String updateNCC(NhaCungCap ncc, String ma) {
        if (this.NCCRepo.updateNCC(ncc, ma)) {
            return "Update thành công!";
        } else {
            return "Update thất bại!";
        }
    }

}
