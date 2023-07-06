package Views.ViewsQuanLy;

import DomainModels.NhaCungCap;
import DomainModels.SanPham;
import Views.ViewsNhanVien.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Servicies.IServiceNhaCungCap;
import Servicies.impl.ServiceNhaCungCap;
import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class frameNhaCungCapQL extends javax.swing.JPanel {

    private IServiceNhaCungCap NccSer = new ServiceNhaCungCap();
    private DefaultTableModel model;
    int row = 1;

    public frameNhaCungCapQL() {
        initComponents();

        Icon iconFirt = new ImageIcon("Icon/firt.png");
        Icon iconRewind = new ImageIcon("Icon/rewind.png");
        Icon iconNext = new ImageIcon("Icon/next.png");
        Icon iconEnd = new ImageIcon("Icon/end.png");
        Icon iconClear = new ImageIcon("Icon/Edit.png");
        Icon iconThem = new ImageIcon("Icon/Add.png");
        Icon iconCapNhat = new ImageIcon("Icon/Up.png");

//        this.btnFirt.setIcon(iconFirt);
//        this.btnBack.setIcon(iconRewind);
//        this.btnNext.setIcon(iconNext);
//        this.btnEnd.setIcon(iconEnd);
        this.btnClear.setIcon(iconClear);
        this.btnThem.setIcon(iconThem);
        this.btnCapNhat.setIcon(iconCapNhat);

        addTableNCC(this.NccSer.getListNCC());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNCC = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rdoCon = new javax.swing.JRadioButton();
        txtMa = new javax.swing.JTextField();
        rdoNgung = new javax.swing.JRadioButton();
        txtDiaChi = new javax.swing.JTextField();
        btnCapNhat = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(1050, 690));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Thông tin nhà cung cấp");

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtSearch.setForeground(new java.awt.Color(153, 153, 153));
        txtSearch.setText("Nhập mã");
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        tblNCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "Số điện thoại", "Địa chỉ", "Trạng thái"
            }
        ));
        tblNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNCCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNCC);

        jButton1.setText("Refesh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnImport.setText("Import Excel");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        btnExport.setText("Export Excel");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btnImport)
                        .addGap(18, 18, 18)
                        .addComponent(btnExport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(btnSearch)
                    .addComponent(btnImport)
                    .addComponent(btnExport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Quản Lý Nhà Cung Cấp");

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Mã nhà cung cấp");

        jLabel5.setText("Tên nhà cung cấp");

        jLabel6.setText("Trạng thái");

        jLabel7.setText("Số điện thoại");

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        jLabel8.setText("Địa chỉ");

        btnGroup.add(rdoCon);
        rdoCon.setSelected(true);
        rdoCon.setText("Còn hợp tác");

        txtMa.setEnabled(false);

        btnGroup.add(rdoNgung);
        rdoNgung.setText("Ngừng hợp tác");
        rdoNgung.setEnabled(false);

        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(rdoCon)
                        .addGap(30, 30, 30)
                        .addComponent(rdoNgung))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(txtMa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(txtSDT))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoCon)
                    .addComponent(jLabel6)
                    .addComponent(rdoNgung))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCapNhatMouseClicked(evt);
            }
        });
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
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
                        .addGap(392, 392, 392)
                        .addComponent(jLabel1)
                        .addGap(408, 408, 408))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(359, 359, 359))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnThem)
                    .addComponent(btnCapNhat))
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void btnCapNhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapNhatMouseClicked
//        JOptionPane.showMessageDialog(this, "Bạn phải đăng nhập với vai trò quản lý!");
    }//GEN-LAST:event_btnCapNhatMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
