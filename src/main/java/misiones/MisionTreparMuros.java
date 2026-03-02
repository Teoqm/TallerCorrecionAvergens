package misiones;

import heroes.Heroe;
import habilidades.ITreparMuros;
import excepciones.HeroeIncompatibleException;
import notificaciones.TelegramNotifier;

/**
 * Representa una misión que requiere la habilidad de trepar muros.
 * <p>
 * Esta clase valida si el héroe asignado implementa la interfaz
 * {@link ITreparMuros}. En caso contrario, se lanza una
 * {@link HeroeIncompatibleException}.
 * </p>
 * <p>
 * Además, integra un sistema de notificación mediante
 * {@link TelegramNotifier} para informar el resultado
 * de la ejecución de la misión.
 * </p>
 *
 * @author Juan Jose Morales
 * @version 2.0
 */
public class MisionTreparMuros implements IMision {

    /**
     * Servicio de notificación utilizado para informar
     * el estado de la misión.
     */
    private TelegramNotifier notifier = new TelegramNotifier();

    /**
     * Ejecuta la misión de trepar muros con el héroe proporcionado.
     * <p>
     * Si el héroe no posee la habilidad requerida,
     * se envía una notificación y se lanza una excepción.
     * </p>
     *
     * @param heroe héroe que intentará ejecutar la misión
     * @throws HeroeIncompatibleException
     *         si el héroe no implementa {@link ITreparMuros}
     */
    @Override
    public void ejecutar(Heroe heroe)
            throws HeroeIncompatibleException {

        // Verifica si el héroe NO tiene la habilidad requerida
        if (!(heroe instanceof ITreparMuros)) {

            String mensaje = heroe.getNombre()
                    + " Heroe incompatible con mision de trepar muros";

            notifier.enviarMensaje(mensaje);

            throw new HeroeIncompatibleException(mensaje);
        }

        // Si el héroe tiene la habilidad, ejecuta la acción
        String mensajeExito = heroe.getNombre()
                + " trepa muros";

        System.out.println(mensajeExito);

        notifier.enviarMensaje(mensajeExito);
    }
}