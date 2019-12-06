package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Forgetpass extends javax.swing.JFrame {
    
     public Forgetpass() {
        initComponents();
    }

    public JButton getBtnback() {
        return btnback;
    }

    public JButton getBtnsubmit() {
        return btnsubmit;
    }

    public JPasswordField getTfConfirm() {
        return tfConfirm;
    }

    public JTextField getTfemail() {
        return tfemail;
    }

    public JPasswordField getTfpass() {
        return tfpass;
    }

    public void addActionListener (ActionListener e){
        btnsubmit.addActionListener(e);
        btnback.addActionListener(e);
    }

    public void setTfConfirm(String confirm) {
        this.tfConfirm.setText(confirm);
    }

    public void setTfemail(String email) {
        this.tfemail.setText(email);
    }

    public void setTfpass(String pass) {
        this.tfpass.setText(pass);
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfemail = new javax.swing.JTextField();
        tfpass = new javax.swing.JPasswordField();
        tfConfirm = new javax.swing.JPasswordField();
        btnback = new javax.swing.JButton();
        btnsubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("hooge 05_54", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("tic's.id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/deadpool-2-movie-cinema-01.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("hooge 05_53", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FORGET PASSWORD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel2)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 600, 60));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 600, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, -1, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel7.setText("E-mail");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, -1, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel8.setText("New Password");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, -1));

        tfemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfemailActionPerformed(evt);
            }
        });
        getContentPane().add(tfemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 180, -1));
        getContentPane().add(tfpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 180, -1));
        getContentPane().add(tfConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 180, -1));

        btnback.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 620, -1, -1));

        btnsubmit.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfemailActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsubmitActionPerformed

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
            java.util.logging.Logger.getLogger(Forgetpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forgetpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forgetpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forgetpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgetpass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField tfConfirm;
    private javax.swing.JTextField tfemail;
    private javax.swing.JPasswordField tfpass;
    // End of variables declaration//GEN-END:variables
}
