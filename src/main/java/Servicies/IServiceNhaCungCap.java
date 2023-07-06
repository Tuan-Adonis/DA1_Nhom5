/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicies;

import DomainModels.NhaCungCap;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IServiceNhaCungCap {
   List<NhaCungCap> getListNCC();
    
    List<NhaCungCap> checkMa(String ma);
    
    String themNCC(NhaCungCap ncc);
    
    String updateNCC(NhaCungCap ncc,String ma);
}
