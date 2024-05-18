package ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

public class AuditivoFinal extends javax.swing.JFrame {

    public AuditivoFinal() {
        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);
        setSize(716, 500);
        setTitle("AUDITIVO INFORMACION");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        cambiarIcono();
        this.repaint();
    }

    private void cambiarIcono() {
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/LOGO.png"));
        Image imagen = icono.getImage();

        this.setIconImage(imagen);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_juego = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        texto4 = new javax.swing.JLabel();
        tex_1 = new javax.swing.JLabel();
        tex_2 = new javax.swing.JLabel();
        tex_3 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_juego.setBackground(new java.awt.Color(204, 204, 255));
        jButton_juego.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton_juego.setText("Juegos");
        jButton_juego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_juegoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_juego, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 200, 30));

        jLabel1.setFont(new java.awt.Font("Vogue", 0, 36)); // NOI18N
        jLabel1.setText("Auditivo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 160, 50));

        texto1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        texto1.setText("El aprendizaje auditivo es un método de enseñanza y adquisición de conocimientos que se ");
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        texto2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        texto2.setText("basa en el uso del oído para procesar y retener información. Este enfoque se apoya en el ");
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        texto3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        texto3.setText("hecho de que algunas personas comprenden y recuerdan mejor la información cuando la ");
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        texto4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        texto4.setText("escuchan, en lugar de leerla o verla. ");
        getContentPane().add(texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        tex_1.setText("1.Memory:Juega una versión auditiva del juego de memoria, donde los jugadores deben recordar y repetir secuencias");
        getContentPane().add(tex_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 690, 40));

        tex_2.setText("2. Juegos de ritmo: Juegos que requieren que los jugadores sigan un ritmo o una secuencia de sonidos.");
        getContentPane().add(tex_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        tex_3.setText("3. Adivina el sonido: Un juego donde los jugadores deben adivinar qué objeto o animal está haciendo un sonido.");
        getContentPane().add(tex_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tipoAprendizaje.png"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_juegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_juegoActionPerformed
        Auditivo n = new Auditivo();
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_juegoActionPerformed

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
                new AuditivoFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_juego;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel tex_1;
    private javax.swing.JLabel tex_2;
    private javax.swing.JLabel tex_3;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    // End of variables declaration//GEN-END:variables
}
