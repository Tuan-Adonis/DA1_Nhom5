/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.NhaCungCap;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IRepositoryNhaCungCap {
     List<NhaCungCap> getNCC();
    
    List<NhaCungCap> checkMa(String ma);
    
    Boolean themNCC(NhaCungCap ncc);
    Boolean updateNCC(NhaCungCap ncc,String ma);
}
