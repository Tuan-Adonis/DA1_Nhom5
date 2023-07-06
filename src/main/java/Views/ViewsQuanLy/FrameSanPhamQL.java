/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.ViewsQuanLy;

import DomainModels.CTSP;
import DomainModels.ChiTietSP;
import DomainModels.Loai;
import DomainModels.MauSac;
import DomainModels.NhaCungCap;
import DomainModels.SanPham;
import Servicies.IServiceSanPham;
import Servicies.impl.ServiceSanPham;
import Views.ViewsNhanVien.*;
import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ADMIN
 */
public class FrameSanPhamQL extends javax.swing.JPanel {

    private IServiceSanPham ISerSP = new ServiceSanPham();
    private String urlAnh = "Icon/iconSanPham.png";

    public FrameSanPhamQL() {
        initComponents();
        Icon iconClear = new ImageIcon("Icon/Edit.png");
        Icon iconThem = new ImageIcon("Icon/Add.png");
        Icon iconCapNhat = new ImageIcon("Icon/Up.png");
        Icon logoSanPham = new ImageIcon("Icon/iconSanPham.png");
        Icon iconCT = new ImageIcon("Icon/expand.png");

        this.btnLamTrongSP.setIcon(iconClear);
        this.btnThemSP.setIcon(iconThem);
        this.btnCapNhatSP.setIcon(iconCapNhat);
        this.btnLamTrongCTSP.setIcon(iconClear);
        this.btnThemCTSP.setIcon(iconThem);
        this.btnCapNhatCTSP.setIcon(iconCapNhat);
        this.lblLogoSanPham.setIcon(logoSanPham);
        this.btnCTLoai.setIcon(iconCT);
        this.btnCTMau.setIcon(iconCT);

//        reload();
        addTable(this.ISerSP.getListSP());
        addCboTenNCC(this.ISerSP.getListNCC());
        addCboLoai(this.ISerSP.getListLoai());
        addCboMauSac(this.ISerSP.getListMS());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnRefesh = new javax.swing.JButton();
        txtImport = new javax.swing.JButton();
        txtExport = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rdoCon = new javax.swing.JRadioButton();
        rdoHet = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtSize = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cboTenNCC = new javax.swing.JComboBox<>();
        btnCTLoai = new javax.swing.JButton();
        btnCTMau = new javax.swing.JButton();
        cboLoai = new javax.swing.JComboBox<>();
        cboMau = new javax.swing.JComboBox<>();
        txtMaCTSP = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnCapNhatCTSP = new javax.swing.JButton();
        btnThemCTSP = new javax.swing.JButton();
        btnLamTrongCTSP = new javax.swing.JButton();
        btnLamTrongSP = new javax.swing.JButton();
        btnThemSP = new javax.swing.JButton();
        btnCapNhatSP = new javax.swing.JButton();
        lblLogoSanPham = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(1050, 690));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtSearch.setForeground(new java.awt.Color(153, 153, 153));
        txtSearch.setText("Tìm theo mã");
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });

        jLabel2.setText("Tìm kiếm sản phẩm");

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã sản phẩm", "Tên sản phẩm", "Trạng thái"
            }
        ));
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnRefesh.setText("Refresh");
        btnRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshActionPerformed(evt);
            }
        });

        txtImport.setText("Import Exel");
        txtImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImportActionPerformed(evt);
            }
        });

        txtExport.setText("Export Exel");
        txtExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnRefesh)
                        .addGap(18, 18, 18)
                        .addComponent(txtImport)
                        .addGap(18, 18, 18)
                        .addComponent(txtExport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(btnSearch)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnSearch)
                    .addComponent(btnRefesh)
                    .addComponent(txtImport)
                    .addComponent(txtExport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Sản Phẩm");

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Mã sản phẩm");

        txtMa.setEnabled(false);

        jLabel13.setText("Tên sản phẩm");

        jLabel3.setText("Trạng thái");

        btnGroup.add(rdoCon);
        rdoCon.setSelected(true);
        rdoCon.setText("Còn hàng");
        rdoCon.setEnabled(false);

        btnGroup.add(rdoHet);
        rdoHet.setText("Hết hàng");
        rdoHet.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3))
                    .addComponent(jLabel7)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(rdoCon)
                        .addGap(26, 26, 26)
                        .addComponent(rdoHet)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(50, Short.MAX_VALUE))))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtMa, txtTen});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(67, 67, 67)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rdoCon)
                    .addComponent(rdoHet))
                .addGap(34, 34, 34))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setText("Mã");

        jLabel15.setText("Loại");

        jLabel16.setText("Màu sắc");

        jLabel17.setText("Kích cỡ");

        jLabel18.setText("Số lượng");

        jLabel19.setText("Đơn giá");

        jLabel20.setText("Tên NCC");

        btnCTLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTLoaiActionPerformed(evt);
            }
        });

        btnCTMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTMauActionPerformed(evt);
            }
        });

        txtMaCTSP.setEnabled(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                            .addComponent(txtSize)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cboMau, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCTLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCTMau, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cboTenNCC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMaCTSP)))
                .addContainerGap())
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDonGia, txtSize, txtSoLuong});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtMaCTSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(cboLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCTLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cboMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCTMau, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel18))
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel19))
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Thông tin sản phẩm");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Chi tiết sản phẩm");

        btnCapNhatCTSP.setText("Cập nhật");
        btnCapNhatCTSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatCTSPActionPerformed(evt);
            }
        });

        btnThemCTSP.setText("Thêm");
        btnThemCTSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCTSPActionPerformed(evt);
            }
        });

        btnLamTrongCTSP.setText("Làm trống");
        btnLamTrongCTSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamTrongCTSPActionPerformed(evt);
            }
        });

        btnLamTrongSP.setText("Làm trống");
        btnLamTrongSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamTrongSPActionPerformed(evt);
            }
        });

        btnThemSP.setText("Thêm");
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });

        btnCapNhatSP.setText("Cập nhật");
        btnCapNhatSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatSPActionPerformed(evt);
            }
        });

        lblLogoSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoSanPhamMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 567, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(169, 169, 169))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblLogoSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLamTrongSP)
                                .addGap(18, 18, 18)
                                .addComponent(btnThemSP)
                                .addGap(18, 18, 18)
                                .addComponent(btnCapNhatSP)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLamTrongCTSP)
                                .addGap(18, 18, 18)
                                .addComponent(btnThemCTSP)
                                .addGap(18, 18, 18)
                                .addComponent(btnCapNhatCTSP))
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogoSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLamTrongCTSP)
                    .addComponent(btnThemCTSP)
                    .addComponent(btnCapNhatCTSP)
                    .addComponent(btnThemSP)
                    .addComponent(btnCapNhatSP)
                    .addComponent(btnLamTrongSP))
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLamTrongSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamTrongSPActionPerformed
        this.txtMa.setText("");
        this.txtTen.setText("");
        this.rdoCon.setSelected(true);
    }//GEN-LAST:event_btnLamTrongSPActionPerformed

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
        int row = tblSanPham.getRowCount();
        String ma = "SP00" + row;
        String ten = this.txtTen.getText();
        if (ma.length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền mã sản phẩm!");
            this.txtMa.requestFocus();
            return;
        }
        if (ten.length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền tên sản phẩm!");
            this.txtTen.requestFocus();
            return;
        }
        int trangThai = 0;
        List<SanPham> listSP = this.ISerSP.checkMa(ma);
        if (listSP.size() != 0) {
            JOptionPane.showMessageDialog(this, "Mã sản phẩm đã tồn tại!");
            return;
        } else {
            SanPham sp = new SanPham();
            sp.setMa(ma);
            sp.setTen(ten);
            sp.setTrangThai(trangThai);

            this.ISerSP.themSp(sp);
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
            addTable(this.ISerSP.getListSP());
        }

    }//GEN-LAST:event_btnThemSPActionPerformed


    private void btnCapNhatSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatSPActionPerformed
        String ma = this.txtMa.getText();
        String ten = this.txtTen.getText();
        if (ma.length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền mã sản phẩm!");
            this.txtMa.requestFocus();
            return;
        }
        if (ten.length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền tên sản phẩm!");
            this.txtTen.requestFocus();
            return;
        }
        List<SanPham> listSP = this.ISerSP.checkMa(ma);
        if (listSP.size() == 0) {
            JOptionPane.showMessageDialog(this, "Mã không tồn tại!");
            return;
        } else {
            SanPham sp = new SanPham();
            sp.setMa(ma);
            sp.setTen(ten);

            JOptionPane.showMessageDialog(this, this.ISerSP.update(sp));
            addTable(this.ISerSP.getListSP());
        }

    }//GEN-LAST:event_btnCapNhatSPActionPerformed

    private void btnLamTrongCTSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamTrongCTSPActionPerformed

        this.txtMaCTSP.setText("");
        this.cboTenNCC.setSelectedIndex(0);
        this.txtDonGia.setText("");
        this.cboLoai.setSelectedIndex(0);
        this.cboMau.setSelectedIndex(0);
        this.txtSize.setText("");
        this.txtSoLuong.setText("");
        Icon icon = new ImageIcon("Icon/iconSanPham.png");
        this.lblLogoSanPham.setIcon(icon);
