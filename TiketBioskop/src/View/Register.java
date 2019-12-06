package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register extends javax.swing.JFrame {

    
   public Register() {
        initComponents();
    }
   
    public JButton getBtnbacksignin() {
        return btnbacksignin;
    }

    public JButton getBtnsign() {
        return btnsign;
    }

    public JPasswordField getTfsconpass() {
        return tfsconpass;
    }

    public JTextField getTfsemail() {
        return tfsemail;
    }

    public JTextField getTffirstname() {
        return tffirstname;
    }

    public JTextField getTflastname() {
        return tflastname;
    }

    public JTextField getTfsnohp() {
        return tfsnohp;
    }

    public JPasswordField getTfspassword() {
        return tfspassword;
    }

    public JTextField getTfsusername() {
        return tfsusername;
    }
    public void setTfsconpass(String conpass) {
        this.tfsconpass.setText(conpass);
    }

    public void setTfsemail(String email) {
        this.tfsemail.setText(email);
    }

    public void setTffirstname(String firstname) {
        this.tffirstname.setText(firstname);
    }

    public void setTflastname(String lastname) {
        this.tflastname.setText(lastname);
    }

    public void setTfsnohp(String nohp) {
        this.tfsnohp.setText(nohp);
    }

    public void setTfspassword(String password) {
        this.tfspassword.setText(password);
    }

    public void setTfsusername(String username) {
        this.tfsusername.setText(username);
    }
    public void addActionListener(ActionListener e){
        btnsign.addActionListener(e);
        btnbacksignin.addActionListener(e);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblsignin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblusername = new javax.swing.JLabel();
        tfsusername = new javax.swing.JTextField();
        lblpass = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tfspassword = new javax.swing.JPasswordField();
        lblconfirm = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfsconpass = new javax.swing.JPasswordField();
        tfsnohp = new javax.swing.JTextField();
        tffirstname = new javax.swing.JTextField();
        tflastname = new javax.swing.JTextField();
        tfsemail = new javax.swing.JTextField();
        btnbacksignin = new javax.swing.JButton();
        btnsign = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("hooge 05_54", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("tic's.id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\adin\\Pictures\\deadpool-2-movie-cinema-01.jpg")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lblsignin.setFont(new java.awt.Font("hooge 05_53", 0, 36)); // NOI18N
        lblsignin.setForeground(new java.awt.Color(255, 255, 255));
        lblsignin.setText("SIGN IN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addComponent(lblsignin)
                .addGap(228, 228, 228))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(lblsignin))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 600, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lblusername.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblusername.setText("Username");

        tfsusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfsusernameActionPerformed(evt);
            }
        });

        lblpass.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblpass.setText("Password");

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        lblconfirm.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblconfirm.setText("Confirm Password");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setText("Last Name ");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setText("First Name");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel12.setText("E-mail");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel13.setText("Nomor Handphone");

        tfsnohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfsnohpActionPerformed(evt);
            }
        });

        tffirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tffirstnameActionPerformed(evt);
            }
        });

        tflastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tflastnameActionPerformed(evt);
            }
        });

        tfsemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfsemailActionPerformed(evt);
            }
        });

        btnbacksignin.setText("BACK");

        btnsign.setText("SIGN IN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblusername)
                                .addGap(92, 92, 92)
                                .addComponent(tfsusername))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblconfirm)
                                .addGap(25, 25, 25)
                                .addComponent(tfsconpass))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblpass)
                                .addGap(97, 97, 97)
                                .addComponent(tfspassword, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tflastname)
                            .addComponent(tffirstname)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(125, 125, 125)
                        .addComponent(tfsemail))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(22, 22, 22)
                        .addComponent(tfsnohp)))
                .addGap(81, 81, 81))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(btnbacksignin)
                .addGap(108, 108, 108)
                .addComponent(btnsign)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusername, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfsusername, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpass)
                    .addComponent(tfspassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblconfirm)
                    .addComponent(tfsconpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(tffirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(tflastname, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfsemail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(tfsnohp, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbacksignin)
                    .addComponent(btnsign))
                .addGap(65, 65, 65)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 600, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfsemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfsemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsemailActionPerformed

    private void tflastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tflastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tflastnameActionPerformed

    private void tffirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tffirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tffirstnameActionPerformed

    private void tfsnohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfsnohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsnohpActionPerformed

    private void tfsusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfsusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsusernameActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbacksignin;
    private javax.swing.JButton btnsign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblconfirm;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lblsignin;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTextField tffirstname;
    private javax.swing.JTextField tflastname;
    private javax.swing.JPasswordField tfsconpass;
    private javax.swing.JTextField tfsemail;
    private javax.swing.JTextField tfsnohp;
    private javax.swing.JPasswordField tfspassword;
    private javax.swing.JTextField tfsusername;
    // End of variables declaration//GEN-END:variables
}
