/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Employee;
import Service.EmployeeService;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;
//import rw.gov.TransportMgtSystem.Dao.EmployeeDao;
//import rw.gov.TransportMgtSystem.Model.Employee;

/**
 *
 * @author Serge
 */
public class LoginPage extends javax.swing.JFrame {

    int nbr;
    Session newSession = null;
    MimeMessage mimeMessage = null;

    /**
     * Creates new form LoginPage
     */
    Color enteredColor, defaultColor;

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {

        initComponents();
        enteredColor = new Color(107, 36, 12);
        Toolkit tool = Toolkit.getDefaultToolkit();
        Dimension dim = new Dimension(tool.getScreenSize());
        int width = (int) (dim.getWidth() * 0.8);
        int height = (int) (dim.getHeight() * 0.8);
        setSize(width, height);
        setLocation(dim.width / 2 - getWidth() / 2, dim.height / 2 - getHeight() / 2);

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        messagetxt = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        passwdTxt = new javax.swing.JPasswordField();
        loginTxt = new javax.swing.JButton();
        resetTxt = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 157, 301, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel3.setText("Username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        messagetxt.setBackground(new java.awt.Color(0, 255, 102));
        messagetxt.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        messagetxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messagetxt.setText(" ");
        messagetxt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(messagetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 401, 394, -1));
        jPanel1.add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 122, -1));

        passwdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwdTxtActionPerformed(evt);
            }
        });
        jPanel1.add(passwdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 122, -1));

        loginTxt.setBackground(new java.awt.Color(153, 204, 255));
        loginTxt.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        loginTxt.setText("Login");
        loginTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginTxtMouseExited(evt);
            }
        });
        loginTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTxtActionPerformed(evt);
            }
        });
        jPanel1.add(loginTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, -1, -1));

        resetTxt.setBackground(new java.awt.Color(204, 153, 255));
        resetTxt.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        resetTxt.setText("Reset");
        resetTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetTxtActionPerformed(evt);
            }
        });
        jPanel1.add(resetTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 450, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Shoe Store Management System");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1373, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwdTxtActionPerformed

    private void loginTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTxtMouseEntered
        // TODO add your handling code here:
        loginTxt.setBackground(enteredColor);
    }//GEN-LAST:event_loginTxtMouseEntered

    private void loginTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTxtMouseExited
        // TODO add your handling code here:
        Color color = new Color(153, 204, 255);
        loginTxt.setBackground(color);
    }//GEN-LAST:event_loginTxtMouseExited

    private void loginTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTxtActionPerformed

        messagetxt.setVisible(true);
        if (usernameTxt.getText().trim().isEmpty() || passwdTxt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill the form");
        } else {
            try {
                Employee emp = new Employee();
                emp.setUsername(usernameTxt.getText());
                emp.setPassword(passwdTxt.getText());

                Registry thereg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                EmployeeService service = (EmployeeService) thereg.lookup("employee");
                List<Employee> empObj = service.LoginStatus(emp);

                if (!empObj.isEmpty()) {
                    GenerateSend otpservice = new GenerateSend();
                    String generatedOtp = otpservice.generateOtp();
                    String useremail = usernameTxt.getText();
                    otpservice.sendOtp(useremail, generatedOtp);

                    String enteredOtp = JOptionPane.showInputDialog(this, "Enter OTP sent to you:", "Otp Verification", JOptionPane.PLAIN_MESSAGE);

                    if (!generatedOtp.equals(enteredOtp)) {
                        JOptionPane.showMessageDialog(this, "Invalid OTP");
                        return;
                    } else {
                        JOptionPane.showMessageDialog(this, "Login successful");
                        ShoeStoreMgtSystem view = new ShoeStoreMgtSystem();
                        view.show();
                        dispose();
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect username or password");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_loginTxtActionPerformed

    private void resetTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetTxtActionPerformed
        messagetxt.setVisible(false);
        passwdTxt.setText("");
        usernameTxt.setText("");
    }//GEN-LAST:event_resetTxtActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginTxt;
    private javax.swing.JLabel messagetxt;
    private javax.swing.JPasswordField passwdTxt;
    private javax.swing.JButton resetTxt;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}