package ventanas;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

public class Auditivo extends javax.swing.JFrame {


    public Auditivo() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(640, 480);
        setTitle("AUDITIVO");
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

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_regresa = new javax.swing.JButton();
        jButton_mate = new javax.swing.JButton();
        jButton_lectura = new javax.swing.JButton();
        jButton_habla = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setText("Matematicas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setText("Lectura");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("Habla");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jButton_regresa.setBackground(new java.awt.Color(214, 184, 232));
        jButton_regresa.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton_regresa.setText("Regresa");
        jButton_regresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_regresaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_regresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 200, 25));

        jButton_mate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mate.png"))); // NOI18N
        jButton_mate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_mateActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_mate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 100, 100));

        jButton_lectura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros.png"))); // NOI18N
        jButton_lectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lecturaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_lectura, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 100, 100));

        jButton_habla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/habla.png"))); // NOI18N
        jButton_habla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hablaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_habla, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 100, 100));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("Auditivo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 80, -1, -1));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/paperAuditivo.png"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_hablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hablaActionPerformed
        JuegoAuditivo n = new JuegoAuditivo();
        n.setVisible(true);
    }//GEN-LAST:event_jButton_hablaActionPerformed

    private void jButton_regresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_regresaActionPerformed
       Botones n = new Botones();
       n.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton_regresaActionPerformed

    private void jButton_lecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lecturaActionPerformed
        JuegoAuditivo2 n = new JuegoAuditivo2();
        n.setVisible(true);
    }//GEN-LAST:event_jButton_lecturaActionPerformed

    private void jButton_mateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_mateActionPerformed
        JuegoAuditivo3 n = new JuegoAuditivo3();
        n.setVisible(true);
    }//GEN-LAST:event_jButton_mateActionPerformed

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
            java.util.logging.Logger.getLogger(Auditivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Auditivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Auditivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Auditivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Auditivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_habla;
    private javax.swing.JButton jButton_lectura;
    private javax.swing.JButton jButton_mate;
    private javax.swing.JButton jButton_regresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
