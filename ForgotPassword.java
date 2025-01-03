/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.system;

import javax.swing.JOptionPane;
import model.user;
import dao.userdao;

/**
 *
 * @author komal
 */
public class ForgotPassword extends javax.swing.JFrame {

    private String dbAnswer = null;
    private String email = null;
    private String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";

    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
        initComponents();
        btnupdate.setEnabled(false);
        btnsearch.setEnabled(false);
        txtsecque.setEditable(false);
    }

    public void clear() {
        btnupdate.setEnabled(false);
        btnsearch.setEnabled(false);
        txtemail.setEditable(true);
        txtemail.setText("");
        txtsecque.setText("");
        txtanswer.setText("");
        txtnewpassword.setText("");
    }

    public void validateEmail() {
        email = txtemail.getText();
        if (email.matches(emailPattern)) {
            btnsearch.setEnabled(true);
        } else {
            btnsearch.setEnabled(false);
        }
    }

    public void validateFields() {
        String password = txtnewpassword.getText();
        String answer = txtanswer.getText();
        String securityQuestion = txtsecque.getText();
        if (!password.equals("") && !answer.equals("") && !securityQuestion.equals("")) {
            btnupdate.setEnabled(true);
        } else {
            btnupdate.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtsecque = new javax.swing.JTextField();
        txtanswer = new javax.swing.JTextField();
        txtnewpassword = new javax.swing.JPasswordField();
        btnsearch = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORGOT PASSWORD ?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 512, -1));

        jLabel2.setFont(new java.awt.Font("Bell MT", 2, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EMAIL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bell MT", 2, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("YOUR SECURITY QUESTION");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 354, -1));

        jLabel4.setFont(new java.awt.Font("Bell MT", 2, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("YOUR ANSWER");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 201, -1));

        jLabel5.setFont(new java.awt.Font("Bell MT", 2, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ENTER NEW PASSWORD");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 494, 308, -1));

        txtemail.setFont(new java.awt.Font("Bell MT", 2, 24)); // NOI18N
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 370, -1));

        txtsecque.setFont(new java.awt.Font("Bell MT", 2, 24)); // NOI18N
        txtsecque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsecqueKeyReleased(evt);
            }
        });
        getContentPane().add(txtsecque, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 370, -1));

        txtanswer.setFont(new java.awt.Font("Bell MT", 2, 24)); // NOI18N
        txtanswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtanswerKeyReleased(evt);
            }
        });
        getContentPane().add(txtanswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 370, -1));

        txtnewpassword.setFont(new java.awt.Font("Bell MT", 2, 24)); // NOI18N
        txtnewpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnewpasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtnewpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 494, 370, -1));

        btnsearch.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        btnsearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\komal\\OneDrive\\Documents\\NetBeansProjects\\Cafe Management System\\Cafe Image & Icon\\images\\search.png")); // NOI18N
        btnsearch.setText("SEARCH");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1125, 192, -1, -1));

        btnexit.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        btnexit.setIcon(new javax.swing.ImageIcon("C:\\Users\\komal\\OneDrive\\Documents\\NetBeansProjects\\Cafe Management System\\Cafe Image & Icon\\images\\exit small.png")); // NOI18N
        btnexit.setText("EXIT");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 600, -1, -1));

        btnclear.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        btnclear.setIcon(new javax.swing.ImageIcon("C:\\Users\\komal\\OneDrive\\Documents\\NetBeansProjects\\Cafe Management System\\Cafe Image & Icon\\images\\clear.png")); // NOI18N
        btnclear.setText("CLEAR");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 600, -1, -1));

        btnupdate.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\komal\\OneDrive\\Documents\\NetBeansProjects\\Cafe Management System\\Cafe Image & Icon\\images\\save.png")); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 600, -1, -1));

        jButton5.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jButton5.setText("SIGNUP");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 690, -1, -1));

        jButton6.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jButton6.setText("LOGIN");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(856, 690, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\komal\\OneDrive\\Documents\\NetBeansProjects\\Cafe Management System\\Cafe Image & Icon\\images\\first page background.PNG")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>                        

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
        validateEmail();
    }                                    

    private void txtsecqueKeyReleased(java.awt.event.KeyEvent evt) {                                      
        // TODO add your handling code here:
        validateFields();
    }                                     

    private void txtanswerKeyReleased(java.awt.event.KeyEvent evt) {                                      
        // TODO add your handling code here:
        validateFields();
    }                                     

    private void txtnewpasswordKeyReleased(java.awt.event.KeyEvent evt) {                                           
        // TODO add your handling code here:
        validateFields();
    }                                          

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Close Application", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }                                       

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        clear();
    }                                        

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String answer = txtanswer.getText();
        String newPassword = txtnewpassword.getText();
        if (answer.equals(dbAnswer)) {
            userdao.update(email, newPassword);
        } else {
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">INCORRECT ANSWER</b></html>", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }                                         

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        email = txtemail.getText();
        user user = null;
        user = userdao.getSecurityQuestion(email);
        if (user == null) {
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">INCORRECT EMAIL</b></html>", "Message", JOptionPane.ERROR_MESSAGE);
        } else {
            btnsearch.setEnabled(false);
            txtemail.setEditable(false);
            dbAnswer = user.getAnswer();
            txtsecque.setText(user.getSecurityQuestion());
            validateFields();
        }
    }                                         

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        setVisible(false);
        new Signup().setVisible(true);
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        setVisible(false);
        new Login().setVisible(true);
    }                                        

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtanswer;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtnewpassword;
    private javax.swing.JTextField txtsecque;
    // End of variables declaration                   
}
