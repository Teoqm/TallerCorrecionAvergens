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
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
     
        
     /*
      *
        SistemaAsignacion sistema = new SistemaAsignacion();

        // =========================
        // CREACIÓN DE HÉROES
        // =========================

        SpiderMan spider = new SpiderMan("spiderman");
        IronMan ironman = new IronMan("Iron Man");
        AcuaMan acuaMan = new AcuaMan("Acuaman");
        Hulk hulk = new Hulk("Hulk");
        Superman superman = new Superman("Super Man");
        Thor thor = new Thor("Thor");

        // =========================
        // CREACIÓN DE MISIONES
        // =========================

        MisionTreparMuros trepar = new MisionTreparMuros();
        MisionControlaFuego fuego = new MisionControlaFuego();
        MisionSigilo sigilo = new MisionSigilo();
        MisionAcuatica acuatica = new MisionAcuatica();
        MisionVolar volar = new MisionVolar();
        TelegramNotifier notifier = new TelegramNotifier();

        // Mensaje simple
        notifier.enviarMensaje("\nAsignando misiones...\n");


        // =========================
        // ASIGNACIÓN DE MISIONES
        // =========================

        sistema.asignarMision(ironman, trepar);
        sistema.asignarMision(spider, trepar);
        sistema.asignarMision(ironman, fuego);
        sistema.asignarMision(thor, sigilo);
        sistema.asignarMision(thor, volar);
        sistema.asignarMision(hulk, trepar);
        sistema.asignarMision(acuaMan, acuatica);
        sistema.asignarMision(superman, volar);
        sistema.asignarMision(superman, acuatica);

        */
     
     
        PantallaInicio inter = new PantallaInicio();
        
        inter.setTitle("Avengers");


        inter.setLocationRelativeTo(null);
        inter.setVisible(true);
     
     
    }

}