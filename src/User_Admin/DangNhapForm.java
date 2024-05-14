/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package User_Admin;

import Admin.DoiMatKhauForm;
import Admin.QuanLiNhaTro;
import Admin.FormAD;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class DangNhapForm extends javax.swing.JFrame {

    public String rememberedUsername = ""; // Biến lưu trữ tên người dùng đã nhớ
    public String rememberedPassword = ""; // Biến lưu trữ mật khẩu đã nhớ
    String vaitronguoisudung = "";
    String linevt = "";
    String storedPassword = "";

    /**
     * Creates new form DangKiForm
     */
    public DangNhapForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void chuyenFrame1 (java.awt.event.ActionEvent evt) {
        QuanLiNhaTro newFrame = new QuanLiNhaTro();
        newFrame.setVisible(true);
        this.setVisible(false);
    }

    private void chuyenFrame2(java.awt.event.ActionEvent evt) {
        FormAD newFrame = new FormAD();
        newFrame.setVisible(true);
        this.setVisible(false);
    }
       private void chuyenFrame3(java.awt.event.ActionEvent evt) {
        DoiMatKhauForm newFrame = new DoiMatKhauForm();
        newFrame.setVisible(true);
        this.setVisible(false);
    }
       private void Doipass(java.awt.event.ActionEvent evt){
           chuyenFrame3(evt);
       }

    private void dangnhap(java.awt.event.ActionEvent evt) {
        // Lấy tên người dùng và mật khẩu từ giao diện đăng nhập
        String enteredUsername = txtten.getText();
        String enteredPassword = txtpass.getText();

        // Kiểm tra xem có chọn "Nhớ mật khẩu" hay không
        if (ckNhoMK.isSelected()) {
            rememberedUsername = enteredUsername;
            rememberedPassword = enteredPassword;
        } else {
            rememberedUsername = "";
            rememberedPassword = "";
        }

        // Kiểm tra thông tin đăng nhập
        if (checkLogin(enteredUsername, enteredPassword)) {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
            if (vaitronguoisudung.equals("User")) {
                chuyenFrame1(evt);
            } else if (vaitronguoisudung.equals("Admin")) {
                chuyenFrame2(evt);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Sai tên đăng nhập hoặc mật khẩu");
        }
    }

    private boolean checkLogin(String enteredUsername, String enteredPassword) {
        try {
            File file = new File("userInfo.txt");
            // Kiểm tra xem tệp có tồn tại không
            if (!file.exists()) {
                JOptionPane.showMessageDialog(this, "Tệp không tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            // Sử dụng BufferedReader để đọc dữ liệu từ tệp
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Tách thông tin từ dòng đọc được
                    String[] userInfo = line.split(": ");
                    if (userInfo.length == 2) {
                        String key = userInfo[0].trim();
                        String value = userInfo[1].trim();

                        // Kiểm tra tên người dùng và mật khẩu
                        if (key.equals("Tên User") && value.equals(enteredUsername)) {
                            line = reader.readLine(); // Đọc dòng tiếp theo (Mật khẩu)
                            String[] passInfo = line.split(": ");
                            if (passInfo.length == 2) {
                                linevt = reader.readLine();
                                System.out.println(linevt);
                                storedPassword = passInfo[1].trim();

                            }

                            String[] ifvaitro = linevt.split(": ");
                            System.out.println(ifvaitro.length);
                            if (ifvaitro.length == 2) {
                                vaitronguoisudung = ifvaitro[1].trim();
                                System.out.println(vaitronguoisudung);
                                return storedPassword.equals(enteredPassword);
                            }
                        }
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi kiểm tra đăng nhập", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtten = new javax.swing.JTextField();
        btndangnhap = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnDoiPass = new javax.swing.JButton();
        btnDangKiUser = new javax.swing.JButton();
        ckNhoMK = new javax.swing.JCheckBox();
        txtpass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Đăng Nhập");

        jLabel2.setText("Tên");

        jLabel3.setText("Password :");

        btndangnhap.setText("Đăng nhập");
        btndangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangnhapActionPerformed(evt);
            }
        });

        btnDoiPass.setText("Quên mật khẩu");
        btnDoiPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiPassActionPerformed(evt);
            }
        });

        btnDangKiUser.setText("Đăng kí");
        btnDangKiUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKiUserActionPerformed(evt);
            }
        });

        ckNhoMK.setText("Nhớ mật khẩu");
        ckNhoMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckNhoMKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDoiPass, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(ckNhoMK)
                                            .addGap(18, 18, 18)
                                            .addComponent(btndangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnDangKiUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtten, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                    .addComponent(txtpass))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndangnhap)
                    .addComponent(btnDangKiUser)
                    .addComponent(ckNhoMK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDoiPass, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangnhapActionPerformed
        dangnhap(evt);
    }//GEN-LAST:event_btndangnhapActionPerformed

    private void btnDoiPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiPassActionPerformed
        Doipass(evt);
    }//GEN-LAST:event_btnDoiPassActionPerformed

    private void ckNhoMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckNhoMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckNhoMKActionPerformed

    private void btnDangKiUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKiUserActionPerformed
        DangkiForm newFrame = new DangkiForm();
        newFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDangKiUserActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhapForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhapForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKiUser;
    private javax.swing.JButton btnDoiPass;
    private javax.swing.JButton btndangnhap;
    private javax.swing.JCheckBox ckNhoMK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtten;
    // End of variables declaration//GEN-END:variables

    private void logout() {
        this.dispose();
    }
}
