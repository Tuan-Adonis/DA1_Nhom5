/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import DomainModels.KhachHang;
import Servicies.impl.ServiceThongKe;
import Utilies.LineChart_AWT;
import ViewsModels.BanHang.HoaDonBanHangRespone;
import ViewsModels.BanHang.NhanVienDangNhapViewModel;
import ViewsModels.ThongKe.ThongKeRepons;
import ViewsModels.ThongKe.ThongKeViewModels;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author ADMIN
 */
public class FrameThongKe extends javax.swing.JPanel {

    private NhanVienDangNhapViewModel nhanVien = new NhanVienDangNhapViewModel();
    private DefaultTableModel dtm = new DefaultTableModel();
    private ServiceThongKe stk = new ServiceThongKe();
    private List<ThongKeViewModels> lstTK = new ArrayList<>();
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private SimpleDateFormat sdfs = new SimpleDateFormat("MM");

    public FrameThongKe() {
        initComponents();
        Icon logoThongKe = new ImageIcon("Icon/iconThongKe.png");
        Icon thongKe = new ImageIcon("Icon/List.png");
        Icon search = new ImageIcon("Icon/Search.png");
        this.btnSearch.setIcon(search);
        this.lblIconThongKe.setIcon(logoThongKe);

        filltabelTK(stk.getALLHoaDonBanHang());
        filltabelTop5(stk.listTop5());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltk = new javax.swing.JTable();
        txtSearchTK = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTongSL = new javax.swing.JTextField();
        txtTongDonHang = new javax.swing.JTextField();
        txtTongDoanhThu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFrom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnThongKe = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cbSort = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnSort = new javax.swing.JButton();
        lblIconThongKe = new javax.swing.JLabel();
        btnThongKeTheoTuan = new javax.swing.JButton();
        btnThongKeTheoNam = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbtop5 = new javax.swing.JTable();
        btnXuatExecl = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(1050, 690));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setPreferredSize(new java.awt.Dimension(1013, 690));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Bảng thống kê");

        tbltk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Mã nhân viên", "Mã khách hàng", "Số lượng bán", "Tổng tiền", "Ngày tạo"
            }
        ));
        jScrollPane1.setViewportView(tbltk);
        if (tbltk.getColumnModel().getColumnCount() > 0) {
            tbltk.getColumnModel().getColumn(1).setResizable(false);
        }

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearchTK, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSearchTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Thống Kê");

        jLabel1.setText("Tổng đơn hàng");

        jLabel4.setText("Tổng số lượng");

        jLabel5.setText("Doanh thu");

        txtTongSL.setEnabled(false);

        txtTongDonHang.setEnabled(false);

        txtTongDoanhThu.setEnabled(false);

        jLabel6.setText("Từ ngày");

        txtFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromActionPerformed(evt);
            }
        });

        jLabel7.setText("đến ngày");

        jLabel8.setText("(VNĐ)");

        btnThongKe.setText("Thống kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        jLabel9.setText("Sắp xếp");

        cbSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Không sắp xếp", "Tổng tiền tăng", "Tổng tiền giảm", "Số lượng tăng", "Số lượng giảm" }));

        jLabel10.setText("(Đôi)");

        jLabel11.setText("(Đơn)");

        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(13, 13, 13)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTongSL, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(txtTongDonHang))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTongDoanhThu)
                                    .addComponent(cbSort, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTongDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTongSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTongDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSort))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnThongKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnThongKeTheoTuan.setText("Biểu đồ theo tuần");
        btnThongKeTheoTuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeTheoTuanActionPerformed(evt);
            }
        });

        btnThongKeTheoNam.setText("Biểu đồ theo tháng");
        btnThongKeTheoNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeTheoNamActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Top 5 khách hàng", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        tbtop5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên", "Số lượng", "Tổng tiền"
            }
        ));
        jScrollPane2.setViewportView(tbtop5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnXuatExecl.setText("Xuất Excel");
        btnXuatExecl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatExeclActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblIconThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThongKeTheoTuan, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnThongKeTheoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(btnXuatExecl, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(440, 440, 440)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lblIconThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThongKeTheoTuan, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThongKeTheoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXuatExecl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThongKeTheoNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeTheoNamActionPerformed
        try {
            genChartMonth();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThongKeTheoNamActionPerformed

    private void btnThongKeTheoTuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeTheoTuanActionPerformed
        genChartWeek();
    }//GEN-LAST:event_btnThongKeTheoTuanActionPerformed

    private void txtFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromActionPerformed

    }//GEN-LAST:event_txtFromActionPerformed

    private void btnXuatExeclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExeclActionPerformed
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("danh_sach_Thong_Ke");
            XSSFRow row = null;
            Cell cell = null;
            List<ThongKeViewModels> listExPort = stk.getALLHoaDonBanHang();
            for (int i = 0; i < listExPort.size(); i++) {

                row = sheet.createRow(i);
                ThongKeViewModels k = listExPort.get(i);

                cell = row.createCell(0);
                cell.setCellValue(k.getMaHD());

                cell = row.createCell(1);
                cell.setCellValue(k.getMaNV());

                cell = row.createCell(2);
                cell.setCellValue(k.getMaKH());

                cell = row.createCell(3);
                cell.setCellValue(k.getSl());

                cell = row.createCell(4);
                cell.setCellValue(String.valueOf(k.getTongTien()));

                cell = row.createCell(5);
                cell.setCellValue(k.getNgayTao());

            }
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter fileName = new FileNameExtensionFilter("Excel Files", "xls", "xlsx", "xlsm");
            chooser.setFileFilter(fileName);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                String path = chooser.getSelectedFile().getPath();
                if (!path.contains(".xlsx")) {
                    path += ".xlsx";
                }
                FileOutputStream fos = new FileOutputStream(path);
                workbook.write(fos);
                fos.flush();
                fos.close();
                JOptionPane.showMessageDialog(this, "Ok");
                return;
            }
