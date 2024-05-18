package ventanas;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;


public class Menu extends javax.swing.JFrame {

   
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(628, 440);
        setTitle("MENU");
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

        jButton_no = new javax.swing.JButton();
        jButton_si = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_no.setBackground(new java.awt.Color(255, 51, 51));
        jButton_no.setFont(new java.awt.Font("Vogue", 0, 24)); // NOI18N
        jButton_no.setText("No");
        jButton_no.setBorder(null);
        jButton_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_noActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 210, 50));

        jButton_si.setBackground(new java.awt.Color(153, 255, 51));
        jButton_si.setFont(new java.awt.Font("Vogue", 0, 24)); // NOI18N
        jButton_si.setText("Si");
        jButton_si.setBorder(null);
        jButton_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_siActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_si, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 210, 50));

        jLabel1.setFont(new java.awt.Font("Vogue", 0, 24)); // NOI18N
        jLabel1.setText("Conoces el aprendizaje de tu hijo? ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/paperMenu.png"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, 640, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_siActionPerformed
        Botones n = new Botones();
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_siActionPerformed

    private void jButton_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_noActionPerformed
        Formulario n = new Formulario();
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_noActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_no;
    private javax.swing.JButton jButton_si;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
