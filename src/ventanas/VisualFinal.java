package ventanas;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

public class VisualFinal extends javax.swing.JFrame {

 
    public VisualFinal() { 
        
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(715, 530);
        setTitle("VISUAL INFORMACION");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.repaint();

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_juego = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();
        texto_1 = new javax.swing.JLabel();
        texto_2 = new javax.swing.JLabel();
        texx_3 = new javax.swing.JLabel();
        tex = new javax.swing.JLabel();
        txc = new javax.swing.JLabel();
        tesa = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_juego.setBackground(new java.awt.Color(204, 204, 255));
        jButton_juego.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton_juego.setText("Juegos");
        jButton_juego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_juegoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_juego, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 200, 25));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("Visual");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        texto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        texto.setText("El aprendizaje visual es una forma de aprender que utiliza imágenes,  gráficos, videos y otros elementos");
        getContentPane().add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 680, 30));

        texto_1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        texto_1.setText("visuales para ayudarnos a  entender y recordar la información. Es como cuando vemos una película o   ");
        getContentPane().add(texto_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        texto_2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        texto_2.setText("miramos una imagen, es más fácil captar y retener la información que nos  están mostrando que si ");
        getContentPane().add(texto_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 670, 20));

        texx_3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        texx_3.setText("solo leyéramos un texto.");
        getContentPane().add(texx_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        tex.setText("1. Puzzles y Rompecabezas: Ayudan a desarrollar habilidades de resolución de problemas y reconocimiento de patrones.");
        getContentPane().add(tex, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 30));

        txc.setText("2. Juegos de Memoria (Memory Matching Games): Estos juegos fortalecen la memoria visual y la concentración.");
        getContentPane().add(txc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        tesa.setText("3. Juegos de Construcción: Ayudan a mejorar la coordinación mano-ojo y la percepción espacial. ");
        getContentPane().add(tesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tipoAprendizaje.png"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_juegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_juegoActionPerformed
        Visual n = new Visual();
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
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_juego;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel tesa;
    private javax.swing.JLabel tex;
    private javax.swing.JLabel texto;
    private javax.swing.JLabel texto_1;
    private javax.swing.JLabel texto_2;
    private javax.swing.JLabel texx_3;
    private javax.swing.JLabel txc;
    // End of variables declaration//GEN-END:variables
}
