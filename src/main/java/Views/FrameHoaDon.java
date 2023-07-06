package Views;

import DomainModels.HoaDon;
import DomainModels.HoaDonCT;
import Servicies.IServiceHoaDon;
import Servicies.impl.ServiceHoaDon;
import ViewsModels.SanPhamAndChiTietSP.HDCTRepo;
import java.awt.Color;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FrameHoaDon extends javax.swing.JPanel {

    private IServiceHoaDon HDSer = new ServiceHoaDon();
    DefaultTableModel model = new DefaultTableModel();
    int row;

    public FrameHoaDon() {
        initComponents();

        addTableHD(this.HDSer.getListHD());
        List<HDCTRepo> list = new ArrayList<>();
        addTableHDCT(list);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHD = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSLHD = new javax.swing.JTextField();
        btnSearchHD = new javax.swing.JButton();
        btnRefeshHD = new javax.swing.JButton();
        btnExportHD = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtNgayBD = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNgayKT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtNgayTao = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtTinhTrang = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLoaiThanhToan = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtMaCT = new javax.swing.JTextField();
        txtSLCT = new javax.swing.JTextField();
        txtDGCT = new javax.swing.JTextField();
        txtMaSPCT = new javax.swing.JTextField();
        txtThanhTienCT = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHDCT = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSLHDCT = new javax.swing.JTextField();
        btnSearchHDCT = new javax.swing.JButton();
        btnRefeshHDCT = new javax.swing.JButton();
        btnExportHDCT = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(1050, 690));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Ngày Tạo", "SĐT khách hàng", "Địa chỉ", "Loại thanh toán", "Tổng tiền", "tình trạng"
            }
        ));
        tblHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHD);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Danh sách hóa đơn");

        jLabel1.setText("Số lượng hóa đơn:");

        txtSLHD.setEnabled(false);

        btnSearchHD.setText("Search");
        btnSearchHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchHDActionPerformed(evt);
            }
        });

        btnRefeshHD.setText("Refesh");
        btnRefeshHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshHDActionPerformed(evt);
            }
        });

        btnExportHD.setText("Export Excel");
        btnExportHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportHDActionPerformed(evt);
            }
        });

        jLabel12.setText("Từ ngày");

        jLabel13.setText("Đến ngày");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtSLHD, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(btnExportHD)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnSearchHD))
                            .addComponent(btnRefeshHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchHD)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtSLHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnRefeshHD)
                    .addComponent(btnExportHD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Hóa Đơn");

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Mã hóa đơn");

        txtMa.setEnabled(false);

        jLabel8.setText("Ngày tạo");

        jLabel9.setText("SĐT khách hàng");

        jLabel10.setText("Địa chỉ");

        jLabel11.setText("Tình trạng");

        txtSDT.setEnabled(false);

        txtNgayTao.setEnabled(false);

        txtDiaChi.setEnabled(false);

        txtTinhTrang.setEnabled(false);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Hóa Đơn");

        jLabel3.setText("Loại thanh toán");

        jLabel6.setText("Tổng tiền");

        txtLoaiThanhToan.setEnabled(false);

        txtTongTien.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtNgayTao))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(jLabel24)
                                .addGap(127, 127, 127))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtMa))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiaChi)
                            .addComponent(txtSDT)
                            .addComponent(txtTinhTrang)
                            .addComponent(txtLoaiThanhToan)
                            .addComponent(txtTongTien))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtLoaiThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setText("Mã hóa đơn");

        jLabel16.setText("Mã sản phẩm");

        jLabel17.setText("Số lượng");

        jLabel18.setText("Đơn giá");

        jLabel19.setText("Thành tiền");

        txtMaCT.setEnabled(false);

        txtSLCT.setEnabled(false);

        txtDGCT.setEnabled(false);

        txtMaSPCT.setEnabled(false);

        txtThanhTienCT.setEnabled(false);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Chi Tiết Hóa Đơn");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaCT))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDGCT, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSLCT)
                            .addComponent(txtThanhTienCT))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(106, 106, 106))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(txtMaSPCT)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtMaCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtMaSPCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtSLCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtDGCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(txtThanhTienCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblHDCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã HD", "Mã SP", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        tblHDCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHDCTMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblHDCT);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("Danh sách chi tiết hóa đơn");

        jLabel2.setText("Số lượng hóa đơn:");

        txtSLHDCT.setEnabled(false);

        btnSearchHDCT.setText("Search");
        btnSearchHDCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchHDCTActionPerformed(evt);
            }
        });

        btnRefeshHDCT.setText("Refesh");
        btnRefeshHDCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshHDCTActionPerformed(evt);
            }
        });

        btnExportHDCT.setText("Export Excel");
        btnExportHDCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportHDCTActionPerformed(evt);
            }
        });

        txtSearch.setForeground(new java.awt.Color(153, 153, 153));
        txtSearch.setText("Tìm theo mã SP");
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(btnExportHDCT)
                        .addGap(53, 53, 53)
                        .addComponent(btnRefeshHDCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtSLHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchHDCT)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSLHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchHDCT)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefeshHDCT)
                    .addComponent(jLabel21)
                    .addComponent(btnExportHDCT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(551, 551, 551)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefeshHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshHDActionPerformed
        addTableHD(this.HDSer.getListHD());
    }//GEN-LAST:event_btnRefeshHDActionPerformed

    private void btnRefeshHDCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshHDCTActionPerformed
        txtSearch.setText("");
        List<HDCTRepo> list = this.HDSer.getListHDCT(txtMa.getText());
        addTableHDCT(list);

    }//GEN-LAST:event_btnRefeshHDCTActionPerformed

    private void tblHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHDMouseClicked
        row = this.tblHD.getSelectedRow();
        String ma = this.tblHD.getValueAt(row, 0).toString();
        String ngayTao = this.tblHD.getValueAt(row, 1).toString();
        String SDT = this.tblHD.getValueAt(row, 2).toString();
        String DiaChi = this.tblHD.getValueAt(row, 3).toString();
        String LoaiThanhToan = this.tblHD.getValueAt(row, 4).toString();
        String TongTien = this.tblHD.getValueAt(row, 5).toString();
        if (tblHD.getValueAt(row, 5).equals(null)) {
            TongTien = "0";
        }
        String TinhTrang = this.tblHD.getValueAt(row, 6).toString();

        this.txtMa.setText(ma);
        this.txtNgayTao.setText(ngayTao);
        this.txtSDT.setText(SDT);
        this.txtDiaChi.setText(DiaChi);
        this.txtLoaiThanhToan.setText(LoaiThanhToan);
        this.txtTongTien.setText(TongTien + " VND");
        this.txtTinhTrang.setText(TinhTrang);

        List<HDCTRepo> list = this.HDSer.getListHDCT(ma);
        addTableHDCT(list);

    }//GEN-LAST:event_tblHDMouseClicked

    private void tblHDCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHDCTMouseClicked
        row = this.tblHDCT.getSelectedRow();
        String maHD = this.tblHDCT.getValueAt(row, 0).toString();
        String maSP = this.tblHDCT.getValueAt(row, 1).toString();
        String SL = this.tblHDCT.getValueAt(row, 2).toString();
        String DG = this.tblHDCT.getValueAt(row, 3).toString();
        String TT = this.tblHDCT.getValueAt(row, 4).toString();

        this.txtMaCT.setText(maHD);
        this.txtMaSPCT.setText(maSP);
        this.txtSLCT.setText(SL);
        this.txtDGCT.setText(DG + " VND");
        this.txtThanhTienCT.setText(TT + " VND");
    }//GEN-LAST:event_tblHDCTMouseClicked

    private void btnSearchHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchHDActionPerformed
        String dateStart = this.txtNgayBD.getText();
        String dateEnd = this.txtNgayKT.getText();
        if (dateStart.length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập ngày bắt đầu!");
            txtNgayBD.requestFocus();
            return;
        }

        if (dateEnd.length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập ngày kết thúc!");
            txtNgayKT.requestFocus();
            return;
        }

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(txtNgayBD.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ngày bắt đầu không đúng định dạng! Vui lòng nhập theo kiểu yyyy-MM-dd");
            txtNgayBD.requestFocus();
            return;
        }

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(txtNgayKT.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ngày kết thúc không đúng định dạng! Vui lòng nhập theo kiểu yyyy-MM-dd");
            txtNgayKT.requestFocus();
            return;
        }
        List<ViewsModels.SanPhamAndChiTietSP.HoaDon> list = this.HDSer.getListHDByNgay(dateStart, dateEnd);
        if (list.size() == 0) {
            JOptionPane.showMessageDialog(this, "Không có hóa đơn chi tiết bạn cần tìm!");
            model = (DefaultTableModel) tblHD.getModel();
            model.setRowCount(0);
            return;

        } else {
            JOptionPane.showMessageDialog(this, "Tìm kiếm thành công!");
            addTableHDbyNgay(list);
        }
    }//GEN-LAST:event_btnSearchHDActionPerformed

    private void btnSearchHDCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchHDCTActionPerformed
        String ma = this.txtSearch.getText();
        List<HDCTRepo> list = this.HDSer.getListHDCTByMaSP(ma, txtMa.getText());
        if (list.size() == 0) {
            JOptionPane.showMessageDialog(this, "Không có mã hóa đơn chi tiết bạn cần tìm!");
            model = (DefaultTableModel) tblHDCT.getModel();
            model.setRowCount(0);
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Tìm kiếm thành công!");
            addTableHDCT(list);
        }

    }//GEN-LAST:event_btnSearchHDCTActionPerformed

    private void btnExportHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportHDActionPerformed
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("danh_sach_hd");
            XSSFRow row = null;
            Cell cell = null;
            List<HoaDon> listExport = this.HDSer.getListHD();
            int i = 0;
            for (HoaDon hd : listExport) {
                row = sheet.createRow(i);
                i++;
                cell = row.createCell(0);
                cell.setCellValue(hd.getMa());

                cell = row.createCell(1);
                cell.setCellValue(hd.getNgayTao());

                cell = row.createCell(2);
                cell.setCellValue(hd.getSdt_KH());

                cell = row.createCell(3);
                cell.setCellValue(hd.getDiaChi());

                cell = row.createCell(4);
                cell.setCellValue(hd.getLoaiThanhToan());

                cell = row.createCell(5);
                cell.setCellValue(hd.getTongTien() + " VND");

                cell = row.createCell(6);
                cell.setCellValue(hd.getTinhTrang());
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
                JOptionPane.showMessageDialog(this, "Export thành công!");
                return;
            }
            JOptionPane.showMessageDialog(this, "Export không thành công!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnExportHDActionPerformed

    private void btnExportHDCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportHDCTActionPerformed
        row = this.tblHD.getSelectedRow();
        String ma = this.tblHD.getValueAt(row, 0).toString();
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("danh_sach_hdct");
            XSSFRow row = null;
            Cell cell = null;
            List<HDCTRepo> listExport = this.HDSer.getListHDCT(ma);
            int i = 0;
            for (HDCTRepo hd : listExport) {
                row = sheet.createRow(i);
                i++;
                cell = row.createCell(0);
                cell.setCellValue(hd.getMaHD());

                cell = row.createCell(1);
                cell.setCellValue(hd.getMaSP());

                cell = row.createCell(2);
                cell.setCellValue(hd.getSoLuong());

                cell = row.createCell(3);
                cell.setCellValue(hd.getDonGia() + " VND");

                cell = row.createCell(4);
                cell.setCellValue(hd.getThanhTien() + " VND");
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
                JOptionPane.showMessageDialog(this, "Export thành công!");
                return;
            }
            JOptionPane.showMessageDialog(this, "Export không thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnExportHDCTActionPerformed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        txtSearch.setText("");
        txtSearch.setForeground(Color.black);
    }//GEN-LAST:event_txtSearchMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportHD;
    private javax.swing.JButton btnExportHDCT;
    private javax.swing.JButton btnRefeshHD;
    private javax.swing.JButton btnRefeshHDCT;
    private javax.swing.JButton btnSearchHD;
    private javax.swing.JButton btnSearchHDCT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblHD;
    private javax.swing.JTable tblHDCT;
    private javax.swing.JTextField txtDGCT;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtLoaiThanhToan;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMaCT;
    private javax.swing.JTextField txtMaSPCT;
    private javax.swing.JTextField txtNgayBD;
    private javax.swing.JTextField txtNgayKT;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSLCT;
    private javax.swing.JTextField txtSLHD;
    private javax.swing.JTextField txtSLHDCT;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtThanhTienCT;
    private javax.swing.JTextField txtTinhTrang;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables

    private void addTableHD(List<HoaDon> listHD) {
        model = (DefaultTableModel) tblHD.getModel();
        model.setRowCount(0);
        for (HoaDon hd : listHD) {
            String tongTien = String.valueOf(hd.getTongTien());
            if (tongTien.equalsIgnoreCase("null")) {
                tongTien = "0";
            }
            model.addRow(new Object[]{hd.getMa(), hd.getNgayTao(), hd.getSdt_KH(), hd.getDiaChi(), hd.getLoaiThanhToan(), tongTien, hd.getTinhTrang()});
        }

        this.txtSLHD.setText(String.valueOf(model.getRowCount()));
    }

    private void addTableHDCT(List<HDCTRepo> listHDCT) {
        model = (DefaultTableModel) tblHDCT.getModel();
        model.setRowCount(0);
        for (HDCTRepo hd : listHDCT) {
            model.addRow(new Object[]{hd.getMaHD(), hd.getMaSP(), hd.getSoLuong(), hd.getDonGia(), hd.getThanhTien()});
        }

        this.txtSLHDCT.setText(String.valueOf(model.getRowCount()));
    }

    private void addTableHDbyNgay(List<ViewsModels.SanPhamAndChiTietSP.HoaDon> listHDByNgay) {
        model = (DefaultTableModel) tblHD.getModel();
        model.setRowCount(0);
        for (ViewsModels.SanPhamAndChiTietSP.HoaDon hd : listHDByNgay) {
            String tongTien = String.valueOf(hd.getTongTien());
            if (tongTien.equalsIgnoreCase("null")) {
                tongTien = "0";
            }
            model.addRow(new Object[]{hd.getMa(), hd.getNgayTao(), hd.getSDT(), hd.getDiaChi(), hd.getLoaiTT(), tongTien, hd.getTinhTrang()});
        }

        this.txtSLHD.setText(String.valueOf(model.getRowCount()));
    }
}
