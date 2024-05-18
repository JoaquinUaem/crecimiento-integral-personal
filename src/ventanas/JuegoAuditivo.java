package ventanas;
import java.awt.Desktop;
import java.awt.Image;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

public class JuegoAuditivo extends javax.swing.JFrame {

    public JuegoAuditivo() {
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

        jButton_juego2 = new javax.swing.JButton();
        jButton_juego1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_juego2.setBackground(new java.awt.Color(214, 184, 232));
        jButton_juego2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_juego2.setText("Animales de granja");
        jButton_juego2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_juego2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_juego2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 170, 200, 30));

        jButton_juego1.setBackground(new java.awt.Color(214, 184, 232));
        jButton_juego1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_juego1.setText("Juego de memoria");
        jButton_juego1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_juego1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_juego1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 100, 200, 30));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("del habla");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoJ.png"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 255, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_juego1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_juego1ActionPerformed
               try {

            URI uri = new URI("https://www.cokogames.com/sound-memory-match/play/");

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

            URI uri = new URI("https://www.cokitos.com/sonidos-de-la-granja/play/");

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
            java.util.logging.Logger.getLogger(JuegoAuditivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoAuditivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoAuditivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoAuditivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoAuditivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_juego1;
    private javax.swing.JButton jButton_juego2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
