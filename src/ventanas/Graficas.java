package ventanas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Graficas extends javax.swing.JFrame {

    private int visualPercentage;
    private int auditivoPercentage;
    private int kinestesicoPercentage;

    public Graficas(int visualPercentage, int auditivoPercentage, int kinestesicoPercentage) {
        initComponents();

        this.visualPercentage = visualPercentage;
        this.auditivoPercentage = auditivoPercentage;
        this.kinestesicoPercentage = kinestesicoPercentage;
        setPreferredSize(new Dimension(400, 300));

        setLocationRelativeTo(null);
        setResizable(false);
        setSize(500, 370);
        setTitle("GRAFICAS");
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

        jButton_info = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_info.setBackground(new java.awt.Color(214, 184, 232));
        jButton_info.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton_info.setText("Más información");
        jButton_info.setBorder(null);
        jButton_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_infoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 200, 25));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grafica.png"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_infoActionPerformed
        if (visualPercentage > auditivoPercentage && visualPercentage > kinestesicoPercentage) {
            VisualFinal n = new VisualFinal();
            n.setVisible(true);
            this.dispose();
        } else if (auditivoPercentage > kinestesicoPercentage) {
            AuditivoFinal n = new AuditivoFinal();
            n.setVisible(true);
            this.dispose();
        } else {
              KinestesicoFinal n = new KinestesicoFinal();
              n.setVisible(true);
              this.dispose();
        }
        
        this.dispose();

    }//GEN-LAST:event_jButton_infoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficas(40, 30, 30).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_info;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables

    public void paint(Graphics g) {
        super.paint(g);

        int totalH = getHeight();
        int totalW = getWidth();

        int barWidth = totalW / 3;

        int visual = (visualPercentage * totalH) / 100;
        int auditivo = (auditivoPercentage * totalH) / 100;
        int kinestesico = (kinestesicoPercentage * totalH) / 100;

        g.setColor(new Color(235, 145, 111));
        g.fillRect(100, 150, visual, 40);
        g.drawString("Visual", 10, 175);

        g.setColor(new Color(215, 64, 215));
        g.fillRect(100, 200, auditivo, 40);
        g.drawString("Auditivo", 10, 225);

        g.setColor(new Color(220, 239, 94));
        g.fillRect(100, 250, kinestesico, 40);
        g.drawString("Kinestesico", 10, 275);

    }
}
