/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author Nanta
 */
public class Lat3 extends javax.swing.JFrame {

    /**
     * Creates new form Lat3
     */
    public Lat3() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Bilangan1 = new javax.swing.JTextField();
        Bilangan2 = new javax.swing.JTextField();
        Kurang = new javax.swing.JButton();
        Kali = new javax.swing.JButton();
        Bagi = new javax.swing.JButton();
        Tambah = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Hasil = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Bilangan 1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 60, 90, 14);

        jLabel2.setText("Bilangan 2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 110, 80, 14);

        jLabel3.setText("Hasil");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 230, 90, 14);

        Bilangan1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Bilangan1.setName("bilangan1"); // NOI18N
        getContentPane().add(Bilangan1);
        Bilangan1.setBounds(170, 50, 170, 30);

        Bilangan2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Bilangan2.setName("Bilangan2"); // NOI18N
        getContentPane().add(Bilangan2);
        Bilangan2.setBounds(170, 100, 170, 30);

        Kurang.setText("-");
        Kurang.setName("kurang"); // NOI18N
        Kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KurangActionPerformed(evt);
            }
        });
        getContentPane().add(Kurang);
        Kurang.setBounds(320, 170, 60, 50);

        Kali.setText("X");
        Kali.setName("kali"); // NOI18N
        Kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KaliActionPerformed(evt);
            }
        });
        getContentPane().add(Kali);
        Kali.setBounds(110, 170, 60, 50);

        Bagi.setText(":");
        Bagi.setName("bagi"); // NOI18N
        Bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagiActionPerformed(evt);
            }
        });
        getContentPane().add(Bagi);
        Bagi.setBounds(180, 170, 60, 50);

        Tambah.setText("+");
        Tambah.setName("tambah"); // NOI18N
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });
        getContentPane().add(Tambah);
        Tambah.setBounds(250, 170, 60, 50);

        jLabel4.setText("Kalkulator Sederhana");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 10, 140, 14);

        jLabel5.setText("Operasi ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(230, 140, 110, 14);

        Hasil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Hasil.setName("hasil"); // NOI18N
        getContentPane().add(Hasil);
        Hasil.setBounds(150, 260, 230, 80);

        jPanel1.setBackground(new java.awt.Color(51, 0, 255));
        jPanel1.setForeground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 370);

        setBounds(0, 0, 492, 404);
    }// </editor-fold>//GEN-END:initComponents

    private void KaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KaliActionPerformed
        // TODO add your handling code here:
        Double bil1 = Double.parseDouble(Bilangan1.getText());
        Double bil2 = Double.parseDouble(Bilangan2.getText());
        Double hasil = bil1*bil2;
        Hasil.setText(String.valueOf(hasil));
        
        
    }//GEN-LAST:event_KaliActionPerformed

    private void BagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagiActionPerformed
        // TODO add your handling code here:
        int bil1 = Integer.parseInt(Bilangan1.getText());
        int bil2 = Integer.parseInt(Bilangan2.getText());
        int hasil = bil1/bil2;
        Hasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_BagiActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        // TODO add your handling code here:
          int bil1 = Integer.parseInt(Bilangan1.getText());
        int bil2 = Integer.parseInt(Bilangan2.getText());
        int hasil = bil1+bil2;
        Hasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_TambahActionPerformed

    private void KurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KurangActionPerformed
        // TODO add your handling code here:
          int bil1 = Integer.parseInt(Bilangan1.getText());
        int bil2 = Integer.parseInt(Bilangan2.getText());
        int hasil = bil1-bil2;
        Hasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_KurangActionPerformed

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
            java.util.logging.Logger.getLogger(Lat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lat3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bagi;
    private javax.swing.JTextField Bilangan1;
    private javax.swing.JTextField Bilangan2;
    private javax.swing.JTextField Hasil;
    private javax.swing.JButton Kali;
    private javax.swing.JButton Kurang;
    private javax.swing.JButton Tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
