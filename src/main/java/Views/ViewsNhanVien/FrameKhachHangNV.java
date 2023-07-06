package Views.ViewsNhanVien;


import DomainModels.KhachHang;
import Servicies.IServiceKhachHang;
import Servicies.impl.ServiceKhachHang;
import java.awt.Color;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrameKhachHangNV extends javax.swing.JPanel {
    
    private IServiceKhachHang serviceKh = new ServiceKhachHang();
    DefaultTableModel dtm = new DefaultTableModel();
    
    
    public FrameKhachHangNV() {
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
    
    public void loadTable(){
        dtm = (DefaultTableModel) tblKhachHang1.getModel();
        dtm.setRowCount(0);
        for (KhachHang k : this.serviceKh.listKhachHang()) {
            dtm.addRow(new Object[]{
                k.getMa(),
                k.getHoTen(),
                k.getGioiTinh() == 0 ? "Nam":"Nữ",
                k.getSdt(),
                k.getDiaChi(),
                k.getNgaySinh(),
                k.getTrangThai() == 0 ? "Còn hoạt động":"Ngừng hoạt động"
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtSearch1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang1 = new javax.swing.JTable();
        lblSearch1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTenKhachHang1 = new javax.swing.JTextField();
        txtSdt1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rdoNam1 = new javax.swing.JRadioButton();
        rdoConHoatDong1 = new javax.swing.JRadioButton();
        txtMaKhachHang1 = new javax.swing.JTextField();
        rdoNu1 = new javax.swing.JRadioButton();
        rdoNgungHoatDong1 = new javax.swing.JRadioButton();
        txtDiaChi1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNgaySinh1 = new javax.swing.JTextField();
        btnCapNhat = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblLogoKhachHang = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(1050, 690));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Thông tin khách hàng");

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtSearch1.setForeground(new java.awt.Color(153, 153, 153));
        txtSearch1.setText("Tìm theo mã");
        txtSearch1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearch1MouseClicked(evt);
            }
        });

        tblKhachHang1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khách hàng", "Tên khách hàng", "Giới tính", "Số điện thoại", "Địa chỉ", "Ngày sinh", "Trạng thái"
            }
        ));
        tblKhachHang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHang1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhachHang1);

        lblSearch1.setText("Search");
        lblSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblSearch1ActionPerformed(evt);
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
                        .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSearch1)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearch1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Danh sách khách hàng");

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Mã khách hàng");

        jLabel5.setText("Tên khách hàng");

        jLabel6.setText("Giới tính");

        jLabel7.setText("Số điện thoại");

        txtTenKhachHang1.setEnabled(false);

        txtSdt1.setEnabled(false);
        txtSdt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSdt1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Địa chỉ");

        jLabel9.setText("Trạng thái");

        buttonGroup1.add(rdoNam1);
        rdoNam1.setSelected(true);
        rdoNam1.setText("Nam");
        rdoNam1.setEnabled(false);

        buttonGroup2.add(rdoConHoatDong1);
        rdoConHoatDong1.setSelected(true);
        rdoConHoatDong1.setText("Còn hoạt động");
        rdoConHoatDong1.setEnabled(false);

        txtMaKhachHang1.setEnabled(false);

        buttonGroup1.add(rdoNu1);
        rdoNu1.setText("Nữ");
        rdoNu1.setEnabled(false);

        buttonGroup2.add(rdoNgungHoatDong1);
        rdoNgungHoatDong1.setText("Ngừng hoạt động");
        rdoNgungHoatDong1.setEnabled(false);

        txtDiaChi1.setEnabled(false);
        txtDiaChi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChi1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Ngày sinh");

        txtNgaySinh1.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(rdoConHoatDong1)
                        .addGap(38, 38, 38)
                        .addComponent(rdoNgungHoatDong1))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDiaChi1)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(rdoNam1)
                            .addGap(95, 95, 95)
                            .addComponent(rdoNu1))
                        .addComponent(txtMaKhachHang1)
                        .addComponent(txtTenKhachHang1)
                        .addComponent(txtSdt1)
                        .addComponent(txtNgaySinh1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaKhachHang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTenKhachHang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rdoNam1)
                    .addComponent(rdoNu1))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSdt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaChi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNgaySinh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rdoConHoatDong1)
                    .addComponent(rdoNgungHoatDong1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.setEnabled(false);
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.setEnabled(false);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.setEnabled(false);
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
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(399, 399, 399)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(388, 388, 388)
                                .addComponent(jLabel3)))
                        .addGap(415, 415, 415))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(lblLogoKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnCapNhat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                        .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClear)
                        .addGap(18, 18, 18)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnCapNhat))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblLogoKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSdt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSdt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSdt1ActionPerformed

    private void txtDiaChi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChi1ActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        JOptionPane.showMessageDialog(this, "Bạn phải đăng nhập với vai trò quản lý!");
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        JOptionPane.showMessageDialog(this, "Bạn phải đăng nhập với vai trò quản lý!");
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        JOptionPane.showMessageDialog(this, "Bạn phải đăng nhập với vai trò quản lý!");
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblKhachHang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHang1MouseClicked
        int row = tblKhachHang1.getSelectedRow();
        if (row == -1) {
            return;
        }
        
        String ma = this.tblKhachHang1.getValueAt(row, 0).toString();
        String ten = this.tblKhachHang1.getValueAt(row, 1).toString();
        String gioiTinh = this.tblKhachHang1.getValueAt(row, 2).toString();
        String sdt = this.tblKhachHang1.getValueAt(row, 3).toString();
        String diaChi = this.tblKhachHang1.getValueAt(row, 4).toString();
        String ngaySinh = this.tblKhachHang1.getValueAt(row, 5).toString();
        String trangThai = this.tblKhachHang1.getValueAt(row, 6).toString();
        if (ngaySinh.equals("") || diaChi.equals("")) {
            txtNgaySinh1.setText("");
            txtDiaChi1.setText("");
        }
        this.txtMaKhachHang1.setText(ma);
        this.txtTenKhachHang1.setText(ten);
        if (gioiTinh == "Nam") {
            this.rdoNam1.setSelected(true);
        } else {
            this.rdoNu1.setSelected(true);
        }
        this.txtSdt1.setText(sdt);
        this.txtDiaChi1.setText(diaChi);
        this.txtNgaySinh1.setText(ngaySinh);
        if (trangThai == "Còn hoạt động") {
            this.rdoConHoatDong1.setSelected(true);
        } else {
            this.rdoNgungHoatDong1.setSelected(true);
        }
    }//GEN-LAST:event_tblKhachHang1MouseClicked

    private void lblSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblSearch1ActionPerformed
        String ma = this.txtSearch1.getText();
        List<KhachHang> listKH = this.serviceKh.checkMa(ma);
        if (listKH.size() == 0) {
            JOptionPane.showMessageDialog(this, "Khách hàng bạn muốn tìm không tồn tại!");
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Tìm kiếm thành công!");
            DefaultTableModel model = new DefaultTableModel();
            model = (DefaultTableModel) tblKhachHang1.getModel();
            model.setRowCount(0);
            for (KhachHang k : listKH) {
                model.addRow(new Object[]{
                    k.getMa(), k.getHoTen(), k.getGioiTinh() == 0 ? "Nam":"Nữ", k.getSdt(), k.getDiaChi(), k.getNgaySinh(), k.getTrangThai() == 0 ? "Còn hoạt động":"Ngừng hoạt động"
                });
            }
            return;
        }
    }//GEN-LAST:event_lblSearch1ActionPerformed

    private void txtSearch1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearch1MouseClicked
        txtSearch1.setText("");
        txtSearch1.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtSearch1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnThem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel lblLogoKhachHang;
    private javax.swing.JButton lblSearch1;
    private javax.swing.JRadioButton rdoConHoatDong1;
    private javax.swing.JRadioButton rdoNam1;
    private javax.swing.JRadioButton rdoNgungHoatDong1;
    private javax.swing.JRadioButton rdoNu1;
    private javax.swing.JTable tblKhachHang1;
    private javax.swing.JTextField txtDiaChi1;
    private javax.swing.JTextField txtMaKhachHang1;
    private javax.swing.JTextField txtNgaySinh1;
    private javax.swing.JTextField txtSdt1;
    private javax.swing.JTextField txtSearch1;
    private javax.swing.JTextField txtTenKhachHang1;
    // End of variables declaration//GEN-END:variables
}
