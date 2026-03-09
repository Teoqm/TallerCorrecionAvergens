package org.mateo;

import heroes.*;
import interfaz.InterfazPrincipal;
import interfaz.PantallaInicio;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import misiones.*;
import notificaciones.TelegramNotifier;

/**
 * Clase principal que ejecuta el sistema de asignación de misiones.
 * <p>
 * En esta clase se crean las instancias de los héroes y las misiones,
 * y se realizan diferentes asignaciones para demostrar el funcionamiento
 * del sistema.
 * </p>
 * <p>
 * Permite evidenciar:
 * <ul>
 *     <li>Polimorfismo mediante la interfaz IMision</li>
 *     <li>Uso de herencia con la clase abstracta Heroe</li>
 *     <li>Aplicación de interfaces para definir habilidades</li>
 *     <li>Manejo de excepciones personalizadas</li>
 * </ul>
 * </p>
 *
 * @author Mateo Quintero
 * @version 1.0
 */
public class Main {

    /**
     * Método principal que inicia la ejecución del programa.
     * <p>
     * Este método crea la pantalla inicial del sistema
     * {@link PantallaInicio} y la muestra al usuario.
     * </p>
     * <p>
     * Desde esta pantalla se puede acceder a la interfaz principal
     * del sistema para gestionar los héroes y las misiones.
     * </p>
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
<<<<<<< HEAD
     
        
     /*
      *
        *==== SISTEMA ANTIGUO =====
        SistemaAsignacion sistema = new SistemaAsignacion();
=======
>>>>>>> d5a0ed233b678a82e295f4768b94bd7baefcf175

        // Creación de la pantalla inicial del sistema
        PantallaInicio inter = new PantallaInicio();

        // Asigna el título de la ventana
        inter.setTitle("Avengers");

        // Centra la ventana en la pantalla
        inter.setLocationRelativeTo(null);

        // Hace visible la interfaz gráfica
        inter.setVisible(true);

    }

}