//        JOptionPane.showMessageDialog(this, "Bạn phải đăng nhập với vai trò quản lý!");
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
//        JOptionPane.showMessageDialog(this, "Bạn phải đăng nhập với vai trò quản lý!");
    }//GEN-LAST:event_btnClearMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addTableNCC(this.NccSer.getListNCC());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNCCMouseClicked
        row = tblNCC.getSelectedRow();
        showDetail(row);
    }//GEN-LAST:event_tblNCCMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.txtMa.setText("");
        this.txtDiaChi.setText("");
        this.txtSDT.setText("");
        this.txtTen.setText("");
        rdoCon.setSelected(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        int row = tblNCC.getRowCount();
        String ma = "NCC00"+row;
        String ten = this.txtTen.getText();
        String sdt = this.txtSDT.getText();
        String diaChi = this.txtDiaChi.getText();
        int trangThai = rdoCon.isSelected() ? 0 : 1;

        if (ma.equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền mã!");
            this.txtMa.requestFocus();
            return;
        }

        if (ten.equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền tên!");
            this.txtTen.requestFocus();
            return;
        }

        if (sdt.equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền số điện thoại!");
            this.txtSDT.requestFocus();
            return;
        }

        if (diaChi.equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền địa chỉ!");
            this.txtDiaChi.requestFocus();
            return;
        }

        List<NhaCungCap> list = this.NccSer.checkMa(ma);
        if (list.size() == 0) {
            String regPhone = "0[0-9]{9,10}";
            if (!sdt.matches(regPhone)) {
                JOptionPane.showMessageDialog(this, "Sai định dạng phone!");
                txtSDT.requestFocus();
                return;
            }

            NhaCungCap nhacc = new NhaCungCap();
            nhacc.setMa(ma);
            nhacc.setTen(ten);
            nhacc.setDiaChi(diaChi);
            nhacc.setSdt(sdt);
            nhacc.setTrangThai(0);

            JOptionPane.showMessageDialog(this, this.NccSer.themNCC(nhacc));
            addTableNCC(this.NccSer.getListNCC());
        } else {
            JOptionPane.showMessageDialog(this, "Nhà cung cấp này đã tồn tại!");
            return;
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        String ma = this.txtMa.getText();
        String ten = this.txtTen.getText();
        String sdt = this.txtSDT.getText();
        String diaChi = this.txtDiaChi.getText();
        int trangThai = rdoCon.isSelected() ? 0 : 1;
        if (ma.equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền mã!");
            this.txtMa.requestFocus();
            return;
        }

        if (ten.equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền tên!");
            this.txtTen.requestFocus();
            return;
        }

        if (sdt.equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền số điện thoại!");
            this.txtSDT.requestFocus();
            return;
        }

        if (diaChi.equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền địa chỉ!");
            this.txtDiaChi.requestFocus();
            return;
        }

        List<NhaCungCap> list = this.NccSer.checkMa(ma);
        if (list.size() == 0) {
            JOptionPane.showMessageDialog(this, "Nhà cung cấp này không tồn tại!");
            return;
        } else {
            String regPhone = "0[0-9]{9,10}";
            if (!sdt.matches(regPhone)) {
                JOptionPane.showMessageDialog(this, "Sai định dạng phone!");
                txtSDT.requestFocus();
                return;
            }

            NhaCungCap nhacc = new NhaCungCap();
            nhacc.setMa(ma);
            nhacc.setTen(ten);
            nhacc.setDiaChi(diaChi);
            nhacc.setSdt(sdt);
            nhacc.setTrangThai(trangThai);

            JOptionPane.showMessageDialog(this, this.NccSer.updateNCC(nhacc, ma));
            addTableNCC(this.NccSer.getListNCC());
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String ma = this.txtSearch.getText();
        if (ma.length() == 0 || ma.equals("Nhập mã")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền thông tin !");
            this.txtSearch.requestFocus();
            addTableNCC(this.NccSer.getListNCC());
            return;
        } else {
            for (NhaCungCap ncc : this.NccSer.getListNCC()) {
                if (ncc.getMa().equals(ma)) {
                    model = (DefaultTableModel) tblNCC.getModel();
                    model.setRowCount(0);
                    model.addRow(new Object[]{ncc.getMa(), ncc.getTen(), ncc.getSdt(), ncc.getDiaChi(), ncc.getTrangThai() == 0 ? "Còn hợp tác" : "Ngừng hợp tác"});
                    this.txtMa.setText(ncc.getMa());
                    this.txtTen.setText(ncc.getTen());
                    this.txtDiaChi.setText(ncc.getDiaChi());
                    this.txtSDT.setText(ncc.getSdt());
                    if (ncc.getTrangThai() == 0) {
                        rdoCon.setSelected(true);
                    } else {
                        rdoNgung.setSelected(true);
                    }
                    tblNCC.setRowSelectionInterval(0, 0);
                    JOptionPane.showMessageDialog(this, "Tìm kiếm thành công!");
                    return;
                }
            }
            model = (DefaultTableModel) tblNCC.getModel();
            model.setRowCount(0);
            this.txtMa.setText("");
            this.txtTen.setText("");
            this.txtDiaChi.setText("");
            this.txtSDT.setText("");
            this.rdoCon.setSelected(true);
            JOptionPane.showMessageDialog(this, "Không có thông tin bạn cần tìm!");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        this.txtSearch.setText("");
        this.txtSearch.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtSearchMouseClicked

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
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
                while (interator.hasNext()) {
                    Row row = interator.next();

                    NhaCungCap ncc = new NhaCungCap();
                    ncc.setMa(row.getCell(0).getStringCellValue());
                    ncc.setTen(row.getCell(1).getStringCellValue());
                    ncc.setSdt(row.getCell(2).getStringCellValue());
                    ncc.setDiaChi(row.getCell(3).getStringCellValue());
                    String Tthai = row.getCell(4).getStringCellValue();
                    if (Tthai.startsWith("Còn") || Tthai.startsWith("0")) {
                        ncc.setTrangThai(0);
                    } else {
                        ncc.setTrangThai(1);
                    }
                    this.NccSer.themNCC(ncc);
                }
                addTableNCC(this.NccSer.getListNCC());
                JOptionPane.showMessageDialog(this, "Thành công!");
                fis.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();;
        }
    }//GEN-LAST:event_btnImportActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("danh_sach_NCC");
            XSSFRow row = null;
            Cell cell = null;
            List<NhaCungCap> listExport = this.NccSer.getListNCC();
            int i = 0;
            for (NhaCungCap ncc : listExport) {
                row = sheet.createRow(i);
                i++;
                cell = row.createCell(0);
                cell.setCellValue(ncc.getMa());

                cell = row.createCell(1);
                cell.setCellValue(ncc.getTen());
                
                cell = row.createCell(2);
                cell.setCellValue(ncc.getSdt());

                cell = row.createCell(3);
                cell.setCellValue(ncc.getDiaChi());

                cell = row.createCell(4);
                cell.setCellValue(ncc.getTrangThai());
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
    }//GEN-LAST:event_btnExportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExport;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoCon;
    private javax.swing.JRadioButton rdoNgung;
    private javax.swing.JTable tblNCC;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    private void addTableNCC(List<NhaCungCap> listNCC) {
        model = (DefaultTableModel) tblNCC.getModel();
        model.setRowCount(0);
        for (NhaCungCap ncc : listNCC) {
            model.addRow(new Object[]{ncc.getMa(), ncc.getTen(), ncc.getSdt(), ncc.getDiaChi(), ncc.getTrangThai() == 0 ? "Còn hợp tác" : "Ngừng hợp tác"});
        }

    }

    private void showDetail(int row) {
        String ma = this.tblNCC.getValueAt(row, 0).toString();
        String ten = this.tblNCC.getValueAt(row, 1).toString();
        String sdt = this.tblNCC.getValueAt(row, 2).toString();
        String diaChi = this.tblNCC.getValueAt(row, 3).toString();
        String trangThai = this.tblNCC.getValueAt(row, 4).toString();

        this.txtMa.setText(ma);
        this.txtDiaChi.setText(diaChi);
        this.txtSDT.setText(sdt);
        this.txtTen.setText(ten);
        if (trangThai.startsWith("Còn")) {
            rdoCon.setSelected(true);
        } else {
            rdoNgung.setSelected(true);
        }
        
        rdoNgung.setEnabled(true);
    }
}
