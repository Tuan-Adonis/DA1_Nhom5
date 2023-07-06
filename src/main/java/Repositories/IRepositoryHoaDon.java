/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.HoaDon;
import ViewsModels.SanPhamAndChiTietSP.HDCTRepo;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IRepositoryHoaDon {

    List<HoaDon> getListHD();

    List<HDCTRepo> getListHDCT(String ma);

    List<ViewsModels.SanPhamAndChiTietSP.HoaDon> getListHDByNgay(String ngayBD, String ngayKT);
    
    List<HDCTRepo> getListHDCTByMaSP(String ma, String maHD);

}
