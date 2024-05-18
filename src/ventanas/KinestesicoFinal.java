package ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;



/**
 *
 * @author williamcasillas
 */
public class KinestesicoFinal extends javax.swing.JFrame {

    /**
     * Creates new form Kinestesico
     */
    public KinestesicoFinal() {
        initComponents();
          setLocationRelativeTo(null);
        setResizable(false);
        setSize(714, 500);
        setTitle("KINESTESICO INFORMACION");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        this.repaint();


    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_juego = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();
        texto_2 = new javax.swing.JLabel();
        tex = new javax.swing.JLabel();
        testo_4 = new javax.swing.JLabel();
        tex_5 = new javax.swing.JLabel();
        tex_6 = new javax.swing.JLabel();
        tex_8 = new javax.swing.JLabel();
        fondo_1 = new javax.swing.JLabel();

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
        getContentPane().add(jButton_juego, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 200, 25));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("Kinestesico");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        texto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        texto.setText("El aprendizaje kinestésico es un estilo de aprendizaje en el cual las personas aprenden ");
        getContentPane().add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        texto_2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        texto_2.setText("mejor cuando están activamente involucradas en el proceso a través del movimiento ");
        getContentPane().add(texto_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        tex.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tex.setText("físico, las manos y la manipulación directa de objetos. Este tipo de aprendizaje se centra ");
        getContentPane().add(tex, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        testo_4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        testo_4.setText("en la experiencia práctica y sensorial. ");
        getContentPane().add(testo_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        tex_5.setText("1. Juegos de roles: Permite a los estudiantes actuar como diferentes personajes o situaciones para entender conceptos  ");
        getContentPane().add(tex_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        tex_6.setText("2. Experimentos científicos: Realiza experimentos prácticos que permitan a los estudiantes manipular materiales.");
        getContentPane().add(tex_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, 30));

        tex_8.setText("3. Juegos de construcción: Usa bloques, piezas de Lego u otros materiales para construir modelos que imaginen.");
        getContentPane().add(tex_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 590, -1));

        fondo_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tipoAprendizaje.png"))); // NOI18N
        getContentPane().add(fondo_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_juegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_juegoActionPerformed
     Kinestesico n = new Kinestesico();
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
            java.util.logging.Logger.getLogger(Kinestesico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kinestesico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kinestesico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kinestesico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KinestesicoFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo_1;
    private javax.swing.JButton jButton_juego;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel testo_4;
    private javax.swing.JLabel tex;
    private javax.swing.JLabel tex_5;
    private javax.swing.JLabel tex_6;
    private javax.swing.JLabel tex_8;
    private javax.swing.JLabel texto;
    private javax.swing.JLabel texto_2;
    // End of variables declaration//GEN-END:variables
}
