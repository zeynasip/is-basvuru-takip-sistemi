/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_1621221085_zeynep_nasip_odev1;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class Anasayfa extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Anasayfa() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
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
        uyeol = new javax.swing.JButton();
        isveren = new javax.swing.JButton();
        basvuru = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_userName = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        txt_sifre1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("ZN KARİYER HAVUZU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 380, 40));

        uyeol.setText("Üye Ol");
        uyeol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeolActionPerformed(evt);
            }
        });
        getContentPane().add(uyeol, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 122, 32));

        isveren.setText("İşveren Giriş");
        isveren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isverenActionPerformed(evt);
            }
        });
        getContentPane().add(isveren, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 122, 33));

        basvuru.setText("Başvuran Giriş");
        basvuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basvuruActionPerformed(evt);
            }
        });
        getContentPane().add(basvuru, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 122, 33));

        jLabel3.setText("Kullanıcı Adı:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel4.setText("Şifre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));
        getContentPane().add(txt_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 122, 30));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 122, 30));
        getContentPane().add(txt_sifre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 120, 30));
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 120, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uyeolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeolActionPerformed
        // TODO add your handling code here:

        //üyelik frame geçiş
        UyelikFrame f1 = new UyelikFrame();
        f1.setVisible(true);


    }//GEN-LAST:event_uyeolActionPerformed

    private void basvuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basvuruActionPerformed
        // TODO add your handling code here:

        //giriş yapma
        boolean girisYap = false;
       
        for (Uye kisi : Uye.uyeler) {
             if (kisi.kullaniciAd.equals(jTextField3.getText()) && kisi.sifre.equals(jPasswordField2.getText())) {
                girisYap = true;
            }
            else girisYap = false;
        }
        if (girisYap == true) {
            BasvuranFrame b = new BasvuranFrame();
            b.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Kullanıcı adı veya şifre yanlış girilmiştir!");
        }


    }//GEN-LAST:event_basvuruActionPerformed

    private void isverenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isverenActionPerformed

        //giriş yapma
        boolean girisYap = false;
       
        for (Uye kisi : Uye.uyeler) {
             if (kisi.kullaniciAd.equals(txt_userName.getText()) && kisi.sifre.equals(txt_sifre1.getText())) {
                girisYap = true;
            }
            else girisYap = false;
        }
        if (girisYap == true) {
            İsverenFrame f = new İsverenFrame();
            f.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Kullanıcı adı veya şifre yanlış girilmiştir!");
        }
    }//GEN-LAST:event_isverenActionPerformed

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
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anasayfa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton basvuru;
    private javax.swing.JButton isveren;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPasswordField txt_sifre1;
    private javax.swing.JTextField txt_userName;
    private javax.swing.JButton uyeol;
    // End of variables declaration//GEN-END:variables
}
