/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicies;

import DomainModels.HoaDon;
import ViewsModels.SanPhamAndChiTietSP.HDCTRepo;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IServiceHoaDon {

    List<HoaDon> getListHD();

    List<HDCTRepo> getListHDCT(String ma);

    List<HDCTRepo> getListHDCTByMaSP(String ma, String maHD);

    List<ViewsModels.SanPhamAndChiTietSP.HoaDon> getListHDByNgay(String ngayBD, String ngayKT);
}
