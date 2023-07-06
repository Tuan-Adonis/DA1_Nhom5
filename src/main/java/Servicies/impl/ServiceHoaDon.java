/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicies.impl;

import DomainModels.HoaDon;
import ViewsModels.SanPhamAndChiTietSP.HDCTRepo;
import Servicies.IServiceHoaDon;
import Repositories.IRepositoryHoaDon;
import Repositories.impl.RepositoryHoaDon;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ServiceHoaDon implements IServiceHoaDon {

    private IRepositoryHoaDon HDRepo = new RepositoryHoaDon();

    @Override
    public List<HoaDon> getListHD() {
        return this.HDRepo.getListHD();
    }

    @Override
    public List<HDCTRepo> getListHDCT(String ma) {
        List<HDCTRepo> list = new ArrayList<>();

        for (HDCTRepo hd : HDRepo.getListHDCT(ma)) {
            HDCTRepo hdct = new HDCTRepo();
            hdct.setMaHD(hd.getMaHD());
            hdct.setMaSP(hd.getMaSP());
            hdct.setSoLuong(Integer.valueOf(hd.getSoLuong()));
            hdct.setDonGia(hd.getDonGia());
            int TongTien = hd.getSoLuong() * Integer.parseInt(hd.getDonGia() + "");
            hdct.setThanhTien(BigDecimal.valueOf(TongTien));

            list.add(hdct);
        }

        return list;
    }

//    public static void main(String[] args) {
//        IRepositoryHoaDon HDRepo = new RepositoryHoaDon();
//        List<ViewsModels.SanPhamAndChiTietSP.HoaDon> list = new ArrayList<>();
//        list = HDRepo.getListHDByNgay("2022-11-28", "2022-11-30");
//        for (ViewsModels.SanPhamAndChiTietSP.HoaDon hoaDon : list) {
//            System.out.println(hoaDon.getMa());
//        }
//
//    }
    @Override
    public List<ViewsModels.SanPhamAndChiTietSP.HoaDon> getListHDByNgay(String ngayBD, String ngayKT) {
        return this.HDRepo.getListHDByNgay(ngayBD, ngayKT);
    }

    @Override
    public List<HDCTRepo> getListHDCTByMaSP(String ma, String maHD) {
        List<HDCTRepo> list = new ArrayList<>();

        for (HDCTRepo hd : HDRepo.getListHDCTByMaSP(ma, maHD)) {
            HDCTRepo hdct = new HDCTRepo();
            hdct.setMaHD(hd.getMaHD());
            hdct.setMaSP(hd.getMaSP());
            hdct.setSoLuong(Integer.valueOf(hd.getSoLuong()));
            hdct.setDonGia(hd.getDonGia());
            int TongTien = hd.getSoLuong() * Integer.parseInt(hd.getDonGia() + "");
            hdct.setThanhTien(BigDecimal.valueOf(TongTien));

            list.add(hdct);
        }
        return list;
    }

}
