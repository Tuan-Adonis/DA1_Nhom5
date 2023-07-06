package Views;

import Views.ViewsNhanVien.*;
import Views.ViewsQuanLy.FrameKhachHangQL;
import Views.ViewsQuanLy.FrameNhanVien;
import Views.ViewsQuanLy.FrameSanPhamQL;
import Views.ViewsQuanLy.frameNhaCungCapQL;
import ViewsModels.BanHang.NhanVienDangNhapViewModel;
import com.github.sarxos.webcam.Webcam;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ViewMain extends javax.swing.JFrame {

    private int chosser;
    private NhanVienDangNhapViewModel usvm;

    public ViewMain(NhanVienDangNhapViewModel user) {
        initComponents();
        this.setLocationRelativeTo(null);
        Icon logoShop = new ImageIcon("Icon/logoShop.PNG");
        Icon userQL = new ImageIcon("Icon/userQL.PNG");
        Icon userNV = new ImageIcon("Icon/userNV.PNG");
        Icon anh1 = new ImageIcon("Icon/anh1.PNG");
        Icon anh2 = new ImageIcon("Icon/anh2.PNG");
        Icon anh3 = new ImageIcon("Icon/anh3.PNG");

        this.lblAnh1.setIcon(anh1);
        this.lblAnh2.setIcon(anh2);
        this.lblAnh3.setIcon(anh3);
        this.lblUser.setIcon(userQL);
        usvm = user;
        if (user.getVaiTro() == 1) {
            pnlNhanVien.setVisible(false);
            pnlThongKe.setVisible(false);
            this.lblUser.setIcon(userNV);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneListService = new javax.swing.JPanel();
        pnlBanHang = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlSanPham = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlHoaDon = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlNhanVien = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnlKhachHang = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pnlNhaCungCap = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pnlThongKe = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pnlHome = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtDangXuat = new javax.swing.JLabel();
        txtDoiMatKhau = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        JView = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        lblAnh3 = new javax.swing.JLabel();
        lblAnh1 = new javax.swing.JLabel();
        lblAnh2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1550, 690));

        paneListService.setBackground(new java.awt.Color(0, 102, 102));
        paneListService.setMaximumSize(new java.awt.Dimension(200, 690));
        paneListService.setMinimumSize(new java.awt.Dimension(200, 690));
        paneListService.setPreferredSize(new java.awt.Dimension(219, 690));

        pnlBanHang.setBackground(new java.awt.Color(204, 255, 204));
        pnlBanHang.setMaximumSize(new java.awt.Dimension(200, 50));
        pnlBanHang.setMinimumSize(new java.awt.Dimension(200, 50));
        pnlBanHang.setPreferredSize(new java.awt.Dimension(219, 50));
        pnlBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBanHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlBanHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlBanHangMouseExited(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new ImageIcon("src/main/resource/icon/shopping.png"));
        jLabel1.setMaximumSize(new java.awt.Dimension(30, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(30, 50));
        jLabel1.setPreferredSize(new java.awt.Dimension(30, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Bán hàng");
        jLabel2.setMaximumSize(new java.awt.Dimension(110, 50));
        jLabel2.setMinimumSize(new java.awt.Dimension(110, 50));
        jLabel2.setPreferredSize(new java.awt.Dimension(110, 50));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlBanHangLayout = new javax.swing.GroupLayout(pnlBanHang);
        pnlBanHang.setLayout(pnlBanHangLayout);
        pnlBanHangLayout.setHorizontalGroup(
            pnlBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBanHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        pnlBanHangLayout.setVerticalGroup(
            pnlBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBanHangLayout.createSequentialGroup()
                .addGroup(pnlBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlSanPham.setBackground(new java.awt.Color(204, 255, 204));
        pnlSanPham.setMaximumSize(new java.awt.Dimension(200, 50));
        pnlSanPham.setMinimumSize(new java.awt.Dimension(200, 50));
        pnlSanPham.setPreferredSize(new java.awt.Dimension(219, 50));
        pnlSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSanPhamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlSanPhamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlSanPhamMouseExited(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new ImageIcon("src/main/resource/icon/product.png"));
        jLabel3.setMaximumSize(new java.awt.Dimension(30, 50));
        jLabel3.setMinimumSize(new java.awt.Dimension(30, 50));
        jLabel3.setPreferredSize(new java.awt.Dimension(30, 50));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Sản phẩm");
        jLabel4.setMaximumSize(new java.awt.Dimension(110, 50));
        jLabel4.setMinimumSize(new java.awt.Dimension(110, 50));
        jLabel4.setPreferredSize(new java.awt.Dimension(110, 50));

        javax.swing.GroupLayout pnlSanPhamLayout = new javax.swing.GroupLayout(pnlSanPham);
        pnlSanPham.setLayout(pnlSanPhamLayout);
        pnlSanPhamLayout.setHorizontalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        pnlSanPhamLayout.setVerticalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSanPhamLayout.createSequentialGroup()
                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlHoaDon.setBackground(new java.awt.Color(204, 255, 204));
        pnlHoaDon.setMaximumSize(new java.awt.Dimension(200, 50));
        pnlHoaDon.setMinimumSize(new java.awt.Dimension(200, 50));
        pnlHoaDon.setPreferredSize(new java.awt.Dimension(219, 50));
        pnlHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlHoaDonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlHoaDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlHoaDonMouseExited(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new ImageIcon("src/main/resource/icon/bill.png"));
        jLabel5.setMaximumSize(new java.awt.Dimension(30, 50));
        jLabel5.setMinimumSize(new java.awt.Dimension(30, 50));
        jLabel5.setPreferredSize(new java.awt.Dimension(30, 50));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Hóa đơn");
        jLabel6.setMaximumSize(new java.awt.Dimension(110, 50));
        jLabel6.setMinimumSize(new java.awt.Dimension(110, 50));
        jLabel6.setPreferredSize(new java.awt.Dimension(110, 50));

        javax.swing.GroupLayout pnlHoaDonLayout = new javax.swing.GroupLayout(pnlHoaDon);
        pnlHoaDon.setLayout(pnlHoaDonLayout);
        pnlHoaDonLayout.setHorizontalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        pnlHoaDonLayout.setVerticalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonLayout.createSequentialGroup()
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlNhanVien.setBackground(new java.awt.Color(204, 255, 204));
        pnlNhanVien.setMaximumSize(new java.awt.Dimension(200, 50));
        pnlNhanVien.setMinimumSize(new java.awt.Dimension(200, 50));
        pnlNhanVien.setPreferredSize(new java.awt.Dimension(219, 50));
        pnlNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlNhanVienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlNhanVienMouseExited(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setIcon(new ImageIcon("src/main/resource/icon/nhanvien.png"));
        jLabel7.setMaximumSize(new java.awt.Dimension(30, 50));
        jLabel7.setMinimumSize(new java.awt.Dimension(30, 50));
        jLabel7.setPreferredSize(new java.awt.Dimension(30, 50));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Nhân viên");
        jLabel8.setMaximumSize(new java.awt.Dimension(110, 50));
        jLabel8.setMinimumSize(new java.awt.Dimension(110, 50));
        jLabel8.setPreferredSize(new java.awt.Dimension(110, 50));

        javax.swing.GroupLayout pnlNhanVienLayout = new javax.swing.GroupLayout(pnlNhanVien);
        pnlNhanVien.setLayout(pnlNhanVienLayout);
        pnlNhanVienLayout.setHorizontalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhanVienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        pnlNhanVienLayout.setVerticalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNhanVienLayout.createSequentialGroup()
                .addGroup(pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlKhachHang.setBackground(new java.awt.Color(204, 255, 204));
        pnlKhachHang.setMaximumSize(new java.awt.Dimension(200, 50));
        pnlKhachHang.setMinimumSize(new java.awt.Dimension(200, 50));
        pnlKhachHang.setPreferredSize(new java.awt.Dimension(219, 50));
        pnlKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlKhachHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlKhachHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlKhachHangMouseExited(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setIcon(new ImageIcon("src/main/resource/icon/khachhang.png"));
        jLabel9.setMaximumSize(new java.awt.Dimension(30, 50));
        jLabel9.setMinimumSize(new java.awt.Dimension(30, 50));
        jLabel9.setPreferredSize(new java.awt.Dimension(30, 50));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Khách hàng");
        jLabel10.setMaximumSize(new java.awt.Dimension(110, 50));
        jLabel10.setMinimumSize(new java.awt.Dimension(110, 50));
        jLabel10.setPreferredSize(new java.awt.Dimension(110, 50));

        javax.swing.GroupLayout pnlKhachHangLayout = new javax.swing.GroupLayout(pnlKhachHang);
        pnlKhachHang.setLayout(pnlKhachHangLayout);
        pnlKhachHangLayout.setHorizontalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlKhachHangLayout.setVerticalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKhachHangLayout.createSequentialGroup()
                .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlNhaCungCap.setBackground(new java.awt.Color(204, 255, 204));
        pnlNhaCungCap.setMaximumSize(new java.awt.Dimension(200, 50));
        pnlNhaCungCap.setMinimumSize(new java.awt.Dimension(200, 50));
        pnlNhaCungCap.setPreferredSize(new java.awt.Dimension(219, 50));
        pnlNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlNhaCungCapMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlNhaCungCapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlNhaCungCapMouseExited(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setIcon(new ImageIcon("src/main/resource/icon/baohanh.png"));
        jLabel11.setMaximumSize(new java.awt.Dimension(30, 50));
        jLabel11.setMinimumSize(new java.awt.Dimension(30, 50));
        jLabel11.setPreferredSize(new java.awt.Dimension(30, 50));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Nhà cung cấp");
        jLabel12.setMaximumSize(new java.awt.Dimension(110, 50));
        jLabel12.setMinimumSize(new java.awt.Dimension(110, 50));
        jLabel12.setPreferredSize(new java.awt.Dimension(110, 50));

        javax.swing.GroupLayout pnlNhaCungCapLayout = new javax.swing.GroupLayout(pnlNhaCungCap);
        pnlNhaCungCap.setLayout(pnlNhaCungCapLayout);
        pnlNhaCungCapLayout.setHorizontalGroup(
            pnlNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhaCungCapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNhaCungCapLayout.setVerticalGroup(
            pnlNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNhaCungCapLayout.createSequentialGroup()
                .addGroup(pnlNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlThongKe.setBackground(new java.awt.Color(204, 255, 204));
        pnlThongKe.setMaximumSize(new java.awt.Dimension(200, 50));
        pnlThongKe.setMinimumSize(new java.awt.Dimension(200, 50));
        pnlThongKe.setPreferredSize(new java.awt.Dimension(219, 50));
        pnlThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlThongKeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlThongKeMouseExited(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setIcon(new ImageIcon("src/main/resource/icon/thongke.png"));
        jLabel13.setMaximumSize(new java.awt.Dimension(30, 50));
        jLabel13.setMinimumSize(new java.awt.Dimension(30, 50));
        jLabel13.setPreferredSize(new java.awt.Dimension(30, 50));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Thống kê");
        jLabel14.setMaximumSize(new java.awt.Dimension(110, 50));
        jLabel14.setMinimumSize(new java.awt.Dimension(110, 50));
        jLabel14.setPreferredSize(new java.awt.Dimension(110, 50));

        javax.swing.GroupLayout pnlThongKeLayout = new javax.swing.GroupLayout(pnlThongKe);
        pnlThongKe.setLayout(pnlThongKeLayout);
        pnlThongKeLayout.setHorizontalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlThongKeLayout.setVerticalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThongKeLayout.createSequentialGroup()
                .addGroup(pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlHome.setBackground(new java.awt.Color(204, 255, 204));
        pnlHome.setMaximumSize(new java.awt.Dimension(200, 50));
        pnlHome.setMinimumSize(new java.awt.Dimension(200, 50));
        pnlHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlHomeMouseExited(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Trang chủ");
        jLabel20.setMaximumSize(new java.awt.Dimension(110, 50));
        jLabel20.setMinimumSize(new java.awt.Dimension(110, 50));
        jLabel20.setPreferredSize(new java.awt.Dimension(110, 50));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setIcon(new ImageIcon("src/main/resource/icon/home.png"));
        jLabel21.setMaximumSize(new java.awt.Dimension(30, 50));
        jLabel21.setMinimumSize(new java.awt.Dimension(30, 50));
        jLabel21.setPreferredSize(new java.awt.Dimension(30, 50));

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeLayout.createSequentialGroup()
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txtDangXuat.setBackground(new java.awt.Color(255, 255, 255));
        txtDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        txtDangXuat.setIcon(new ImageIcon("src/main/resource/icon/undo.png"));
        txtDangXuat.setText("Đăng xuất");
        txtDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDangXuatMouseClicked(evt);
            }
        });

        txtDoiMatKhau.setBackground(new java.awt.Color(255, 255, 255));
        txtDoiMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        txtDoiMatKhau.setIcon(new ImageIcon("src/main/resource/icon/password.png"));
        txtDoiMatKhau.setText("Đổi mật khẩu");
        txtDoiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDoiMatKhauMouseClicked(evt);
            }
        });

        lblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout paneListServiceLayout = new javax.swing.GroupLayout(paneListService);
        paneListService.setLayout(paneListServiceLayout);
        paneListServiceLayout.setHorizontalGroup(
            paneListServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneListServiceLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(paneListServiceLayout.createSequentialGroup()
                .addComponent(pnlHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneListServiceLayout.createSequentialGroup()
                .addGroup(paneListServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlBanHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlNhanVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlKhachHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlNhaCungCap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlThongKe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(paneListServiceLayout.createSequentialGroup()
                        .addComponent(txtDangXuat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDoiMatKhau))
                    .addComponent(pnlHome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        paneListServiceLayout.setVerticalGroup(
            paneListServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneListServiceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(pnlHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paneListServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoiMatKhau)
                    .addComponent(txtDangXuat))
                .addGap(42, 42, 42))
        );

        JView.setBackground(new java.awt.Color(204, 255, 255));
        JView.setPreferredSize(new java.awt.Dimension(1050, 690));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setText("CỬA HÀNG BÁN GIÀY THỂ THAO NAM");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setForeground(new java.awt.Color(0, 102, 255));
        jLabel16.setText("Tên shop:");

        jLabel17.setForeground(new java.awt.Color(0, 102, 255));
        jLabel17.setText("Địa chỉ:");

        jLabel18.setForeground(new java.awt.Color(0, 102, 255));
        jLabel18.setText("Số điện thoại:");

        jLabel19.setForeground(new java.awt.Color(0, 102, 255));
        jLabel19.setText("Email:");

        jLabel22.setForeground(new java.awt.Color(0, 102, 255));
        jLabel22.setText("Giờ hoạt động:");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 51));
        jLabel23.setText("Cửa Hàng Bán Giày Thể Thao Nam");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 51));
        jLabel24.setText("Cao Đẳng FPT POLYTECHNIC");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 51));
        jLabel25.setText("999xxx999");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 0, 51));
        jLabel26.setText("CaoDangFPT@gmail.com");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 102, 255));
        jLabel27.setText("--->>>");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 0, 51));
        jLabel42.setText("08:00:00");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 0, 51));
        jLabel43.setText("20:00:00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel43)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel27)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        lblAnh3.setBackground(new java.awt.Color(255, 255, 255));

        lblAnh1.setBackground(new java.awt.Color(255, 255, 255));

        lblAnh2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mốc Ưu Đãi", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 51, 51));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 255));
        jLabel28.setText("Yêu cầu");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 255));
        jLabel29.setText("Mã Ưu Đãi");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 255));
        jLabel30.setText("Giá Trị");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setText("> 10.000.000");

        jLabel32.setText("-----");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setText("> 20.000.000");

        jLabel34.setText("-----");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setText("> 40.000.000");

        jLabel36.setText("UD1");

        jLabel37.setText("UD2");

        jLabel38.setText("UD3");

        jLabel39.setForeground(new java.awt.Color(255, 0, 51));
        jLabel39.setText("Giảm 10%");

        jLabel40.setForeground(new java.awt.Color(255, 0, 51));
        jLabel40.setText("Giảm 5%");

        jLabel41.setForeground(new java.awt.Color(255, 0, 51));
        jLabel41.setText("Giảm 15%");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel36)
                                .addGap(106, 106, 106)
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel38)
                                .addGap(55, 55, 55))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel40)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel41)
                        .addGap(36, 36, 36))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JViewLayout = new javax.swing.GroupLayout(JView);
        JView.setLayout(JViewLayout);
        JViewLayout.setHorizontalGroup(
            JViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JViewLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel15)
                .addContainerGap(331, Short.MAX_VALUE))
            .addGroup(JViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAnh1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblAnh2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAnh3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(JViewLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        JViewLayout.setVerticalGroup(
            JViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGroup(JViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JViewLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JViewLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addGroup(JViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnh3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnh2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnh1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneListService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JView, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
            .addComponent(paneListService, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
        );

        JView.getAccessibleContext().setAccessibleParent(JView);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBanHangMouseClicked

        pnlBanHang.setBackground(new Color(204, 255, 204));
        JView.removeAll();
        JView.add(new FrameBanHang(usvm));
        JView.setLayout(new FlowLayout());
        this.pack();

    }//GEN-LAST:event_pnlBanHangMouseClicked

    private void pnlBanHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBanHangMouseEntered
        // TODO add your handling code here:
        pnlBanHang.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });

        pnlBanHang.setBackground(new Color(102, 255, 204));
    }//GEN-LAST:event_pnlBanHangMouseEntered

    private void pnlBanHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBanHangMouseExited
        // TODO add your handling code here:

        pnlBanHang.setBackground(new Color(153, 255, 204));
    }//GEN-LAST:event_pnlBanHangMouseExited

    private void pnlSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSanPhamMouseClicked
        // TODO add your handling code here:
        Webcam.getDefault().close();
        pnlSanPham.setBackground(new Color(204, 255, 204));
        JView.removeAll();
        JView.add(usvm.getVaiTro() == 0 ? new FrameSanPhamQL() : new FrameSanPhamNV());
        JView.setLayout(new FlowLayout());
        this.pack();
    }//GEN-LAST:event_pnlSanPhamMouseClicked

    private void pnlSanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSanPhamMouseEntered
        // TODO add your handling code here:
        pnlSanPham.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });

        pnlSanPham.setBackground(new Color(102, 255, 204));
    }//GEN-LAST:event_pnlSanPhamMouseEntered

    private void pnlSanPhamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSanPhamMouseExited
        // TODO add your handling code here:

        pnlSanPham.setBackground(new Color(153, 255, 204));
    }//GEN-LAST:event_pnlSanPhamMouseExited

    private void pnlHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHoaDonMouseClicked
        // TODO add your handling code here:
        Webcam.getDefault().close();
        pnlHoaDon.setBackground(new Color(204, 255, 204));
        JView.removeAll();
        JView.add(new FrameHoaDon());
        JView.setLayout(new FlowLayout());
        this.pack();

    }//GEN-LAST:event_pnlHoaDonMouseClicked

    private void pnlHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHoaDonMouseEntered
        // TODO add your handling code here:
        pnlHoaDon.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });

        pnlHoaDon.setBackground(new Color(102, 255, 204));
    }//GEN-LAST:event_pnlHoaDonMouseEntered

    private void pnlHoaDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHoaDonMouseExited
        // TODO add your handling code here:

        pnlHoaDon.setBackground(new Color(153, 255, 204));
    }//GEN-LAST:event_pnlHoaDonMouseExited

    private void pnlNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNhanVienMouseClicked
        Webcam.getDefault().close();
        pnlNhanVien.setBackground(new Color(204, 255, 204));
        JView.removeAll();
        JView.add(new FrameNhanVien());
        JView.setLayout(new FlowLayout());
        this.pack();


    }//GEN-LAST:event_pnlNhanVienMouseClicked

    private void pnlNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNhanVienMouseEntered
        // TODO add your handling code here:
        pnlNhanVien.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });

        pnlNhanVien.setBackground(new Color(102, 255, 204));
    }//GEN-LAST:event_pnlNhanVienMouseEntered

    private void pnlNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNhanVienMouseExited
        // TODO add your handling code here:

        pnlNhanVien.setBackground(new Color(153, 255, 204));
    }//GEN-LAST:event_pnlNhanVienMouseExited

    private void pnlKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKhachHangMouseClicked
        // TODO add your handling code here:
        Webcam.getDefault().close();
        pnlKhachHang.setBackground(new Color(204, 255, 204));
        JView.removeAll();
        JView.add(usvm.getVaiTro() == 0 ? new FrameKhachHangQL() : new FrameKhachHangNV());
        JView.setLayout(new FlowLayout());
        this.pack();

    }//GEN-LAST:event_pnlKhachHangMouseClicked

    private void pnlKhachHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKhachHangMouseEntered
        // TODO add your handling code here:
        pnlKhachHang.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });

        pnlKhachHang.setBackground(new Color(102, 255, 204));
    }//GEN-LAST:event_pnlKhachHangMouseEntered

    private void pnlKhachHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKhachHangMouseExited
        // TODO add your handling code here:

        pnlKhachHang.setBackground(new Color(153, 255, 204));
    }//GEN-LAST:event_pnlKhachHangMouseExited

    private void pnlNhaCungCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNhaCungCapMouseClicked
        // TODO add your handling code here:
        Webcam.getDefault().close();
        pnlNhaCungCap.setBackground(new Color(204, 255, 204));
        JView.removeAll();
        JView.add(usvm.getVaiTro() == 0 ? new frameNhaCungCapQL() : new frameNhaCungCapNV());
        JView.setLayout(new FlowLayout());
        this.pack();

    }//GEN-LAST:event_pnlNhaCungCapMouseClicked

    private void pnlNhaCungCapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNhaCungCapMouseEntered
        // TODO add your handling code here:
        pnlNhaCungCap.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });

        pnlNhaCungCap.setBackground(new Color(102, 255, 204));
    }//GEN-LAST:event_pnlNhaCungCapMouseEntered

    private void pnlNhaCungCapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNhaCungCapMouseExited
        // TODO add your handling code here:

        pnlNhaCungCap.setBackground(new Color(153, 255, 204));
    }//GEN-LAST:event_pnlNhaCungCapMouseExited

    private void pnlThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThongKeMouseClicked
        // TODO add your handling code here:
        Webcam.getDefault().close();
        pnlThongKe.setBackground(new Color(204, 255, 204));
        JView.removeAll();
        JView.add(new FrameThongKe());
        JView.setLayout(new FlowLayout());
        this.pack();

    }//GEN-LAST:event_pnlThongKeMouseClicked

    private void pnlThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThongKeMouseEntered
        // TODO add your handling code here:
        pnlThongKe.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });

        pnlThongKe.setBackground(new Color(102, 255, 204));
    }//GEN-LAST:event_pnlThongKeMouseEntered

    private void pnlThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThongKeMouseExited
        // TODO add your handling code here:

        pnlThongKe.setBackground(new Color(153, 255, 204));
    }//GEN-LAST:event_pnlThongKeMouseExited

    private void pnlHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHomeMouseClicked
        Webcam.getDefault().close();
        pnlHome.setBackground(new Color(204, 255, 204));
        JView.removeAll();
        JView.add(new ViewMain(usvm).JView);
        JView.setLayout(new FlowLayout());
        this.pack();

    }//GEN-LAST:event_pnlHomeMouseClicked

    private void pnlHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHomeMouseEntered
        // TODO add your handling code here:
        pnlHome.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });
        pnlHome.setBackground(new Color(102, 255, 204));
    }//GEN-LAST:event_pnlHomeMouseEntered

    private void pnlHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHomeMouseExited
        // TODO add your handling code here:
        pnlHome.setBackground(new Color(153, 255, 204));
    }//GEN-LAST:event_pnlHomeMouseExited

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked

    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtDoiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDoiMatKhauMouseClicked
        Webcam.getDefault().close();
        new ViewDoiMatKhau(usvm).setVisible(true);

    }//GEN-LAST:event_txtDoiMatKhauMouseClicked

    private void txtDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDangXuatMouseClicked
        Webcam.getDefault().close();
        int cofirm = JOptionPane.showConfirmDialog(this, "Xác nhận đăng xuất!", "Xác nhận", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);
        if (cofirm != JOptionPane.YES_OPTION) {
            return;
        }
        new ViewDangNhap().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtDangXuatMouseClicked

    private void lblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserMouseClicked

    }//GEN-LAST:event_lblUserMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JView;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAnh1;
    private javax.swing.JLabel lblAnh2;
    private javax.swing.JLabel lblAnh3;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel paneListService;
    private javax.swing.JPanel pnlBanHang;
    private javax.swing.JPanel pnlHoaDon;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlKhachHang;
    private javax.swing.JPanel pnlNhaCungCap;
    private javax.swing.JPanel pnlNhanVien;
    private javax.swing.JPanel pnlSanPham;
    private javax.swing.JPanel pnlThongKe;
    private javax.swing.JLabel txtDangXuat;
    private javax.swing.JLabel txtDoiMatKhau;
    // End of variables declaration//GEN-END:variables

    private void clearChosserListService() {
        pnlBanHang.setBackground(new Color(51, 255, 204));
        pnlSanPham.setBackground(new Color(51, 255, 204));
        pnlHoaDon.setBackground(new Color(51, 255, 204));
        pnlNhanVien.setBackground(new Color(51, 255, 204));
        pnlKhachHang.setBackground(new Color(51, 255, 204));
        pnlNhaCungCap.setBackground(new Color(51, 255, 204));
        pnlThongKe.setBackground(new Color(51, 255, 204));
        pnlHome.setBackground(new Color(51, 255, 204));
    }

}
