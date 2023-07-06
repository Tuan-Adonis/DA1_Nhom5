/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.KhachHang;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IRepositoryKhachHang {
    
    List<KhachHang> listKhachHang();
    
    public void add(KhachHang khachHang);
    
    public void update(KhachHang khachHang);
    
    List<KhachHang> checkMa(String ma);
    
    
    //add excel
    void insert(List<KhachHang> listkH); 
}
