/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package User_Admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class DangkiForm extends javax.swing.JFrame {

    /**
     * Creates new form TK
     */
    public DangkiForm() {
        initComponents();
        initListeners();
        setLocationRelativeTo(null);
    }

    private void initListeners() {
        txtDangKi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (validateInput()) {
                    performRegistration();
                }
            }
        });
    }

    private boolean validateInput() {
        String tenUser = txtTenUser.getText();
        String password = String.valueOf(txtPass1.getPassword());
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        String age = txtAge.getText();
        String sdt = txtsdt1.getText();
        if (tenUser.isEmpty() || password.isEmpty() || email.isEmpty() || address.isEmpty() || age.isEmpty() || sdt.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.", "Lỗi đăng ký", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public void saveUserInfoToFile(String tenUser, String password, String email, String address, String age, String sdt, String gender, String vaitro) {
        try {
            File file = new File("userInfo.txt");

            // Kiểm tra xem tệp đã tồn tại hay chưa
            if (!file.exists()) {
                file.createNewFile();
            }

            // Sử dụng BufferedWriter để ghi dữ liệu vào tệp
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                // Ghi thông tin người dùng vào tệp
                writer.write("Tên User: " + tenUser + "\n");
                writer.write("Mật khẩu: " + password + "\n");
                writer.write("Vai Trò: " + vaitro + "\n");
                writer.write("Email: " + email + "\n");
                writer.write("Địa chỉ: " + address + "\n");
                writer.write("Tuổi: " + age + "\n");
                writer.write("SDT: " + sdt + "\n");
                writer.write("Giới tính: " + gender + "\n");               
                writer.write("---------------------------------\n");
            }

            JOptionPane.showMessageDialog(null, "Thông tin đã được lưu vào tệp.", "Lưu thành công", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi lưu thông tin.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void chuyenFrame4(java.awt.event.ActionEvent evt) {
    DichVu newFrame = new DichVu();
    newFrame.setVisible(true);
    this.setVisible(false);
}

    private void performRegistration() {
        // Get user input and perform registration logic here
        String tenUser = txtTenUser.getText();
        String password = String.valueOf(txtPass1.getPassword());
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        String age = txtAge.getText();
        String sdt = txtsdt1.getText();
        String gender = jRadioButton1.isSelected() ? "Nam" : "Nữ";
        String vaitro = "";
        if (rdoadmin.isSelected()) {
            vaitro = "Admin";
        }
        if (rdouser.isSelected()) {
            vaitro = "User";
        }
        if (vaitro.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chọn Vai Trò");
            return;
        }
        // Gọi phương thức để lưu thông tin vào tệp
        saveUserInfoToFile(tenUser, password, email, address, age, sdt, gender, vaitro);

        // Hiển thị thông báo đăng ký thành công
        String message = "Tên User: " + tenUser + "\n"
                + "Mật khẩu: " + password + "\n"
                + "Email: " + email + "\n"
                + "Địa chỉ: " + address + "\n"
                + "Tuổi: " + age + "\n"
                + "SDT: " + sdt + "\n"
                + "Giới tính: " + gender +"\n"
                + "Vai Trò:" + vaitro;

        JOptionPane.showMessageDialog(null, message, "Đăng ký thành công", JOptionPane.INFORMATION_MESSAGE);
    }

    public void chuyenFrame(java.awt.event.ActionEvent evt) {
        DangNhapForm newFrame = new DangNhapForm();
        newFrame.setVisible(true);
        this.setVisible(false);
    }

    public void dangki(java.awt.event.ActionEvent evt) {
        chuyenFrame(evt);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton4 = new javax.swing.JRadioButton();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTenUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPass1 = new javax.swing.JPasswordField();
        rdoadmin = new javax.swing.JRadioButton();
        rdouser = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtDangKi = new javax.swing.JButton();
        txtDangKiDV = new javax.swing.JButton();
        txtsdt1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jRadioButton4.setText("jRadioButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tên User:");

        txtTenUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenUserActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Địa chỉ:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Tuổi:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("SDT:");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Nữ");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Nam");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Giới tính");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Mật khẩu:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Email:");

        buttonGroup2.add(rdoadmin);
        rdoadmin.setText("Admin");

        buttonGroup2.add(rdouser);
        rdouser.setText("User");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Vai Trò");

        txtDangKi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDangKi.setText("Đăng ký");
        txtDangKi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDangKiActionPerformed(evt);
            }
        });

        txtDangKiDV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDangKiDV.setText("Đăng kí dịch vụ");
        txtDangKiDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDangKiDVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addComponent(txtTenUser)
                            .addComponent(txtPass1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAge)
                            .addComponent(txtAddress)
                            .addComponent(txtsdt1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(77, 77, 77)
                        .addComponent(rdoadmin)
                        .addGap(18, 18, 18)
                        .addComponent(rdouser)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jRadioButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(jRadioButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(txtDangKi, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDangKiDV)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtTenUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtsdt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoadmin)
                    .addComponent(rdouser)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel8)
                    .addComponent(txtDangKi)
                    .addComponent(txtDangKiDV))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Menu");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("LIST");

        jMenuItem1.setText("Hiển thị thông tin");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Xem hóa đơn");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Xem thông tin nha trọ");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Xem đánh giá");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenUserActionPerformed

    private void txtDangKiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDangKiActionPerformed
       
    }//GEN-LAST:event_txtDangKiActionPerformed

    private void txtDangKiDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDangKiDVActionPerformed
        chuyenFrame4(evt);
    }//GEN-LAST:event_txtDangKiDVActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangkiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangkiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangkiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangkiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangkiForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton rdoadmin;
    private javax.swing.JRadioButton rdouser;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JButton txtDangKi;
    private javax.swing.JButton txtDangKiDV;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPass1;
    private javax.swing.JTextField txtTenUser;
    private javax.swing.JTextField txtsdt1;
    // End of variables declaration//GEN-END:variables
}
