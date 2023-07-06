/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.ViewsQuanLy;

import DomainModels.KhachHang;
import DomainModels.NhanVien;
import Servicies.impl.ServiceNhanVien;
import Utilies.SenderMailUtil;
import ViewsModels.NhanVien.NhanVienViewModels;
import java.io.FileOutputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
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

public class FrameNhanVien extends javax.swing.JPanel {

    private DefaultTableModel dtm = new DefaultTableModel();
    private ServiceNhanVien snv = new ServiceNhanVien();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private Thread t1;

    public FrameNhanVien() {
        initComponents();
        Icon iconClear = new ImageIcon("Icon/Edit.png");
        Icon iconThem = new ImageIcon("Icon/Add.png");
        Icon iconCapNhat = new ImageIcon("Icon/Up.png");

        this.btnClear.setIcon(iconClear);
        this.btnThem.setIcon(iconThem);
        this.btnCapNhat.setIcon(iconCapNhat);

        ButtonGroup b = new ButtonGroup();
        b.add(rdoNam);
        b.add(rdoNu);

        ButtonGroup c = new ButtonGroup();
        c.add(rdoQuanLy);
        c.add(rdoNhanVien);

        ButtonGroup d = new ButtonGroup();
        d.add(rdoDangLam);
        d.add(rdoNghiLam);

        rdoNam.setSelected(true);
        rdoQuanLy.setSelected(true);
        rdoDangLam.setSelected(true);

        fillTableNhanVien(snv.listNhanVien());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoDangLam = new javax.swing.JRadioButton();
        txtMaNV = new javax.swing.JTextField();
        rdoNu = new javax.swing.JRadioButton();
        rdoNghiLam = new javax.swing.JRadioButton();
        txtDiaChi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        rdoQuanLy = new javax.swing.JRadioButton();
        rdoNhanVien = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        btnCapNhat = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(1050, 690));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Thông tin nhân viên");

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Giới Tính", "Ngày Sinh", "SĐT", "Mật khẩu", "Email", "Địa chỉ", "Role", "Trạng thái"
            }
        ));
        tbNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNhanVien);

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
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Nhân Viên");

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Mã nhân viên");

        jLabel5.setText("Tên nhân viên");

        jLabel6.setText("Giới tính");

        jLabel7.setText("Email");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel8.setText("Địa chỉ");

        jLabel9.setText("Trạng thái");

        rdoNam.setText("Nam");

        rdoDangLam.setText("Đang làm");

        txtMaNV.setEnabled(false);

        rdoNu.setText("Nữ");

        rdoNghiLam.setText("Nghỉ làm");
        rdoNghiLam.setEnabled(false);

        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        jLabel10.setText("Ngày sinh");

        txtNgaySinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaySinhActionPerformed(evt);
            }
        });

        jLabel11.setText("SĐT");

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        jLabel12.setText("Role");

        rdoQuanLy.setText("Quản lý");

        rdoNhanVien.setText("Nhân viên");

        jLabel2.setText("Mật khẩu");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(rdoNam)
                                .addGap(59, 59, 59)
                                .addComponent(rdoNu))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTenNV)
                                .addComponent(txtSDT)
                                .addComponent(txtMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                .addComponent(txtNgaySinh))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDiaChi)
                            .addComponent(txtEmail)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(rdoQuanLy)
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(rdoDangLam)
                                .addGap(84, 84, 84)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoNghiLam)
                            .addComponent(rdoNhanVien))
                        .addGap(178, 178, 178))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(rdoNam)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rdoNu))))
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(rdoQuanLy)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoNhanVien))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(rdoDangLam)
                        .addComponent(rdoNghiLam)))
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

        btnClear.setText("Làm trống");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jButton1.setText("Xuất Excel ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel1)
                        .addGap(469, 469, 469))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(399, 399, 399)
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhat)
                    .addComponent(btnClear)
                    .addComponent(btnThem)
                    .addComponent(jButton1))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void txtNgaySinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaySinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaySinhActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void tbNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhanVienMouseClicked
        int row = tbNhanVien.getSelectedRow();

        if (row == -1) {
            return;
        }

        txtMaNV.setText(tbNhanVien.getValueAt(row, 0).toString());
        txtTenNV.setText(tbNhanVien.getValueAt(row, 1).toString());
        if (tbNhanVien.getValueAt(row, 2).toString().equals("Nam")) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        txtNgaySinh.setText(tbNhanVien.getValueAt(row, 3).toString());
        txtSDT.setText(tbNhanVien.getValueAt(row, 4).toString());
        txtMatKhau.setText(tbNhanVien.getValueAt(row, 5).toString());
        txtEmail.setText(tbNhanVien.getValueAt(row, 6).toString());
        txtDiaChi.setText(tbNhanVien.getValueAt(row, 7).toString());
        if (tbNhanVien.getValueAt(row, 8).toString().equals("Quản Lý")) {
            rdoQuanLy.setSelected(true);
        } else {
            rdoNhanVien.setSelected(true);
        }
        if (tbNhanVien.getValueAt(row, 9).toString().equals("Đang làm")) {
            rdoDangLam.setSelected(true);
        } else {
            rdoNghiLam.setSelected(true);
        }
  rdoNghiLam.setEnabled(true);
    }//GEN-LAST:event_tbNhanVienMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
        List<NhanVien> listNVVM = new ArrayList<>();
        String searchNV = txtSearch.getText();
        if (searchNV.equals("")) {
            fillTableNhanVien(snv.listNhanVien());
            return;
        }
        if (tbNhanVien.getRowCount() > 0) {
            for (NhanVien nvvm : snv.listNhanVien()) {
                if (searchNV.equals(nvvm.getMa()) || searchNV.equals(nvvm.getTen()) || searchNV.equals(nvvm.getGioiTinh() == 0 ? "Nam" : "Nữ") || searchNV.equals(nvvm.getNgaySinh().toString()) || searchNV.equals(nvvm.getSdt())
                        || searchNV.equals(nvvm.getMatKhau()) || searchNV.equals(nvvm.getEmail()) || searchNV.equals(nvvm.getDiaChi()) || searchNV.equals(nvvm.get_Role() == 0 ? "Quản Lý" : "Nhân Viên") || searchNV.equals(nvvm.getTrangThai() == 0 ? "Đang làm" : "Nghỉ làm")) {
                    listNVVM.add(nvvm);
                    fillTableNhanVien(listNVVM);
                }
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        if (txtNgaySinh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống thông tin!");
            return;
        }
        String ma = this.txtMaNV.getText();
        String ten = this.txtTenNV.getText();
        int gioiTinh = this.rdoNam.isSelected() ? 0 : 1;
        String ngaySinhStr = this.txtNgaySinh.getText();
        Date ngaySinh = Date.valueOf(ngaySinhStr);
        String sdt = this.txtSDT.getText();
        String matKhauStr = this.txtMatKhau.getText();
        String email = this.txtEmail.getText();
        String diaChi = this.txtDiaChi.getText();
        int chucVu = this.rdoQuanLy.isSelected() ? 0 : 1;
        int trangThai = this.rdoDangLam.isSelected() ? 0 : 1;

        if (ma.length() == 0 || ten.length() == 0 || sdt.length() == 0 || diaChi.length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống thông tin!");
            return;
        }
        NhanVien k = new NhanVien();
        k.setMa(ma);
        k.setTen(ten);
        k.setGioiTinh(gioiTinh);
        k.setNgaySinh(ngaySinh);
        k.setSdt(sdt);
        k.setMatKhau(matKhauStr);
        k.setEmail(email);
        k.setDiaChi(diaChi);
        k.set_Role(chucVu);
        k.setTrangThai(trangThai);

        this.snv.updateNhanVien(k);
        JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
        fillTableNhanVien(snv.listNhanVien());
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("danh_sach_nhanVien");
            XSSFRow row = null;
            Cell cell = null;
            List<NhanVienViewModels> listExPort = snv.getAllNV();
            for (int i = 0; i < listExPort.size(); i++) {

                row = sheet.createRow(i);
                NhanVienViewModels k = listExPort.get(i);

                cell = row.createCell(0);
                cell.setCellValue(k.getMaNV());

                cell = row.createCell(1);
                cell.setCellValue(k.getTenNV());

                cell = row.createCell(2);
                cell.setCellValue(k.getGioiTinh());

                cell = row.createCell(3);
                cell.setCellValue(k.getNgaySinh());

                cell = row.createCell(4);
                cell.setCellValue(k.getSDT());

                cell = row.createCell(5);
                cell.setCellValue(k.getMatKhau());

                cell = row.createCell(6);
                cell.setCellValue(k.getEmail());

                cell = row.createCell(7);
                cell.setCellValue(k.getDiaChi());

                cell = row.createCell(8);
                cell.setCellValue(k.getVaiTro());

                cell = row.createCell(9);
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

            }
            JOptionPane.showMessageDialog(this, "Xuất file thành công");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoDangLam;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNghiLam;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JRadioButton rdoQuanLy;
    private javax.swing.JTable tbNhanVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables

    private void fillTableNhanVien(List<NhanVien> listNV) {
        dtm = (DefaultTableModel) tbNhanVien.getModel();
        dtm.setRowCount(0);

        for (NhanVien s : listNV) {
            dtm.addRow(new Object[]{
                s.getMa(),
                s.getTen(),
                s.getGioiTinh() == 0 ? "Nam" : "Nữ",
                s.getNgaySinh(),
                s.getSdt(),
                s.getMatKhau(),
                s.getEmail(),
                s.getDiaChi(),
                s.get_Role() == 0 ? "Quản Lý" : "Nhân Viên",
                s.getTrangThai() == 0 ? "Đang làm" : "Nghỉ làm"
            });
        }
    }

    private void clearForm() {
        txtMaNV.setText("");
        txtTenNV.setText("");
        txtNgaySinh.setText("");
        txtSDT.setText("");
        txtMatKhau.setText("");
        txtDiaChi.setText("");
        txtEmail.setText("");
        txtSearch.setText("");
        rdoNam.setSelected(true);
        rdoQuanLy.setSelected(true);
        rdoDangLam.setSelected(true);
    }

    public NhanVien getFormData() {
        int row = tbNhanVien.getRowCount();
        String ma = "NV000" + row++;
        String hoTen = txtTenNV.getText();
        int gioiTinh = rdoNam.isSelected() ? 0 : 1;
        String ngaySinh = txtNgaySinh.getText();
        String sdt = txtSDT.getText();
        String matKhau = txtMatKhau.getText();
        String email = txtEmail.getText();
        String diaChi = txtDiaChi.getText();
        int vaiTro = rdoQuanLy.isSelected() ? 0 : 1;
        int tranThai = rdoDangLam.isSelected() ? 0 : 1;

        // check rỗng
        if (hoTen.equals("") || sdt.equals("") || matKhau.equals("") || email.equals("")
                || diaChi.equals("") || ngaySinh.equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ dữ liệu!");
            return null;
        }

        // check kiểu string
//        String patternString = "[A-Za-z0-9]{6,32}";
//        if (!ma.matches(patternString)) {
//            JOptionPane.showMessageDialog(this, "Mã nhân viên có độ dài 6-32 ký tự. Không có ký tự đặc biệt!");
//            return null;
//        }

        if (hoTen.length() < 6 || hoTen.length() > 32) {
            JOptionPane.showMessageDialog(this, "Tên nhân viên phải có độ dài 6-32 ký tự!");
            return null;
        }

        Date ns = Date.valueOf(ngaySinh);

        // check sđt
        String patternsdt = "0\\d{9,10}";
        if (!sdt.matches(patternsdt)) {
            JOptionPane.showMessageDialog(this, "SDT không đúng định dạng (Độ dài 10 - 20 số)!");
            return null;
        }

        // check mật khẩu
        String patternMatKhau = "[A-Za-z0-9]{8,32}";
        if (!matKhau.matches(patternMatKhau)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu phải có độ dài 8-32 ký tự. Không có ký tự đặc biệt!");
            return null;
        }

        String patternemail = "\\w+@\\w+\\.\\w+";
        if (!email.matches(patternemail)) {
            JOptionPane.showMessageDialog(this, "Email không đúng định dạng!");
            return null;
        }

        if (diaChi.length() > 255) {
            JOptionPane.showMessageDialog(this, "Địa chỉ tối đa 255 ký tự!");
        }

        NhanVien nv = new NhanVien();
        nv.setMa(ma);
        nv.setTen(hoTen);
        nv.setGioiTinh(gioiTinh);
        nv.setNgaySinh(ns);
        nv.setSdt(sdt);
        nv.setMatKhau(matKhau);
        nv.setEmail(email);
        nv.setDiaChi(diaChi);
        nv.set_Role(vaiTro);
        nv.setTrangThai(tranThai);
        return nv;
    }

    private void insert() {
        NhanVien nv = this.getFormData();
        if (nv == null) {
            return;
        }
        try {
            NhanVienViewModels nvrp = new NhanVienViewModels();
            nvrp.setMaNV(nv.getMa());
            nvrp.setTenNV(nv.getTen());
            nvrp.setGioiTinh(nv.getGioiTinh());
            nvrp.setNgaySinh(nv.getNgaySinh());
            nvrp.setSDT(nv.getSdt());
            nvrp.setMatKhau(nv.getMatKhau());
            nvrp.setEmail(nv.getEmail());
            nvrp.setDiaChi(nv.getDiaChi());
            nvrp.setVaiTro(nv.get_Role());
            nvrp.setTrangThai(nv.getTrangThai());
            snv.Insert(nvrp);
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
            t1 = new Thread() {
                @Override
                public void run() {
                    new SenderMailUtil().sendMail("Tài khoản đăng nhập của bạn: ", "Mật khẩu: " + txtMatKhau.getText() + " --- Email: " +txtEmail.getText(),nv.getEmail());
                    t1.stop();
                }
            };
            t1.start();
            JOptionPane.showMessageDialog(this, "Tài khoản đăng nhập đã được gửi tới email");
            clearForm();
        } catch (Exception e) {
        }
        fillTableNhanVien(snv.listNhanVien());
    }

    private void update() {
        NhanVien nv = this.getFormData();
        if (nv == null) {
            return;
        }

        snv.updateNhanVien(nv);
        fillTableNhanVien(snv.listNhanVien());
    }
}
