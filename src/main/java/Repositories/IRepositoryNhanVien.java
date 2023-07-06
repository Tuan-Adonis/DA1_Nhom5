/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.NhanVien;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IRepositoryNhanVien {
    
    List<NhanVien> listNv();
    
    void addNhanVien(NhanVien nv);
    
    void updateNhanVien(NhanVien nv);
    
    
    
}