JOptionPane.showMessageDialog(this, "Bạn từ chối xuất file!");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }//GEN-LAST:event_btnXuatExeclActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        String ngayBD = txtFrom.getText();
        String ngayKT = txtTo.getText();
        if (ngayBD.equals("") || ngayKT.equals("")) {
            JOptionPane.showMessageDialog(this, "Ngày chưa được nhập!");
            return;
        }
        filltabelTK(stk.listHDByNgay(ngayBD, ngayKT));


    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        List<ThongKeViewModels> listTKVM = new ArrayList<>();
        String searchTK = txtSearchTK.getText();
        if (searchTK.equals("")) {
            filltabelTK(stk.getALLHoaDonBanHang());
            return;
        }
        if (tbltk.getRowCount() > 0) {
            for (ThongKeViewModels tkvm : stk.getALLHoaDonBanHang()) {
                if (searchTK.equals(tkvm.getMaHD()) || searchTK.equals(tkvm.getMaNV()) || searchTK.equals(tkvm.getMaKH())
                        || searchTK.equals(String.valueOf(tkvm.getSl())) || searchTK.equals(tkvm.getNgayTao().toString()) || searchTK.equals(tkvm.getTongTien().toString())) {
                    listTKVM.add(tkvm);
                    filltabelTK(listTKVM);
                    return;
                }
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        if (cbSort.getSelectedIndex() == 0) {
            filltabelTK(stk.getALLHoaDonBanHang());
            JOptionPane.showMessageDialog(this, "Sort thành công!");
            return;
        }

        if (cbSort.getSelectedIndex() == 1) {
            filltabelTK(stk.sortTienTang());
            JOptionPane.showMessageDialog(this, "Sort thành công!");
            return;
        }

        if (cbSort.getSelectedIndex() == 2) {
            filltabelTK(stk.sortTienGiam());
            JOptionPane.showMessageDialog(this, "Sort thành công!");
            return;
        }

        if (cbSort.getSelectedIndex() == 3) {
            filltabelTK(stk.sortSLTang());
            JOptionPane.showMessageDialog(this, "Sort thành công!");
            return;
        }

        if (cbSort.getSelectedIndex() == 4) {
            filltabelTK(stk.sortSLGiam());
            JOptionPane.showMessageDialog(this, "Sort thành công!");
        }


    }//GEN-LAST:event_btnSortActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSort;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnThongKeTheoNam;
    private javax.swing.JButton btnThongKeTheoTuan;
    private javax.swing.JButton btnXuatExecl;
    private javax.swing.JComboBox<String> cbSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblIconThongKe;
    private javax.swing.JTable tbltk;
    private javax.swing.JTable tbtop5;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtSearchTK;
    private javax.swing.JTextField txtTo;
    private javax.swing.JTextField txtTongDoanhThu;
    private javax.swing.JTextField txtTongDonHang;
    private javax.swing.JTextField txtTongSL;
    // End of variables declaration//GEN-END:variables

    private void filltabelTK(List<ThongKeViewModels> listTK) {
        dtm = (DefaultTableModel) tbltk.getModel();
        dtm.setRowCount(0);
        long tongTien = 0;
        int tongSP = 0;
        int tongHd = 0;
        for (ThongKeViewModels h : listTK) {
            dtm.addRow(new Object[]{
                h.getMaHD(),
                h.getMaNV(),
                h.getMaKH(),
                h.getSl(),
                h.getTongTien(),
                h.getNgayTao()
            });
            tongHd++;
            tongSP += h.getSl();
            tongTien += Long.parseLong(h.getTongTien().toString());
        }
        txtTongDoanhThu.setText(tongTien + "");
        txtTongSL.setText(tongSP + "");
        txtTongDonHang.setText(tongHd + "");
    }

    private void genChartWeek() {
        List<BigDecimal> lst = new ArrayList<>();
        List<String> lsts = new ArrayList<>();
        Date now = new Date();
        Date to = now;
        for (int i = 1; i <= 7; i++) {
            lst.add(stk.getWeekChar(to));
            lsts.add(sdf.format(to));
            to = new Date(now.getTime() - 86400000 * i);
        }
        LineChart_AWT chart = new LineChart_AWT("Biểu đồ thống kê doanh thu", "Thu nhập", lst, lsts, "Ngày");
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
    }

    private void genChartMonth() {
        List<BigDecimal> lst = new ArrayList<>();
        List<String> lsts = new ArrayList<>();
        Date now = new Date();
        Date to = now;
        for (int i = 1; i <= 30; i++) {
            lst.add(stk.getWeekChar(to));
            lsts.add(sdf.format(to));
            to = new Date(now.getTime() - 86400000 * i);
        }
        LineChart_AWT chart = new LineChart_AWT("Biểu đồ thống kê doanh thu", "Thu nhập", lst, lsts, "N");
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
    }

    private void filltabelTop5(List<ThongKeRepons> listTK) {
        dtm = (DefaultTableModel) tbtop5.getModel();
        dtm.setRowCount(0);
        for (ThongKeRepons h : listTK) {
            dtm.addRow(new Object[]{
                h.getTenKH(),
                h.getSoLuong(),
                h.getTongTien()
            });
        }
    }
}
