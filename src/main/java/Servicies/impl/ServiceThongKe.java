package Servicies.impl;

import DomainModels.HoaDon;
import DomainModels.HoaDonCT;
import Repositories.impl.RepositoryHoaDonChiTiet;
import ViewsModels.ThongKe.ThongKeRepons;
import ViewsModels.ThongKe.ThongKeViewModels;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceThongKe {

    private RepositoryHoaDonChiTiet repoCT = new RepositoryHoaDonChiTiet();

    public List<ThongKeViewModels> getALLHoaDonBanHang() {
        return repoCT.listHDCTTK();
    }

    public List<ThongKeViewModels> sortTienTang() {
        return repoCT.sortTienTang();
    }

    public List<ThongKeViewModels> sortTienGiam() {
        return repoCT.sortTienGiam();
    }

    public List<ThongKeViewModels> sortSLTang() {
        return repoCT.sortSLTang();
    }

    public List<ThongKeViewModels> sortSLGiam() {
        return repoCT.sortSLGiam();
    }

    public BigDecimal getWeekChar(Date to) {
        List<HoaDonCT> lst = repoCT.getHDByDate(to, to);
        BigDecimal b = new BigDecimal(0);
        for (HoaDonCT s : lst) {
            b = s.getDonGia().multiply(BigDecimal.valueOf(s.getSoLuong()));
        }
        return b;
    }

    public BigDecimal getYearChar(Date now, Date to) {
        List<HoaDonCT> lst = repoCT.getHDByDate(now, to);
        BigDecimal b = new BigDecimal(0);
        for (HoaDonCT s : lst) {
            try {
                b = b.add(s.getDonGia().multiply(BigDecimal.valueOf(s.getSoLuong())));
            } catch (Exception e) {
            }
        }
        return b;
    }

    public List<ThongKeViewModels> getHDByDate(Date from, Date to) {
        List<HoaDonCT> lstHd = repoCT.getHDByDate(from, to);
        List<ThongKeViewModels> lsthdtk = new ArrayList<>();
        for (HoaDonCT s : lstHd) {
            List<HoaDonCT> lsthdct = repoCT.SelectByHoaDonCTID(s.getId());
            ThongKeViewModels hd = new ThongKeViewModels(s.getId_hd(), lsthdct);
            lsthdtk.add(hd);
        }
        return lsthdtk;
    }
    
     public List<ThongKeViewModels> listHDByNgay(String date1, String date2) {
         return repoCT.listHDByNgay(date1, date2);
     }
     
      public ArrayList<ThongKeRepons> listTop5() {
          return repoCT.listTop5();
      }

}
