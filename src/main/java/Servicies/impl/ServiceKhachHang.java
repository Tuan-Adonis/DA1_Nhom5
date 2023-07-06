/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicies.impl;

import DomainModels.KhachHang;
import Repositories.IRepositoryKhachHang;
import Repositories.impl.RepositoryKhachHang;
import Servicies.IServiceKhachHang;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ADMIN
 */
public class ServiceKhachHang implements IServiceKhachHang{
    
    
    private IRepositoryKhachHang repoKhachHang = new RepositoryKhachHang();
    
    @Override
    public List<KhachHang> checkMa(String ma) {
        return this.repoKhachHang.checkMa(ma);
    }

    @Override
    public void add(KhachHang khachHang) {
        this.repoKhachHang.add(khachHang);
    }

    @Override
    public void update(KhachHang khachHang) {
        this.repoKhachHang.update(khachHang);
    }

    @Override
    public List<KhachHang> listKhachHang() {
        return repoKhachHang.listKhachHang();
    }

    //add excel
    @Override
    public void insert(List<KhachHang> listkH) {
        this.repoKhachHang.insert(listkH);
    }

    
    
}
