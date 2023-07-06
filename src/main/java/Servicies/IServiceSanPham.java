/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicies;

import DomainModels.CTSP;
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
public interface IServiceSanPham {

    public List<SanPham> getListSP();

    public void themSp(SanPham sp);

    public List<SanPham> checkMa(String ma);

    public String themSPCT(CTSP ctsp,String ma);

    public String update(SanPham sp);

    public ArrayList<NhaCungCap> getListNCC();

    public ArrayList<CTSP> getListCTSP(String ma);

    public String updateCTSP(CTSP ctsp, String ma);

    public List<MauSac> getListMS();

    public String themMauSac(MauSac ms);

    public String updateMauSac(MauSac ms);

    public List<Loai> getListLoai();

    public String themLoai(Loai loai);

    public String updateLoai(Loai loai);
    
    public List<CTSP> getAllCTSP(String ma);

}
