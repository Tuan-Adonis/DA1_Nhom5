package Views.ViewsQuanLy;

import DomainModels.KhachHang;
import Servicies.IServiceKhachHang;
import Views.ViewsNhanVien.*;
import Servicies.impl.ServiceKhachHang;
import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serial;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FrameKhachHangQL extends javax.swing.JPanel {

    private IServiceKhachHang serviceKh = new ServiceKhachHang();
    private DefaultTableModel dtm = new DefaultTableModel();

    public FrameKhachHangQL() {
        initComponents();
        Icon logokhachHang = new ImageIcon("Icon/LogoKH.png");
        Icon iconClear = new ImageIcon("Icon/Edit.png");
        Icon iconThem = new ImageIcon("Icon/Add.png");
        Icon iconCapNhat = new ImageIcon("Icon/Up.png");

        this.btnClear.setIcon(iconClear);
        this.btnThem.setIcon(iconThem);
        this.btnCapNhat.setIcon(iconCapNhat);
        this.lblLogoKhachHang.setIcon(logokhachHang);

        this.loadTable();
    }

    public void clearForm() {
        this.txtMaKhachHang.setText("");
        this.txtTenKhachHang.setText("");
        this.txtDiaChi.setText("");
        this.txtNgaySinh.setText("");
        this.txtSdt.setText("");
        this.rdoNam.setSelected(true);
        this.rdoConHoatDong.setSelected(true);
    }

    public void loadTable() {
        dtm = (DefaultTableModel) tblKhachHang.getModel();
        dtm.setRowCount(0);
        int i = 1;
        for (KhachHang k : this.serviceKh.listKhachHang()) {
            dtm.addRow(new Object[]{
                i++,
                k.getMa(),
                k.getHoTen(),
                k.getGioiTinh() == 0 ? "Nam" : "Nữ",
                k.getSdt(),
                k.getDiaChi(),
                k.getNgaySinh(),
                k.getLoaiKH() == 0 ? "Khách thường" : (k.getLoaiKH() == 1 ? "Khách bậc 1" : (k.getLoaiKH() == 2 ? "Khách bậc 2" : "Khách bậc 3")),
                k.getTrangThai() == 0 ? "Còn hoạt động" : "Ngừng hoạt động"
            });
        }
    }

    //add excel
    public void insert() {
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
                List<KhachHang> listSerial = new ArrayList<>();
                while (interator.hasNext()) {
                    Row row = interator.next();

                    KhachHang k = new KhachHang();
                    k.setMa(row.getCell(0).getStringCellValue());
                    k.setHoTen(row.getCell(1).getStringCellValue());
                    String gt = row.getCell(2).getStringCellValue();
                    if (gt.equalsIgnoreCase("Nam")) {
                        k.setGioiTinh(0);
                    } else {
                        k.setGioiTinh(1);
                    }
                    k.setSdt(row.getCell(3).getStringCellValue());
                    k.setDiaChi(row.getCell(4).getStringCellValue());
                    k.setNgaySinh(row.getCell(5).getDateCellValue());
                    k.setTrangThai(0);
                    listSerial.add(k);

                }
                System.out.println(listSerial);
                serviceKh.insert(listSerial);
                loadTable();
                JOptionPane.showMessageDialog(this, "Thêm thành công!!");
                fis.close();
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        btnAddExcel = new javax.swing.JButton();
        btnXuatExcel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblMaKhachHang = new javax.swing.JLabel();
        lblTenKhachHang = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        lblSdt = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        lblDiaChi = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoConHoatDong = new javax.swing.JRadioButton();
        txtMaKhachHang = new javax.swing.JTextField();
        rdoNu = new javax.swing.JRadioButton();
        rdoNgungHoatDong = new javax.swing.JRadioButton();
        txtDiaChi = new javax.swing.JTextField();
        lblNgaySinh = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        btnCapNhat = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblLogoKhachHang = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(1050, 690));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Thông tin khách hàng");

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtSearch.setForeground(new java.awt.Color(153, 153, 153));
        txtSearch.setText("Tìm theo mã");
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Khách hàng", "Tên khách hàng", "Giới tính", "Số điện thoại", "Địa chỉ", "Ngày sinh", "Loại KH", "Trạng thái"
            }
        ));
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhachHang);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnLoad.setText("Refresh");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnAddExcel.setText("Import Excel");
        btnAddExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddExcelActionPerformed(evt);
            }
        });

        btnXuatExcel.setText("Export Excel");
        btnXuatExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatExcelActionPerformed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnLoad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddExcel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXuatExcel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnLoad)
                    .addComponent(btnAddExcel)
                    .addComponent(btnXuatExcel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Danh sách khách hàng");

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblMaKhachHang.setText("Mã khách hàng");

        lblTenKhachHang.setText("Tên khách hàng");

        lblGioiTinh.setText("Giới tính");

        lblSdt.setText("Số điện thoại");

        txtSdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSdtActionPerformed(evt);
            }
        });

        lblDiaChi.setText("Địa chỉ");

        lblTrangThai.setText("Trạng thái");

        buttonGroup1.add(rdoNam);
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");
        rdoNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNamActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdoConHoatDong);
        rdoConHoatDong.setSelected(true);
        rdoConHoatDong.setText("Còn hoạt động");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        buttonGroup2.add(rdoNgungHoatDong);
        rdoNgungHoatDong.setText("Ngừng hoạt động");
        rdoNgungHoatDong.setEnabled(false);

        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        lblNgaySinh.setText("Ngày sinh");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNgaySinh)
                    .addComponent(lblTrangThai)
                    .addComponent(lblMaKhachHang)
                    .addComponent(lblTenKhachHang)
                    .addComponent(lblSdt)
                    .addComponent(lblGioiTinh)
                    .addComponent(lblDiaChi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(rdoConHoatDong)
                        .addGap(28, 28, 28)
                        .addComponent(rdoNgungHoatDong))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(rdoNam)
                            .addGap(86, 86, 86)
                            .addComponent(rdoNu))
                        .addComponent(txtTenKhachHang)
                        .addComponent(txtSdt)
                        .addComponent(txtNgaySinh)
                        .addComponent(txtMaKhachHang)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaKhachHang)
                    .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenKhachHang)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGioiTinh)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSdt)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDiaChi))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgaySinh)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTrangThai)
                    .addComponent(rdoConHoatDong)
                    .addComponent(rdoNgungHoatDong))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblLogoKhachHang.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(414, 414, 414)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(394, 394, 394)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(lblLogoKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnClear)
                                .addGap(18, 18, 18)
                                .addComponent(btnThem)
                                .addGap(18, 18, 18)
                                .addComponent(btnCapNhat))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogoKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSdtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSdtActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed

        if (txtNgaySinh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống thông tin!");
            return;
        }
        String ma = this.txtMaKhachHang.getText();
        String ten = this.txtTenKhachHang.getText();
        int gioiTinh = this.rdoNam.isSelected() ? 0 : 1;
        String sdt = this.txtSdt.getText();
        String diaChi = this.txtDiaChi.getText();
        String ngaySinhStr = this.txtNgaySinh.getText();
        Date ngaySinh = Date.valueOf(ngaySinhStr);
        int trangThai = this.rdoConHoatDong.isSelected() ? 0 : 1;

        if (ma.length() == 0 || ten.length() == 0 || sdt.length() == 0 || diaChi.length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống thông tin!");
            return;
        }
        KhachHang k = new KhachHang();
        k.setMa(ma);
        k.setHoTen(ten);
        k.setGioiTinh(gioiTinh);
        k.setSdt(sdt);
        k.setDiaChi(diaChi);
        k.setNgaySinh(ngaySinh);
        k.setTrangThai(trangThai);

        this.serviceKh.update(k);
        JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
        this.loadTable();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        if (txtNgaySinh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống thông tin!");
            return;
        }
        //int row1 = tblKhachHang.getRowCount();
        String ma = this.txtMaKhachHang.getText();
        String ten = this.txtTenKhachHang.getText();
        int gioiTinh = this.rdoNam.isSelected() ? 0 : 1;
        String sdt = this.txtSdt.getText();
        String diaChi = this.txtDiaChi.getText();
        String ngaySinhStr = this.txtNgaySinh.getText();
        Date ngaySinh = Date.valueOf(ngaySinhStr);
        int trangThai = this.rdoConHoatDong.isSelected() ? 0 : 1;
        String regPhone = "0[0-9]{9,10}";
        if (!sdt.matches(regPhone)) {
            JOptionPane.showMessageDialog(this, "Định dạng số điện thoại không hợp lệ!");
            return;
        }
        
        if (ma.length() == 0 || ten.length() == 0 || sdt.length() == 0 || diaChi.length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống thông tin!");
            return;
        }
        
        if (ten.length() < 6 || ten.length() > 32) {
            JOptionPane.showMessageDialog(this, "Tên khách hàng phải có độ dài 6-32 ký tự!");
            return;
        }
        
        if(diaChi.length() > 255 ){
            JOptionPane.showMessageDialog(this, "Địa chỉ tối đa 255 ký tự!");
            return;
        }
        
        
        KhachHang k = new KhachHang();
        k.setMa(ma);
        k.setHoTen(ten);
        k.setGioiTinh(gioiTinh);
        k.setSdt(sdt);
        k.setDiaChi(diaChi);
        k.setNgaySinh(ngaySinh);
        k.setTrangThai(trangThai);

        this.serviceKh.add(k);
        JOptionPane.showMessageDialog(this, "Thêm thành công!");
        this.loadTable();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void rdoNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNamActionPerformed

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        int row = tblKhachHang.getSelectedRow();
        if (row == -1) {
            return;
        }
        rdoNgungHoatDong.setEnabled(true);
        String ma = this.tblKhachHang.getValueAt(row, 1).toString();
        String ten = this.tblKhachHang.getValueAt(row, 2).toString();
        String gioiTinh = this.tblKhachHang.getValueAt(row, 3).toString();
        String sdt = this.tblKhachHang.getValueAt(row, 4).toString();
        String diaChi = this.tblKhachHang.getValueAt(row, 5).toString();
        String ngaySinh = this.tblKhachHang.getValueAt(row, 6).toString();
        String trangThai = this.tblKhachHang.getValueAt(row, 8).toString();
        if (ngaySinh.equals("") || diaChi.equals("")) {
            txtNgaySinh.setText("");
            txtDiaChi.setText("");
        }
        this.txtMaKhachHang.setText(ma);
        this.txtTenKhachHang.setText(ten);
        if (gioiTinh == "Nam") {
            this.rdoNam.setSelected(true);
        } else {
            this.rdoNu.setSelected(true);
        }
        this.txtSdt.setText(sdt);
        this.txtDiaChi.setText(diaChi);
        this.txtNgaySinh.setText(ngaySinh);
        if (trangThai == "Còn hoạt động") {
            this.rdoConHoatDong.setSelected(true);
        } else {
            this.rdoNgungHoatDong.setSelected(true);
        }
    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        loadTable();
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String ma = this.txtSearch.getText();
        List<KhachHang> listKH = this.serviceKh.checkMa(ma);
        if (listKH.size() == 0) {
            JOptionPane.showMessageDialog(this, "Khách hàng bạn muốn tìm không tồn tại!");
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Tìm kiếm thành công!");
            DefaultTableModel model = new DefaultTableModel();
            model = (DefaultTableModel) tblKhachHang.getModel();
            model.setRowCount(0);
            for (KhachHang k : listKH) {
                model.addRow(new Object[]{
                    1, k.getMa(), k.getHoTen(), k.getGioiTinh() == 0 ? "Nam":"Nữ", k.getSdt(), k.getDiaChi(), k.getNgaySinh(),k.getLoaiKH() == 0 ? "Khách thường":"" ,k.getTrangThai() == 0 ? "Còn hoạt động":"Ngừng hoạt động"
                });
            }           
            return;
        }

          
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddExcelActionPerformed
        insert();
    }//GEN-LAST:event_btnAddExcelActionPerformed

    private void btnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcelActionPerformed
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("danh_sach_new");
            XSSFRow row = null;
            Cell cell = null;
            List<KhachHang> listExPort = serviceKh.listKhachHang();
            for (int i = 0; i < listExPort.size(); i++) {

                row = sheet.createRow(i);
                KhachHang k = listExPort.get(i);

                cell = row.createCell(0);
                cell.setCellValue(k.getMa());

                cell = row.createCell(1);
                cell.setCellValue(k.getHoTen());
                
                cell = row.createCell(2);
                cell.setCellValue(k.getGioiTinh());
                
                cell = row.createCell(3);
                cell.setCellValue(k.getSdt());
                
                cell = row.createCell(4);
                cell.setCellValue(k.getDiaChi());
                
                cell = row.createCell(5);
                cell.setCellValue(k.getNgaySinh());
                
                cell = row.createCell(6);
                cell.setCellValue(k.getTrangThai());

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
                JOptionPane.showMessageDialog(this, "Xuất file Excel thành công!!");
            }
            
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

    }//GEN-LAST:event_btnXuatExcelActionPerformed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        // TODO add your handling code here:
        txtSearch.setText("");
        txtSearch.setForeground(Color.black);
    }//GEN-LAST:event_txtSearchMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddExcel;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXuatExcel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblLogoKhachHang;
    private javax.swing.JLabel lblMaKhachHang;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblSdt;
    private javax.swing.JLabel lblTenKhachHang;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JRadioButton rdoConHoatDong;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNgungHoatDong;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenKhachHang;
    // End of variables declaration//GEN-END:variables
}
