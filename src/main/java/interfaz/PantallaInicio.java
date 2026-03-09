/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

/**
 * Ventana inicial del sistema Avengers.
 * <p>
 * Esta pantalla funciona como menú de inicio de la aplicación.
 * Muestra el título del sistema, una imagen de fondo y un botón
 * para comenzar la aplicación.
 * </p>
 * <p>
 * Además reproduce música de fondo mientras la ventana está activa
 * y detiene el sonido automáticamente cuando la ventana se cierra.
 * </p>
 *
 * @author mateo
 * @version 1.0
 */
public class PantallaInicio extends javax.swing.JFrame {


    /**
     * Clip de audio utilizado para reproducir la música de fondo.
     */
    private Clip clip;

    /**
     * Constructor de la pantalla de inicio.
     * <p>
     * Inicializa los componentes gráficos, configura propiedades
     * de la ventana como tamaño, posición e icono, y comienza
     * la reproducción de la música de fondo.
     * </p>
     */
    public PantallaInicio() {
        initComponents();

        System.out.println(getClass().getResource("/imagenes/IconoAvengers.jpg"));
        System.out.println("holaaa");
        this.setSize(970,600);
        setResizable(false);
        this.setLocationRelativeTo(null);

        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/IconoAvengers.jpg")).getImage());

        }catch(NullPointerException e){
            System.out.println("Imagen no encontrada");
        }

        reproducirSonido();


        // Agregar el listener para detener la música cuando se cierre la ventana
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                detenerSonido();
            }
        });
    }

    /**
     * Método generado automáticamente por el editor de NetBeans
     * para inicializar los componentes de la interfaz gráfica.
     * <p>
     * Contiene la configuración de los elementos visuales como
     * botones, etiquetas y paneles.
     * </p>
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jToggleButton1.setText("COMENZAR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 270, 70));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MISION AVENGERS");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLayeredPane2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 480, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AvengersFondo.png"))); // NOI18N
        jLayeredPane2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento que se ejecuta al presionar el botón "COMENZAR".
     * <p>
     * Abre la ventana principal del sistema y la muestra
     * al usuario.
     * </p>
     *
     * @param evt evento generado al hacer clic en el botón
     */
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        InterfazPrincipal inter = new InterfazPrincipal();
        inter.setTitle("Avengers");
        inter.setSize(875,670);
        inter.setLocationRelativeTo(null);
        inter.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * Reproduce la música de fondo del menú principal.
     * <p>
     * Carga el archivo de audio ubicado en la carpeta de recursos
     * y lo reproduce en bucle continuo.
     * </p>
     */
    public void reproducirSonido() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(
                    getClass().getResource("/music/AvengersMenu.wav"));
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    /**
     * Detiene la reproducción de la música de fondo.
     * <p>
     * Se utiliza cuando la ventana se cierra para liberar
     * los recursos de audio.
     * </p>
     */
    public void detenerSonido() {
        if (clip != null) {
            clip.stop();
            clip.close();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}