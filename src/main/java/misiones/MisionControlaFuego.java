package misiones;

import excepciones.HeroeIncompatibleException;
import habilidades.IcontrolaFuego;
import heroes.Heroe;
import notificaciones.TelegramNotifier;

/**
 * Clase que representa una misión que requiere la habilidad
 * de controlar fuego para poder ser ejecutada.
 * <p>
 * Implementa la interfaz {@code IMision} y valida si el héroe
 * proporcionado posee la habilidad {@code IcontrolaFuego}.
 * Si el héroe no implementa dicha interfaz, se lanza una
 * {@code HeroeIncompatibleException}.
 * </p>
 *
 * @author Juan Jose Morales
 * @version 1.0
 */
public class MisionControlaFuego implements IMision {
    TelegramNotifier notifier = new TelegramNotifier();
    /**
     * Ejecuta la misión de controlar fuego con el héroe recibido.
     * <p>
     * Se verifica si el héroe implementa la interfaz {@code IcontrolaFuego}.
     * En caso de no cumplir con esta condición, se genera una excepción
     * indicando que el héroe es incompatible con la misión.
     * </p>
     *
     * @param heroe Héroe que intentará ejecutar la misión
     * @throws HeroeIncompatibleException
     *         Se lanza cuando el héroe no posee la habilidad de controlar fuego
     */
    @Override
    public void ejecutar(Heroe heroe)
            throws HeroeIncompatibleException {

        // Verifica si el héroe NO tiene la habilidad de controlar fuego
        if (!(heroe instanceof IcontrolaFuego)) {

            // Lanza excepción por incompatibilidad


            notifier.enviarMensaje(heroe.getNombre() + " Heroe incompatible con mision de controlar fuego\n");

            throw new HeroeIncompatibleException(
                    heroe.getNombre() + " Heroe incompatible con mision de controlar fuego\n");
        }

        // Si el héroe posee la habilidad, ejecuta la acción
        System.out.println(
                heroe.getNombre()
                        + " controla el fuego");

        notifier.enviarMensaje(heroe.getNombre()
                + " controla el fuego");






    }
}