//        reload();
    }//GEN-LAST:event_btnLamTrongCTSPActionPerformed

    private void btnThemCTSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCTSPActionPerformed
        String ma = this.txtMa.getText();
        String maCTSP = "CT" + ma;
        String tenncc = this.cboTenNCC.getSelectedItem().toString();
        String loai = this.cboLoai.getSelectedItem().toString();
        String mauSac = this.cboMau.getSelectedItem().toString();
        String logoSP = urlAnh;

        if (maCTSP.length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền mã chi tiết sản phẩm!");
            return;
        }

        if (txtSoLuong.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền số lượng!");
            this.txtSoLuong.requestFocus();
            return;
        }

        if (txtDonGia.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền đơn giá!");
            this.txtDonGia.requestFocus();
            return;
        }

        if (txtSize.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền kích cỡ!");
            this.txtSize.requestFocus();
            return;
        }

        int kichCo = -1;
        try {
            kichCo = Integer.parseInt(this.txtSize.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Kích cỡ phải là số!");
            this.txtSize.requestFocus();
            return;
        }
        if (kichCo < 0) {
            JOptionPane.showMessageDialog(this, "Kích cỡ phải lớn hơn hoặc bằng 0!");
            this.txtSize.requestFocus();
            return;
        }

        int soLuong = -1;
        try {
            soLuong = Integer.parseInt(this.txtSoLuong.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Số lượng phải là số!");
            this.txtSoLuong.requestFocus();
            return;
        }
        if (soLuong < 0) {
            JOptionPane.showMessageDialog(this, "Số lượng phải lớn hơn hoặc bằng 0!");
            this.txtSoLuong.requestFocus();
            return;
        }

        int gia = -1;
        try {
            gia = Integer.parseInt(this.txtDonGia.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Giá phải là số!");
            this.txtDonGia.requestFocus();
            return;
        }
        if (gia < 0) {
            JOptionPane.showMessageDialog(this, "Giá phải lớn hơn hoặc bằng 0!");
            this.txtDonGia.requestFocus();
            return;
        }

        List<CTSP> list = this.ISerSP.getAllCTSP(maCTSP);
        if (list.size() == 0) {
            CTSP ctsp = new CTSP();
            ctsp.setMa(maCTSP);
            ctsp.setLoai(loai);
            ctsp.setMau(mauSac);
            ctsp.setSoLuong(soLuong);
            ctsp.setKichCo(kichCo);
            ctsp.setGiaBan(BigDecimal.valueOf(gia));
            ctsp.setNhaCC(tenncc);
            ctsp.setUrlAnh(logoSP);

            JOptionPane.showMessageDialog(this, this.ISerSP.themSPCT(ctsp, ma));
            addTable(this.ISerSP.getListSP());
        } else {
            JOptionPane.showMessageDialog(this, "Mã sản phẩm chi tiết đã tồn tại!Vui lòng điền mã khác.");
            return;
        }


    }//GEN-LAST:event_btnThemCTSPActionPerformed

    private void btnCapNhatCTSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatCTSPActionPerformed
        String maCTSP = this.txtMaCTSP.getText();
        String tenncc = this.cboTenNCC.getSelectedItem().toString();
        String loai = this.cboLoai.getSelectedItem().toString();
        String mauSac = this.cboMau.getSelectedItem().toString();
        String logoSP = urlAnh;

        if (maCTSP.length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền mã chi tiết sản phẩm!");
            return;
        }

        if (txtSoLuong.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền số lượng!");
            this.txtSoLuong.requestFocus();
            return;
        }

        if (txtDonGia.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền đơn giá!");
            this.txtDonGia.requestFocus();
            return;
        }

        if (txtSize.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền kích cỡ!");
            this.txtSize.requestFocus();
            return;
        }

        int kichCo = -1;
        try {
            kichCo = Integer.parseInt(this.txtSize.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Kích cỡ phải là số!");
            this.txtSize.requestFocus();
            return;
        }
        if (kichCo < 0) {
            JOptionPane.showMessageDialog(this, "Kích cỡ phải lớn hơn hoặc bằng 0!");
            this.txtSize.requestFocus();
            return;
        }

        int soLuong = -1;
        try {
            soLuong = Integer.parseInt(this.txtSoLuong.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Số lượng phải là số!");
            this.txtSoLuong.requestFocus();
            return;
        }
        if (soLuong < 0) {
            JOptionPane.showMessageDialog(this, "Số lượng phải lớn hơn hoặc bằng 0!");
            this.txtSoLuong.requestFocus();
            return;
        }

        int gia = -1;
        try {
            gia = Integer.parseInt(this.txtDonGia.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Giá phải là số!");
            this.txtDonGia.requestFocus();
            return;
        }
        if (gia < 0) {
            JOptionPane.showMessageDialog(this, "Giá phải lớn hơn hoặc bằng 0!");
            this.txtDonGia.requestFocus();
            return;
        }

        List<CTSP> list = this.ISerSP.getAllCTSP(maCTSP);
        if (list.size() == 0) {
            JOptionPane.showMessageDialog(this, "Không tồn tại mã chi tiết sản phẩm!");
            return;
        } else {
            CTSP ctsp = new CTSP();
            ctsp.setMa(maCTSP);
            ctsp.setLoai(loai);
            ctsp.setMau(mauSac);
            ctsp.setSoLuong(soLuong);
            ctsp.setKichCo(kichCo);
            ctsp.setGiaBan(BigDecimal.valueOf(gia));
            ctsp.setNhaCC(tenncc);
            ctsp.setUrlAnh(urlAnh);
            JOptionPane.showMessageDialog(this, this.ISerSP.updateCTSP(ctsp, maCTSP));
            addTable(this.ISerSP.getListSP());
        }

    }//GEN-LAST:event_btnCapNhatCTSPActionPerformed

    private void btnRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshActionPerformed
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);
        int i = 0;
        for (SanPham sp : this.ISerSP.getListSP()) {
            i++;
            model.addRow(new Object[]{i, sp.getMa(), sp.getTen(), sp.getTrangThai() == 0 ? "Còn hàng" : "Hết hàng"});
        }
        addCboTenNCC(this.ISerSP.getListNCC());
        addCboLoai(this.ISerSP.getListLoai());
        addCboMauSac(this.ISerSP.getListMS());
    }//GEN-LAST:event_btnRefeshActionPerformed

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        int row = this.tblSanPham.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Không có dữ liệu để hiển thị!");
            return;
        }
        String ma = this.tblSanPham.getValueAt(row, 1).toString();
        String ten = this.tblSanPham.getValueAt(row, 2).toString();
        String trangThai = this.tblSanPham.getValueAt(row, 3).toString();

        txtMa.setText(ma);
        txtTen.setText(ten);
        if (trangThai.equals("Còn hàng")) {
            rdoCon.setSelected(true);
        } else {
            rdoHet.setSelected(true);
        }
//        txtMa.setSelectedItem(ma);

        ArrayList<CTSP> list = this.ISerSP.getListCTSP(ma);
        if (list.size() == 0) {
            this.txtMaCTSP.setText("");
            this.cboTenNCC.setSelectedIndex(0);
            this.txtDonGia.setText("");
            this.cboLoai.setSelectedIndex(0);
            this.cboMau.setSelectedIndex(0);
            this.txtSize.setText("");
            this.txtSoLuong.setText("");
            Icon icon = new ImageIcon("Icon/iconSanPham.png");
            this.lblLogoSanPham.setIcon(icon);
            urlAnh = "Icon/iconSanPham.png";
        } else {
            for (CTSP a : list) {
                this.txtMaCTSP.setText(a.getMa());
                this.cboLoai.setSelectedItem(a.getLoai());
                this.txtDonGia.setText(a.getGiaBan() + "");
                this.cboMau.setSelectedItem(a.getMau());
                this.txtSize.setText(a.getKichCo() + "");
                this.txtSoLuong.setText(a.getSoLuong() + "");
                this.cboTenNCC.setSelectedItem(a.getNhaCC());
                Icon icon = new ImageIcon(a.getUrlAnh());
                this.lblLogoSanPham.setIcon(icon);
                urlAnh = a.getUrlAnh();
            }
        }
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String ma = this.txtSearch.getText();
        if (ma.length() == 0 || ma.equals("Tìm theo mã")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền thông tin!");
            this.txtSearch.requestFocus();
            return;
        }
        List<SanPham> listSP = this.ISerSP.checkMa(ma);
        if (listSP.size() == 0) {
            JOptionPane.showMessageDialog(this, "Không có sản phẩm bạn cần tìm!");
            this.txtMa.setText("");
            this.txtTen.setText("");
            this.rdoCon.setSelected(true);

            this.txtMaCTSP.setText("");
            this.cboTenNCC.setSelectedIndex(0);
            this.txtDonGia.setText("");
            this.cboLoai.setSelectedIndex(0);
            this.cboMau.setSelectedIndex(0);
            this.txtSize.setText("");
            this.txtSoLuong.setText("");
            Icon icon = new ImageIcon("Icon/iconSanPham.png");
            this.lblLogoSanPham.setIcon(icon);
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Tìm kiếm thành công!");
            for (SanPham sp : listSP) {
                DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
                model.setRowCount(0);
                model.addRow(new Object[]{1, sp.getMa(), sp.getTen(), sp.getTrangThai() == 0 ? "Còn hàng" : "Hết hàng"});
                this.txtMa.setText(sp.getMa());
                this.txtTen.setText(sp.getTen());
                if (sp.getTrangThai() == 0) {
                    this.rdoCon.setSelected(true);
                } else {
                    this.rdoHet.setSelected(true);
                }

            }

            List<CTSP> list = this.ISerSP.getListCTSP(ma);
            if (list.size() == 0) {
                this.txtMaCTSP.setText("");
                this.cboTenNCC.setSelectedIndex(0);
                this.txtDonGia.setText("");
                this.cboLoai.setSelectedIndex(0);
                this.cboMau.setSelectedIndex(0);
                this.txtSize.setText("");
                this.txtSoLuong.setText("");
                Icon icon = new ImageIcon("Icon/iconSanPham.png");
                this.lblLogoSanPham.setIcon(icon);
            } else {
                for (CTSP a : list) {

                    this.tblSanPham.setRowSelectionInterval(0, 0);
                    this.txtMaCTSP.setText(a.getMa());
                    this.cboLoai.setSelectedItem(a.getLoai());
                    this.txtDonGia.setText(a.getGiaBan() + "");
                    this.cboMau.setSelectedItem(a.getMau());
                    this.txtSize.setText(a.getKichCo() + "");
                    this.txtSoLuong.setText(a.getSoLuong() + "");
                    this.cboTenNCC.setSelectedItem(a.getNhaCC());
                    Icon icon = new ImageIcon(a.getUrlAnh());
                    this.lblLogoSanPham.setIcon(icon);
                }
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        this.txtSearch.setText("");
        this.txtSearch.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtSearchMouseClicked

    private void lblLogoSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoSanPhamMouseClicked
        JFileChooser fChooser = new JFileChooser("C:\\Users\\ADMIN\\OneDrive\\Documents\\NetBeansProjects\\DA1_BanGiay\\iconSP");
        int result = fChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File f = fChooser.getSelectedFile();
            Icon icon = new ImageIcon(f.getAbsolutePath());
            this.lblLogoSanPham.setIcon(icon);
        } else {
            JOptionPane.showMessageDialog(this, "Chưa chọn ảnh!");
            return;
        }
        urlAnh = String.valueOf(fChooser.getSelectedFile());
    }//GEN-LAST:event_lblLogoSanPhamMouseClicked

    private void btnCTLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTLoaiActionPerformed
        FrQLLoai fr = new FrQLLoai();
        fr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }//GEN-LAST:event_btnCTLoaiActionPerformed

    private void btnCTMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTMauActionPerformed
        FrQLMauSac fr = new FrQLMauSac();
        fr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }//GEN-LAST:event_btnCTMauActionPerformed

    private void txtImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImportActionPerformed
        try {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter fnef = new FileNameExtensionFilter("Excel Files", "xls", "xlsx", "xlsm");
            chooser.setFileFilter(fnef);

            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File fileSelected = chooser.getSelectedFile();
                FileInputStream fis = new FileInputStream(fileSelected);
                BufferedInputStream bis = new BufferedInputStream(fis);

                XSSFWorkbook workbook = new XSSFWorkbook(bis);
                XSSFSheet sheet = workbook.getSheetAt(0);
                Iterator<Row> interator = sheet.iterator();
//                List<SanPham> list = new ArrayList<>();
                while (interator.hasNext()) {
                    Row row = interator.next();

                    SanPham sp = new SanPham();
                    sp.setMa(row.getCell(0).getStringCellValue());
                    sp.setTen(row.getCell(1).getStringCellValue());
                    String Tthai = row.getCell(2).getStringCellValue();
                    if (Tthai.startsWith("Còn") || Tthai.startsWith("0")) {
                        sp.setTrangThai(0);
                    } else {
                        sp.setTrangThai(1);
                    }
//                    list.add(sp);
                    this.ISerSP.themSp(sp);
                }
//                this.ISerSP.themSp(list);
                addTable(this.ISerSP.getListSP());
                JOptionPane.showMessageDialog(this, "Thành công!");
                fis.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();;
        }
    }//GEN-LAST:event_txtImportActionPerformed

    private void txtExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExportActionPerformed
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("danh_sach_SP");
            XSSFRow row = null;
            Cell cell = null;
            List<SanPham> listExport = this.ISerSP.getListSP();
            int i = 0;
            for (SanPham sp : listExport) {
                row = sheet.createRow(i);
                i++;
                cell = row.createCell(0);
                cell.setCellValue(sp.getMa());

                cell = row.createCell(1);
                cell.setCellValue(sp.getTen());

                cell = row.createCell(2);
                cell.setCellValue(sp.getTrangThai());
            }
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter fnef = new FileNameExtensionFilter("Excel Files", "xls", "xlsx", "xlsm");
            chooser.setFileFilter(fnef);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                String path = chooser.getSelectedFile().getPath();
                if (!path.contains(".xlsx")) {
                    path += ".xlsx";
                }
                FileOutputStream fos = new FileOutputStream(path);
                workbook.write(fos);
                fos.flush();
                fos.close();
                JOptionPane.showMessageDialog(this, "Xuất thành công!");
                return;
            }
            JOptionPane.showMessageDialog(this, "Xuất không thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtExportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCTLoai;
    private javax.swing.JButton btnCTMau;
    private javax.swing.JButton btnCapNhatCTSP;
    private javax.swing.JButton btnCapNhatSP;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnLamTrongCTSP;
    private javax.swing.JButton btnLamTrongSP;
    private javax.swing.JButton btnRefesh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnThemCTSP;
    private javax.swing.JButton btnThemSP;
    private javax.swing.JComboBox<String> cboLoai;
    private javax.swing.JComboBox<String> cboMau;
    private javax.swing.JComboBox<String> cboTenNCC;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogoSanPham;
    private javax.swing.JRadioButton rdoCon;
    private javax.swing.JRadioButton rdoHet;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JButton txtExport;
    private javax.swing.JButton txtImport;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMaCTSP;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

//    private void addCboMa(List<SanPham> listSP) {
//        DefaultComboBoxModel modelMa = (DefaultComboBoxModel) cboMa.getModel();
//
//        for (SanPham sp : listSP) {
//            modelMa.addElement(sp.getMa());
//        }
//    }
    private void addCboTenNCC(ArrayList<NhaCungCap> list) {
        DefaultComboBoxModel modelMa = (DefaultComboBoxModel) cboTenNCC.getModel();
        modelMa.removeAllElements();
        for (NhaCungCap sp : list) {
            modelMa.addElement(sp.getTen());
        }
    }

    private void addCboLoai(List<Loai> listLoai) {
        DefaultComboBoxModel modelMa = (DefaultComboBoxModel) cboLoai.getModel();
        modelMa.removeAllElements();
        for (Loai loai : listLoai) {
            modelMa.addElement(loai.getTen());
        }
    }

    private void addCboMauSac(List<MauSac> listMS) {
        DefaultComboBoxModel modelMa = (DefaultComboBoxModel) cboMau.getModel();
        modelMa.removeAllElements();

        for (MauSac ms : listMS) {
            modelMa.addElement(ms.getTen());
        }
    }

    private void addTable(List<SanPham> listSP) {
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);
        int i = 0;
        for (SanPham sp : this.ISerSP.getListSP()) {
            i++;
            model.addRow(new Object[]{i, sp.getMa(), sp.getTen(), sp.getTrangThai() == 0 ? "Còn hàng" : "Hết hàng"});
        }
    }

//    private void reload() {
////        addCboMa(this.ISerSP.getListSP());
//        addCboTenNCC(this.ISerSP.getListNCC());
//        addCboLoai(this.ISerSP.getListLoai());
//        addCboMauSac(this.ISerSP.getListMS());
//        addTable(this.ISerSP.getListSP());
//    }
}
