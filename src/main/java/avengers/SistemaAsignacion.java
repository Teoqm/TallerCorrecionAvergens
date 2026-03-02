package avengers;

import excepciones.HeroeIncompatibleException;
import heroes.Heroe;
import misiones.IMision;
import notificaciones.TelegramNotifier;

/**
 * Clase encargada de gestionar la asignación de misiones
 * a los diferentes héroes del sistema.
 * <p>
 * Aplica polimorfismo permitiendo que cualquier implementación
 * de {@link IMision} sea ejecutada por un objeto de tipo {@link Heroe}.
 * </p>
 * <p>
 * También centraliza el manejo de excepciones relacionadas
 * con la incompatibilidad entre héroes y misiones e integra
 * un sistema de notificación mediante {@link TelegramNotifier}.
 * </p>
 *
 * @author Juan Jose Morales
 * @version 2.0
 */
public class SistemaAsignacion {

    /**
     * Asigna una misión a un héroe y ejecuta la acción correspondiente.
     * <p>
     * Si el héroe no cumple con los requisitos de la misión,
     * se captura la excepción y se muestra el mensaje de error.
     * </p>
     *
     * @param heroe  héroe al que se le asignará la misión
     * @param mision misión que se desea ejecutar
     */
    public void asignarMision(Heroe heroe, IMision mision) {

        try {

            mision.ejecutar(heroe);
            TelegramNotifier notifier = new TelegramNotifier();

            // Mensaje simple
            notifier.enviarMensaje("Mision realizada correctamente\n");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

}