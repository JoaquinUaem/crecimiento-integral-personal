package ventanas;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Formulario extends javax.swing.JFrame {

    private ButtonGroup[] grupos;
    private String[][] respuestas;

    public Formulario() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(700, 530);
        setTitle("FORMULARIO");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        cambiarIcono();
        grupos = new ButtonGroup[6];
        respuestas = new String[6][3];

        // Add radio buttons to groups and set responses
        grupos[0] = new ButtonGroup();
        grupos[0].add(jRadioButton1);
        grupos[0].add(jRadioButton2);
        grupos[0].add(jRadioButton3);
        respuestas[0][0] = "Dibujar o ver videos ";
        respuestas[0][1] = "Escuchar musica o historias ";
        respuestas[0][2] = "Escuchar musica o historias ";

        grupos[1] = new ButtonGroup();
        grupos[1].add(jRadioButton4);
        grupos[1].add(jRadioButton5);
        grupos[1].add(jRadioButton6);
        respuestas[1][0] = "Con ayuda de videos o imagenes";
        respuestas[1][1] = "Que alguien le hable del tema";
        respuestas[1][2] = "Con practicas y manualidades";

        grupos[2] = new ButtonGroup();
        grupos[2].add(jRadioButton7);
        grupos[2].add(jRadioButton8);
        grupos[2].add(jRadioButton9);
        respuestas[2][0] = "Ver el pizarrón y material de apoyo";
        respuestas[2][1] = "Escuchando a su profesor ";
        respuestas[2][2] = "Hacer actividades de practica";

        grupos[3] = new ButtonGroup();
        grupos[3].add(jRadioButton10);
        grupos[3].add(jRadioButton11);
        grupos[3].add(jRadioButton12);
        respuestas[3][0] = "Juegos con imagenes";
        respuestas[3][1] = "Que tengan musica de fondo";
        respuestas[3][2] = "Deportes o juegos de construcción";

        grupos[4] = new ButtonGroup();
        grupos[4].add(jRadioButton13);
        grupos[4].add(jRadioButton14);
        grupos[4].add(jRadioButton15);
        respuestas[4][0] = "Usando fotos de referencia";
        respuestas[4][1] = "En voz alta";
        respuestas[4][2] = "Con apoyo de titeres o marionetas";

        grupos[5] = new ButtonGroup();
        grupos[5].add(jRadioButton16);
        grupos[5].add(jRadioButton17);
        grupos[5].add(jRadioButton18);
        respuestas[5][0] = "Con diagramas y diapositivas";
        respuestas[5][1] = "Repasando en voz alta";
        respuestas[5][2] = "Haciendo actividades ";
    }

    private void cambiarIcono() {
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/LOGO.png"));
        Image imagen = icono.getImage();

        this.setIconImage(imagen);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_calcular = new javax.swing.JButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_calcular.setBackground(new java.awt.Color(204, 204, 255));
        jButton_calcular.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_calcular.setText("Calcular");
        jButton_calcular.setBorder(null);
        jButton_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_calcularActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 200, 25));

        jRadioButton18.setText("Haciendo actividades ");
        jRadioButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, -1, -1));

        jRadioButton17.setText("Repasando en voz alta");
        jRadioButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        jRadioButton16.setText("Con diagramas y diapositivas");
        jRadioButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        jRadioButton15.setText("Con apoyo de titeres o marionetas");
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, -1));

        jRadioButton14.setText("En voz alta");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));

        jRadioButton13.setText("Usando fotos de referencia");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jRadioButton12.setText("Deportes o juegos de construcción");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        jRadioButton11.setText("Que tengan musica de fondo");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        jRadioButton10.setText("Juegos con imagenes");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jRadioButton9.setText("Hacer actividades de practica");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        jRadioButton8.setText("Escuchando a su profesor ");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        jRadioButton7.setText("Ver el pizarrón y material de apoyo");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jRadioButton6.setText("Con practicas y manualidades");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        jRadioButton5.setText("Que alguien le hable del tema");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jRadioButton4.setText("Con ayuda de videos o imagenes");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jRadioButton3.setText("Jugar al aire libre");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        jRadioButton2.setText("Escuchar musica o historias ");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        jRadioButton1.setText("Dibujar o ver videos ");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Cuando su hijo se prepara para una prueba, ¿Cómo prefiere estudiar? ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Cuando su hijo cuenta una historia, ¿Cómo prefiere hacerlo? ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 355, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("¿Qué tipo de juegos disfruta más?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Cundo su hijo esta en clase, ¿Que lo apoya a recordar?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Su hijo, ¿Como disfruta aprender?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("¿Qué le gusta hacer a tu hijo en su tiempo libre?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/formulario.png"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton16ActionPerformed

    private void jRadioButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton17ActionPerformed

    private void jRadioButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton18ActionPerformed

    private void jButton_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_calcularActionPerformed
        boolean allAnswered = true;

        for (ButtonGroup group : grupos) {
            if (group.getSelection() == null) {
                allAnswered = false;
                break;
            }
        }

        if (!allAnswered) {
            JOptionPane.showMessageDialog(this, "Por favor responda todas las preguntas.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int visualCount = 0;
        int auditivoCount = 0;
        int kinestesicoCount = 0;

        for (int i = 0; i < grupos.length; i++) {
            ButtonGroup group = grupos[i];
            for (Enumeration<AbstractButton> buttons = group.getElements(); buttons.hasMoreElements();) {
                AbstractButton button = buttons.nextElement();
                if (button.isSelected()) {
                    if (respuestas[i][0].equals(button.getText())) {
                        visualCount++;
                    } else if (respuestas[i][1].equals(button.getText())) {
                        auditivoCount++;
                    } else if (respuestas[i][2].equals(button.getText())) {
                        kinestesicoCount++;
                    }
                }
            }
        }

        int total = visualCount + auditivoCount + kinestesicoCount;
        if (total > 0) {
            int visualPercentage = (visualCount * 100) / total;
            int auditivoPercentage = (auditivoCount * 100) / total;
            int kinestesicoPercentage = (kinestesicoCount * 100) / total;

           /* JOptionPane.showMessageDialog(null,
                    "Visual: " + visualPercentage + "%\n"
                    + "Auditivo: " + auditivoPercentage + "%\n"
                    + "Kinestésico: " + kinestesicoPercentage + "%");*/

            Graficas graficas = new Graficas(visualPercentage, auditivoPercentage, kinestesicoPercentage);
            graficas.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton_calcularActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_calcular;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables

}
