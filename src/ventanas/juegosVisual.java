package ventanas;

import java.awt.Desktop;
import java.awt.Image;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

public class juegosVisual extends javax.swing.JFrame {

    public juegosVisual() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(255, 340);
        setTitle("JUEGOS");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        cambiarIcono();

    }

    private void cambiarIcono() {
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/LOGO.png"));
        Image imagen = icono.getImage();

        this.setIconImage(imagen);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_juego4 = new javax.swing.JButton();
        jButton_juego3 = new javax.swing.JButton();
        jButton_juego2 = new javax.swing.JButton();
        jButton_juego1 = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_juego4.setBackground(new java.awt.Color(214, 184, 232));
        jButton_juego4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_juego4.setText("Memoria visual ");
        jButton_juego4.setBorder(null);
        jButton_juego4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_juego4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_juego4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, 200, 30));

        jButton_juego3.setBackground(new java.awt.Color(214, 184, 232));
        jButton_juego3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_juego3.setText("Busquemos sus sombras");
        jButton_juego3.setBorder(null);
        jButton_juego3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_juego3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_juego3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 170, 200, 30));

        jButton_juego2.setBackground(new java.awt.Color(214, 184, 232));
        jButton_juego2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_juego2.setText("Dulce Maria y el mono");
        jButton_juego2.setBorder(null);
        jButton_juego2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_juego2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_juego2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 200, 30));

        jButton_juego1.setBackground(new java.awt.Color(214, 184, 232));
        jButton_juego1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_juego1.setText("Comprension de imagenes ");
        jButton_juego1.setBorder(null);
        jButton_juego1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_juego1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_juego1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 70, 200, 30));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoJ.png"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 255, 356));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_juego1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_juego1ActionPerformed
        try {

            URI uri = new URI("https://wordwall.net/es/resource/19943667/comprension/comprension-de-imagenes");

            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(uri);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton_juego1ActionPerformed

    private void jButton_juego2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_juego2ActionPerformed

        try {

            URI uri = new URI("https://maguare.gov.co/dulce-maria-y-el-cangrejo/");

            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(uri);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton_juego2ActionPerformed

    private void jButton_juego3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_juego3ActionPerformed
          try {

            URI uri = new URI("https://wordwall.net/es/resource/16252183/discriminación-visual/busquemos-sus-sombras-");

            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(uri);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton_juego3ActionPerformed

    private void jButton_juego4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_juego4ActionPerformed
              try {

            URI uri = new URI("https://wordwall.net/es/resource/3589783/memoria-y-percepci%C3%B3n-visual");

            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(uri);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton_juego4ActionPerformed

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
            java.util.logging.Logger.getLogger(juegosVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(juegosVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(juegosVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(juegosVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new juegosVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_juego1;
    private javax.swing.JButton jButton_juego2;
    private javax.swing.JButton jButton_juego3;
    private javax.swing.JButton jButton_juego4;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
