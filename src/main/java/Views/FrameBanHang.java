package Views;

import DomainModels.ChiTietSP;
import DomainModels.HoaDon;
import DomainModels.KhachHang;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.Result;
import Servicies.impl.ServiceBanHang;
import Utilies.InHoaDon;
import ViewsModels.BanHang.GioHangInRespone;
import ViewsModels.BanHang.GioHangRespone;
import ViewsModels.BanHang.HoaDonBanHangRespone;
import ViewsModels.BanHang.HoaDonInRespone;
import ViewsModels.BanHang.NhanVienDangNhapViewModel;
import ViewsModels.BanHang.SanPhamBanHangResponse;
import ViewsModels.BanHang.khachHangBanHangRespone;
import ViewsModels.ThongKe.ThongKeRepons;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Reader;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class FrameBanHang extends javax.swing.JPanel {

    private NhanVienDangNhapViewModel us = new NhanVienDangNhapViewModel();
    private Thread t1;
    private khachHangBanHangRespone kh = new khachHangBanHangRespone();
    private DefaultTableModel dtm = new DefaultTableModel();
    private ServiceBanHang bhs = new ServiceBanHang();
    private List<HoaDonBanHangRespone> lstHoaDon = new ArrayList<>();
    private List<SanPhamBanHangResponse> lstSP = new ArrayList<>();
    private List<GioHangRespone> lstGH = new ArrayList<>();
    private ArrayList<GioHangInRespone> lstGHIRP = new ArrayList<>();
    private int indexHD = -1;
    private int indexSP = -1;
    private int indexGH = -1;
    private int indexImel = -1;
    private int indexImelBan = -1;
    private DecimalFormat df = new DecimalFormat("##0.###");

    public FrameBanHang(NhanVienDangNhapViewModel user) {
        initComponents();
        us = user;

        ButtonGroup bg = new ButtonGroup();
        bg.add(rdoTatCa);
        bg.add(rdoDaThanhToan);
        bg.add(rdoChoThanhToan);
        bg.add(rdoDaHuy);

        rdoTatCa.setSelected(true);

        Icon thanhToan = new ImageIcon("Icon/Money.png");
        Icon taoHD = new ImageIcon("Icon/Add.png");
        Icon lamTrong = new ImageIcon("Icon/No.png");
        Icon search = new ImageIcon("Icon/Search.png");

        this.btnThanhToan.setIcon(thanhToan);
        this.btnHoaDonMoi.setIcon(taoHD);
        this.btnHuyHoaDon.setIcon(lamTrong);
        this.btnSearchHD.setIcon(search);
        this.btnSearchSP.setIcon(search);
        this.btnXoaAllGH.setIcon(lamTrong);
        btnThemKhachHang.setIcon(taoHD);

        fillTableSP(bhs.listSanPhamBanHang());
        fillTableHoaDon(bhs.listHoaDonBanHang());
        FilltoTableGH();
        scannerImel();
    }

    private void clearForm() {
        txtMaKH.setText("");
        txtTenKhachHang.setText("");
        txtSdtKH.setText("");
        txtMaHD.setText("");
        txtMaNV.setText("");
        txtTongTien.setText("0");
        cbHinhThuc.setSelectedIndex(0);
        txtTienKhachDua.setText("0");
        txtTienThua.setText("0");
        txtPhaiTra.setText("0");
        txtMGG.setText("");
        lstGHIRP.clear();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHoaDon = new javax.swing.JTable();
        btnSearchHD = new javax.swing.JButton();
        txtSearchHD = new javax.swing.JTextField();
        rdoDaHuy = new javax.swing.JRadioButton();
        rdoDaThanhToan = new javax.swing.JRadioButton();
        rdoChoThanhToan = new javax.swing.JRadioButton();
        rdoTatCa = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbGioHang = new javax.swing.JTable();
        btnXoaAllGH = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbSanPham = new javax.swing.JTable();
        txtSearchSP = new javax.swing.JTextField();
        btnSearchSP = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbHinhThuc = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtTienKhachDua = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnThanhToan = new javax.swing.JButton();
        btnHoaDonMoi = new javax.swing.JButton();
        btnHuyHoaDon = new javax.swing.JButton();
        txtTongTien = new javax.swing.JTextField();
        txtTienThua = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtSdtKH = new javax.swing.JTextField();
        btnThemKhachHang = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtTienGiam = new javax.swing.JTextField();
        txtMGG = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPhaiTra = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnlCam = new javax.swing.JPanel();
        pnlWebCam = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(1050, 690));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Danh Sách Hóa Đơn");

        tbHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Nhân viên", "Khách Hàng", "Ngày tạo", "Hình thức", "Trạng thái"
            }
        ));
        tbHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHoaDonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbHoaDonMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tbHoaDon);

        btnSearchHD.setText("Search");
        btnSearchHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchHDActionPerformed(evt);
            }
        });

        rdoDaHuy.setText("Đã hủy");
        rdoDaHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDaHuyActionPerformed(evt);
            }
        });

        rdoDaThanhToan.setText("Đã thanh toán");
        rdoDaThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDaThanhToanActionPerformed(evt);
            }
        });

        rdoChoThanhToan.setText("Chờ thanh toán");
        rdoChoThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoChoThanhToanActionPerformed(evt);
            }
        });

        rdoTatCa.setText("Tất cả");
        rdoTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoTatCaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rdoTatCa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoChoThanhToan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoDaThanhToan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoDaHuy))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(109, 109, 109)
                            .addComponent(btnSearchHD)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSearchHD, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnSearchHD)
                    .addComponent(txtSearchHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoDaHuy)
                    .addComponent(rdoDaThanhToan)
                    .addComponent(rdoChoThanhToan)
                    .addComponent(rdoTatCa))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Giỏ hàng");

        tbGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên SP", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        tbGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGioHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbGioHang);

        btnXoaAllGH.setText("Xóa tất cả");
        btnXoaAllGH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaAllGHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoaAllGH)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(btnXoaAllGH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Danh Sách Sản Phẩm");

        tbSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên SP", "Loại", "Màu sắc", "Kích cỡ", "Số lượng tồn", "Đơn giá"
            }
        ));
        tbSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSanPhamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbSanPhamMouseEntered(evt);
            }
        });
        jScrollPane3.setViewportView(tbSanPham);

        btnSearchSP.setText("Search");
        btnSearchSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearchSP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearchSP, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnSearchSP)
                    .addComponent(txtSearchSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Mã HD");

        txtMaHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMaHD.setForeground(new java.awt.Color(0, 0, 255));
        txtMaHD.setEnabled(false);

        jLabel7.setText("Tiền hàng");

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jLabel8.setText("Hình thức");

        cbHinhThuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền mặt", "Chuyển khoản" }));

        jLabel10.setText("Khách đưa");

        txtTienKhachDua.setForeground(new java.awt.Color(255, 51, 51));
        txtTienKhachDua.setText("0");
        txtTienKhachDua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienKhachDuaActionPerformed(evt);
            }
        });

        jLabel11.setText("Tiền thừa");

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        btnThanhToan.setText("Thanh Toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        btnHoaDonMoi.setText("Tạo");
        btnHoaDonMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonMoiActionPerformed(evt);
            }
        });

        btnHuyHoaDon.setText("Hủy");
        btnHuyHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyHoaDonActionPerformed(evt);
            }
        });

        txtTongTien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTongTien.setForeground(new java.awt.Color(255, 51, 51));
        txtTongTien.setText("0");
        txtTongTien.setEnabled(false);

        txtTienThua.setForeground(new java.awt.Color(255, 51, 51));
        txtTienThua.setText("0");
        txtTienThua.setEnabled(false);
        txtTienThua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienThuaActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Khách hàng", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 51, 51))); // NOI18N

        jLabel6.setText("Mã KH");

        txtMaKH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMaKH.setForeground(new java.awt.Color(0, 0, 255));
        txtMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKHActionPerformed(evt);
            }
        });

        jLabel9.setText("Tên KH");

        txtTenKhachHang.setForeground(new java.awt.Color(0, 0, 255));
        txtTenKhachHang.setEnabled(false);
        txtTenKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKhachHangActionPerformed(evt);
            }
        });

        jLabel13.setText("Sdt KH");

        txtSdtKH.setForeground(new java.awt.Color(0, 0, 255));
        txtSdtKH.setEnabled(false);

        btnThemKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKhachHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSdtKH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThemKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtSdtKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnThemKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setText("Mã NV");

        txtMaNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMaNV.setForeground(new java.awt.Color(0, 0, 255));
        txtMaNV.setEnabled(false);

        jLabel4.setText("MGG");

        jLabel15.setText("Tiền giảm");

        txtTienGiam.setText("0");
        txtTienGiam.setEnabled(false);
        txtTienGiam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienGiamActionPerformed(evt);
            }
        });

        txtMGG.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMGG.setForeground(new java.awt.Color(0, 0, 255));
        txtMGG.setEnabled(false);

        jLabel14.setText("Phải trả");

        txtPhaiTra.setText("0");
        txtPhaiTra.setEnabled(false);
        txtPhaiTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhaiTraActionPerformed(evt);
            }
        });

        jLabel16.setText("(VNĐ)");

        jLabel17.setText("(VNĐ)");

        jLabel18.setText("(VNĐ)");

        jLabel19.setText("(VNĐ)");

        jLabel20.setText("(VNĐ)");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel7)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)
                                .addComponent(jLabel14))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbHinhThuc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMaHD))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMGG, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTienThua, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTienKhachDua, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhaiTra, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTienGiam, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTongTien))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel18))
                                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnHoaDonMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHuyHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                            .addComponent(btnThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbHinhThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtMGG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTienGiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtPhaiTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHoaDonMoi)
                    .addComponent(btnHuyHoaDon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quét mã", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 102, 102))); // NOI18N

        pnlCam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlWebCam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlCam.add(pnlWebCam, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCam, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(75, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rdoChoThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoChoThanhToanActionPerformed
        fillTableHoaDonCTT();
    }//GEN-LAST:event_rdoChoThanhToanActionPerformed

    private void rdoDaThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDaThanhToanActionPerformed
        fillTableHoaDonDTT();
    }//GEN-LAST:event_rdoDaThanhToanActionPerformed

    private void rdoDaHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDaHuyActionPerformed
        fillTableHoaDonDH();
    }//GEN-LAST:event_rdoDaHuyActionPerformed

    private void rdoTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoTatCaActionPerformed
        fillTableHoaDon(bhs.listHoaDonBanHang());
    }//GEN-LAST:event_rdoTatCaActionPerformed

    private void tbHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHoaDonMouseClicked
        int row = tbHoaDon.getSelectedRow();
        if (row == -1) {
            return;
        }
        txtMaHD.setText(tbHoaDon.getValueAt(row, 0).toString());
        txtMaKH.setText(tbHoaDon.getValueAt(row, 2).toString());
        showKH();
        txtMaNV.setText(tbHoaDon.getValueAt(row, 1).toString());

        HoaDon hd = bhs.SelectHoaDonByMa(txtMaHD.getText());
        txtPhaiTra.setText(hd.getTongTien() + "");
        cbHinhThuc.setSelectedItem(tbHoaDon.getValueAt(row, 4).toString());
        fillTableGHByMa(txtMaHD.getText());
        btnHuyHoaDon.setBackground(Color.red);
        btnHuyHoaDon.setEnabled(true);

    }//GEN-LAST:event_tbHoaDonMouseClicked

    private void btnSearchHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchHDActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
        List<HoaDonBanHangRespone> listHDBHRP = new ArrayList<>();
        String searchHD = txtSearchHD.getText();
        if (searchHD.equals("")) {
            fillTableHoaDon(bhs.listHoaDonBanHang());
            return;
        }
        if (tbHoaDon.getRowCount() > 0) {
            for (HoaDonBanHangRespone hdbhrp : bhs.getALLHoaDonBanHang()) {
                if (searchHD.equals(hdbhrp.getMa()) || searchHD.equals(hdbhrp.getNguoiTao()) || searchHD.equals(hdbhrp.getKhachHang())
                        || searchHD.equals(hdbhrp.getNgayTao().toString())) {
                    listHDBHRP.add(hdbhrp);
                    fillTableHoaDon(listHDBHRP);
                }
            }
        }
    }//GEN-LAST:event_btnSearchHDActionPerformed

    private void txtTenKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKhachHangActionPerformed


    }//GEN-LAST:event_txtTenKhachHangActionPerformed

    private void txtMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKHActionPerformed
        showKH();

    }//GEN-LAST:event_txtMaKHActionPerformed

    private void btnHoaDonMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonMoiActionPerformed

        int ltt = cbHinhThuc.getSelectedIndex();
        try {
            if (txtMaKH.getText().equals("") || txtTenKhachHang.getText().equals("") || txtSdtKH.getText().equals("")) {
                return;
            }
            if (bhs.createHoaDon(us.getId(), txtMaKH.getText(), ltt)) {
                JOptionPane.showMessageDialog(this, "Tạo hóa đơn thành công");
                fillTableHoaDon(bhs.listHoaDonBanHang());
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Tạo hóa đơn thất bại");
        }

    }//GEN-LAST:event_btnHoaDonMoiActionPerformed

    private void btnHuyHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyHoaDonActionPerformed
        int row = tbHoaDon.getSelectedRow();
        int rowGH = tbGioHang.getSelectedRow();
        if (row == -1) {
            return;
        }
        String trangThai = tbHoaDon.getValueAt(row, 5).toString();
        if (trangThai.equals("Đã thanh toán") || trangThai.equals("Đã hủy")) {
            JOptionPane.showMessageDialog(this, "Bạn chỉ được hủy đơn chờ thanh toán!");
            return;
        }

        for (int i = 0; i < tbGioHang.getRowCount(); i++) {
            bhs.updateSanPhamMua(tbGioHang.getValueAt(i, 0).toString(), Integer.parseInt(tbGioHang.getValueAt(i, 2).toString()));
        }

        if (bhs.updateHuy(txtMaHD.getText())) {
            fillTableGHByMa(txtMaHD.getText());
            clearForm();
            JOptionPane.showMessageDialog(this, "Hủy hóa đơn thành công!");
            fillTableHoaDon(bhs.listHoaDonBanHang());
            fillTableSP(bhs.listSanPhamBanHang());
            return;
        }
        JOptionPane.showMessageDialog(this, "Hủy hóa đơn thất bại!");
    }//GEN-LAST:event_btnHuyHoaDonActionPerformed

    private void tbSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSanPhamMouseClicked
        int rowHD = tbHoaDon.getSelectedRow();
        if (txtMaHD.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chọn hóa đơn cần mua hàng!");
            return;
        }
        String trangThaiStr = tbHoaDon.getValueAt(rowHD, 5).toString();
        if (trangThaiStr.equals("Đã thanh toán") || trangThaiStr.equals("Đã hủy")) {
            JOptionPane.showMessageDialog(this, "Bạn cần chọn hóa đơn chưa thanh toán!");
            return;
        }

        getSPfillGH();
    }//GEN-LAST:event_tbSanPhamMouseClicked

    private void tbGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGioHangMouseClicked
        getSPunGH();

    }//GEN-LAST:event_tbGioHangMouseClicked

    private void tbHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHoaDonMouseEntered

    }//GEN-LAST:event_tbHoaDonMouseEntered

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed

        if (txtMaHD.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chọn hóa đơn cần mua hàng!");
            return;
        }

        double tienKhachDua = Double.parseDouble(txtTienKhachDua.getText());
        double phaiTra = Double.parseDouble(txtPhaiTra.getText());
        if (tienKhachDua < phaiTra) {
            JOptionPane.showMessageDialog(this, "Khách chưa trả đủ số tiền!");
            return;
        }

        int vitri = tbHoaDon.getSelectedRow();

        if (tbHoaDon.getValueAt(vitri, 5).toString().equals("Đã thanh toán") || tbHoaDon.getValueAt(vitri, 5).toString().equals("Đã hủy")) {
            JOptionPane.showMessageDialog(this, "Lỗi thanh toán!");
            return;
        }

        int lkh = 0;
        for (ThongKeRepons tkrp : bhs.listTop5()) {
            if (txtTenKhachHang.getText().equals(tkrp.getTenKH())) {
                double tongTienHang = Double.parseDouble(tkrp.getTongTien().toString());

                double tienMoi = tongTienHang + phaiTra;
                double canThem = 0;
                if (tienMoi < 10000000) {
                    canThem = 10000000 - tienMoi;
                } else if (tienMoi < 20000000) {
                    canThem = 20000000 - tienMoi;
                } else if (tienMoi < 40000000) {
                    canThem = 40000000 - tienMoi;
                }
                JOptionPane.showMessageDialog(this, "Bạn cần mua thêm: " + canThem + " để lên bậc tiếp theo");

                if (tienMoi > 10000000) {
                    lkh = 1;
                }
                if (tienMoi > 20000000) {
                    lkh = 2;
                }
                if (tienMoi > 40000000) {
                    lkh = 3;
                }
            }
        }
        HoaDon hd = bhs.SelectHoaDonByMa(txtMaHD.getText());

        String rank = "";
        switch (lkh) {
            case 1 ->
                rank = "Khách bậc 1";
            case 2 ->
                rank = "Khách bậc 2";
            case 3 ->
                rank = "Khách bậc 3";
            default -> {
            }
        }
        String maCK = "";
        if (cbHinhThuc.getSelectedItem().equals("Chuyển khoản")) {
            maCK = JOptionPane.showInputDialog("Nhập mã chuyển khoản");
        }
        if (maCK.equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mã chuyển khoản!");
            return;
        }

        if (maCK.length() < 10) {
            JOptionPane.showMessageDialog(this, "Mã chuyển khoản không đúng!");
            return;
        }
        bhs.updateKhachHang(txtMaKH.getText(), lkh);
        insertHDCT();
        bhs.updateHD(txtMaHD.getText(), phaiTra);
        clearMouclickAll();
        fillTableHoaDon(bhs.listHoaDonBanHang());
        fillTableSP(bhs.listSanPhamBanHang());
        JOptionPane.showMessageDialog(this, "Thanh toán thành công!");

        int cofirm = JOptionPane.showConfirmDialog(this, "Bạn muốn in hóa đơn?", "Xác nhận", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);
        if (cofirm != JOptionPane.YES_OPTION) {
            clearForm();
            return;
        }
        double tienPhaiTra = Double.parseDouble(txtPhaiTra.getText());
        HoaDonInRespone hdin = new HoaDonInRespone();
        hdin.setMahd(txtMaHD.getText());
        hdin.setNhanVien(txtMaNV.getText() + "-" + us.getHoTen());
        hdin.setKhachhang(txtTenKhachHang.getText());
        hdin.setSdtKH(txtSdtKH.getText());
        hdin.setDiaChi("Tại cửa hàng");
        hdin.setTongTien(BigDecimal.valueOf(tienPhaiTra));
        hdin.setHinhThucThanhToan(cbHinhThuc.getSelectedItem().toString());
        List<GioHangInRespone> ghin = new ArrayList<>();
        for (GioHangInRespone g : lstGHIRP) {
            GioHangInRespone gh = new GioHangInRespone();
            gh.setTenSP(g.getTenSP());
            gh.setDonGia(g.getDonGia());
            gh.setSoLuong(g.getSoLuong());
            gh.setThanhTien(g.getThanhtien());
            ghin.add(gh);
        }

        if (InHoaDon.makePDF(hdin, ghin)) {
            JOptionPane.showMessageDialog(this, "In hoá đơn thành công");
            clearForm();
        }
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void txtTienKhachDuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienKhachDuaActionPerformed
        double PhaiTra = Double.parseDouble(txtPhaiTra.getText());
        double tkd = Double.parseDouble(txtTienKhachDua.getText());

        double tienThua = 0;
        if (PhaiTra > tkd) {
            tienThua = 0;
            txtTienThua.setText(df.format(tienThua) + "");
        }
        if (PhaiTra < tkd) {
            tienThua = tkd - PhaiTra;
            txtTienThua.setText(df.format(tienThua) + "");
        }
    }//GEN-LAST:event_txtTienKhachDuaActionPerformed

    private void btnSearchSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSPActionPerformed
        List<SanPhamBanHangResponse> listHDBHRP = new ArrayList<>();
        String searchSP = txtSearchSP.getText();
        if (searchSP.equals("")) {
            fillTableSP(bhs.listSanPhamBanHang());
            return;
        }
        if (tbHoaDon.getRowCount() > 0) {
            for (SanPhamBanHangResponse spbhrp : bhs.listSanPhamBanHang()) {
                if (searchSP.equals(spbhrp.getMaSP()) || searchSP.equals(spbhrp.getTenSP()) || searchSP.equals(spbhrp.getLoai())
                        || searchSP.equals(spbhrp.getMauSac()) || searchSP.equals(String.valueOf(spbhrp.getKichCo())) || searchSP.equals(String.valueOf(spbhrp.getSoLuong())) || searchSP.equals(spbhrp.getGiaBan().toString())) {
                    listHDBHRP.add(spbhrp);
                    fillTableSP(listHDBHRP);
                    return;
                }
            }
        }

    }//GEN-LAST:event_btnSearchSPActionPerformed

    private void btnThemKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemKhachHangActionPerformed
        new ViewThemKHBanHang(us).setVisible(true);
    }//GEN-LAST:event_btnThemKhachHangActionPerformed

    private void txtTienGiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienGiamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienGiamActionPerformed

    private void txtTienThuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienThuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienThuaActionPerformed

    private void txtPhaiTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhaiTraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhaiTraActionPerformed

    private void btnXoaAllGHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaAllGHActionPerformed
        for (int i = 0; i < tbGioHang.getRowCount(); i++) {
            bhs.updateSanPhamMua(tbGioHang.getValueAt(i, 0).toString(), Integer.parseInt(tbGioHang.getValueAt(i, 2).toString()));
        }

        fillTableGHByMa(txtMaHD.getText());
        JOptionPane.showMessageDialog(this, "Hủy tất cả sản phẩm thành công!");
        fillTableSP(bhs.listSanPhamBanHang());
        lstGHIRP.clear();
    }//GEN-LAST:event_btnXoaAllGHActionPerformed

    private void tbSanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSanPhamMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbSanPhamMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHoaDonMoi;
    private javax.swing.JButton btnHuyHoaDon;
    private javax.swing.JButton btnSearchHD;
    private javax.swing.JButton btnSearchSP;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThemKhachHang;
    private javax.swing.JButton btnXoaAllGH;
    private javax.swing.JComboBox<String> cbHinhThuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnlCam;
    private javax.swing.JPanel pnlWebCam;
    private javax.swing.JRadioButton rdoChoThanhToan;
    private javax.swing.JRadioButton rdoDaHuy;
    private javax.swing.JRadioButton rdoDaThanhToan;
    private javax.swing.JRadioButton rdoTatCa;
    private javax.swing.JTable tbGioHang;
    private javax.swing.JTable tbHoaDon;
    private javax.swing.JTable tbSanPham;
    private javax.swing.JTextField txtMGG;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtPhaiTra;
    private javax.swing.JTextField txtSdtKH;
    private javax.swing.JTextField txtSearchHD;
    private javax.swing.JTextField txtSearchSP;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtTienGiam;
    private javax.swing.JTextField txtTienKhachDua;
    private javax.swing.JTextField txtTienThua;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables

    public void scannerImel() {
        Webcam webcam = Webcam.getDefault();
        webcam.setViewSize(WebcamResolution.QVGA.getSize());

        WebcamPanel panel = new WebcamPanel(webcam);
        panel.setPreferredSize(WebcamResolution.VGA.getSize());
        panel.setFPSDisplayed(true);

        pnlWebCam.add(panel, new AbsoluteConstraints(0, 0, 272, 182));

        t1 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                    }
                    BufferedImage image = null;
                    Result result = null;
                    if (webcam.isOpen()) {
                        if ((image = webcam.getImage()) == null) {
                            continue;
                        }
                    }
                    try {
                        LuminanceSource source = new BufferedImageLuminanceSource(image);
                        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
                        Reader reader = new MultiFormatReader();
                        result = reader.decode(bitmap);
                    } catch (Exception e) {
                    }

                    if (result != null) {
                        try {
                            if (txtMaHD.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "Bạn cần chọn hóa đơn!");
                                clearForm();
                                return;
                            }
                            int row = tbHoaDon.getSelectedRow();
                            String trangThai = tbHoaDon.getValueAt(row, 5).toString();
                            if (trangThai.equals("Đã thanh toán") || trangThai.equals("Đã hủy")) {
                                JOptionPane.showMessageDialog(null, "Bạn cần chọn hóa đơn chưa thanh toán!");
                                clearForm();
                                return;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        ChiTietSP ctsp = bhs.SelectCTSPByQRcode(result.getText());
                        for (GioHangInRespone x : lstGHIRP) {
                            if (ctsp.getMa().equalsIgnoreCase(x.getMaSP())) {
                                int sl = 0;
                                try {
                                    sl = Integer.parseInt(JOptionPane.showInputDialog("Mời bạn nhập số lượng"));
                                    if (sl < 0 || sl > ctsp.getSoLuong()) {
                                        JOptionPane.showMessageDialog(null, "Nhập sai số lượng");
                                        return;
                                    }
                                    if (sl == 0) {
                                        lstGHIRP.remove(x);
                                        return;
                                    }
                                    x.setSoLuong(sl);
                                    bhs.UpdateSanPhamBan(ctsp.getMa(), sl);
                                    FilltoTableGH();
                                    showtien();
                                    return;

                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "Số lượng phải là số");
                                    return;
                                }

                            }
                        }
                        int sl = 0;
                        try {
                            sl = Integer.parseInt(JOptionPane.showInputDialog("Mời bạn nhập số lượng"));
                            if (sl < 0 || sl > ctsp.getSoLuong()) {
                                JOptionPane.showMessageDialog(null, "Nhập sai số lượng");
                                return;
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Số lượng phải là số");
                        }

                        GioHangInRespone ghi = new GioHangInRespone(String.valueOf(ctsp.getId()), ctsp.getMa(), ctsp.getId_sp().getTen(), sl, ctsp.getGiaBan());
                        lstGHIRP.add(ghi);
                        bhs.UpdateSanPhamBan(ctsp.getMa(), sl);
                        FilltoTableGH();
                        fillTableSP(bhs.listSanPhamBanHang());
                        showtien();
                    }
                }
            }
        };
        t1.start();
    }

    private void fillTableHoaDon(List<HoaDonBanHangRespone> listHD) {
        dtm = (DefaultTableModel) tbHoaDon.getModel();
        dtm.setRowCount(0);

        for (HoaDonBanHangRespone s : listHD) {
            dtm.addRow(s.toDataRow());
        }
        btnHuyHoaDon.setBackground(Color.red);
        btnHuyHoaDon.setEnabled(true);
    }

    private void fillTableSP(List<SanPhamBanHangResponse> listSPBH) {
        dtm = (DefaultTableModel) tbSanPham.getModel();
        dtm.setRowCount(0);
        for (SanPhamBanHangResponse s : listSPBH) {
            if (s.getSoLuong() > 0) {
                dtm.addRow(s.toDataRow());
            }
        }
    }

    private void fillTableHoaDonDTT() {
        dtm = (DefaultTableModel) tbHoaDon.getModel();
        dtm.setRowCount(0);
        lstHoaDon = bhs.getALLHoaDonDaThanhToan();
        if (lstHoaDon.isEmpty()) {
            return;
        }
        for (HoaDonBanHangRespone s : lstHoaDon) {
            dtm.addRow(s.toDataRow());
        }
        btnHuyHoaDon.setBackground(Color.red);
        btnHuyHoaDon.setEnabled(true);
    }

    private void fillTableHoaDonDH() {
        dtm = (DefaultTableModel) tbHoaDon.getModel();
        dtm.setRowCount(0);
        lstHoaDon = bhs.getALLHoaDonDaHuy();
        if (lstHoaDon.isEmpty()) {
            return;
        }
        for (HoaDonBanHangRespone s : lstHoaDon) {
            dtm.addRow(s.toDataRow());
        }
        btnHuyHoaDon.setBackground(Color.red);
        btnHuyHoaDon.setEnabled(true);
    }

    private void fillTableHoaDonCTT() {
        dtm = (DefaultTableModel) tbHoaDon.getModel();
        dtm.setRowCount(0);
        lstHoaDon = bhs.getALLHoaDonChoThanhToan();
        if (lstHoaDon.isEmpty()) {
            return;
        }
        for (HoaDonBanHangRespone s : lstHoaDon) {
            dtm.addRow(s.toDataRow());
        }
        btnHuyHoaDon.setBackground(Color.red);
        btnHuyHoaDon.setEnabled(true);
    }

    private void fillTableGH(ArrayList<GioHangRespone> listGHBH) {
        dtm = (DefaultTableModel) tbGioHang.getModel();
        dtm.setRowCount(0);
        for (GioHangRespone s : listGHBH) {
            dtm.addRow(s.toDataRow());
        }
    }

    private void fillTableGHByMa(String ma) {
        dtm = (DefaultTableModel) tbGioHang.getModel();
        dtm.setRowCount(0);
        try {
            lstGH = bhs.getAllGHByMaHD(ma);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (GioHangRespone s : lstGH) {
            dtm.addRow(s.toDataRow());
        }
        indexGH = -1;
        double tong = 0;
        for (int i = 0; i < tbGioHang.getRowCount(); i++) {
            tong += (Double.parseDouble(tbGioHang.getValueAt(i, 4).toString()));
        }
        txtTongTien.setText(tong + "");
    }

    private void getSPfillGH() {
        int row = tbSanPham.getSelectedRow();
        int rowGH = tbGioHang.getSelectedRow();

        for (GioHangInRespone x : lstGHIRP) {
            if (tbSanPham.getValueAt(row, 0).toString().equalsIgnoreCase(x.getMaSP())) {
                int sl = 0;
                try {
                    sl = Integer.parseInt(JOptionPane.showInputDialog("Mời bạn nhập số lượng"));
                    if (sl < 1 || sl > bhs.listSanPhamBanHang().get(row).getSoLuong()) {
                        JOptionPane.showMessageDialog(this, "Nhập sai số lượng");
                        return;
                    }
                    if (sl < 1) {
                        lstGHIRP.remove(x);
                        return;
                    }
                    x.setSoLuong(sl);
                    bhs.UpdateSanPhamBan(tbSanPham.getValueAt(row, 0).toString(), sl);
                    FilltoTableGH();
                    showtien();
                    return;

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Số lượng phải là số");
                    return;
                }

            }
        }
        int sl = 0;
        try {
            sl = Integer.parseInt(JOptionPane.showInputDialog("Mời bạn nhập số lượng"));
            if (sl < 1 || sl > bhs.listSanPhamBanHang().get(row).getSoLuong()) {
                JOptionPane.showMessageDialog(this, "Nhập sai số lượng");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Số lượng phải là số");
        }

        if (sl < 1) {
            JOptionPane.showMessageDialog(this, "Nhập sai số lượng!");
            return;
        }
        double dg = Double.parseDouble(tbSanPham.getValueAt(row, 6).toString());

        String idCTSP = bhs.listSanPhamBanHang().get(row).getId();
        String maCTSP = tbSanPham.getValueAt(row, 0).toString();
        String tenSP = tbSanPham.getValueAt(row, 1).toString();
        BigDecimal donGia = BigDecimal.valueOf(dg);

        GioHangInRespone ghirp = new GioHangInRespone(idCTSP, maCTSP, tenSP, sl, donGia);

        lstGHIRP.add(ghirp);
        bhs.UpdateSanPhamBan(tbSanPham.getValueAt(row, 0).toString(), sl);
        FilltoTableGH();
        fillTableSP(bhs.listSanPhamBanHang());
        showtien();
    }

    private void getSPunGH() {
        int row = tbGioHang.getSelectedRow();

        int slm = Integer.parseInt(tbGioHang.getValueAt(row, 2).toString());
        for (GioHangInRespone x : lstGHIRP) {
            if (tbGioHang.getValueAt(row, 0).toString().equalsIgnoreCase(x.getMaSP())) {
                int sl = -1;
                try {
                    sl = Integer.parseInt(JOptionPane.showInputDialog("Mời bạn nhập số lượng bỏ ra"));
                    if (sl < 0 || sl > lstGHIRP.get(row).getSoLuong()) {
                        JOptionPane.showMessageDialog(this, "Nhập sai số lượng");
                        return;
                    }
                    if (sl == 0) {
                        lstGH.remove(x);
                        return;
                    }
                    if (Integer.parseInt(tbGioHang.getValueAt(row, 2).toString()) == 0) {
                        tbGioHang.remove(row);
                    }
                    int slmh = slm - sl;
                    x.setSoLuong(slmh);
                    bhs.updateSanPhamMua(tbGioHang.getValueAt(row, 0).toString(), sl);
                    FilltoTableGH();
                    fillTableSP(bhs.listSanPhamBanHang());
                    showtien();
                    return;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Số lượng phải là số");
                }

            }
        }
    }

    private void FilltoTableGH() {
        dtm = (DefaultTableModel) tbGioHang.getModel();
        dtm.setRowCount(0);
        for (GioHangInRespone x : lstGHIRP) {
            if (x.getSoLuong() > 0) {
                dtm.addRow(new Object[]{x.getMaSP(), x.getTenSP(), x.getSoLuong(), x.getDonGia(), x.getThanhtien()});
            }
        }
    }

    private void showtien() {

        double tt = 0;
        for (GioHangInRespone x : lstGHIRP) {
            tt += Double.parseDouble(x.getThanhtien().toString());
        }
        txtTongTien.setText(String.valueOf(df.format(tt)));
        double tkd = Double.parseDouble(txtTienKhachDua.getText());
        double tienGiam = 0;

        if (Double.parseDouble(txtTongTien.getText()) > 10000000) {
            txtMGG.setText("UD1");
        }
        if (Double.parseDouble(txtTongTien.getText()) > 20000000) {
            txtMGG.setText("UD2");
        }
        if (Double.parseDouble(txtTongTien.getText()) > 40000000) {
            txtMGG.setText("UD3");
        }

        String maGG = txtMGG.getText();
        tienGiam = switch (maGG) {
            case "UD1" ->
                tt * 0.05;
            case "UD2" ->
                tt * 0.1;
            case "UD3" ->
                tt * 0.15;
            default ->
                0;
        };

        txtTienGiam.setText(String.valueOf(df.format(tienGiam)));

        double PhaiTra = tt - tienGiam;
        txtPhaiTra.setText(String.valueOf(df.format(PhaiTra)));
    }

    private void insertHDCT() {
        int rowHD = tbHoaDon.getSelectedRow();
        String idHD = bhs.listHoaDonBanHang().get(rowHD).getId();

        bhs.INSERT(idHD, lstGHIRP);

    }

    private void UpdateSPHUYHD() {
        int rowGH = tbGioHang.getSelectedRow();
        for (int i = 0; i < tbGioHang.getRowCount(); i++) {
            bhs.updateSanPhamMua(tbGioHang.getValueAt(i, 0).toString(), Integer.parseInt(tbGioHang.getValueAt(i, 2).toString()));
        }
    }

    private void clearMouclickAll() {
        tbSanPham.clearSelection();
        tbHoaDon.clearSelection();
        dtm = (DefaultTableModel) tbGioHang.getModel();
        dtm.setRowCount(0);
    }

    private void showKH() {
        KhachHang kh = bhs.SelectKHByMa(txtMaKH.getText());
        txtTenKhachHang.setText(kh.getHoTen());
        txtSdtKH.setText(kh.getSdt());
        String lkh = "";
        System.out.println("check loai kh");
        System.out.println(kh.getLoaiKH());
        lkh = switch (kh.getLoaiKH()) {
            case 1 ->
                "UD1";
            case 2 ->
                "UD2";
            case 3 ->
                "UD3";
            default ->
                "";
        };
        txtMGG.setText(lkh);
    }
}
