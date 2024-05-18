package ventanas;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

public class Acceso extends javax.swing.JFrame {

    public Acceso() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(749, 483);
        setTitle("ACCESO");
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

        jButton_acceder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_acceder.setFont(new java.awt.Font("Vogue", 0, 48)); // NOI18N
        jButton_acceder.setForeground(new java.awt.Color(255, 255, 255));
        jButton_acceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/manoLogo.png"))); // NOI18N
        jButton_acceder.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_accederActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 160, 70));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("“Somos una organización que apoya el crecimiento personal de los niños a temprana edad” ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Vogue", 0, 24)); // NOI18N
        jLabel2.setText("Crecimiento Integral de la Persona");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("“En CIP somos unos fieles creyentes que la base de la humanidad son los mas jovenes”");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 600, 60));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio.png"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_accederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_accederActionPerformed
        Menu n = new Menu();
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_accederActionPerformed

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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_acceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
