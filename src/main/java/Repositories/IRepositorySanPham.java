/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.CTSP;
import DomainModels.ChiTietSP;
import DomainModels.Loai;
import DomainModels.MauSac;
import DomainModels.NhaCungCap;
import DomainModels.SanPham;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IRepositorySanPham {

    List<SanPham> AllListSP();

    ArrayList<NhaCungCap> AllListNCC();

    ArrayList<CTSP> getCTSP(String ma);

    void them(SanPham sp);

    List<SanPham> checkMa(String ma);

    Boolean update(SanPham sp);

    Boolean themCTSP(CTSP ctsp,String ma);

    Boolean updateCTSP(CTSP ctsp, String ma);

    List<MauSac> getlistMS();

    Boolean themMauSac(MauSac ms);

    Boolean updateMauSac(MauSac ms);
    
    List<Loai> getlistLoai();

    Boolean themLoai(Loai loai);

    Boolean updateLoai(Loai loai);
    
    List<CTSP> allListCTSP(String ma);
}
