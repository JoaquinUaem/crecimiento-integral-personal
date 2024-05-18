package ventanas;
import java.awt.Desktop;
import java.awt.Image;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

public class JuegoKin extends javax.swing.JFrame {

    public JuegoKin() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(255, 280);
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

        jButton_Juego2 = new javax.swing.JButton();
        jButton_Juego1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Juego2.setBackground(new java.awt.Color(214, 184, 232));
        jButton_Juego2.setText("Conjunto colores");
        jButton_Juego2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Juego2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Juego2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 130, 200, 30));

        jButton_Juego1.setBackground(new java.awt.Color(214, 184, 232));
        jButton_Juego1.setText("Aritmetica");
        jButton_Juego1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Juego1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Juego1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 80, 200, 30));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("de matematicas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoJ.png"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 255, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Juego1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Juego1ActionPerformed
        try {

            URI uri = new URI("https://poki.com/es/g/arithmetica");

            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(uri);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton_Juego1ActionPerformed

    private void jButton_Juego2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Juego2ActionPerformed
        try {

            URI uri = new URI("https://poki.com/es/g/water-color-sort");

            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(uri);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton_Juego2ActionPerformed

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
            java.util.logging.Logger.getLogger(JuegoKin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoKin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoKin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoKin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoKin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Juego1;
    private javax.swing.JButton jButton_Juego2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
