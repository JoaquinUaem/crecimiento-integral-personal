package ventanas;

import java.awt.Desktop;
import java.awt.Image;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

public class Visual extends javax.swing.JFrame {

    public Visual() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(640, 480);
        setTitle("VISUAL");
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

        jButton_regresa = new javax.swing.JButton();
        jButton_habla = new javax.swing.JButton();
        jButton_lectura = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_regresa.setBackground(new java.awt.Color(214, 184, 232));
        jButton_regresa.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton_regresa.setText("Regresar");
        jButton_regresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_regresaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_regresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 200, 25));

        jButton_habla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/habla.png"))); // NOI18N
        jButton_habla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hablaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_habla, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 100, 100));

        jButton_lectura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros.png"))); // NOI18N
        jButton_lectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lecturaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_lectura, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 100, 100));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setText("Habla");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 290, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("Lectura");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setText("Visual");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PaperVisual.png"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 628, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_lecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lecturaActionPerformed
        juegosVisual n = new juegosVisual();
        n.setVisible(true);
    }//GEN-LAST:event_jButton_lecturaActionPerformed

    private void jButton_hablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hablaActionPerformed
     try {
           
            URI uri = new URI("https://www.cokitos.com/juego-del-ahorcado-para-ninos/play/");
            
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(uri);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton_hablaActionPerformed

    private void jButton_regresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_regresaActionPerformed
            Botones n = new Botones();
            n.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton_regresaActionPerformed

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
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_habla;
    private javax.swing.JButton jButton_lectura;
    private javax.swing.JButton jButton_regresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
