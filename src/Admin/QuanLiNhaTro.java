/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class QuanLiNhaTro extends javax.swing.JFrame {

    DefaultTableModel Model;
    ControlDb ctDb = new ControlDb();
    List<NhaTro> list = new ArrayList();
    int current = 0;
    String user = "sa";
    String pass = "232197";
    String url = "jdbc:sqlserver://Macos:1433;databaseName=QLNhaTro";

    public QuanLiNhaTro() {
        initComponents();
        list = ctDb.getlist();
        System.out.println(list.size());
//      LoadDataToArray(); //load du lieu tu table vao arraylist
        Display(current);//hien thi du lieu dau tien len frame
        filltotable();
        setLocationRelativeTo(null);
    }

    private void chuyenFrameDV(java.awt.event.ActionEvent evt) {
        //chuyen toi frame dang ki dich vu
        DichVu1 newFrame = new DichVu1();
        newFrame.setVisible(true);
        this.setVisible(false);
    }

    public void Display(int i) {
        NhaTro nt = list.get(i);
        txtMaPhong.setText(nt.MaPhong);
        txtGiaPhong.setText(nt.GiaPhong);
        txtSoLuong.setText(nt.SoLuong);
        txtxDienTich.setText(nt.DienTich);
        txtDichVu.setText(nt.DichVu);
    }

//    public void LoadDataToArray() {
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            Connection con = DriverManager.getConnection(url, user, pass);
//            String sql = "select*from  QuanLyNhaTro";
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            list.clear();
//            while (rs.next()) {
//                String maphong = rs.getString(1);
//                String giaphong = rs.getString(2);
//                String soluong = rs.getString(3);
//                String dientich = rs.getString(4);
//                String dichvu = rs.getString(5);
//                NhaTro nt = new NhaTro(maphong, giaphong, soluong, dientich, dichvu);
//
//                list.add(nt);
//            }
//            con.close();
//        } catch (Exception ex) {
//            System.out.println(ex);
//        }
//    }
    public QuanLiNhaTro(DefaultTableModel Model, JButton btnAdd, JButton btnAn, JButton btnService, JButton btnShow, JButton btnShowFeedBack, JButton btnUpdate, JButton jButton1, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JLabel jLabel5, JLabel jLabel6, JLabel jLabel7, JPanel jPanel1, JPanel jPanel2, JPanel jPanel4, JScrollPane jScrollPane2, JTable tblThongTinNT, JTextField txtDichVu, JTextField txtGiaPhong, JTextField txtMaPhong, JTextField txtSoLuong, JTextField txtxDienTich) throws HeadlessException {
        this.Model = Model;
        this.btnAdd = btnAdd;
        this.btnAn = btnAn;
        this.btnService = btnService;
        this.btnShow = btnShow;
        this.btnShowFeedBack = btnShowFeedBack;
        this.btnUpdate = btnUpdate;
        this.jButton1 = jButton1;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel5 = jLabel5;
        this.jLabel6 = jLabel6;
        this.jLabel7 = jLabel7;
        this.jPanel1 = jPanel1;
        this.jPanel2 = jPanel2;
        this.jPanel4 = jPanel4;
        this.jScrollPane2 = jScrollPane2;
        this.tblThongTinNT = tblThongTinNT;
        this.txtDichVu = txtDichVu;
        this.txtGiaPhong = txtGiaPhong;
        this.txtMaPhong = txtMaPhong;
        this.txtSoLuong = txtSoLuong;
        this.txtxDienTich = txtxDienTich;
    }

    public void showdeltaill(int index) {
        try {
            txtMaPhong.setText(tblThongTinNT.getValueAt(index, 0) + "");
            txtGiaPhong.setText(tblThongTinNT.getValueAt(index, 1) + "");
            txtSoLuong.setText(tblThongTinNT.getValueAt(index, 2) + "");
            txtxDienTich.setText(tblThongTinNT.getValueAt(index, 3) + "");
            txtDichVu.setText(tblThongTinNT.getValueAt(index, 4) + "");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void filltotable() {
        System.out.println(list.size());
        Model = (DefaultTableModel) tblThongTinNT.getModel();
        Model.setRowCount(0);
        for (NhaTro nt : list) {
            Object[] row = new Object[]{nt.getMaPhong(), nt.getGiaPhong(), nt.getSoLuong(), nt.getDienTich(), nt.getDichVu()};
            Model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaPhong = new javax.swing.JTextField();
        txtxDienTich = new javax.swing.JTextField();
        txtGiaPhong = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDichVu = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnAn = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnShowFeedBack = new javax.swing.JButton();
        btnService = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThongTinNT = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÍ NHÀ TRỌ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin nhà trọ"));

        jLabel2.setText("Mã Phòng");

        jLabel3.setText("Giá Phòng");

        jLabel4.setText("Số lượng tối đa");

        jLabel5.setText("Diện tích");

        txtSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongActionPerformed(evt);
            }
        });

        jLabel6.setText("m^2");

        jLabel7.setText("Dịch vụ");

        txtDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDichVuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGiaPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(txtMaPhong))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtxDienTich, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtDichVu))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGiaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtxDienTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnAn.setText("Ẩn");
        btnAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnActionPerformed(evt);
            }
        });

        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnShow.setText("Xem thông tin");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnShowFeedBack.setText("Xem đánh giá");

        btnService.setText("Đăng kí dịch vụ");
        btnService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiceActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh Sách Phòng"));

        tblThongTinNT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Phòng", "Giá Phòng", "Số lượng", "Diện tích", "Dịch vụ"
            }
        ));
        tblThongTinNT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThongTinNTMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblThongTinNT);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );

        jButton1.setText("Làm Mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addGap(63, 63, 63)
                        .addComponent(btnShow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShowFeedBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnService)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnAn)
                    .addComponent(btnUpdate)
                    .addComponent(btnShow)
                    .addComponent(btnShowFeedBack)
                    .addComponent(btnService)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        String map = txtMaPhong.getText();
        String giaphong = txtGiaPhong.getText();
        String soluong = txtSoLuong.getText();
        String dientich = txtxDienTich.getText();
        String dichvu = txtDichVu.getText();
        boolean check = ctDb.save(map, giaphong, soluong, dientich, dichvu);
        if (check) {
            JOptionPane.showMessageDialog(this, "Saved !");
        } else {
            JOptionPane.showMessageDialog(this, "Error!");
        }
        list = ctDb.getlist();
        filltotable();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (txtMaPhong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nhập Mã Phòng");
            txtMaPhong.requestFocus();
            return;
        }
        String maphong = txtMaPhong.getText();
        String giaphong = txtGiaPhong.getText();
        String soluong = txtSoLuong.getText();
        String dientich = txtxDienTich.getText();
        String dichvu = txtDichVu.getText();

        boolean check = ctDb.update(maphong, giaphong, soluong, dientich, dichvu);
        if (check) {
            JOptionPane.showMessageDialog(this, "Update !");
        } else {
            JOptionPane.showMessageDialog(this, "Error!");
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblThongTinNTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThongTinNTMouseClicked
        int selectedRow = tblThongTinNT.getSelectedRow();
        showdeltaill(selectedRow);
    }//GEN-LAST:event_tblThongTinNTMouseClicked

    private void btnAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnActionPerformed
        if (txtMaPhong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nhập Mã Phòng");
            txtMaPhong.requestFocus();
            return;
        }
        String maphong = txtMaPhong.getText();      
            boolean check = ctDb.hide(maphong);
            if (check) {
                JOptionPane.showMessageDialog(this, "Updated Hide State!");
            } else {
                JOptionPane.showMessageDialog(this, "Error!");
            }
        list = ctDb.getlist();
        filltotable();
    }//GEN-LAST:event_btnAnActionPerformed

    private void txtSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongActionPerformed

    private void txtDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDichVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDichVuActionPerformed

    private void btnServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiceActionPerformed
        chuyenFrameDV(evt);
    }//GEN-LAST:event_btnServiceActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtMaPhong.setText("");
        txtGiaPhong.setText("");
        txtSoLuong.setText("");
        txtxDienTich.setText("");
        txtDichVu.setText("");
        txtMaPhong.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    private boolean checkForm() {
        if (txtSoLuong.getText().equals("") && txtMaPhong.getText().equals("")
                && txtGiaPhong.getText().equals("") && txtxDienTich.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin !", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtSoLuong.getText().equals("")
                && txtGiaPhong.getText().equals("") && txtxDienTich.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin !", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtSoLuong.getText().equals("") && txtMaPhong.getText().equals("")
                && txtxDienTich.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin !", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtMaPhong.getText().equals("")
                && txtGiaPhong.getText().equals("") && txtxDienTich.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin !", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtSoLuong.getText().equals("") && txtMaPhong.getText().equals("")
                && txtGiaPhong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin !", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtMaPhong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã phòng !", "Thông báo", JOptionPane.ERROR_MESSAGE);
            txtMaPhong.requestFocus();
            return false;
        }
        if (txtGiaPhong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập giá phòng !", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtSoLuong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số lượng tối đa !", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return false;

        }
        try {
            Integer.valueOf(txtSoLuong.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Số lượng phải là số !", "Notification", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtxDienTich.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập diện tích !", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        try {
            Integer.valueOf(txtxDienTich.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Diện tích phải là số !", "Notification", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLiNhaTro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new QuanLiNhaTro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAn;
    private javax.swing.JButton btnService;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnShowFeedBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblThongTinNT;
    private javax.swing.JTextField txtDichVu;
    private javax.swing.JTextField txtGiaPhong;
    private javax.swing.JTextField txtMaPhong;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtxDienTich;
    // End of variables declaration//GEN-END:variables
}
