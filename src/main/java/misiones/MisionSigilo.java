package misiones;

import excepciones.HeroeIncompatibleException;
import habilidades.ISigilo;
import heroes.Heroe;
import notificaciones.TelegramNotifier;

/**
 * Representa una misión que requiere la habilidad de sigilo.
 * <p>
 * Esta clase valida si el héroe asignado implementa la interfaz
 * {@link ISigilo}. En caso contrario, se envía una notificación
 * y se lanza una {@link HeroeIncompatibleException}.
 * </p>
 * <p>
 * Integra un sistema de notificación mediante {@link TelegramNotifier}
 * para informar el resultado de la ejecución de la misión.
 * </p>
 *
 * @author Juan Jose Morales
 * @version 2.0
 */
public class MisionSigilo implements IMision {

    /**
     * Servicio de notificación utilizado para informar
     * el estado de la misión.
     */
    private TelegramNotifier notifier = new TelegramNotifier();

    /**
     * Ejecuta la misión de sigilo con el héroe proporcionado.
     *
     * @param heroe héroe que intentará ejecutar la misión
     * @throws HeroeIncompatibleException
     *         si el héroe no implementa {@link ISigilo}
     */
    @Override
    public void ejecutar(Heroe heroe)
            throws HeroeIncompatibleException {

        // Verifica si el héroe NO tiene la habilidad requerida
        if (!(heroe instanceof ISigilo)) {

            String mensaje = heroe.getNombre()
                    + " Heroe incompatible con mision de sigilo";

            notifier.enviarMensaje(mensaje);

            throw new HeroeIncompatibleException(mensaje);
        }

        // Si el héroe tiene la habilidad, ejecuta la acción
        String mensajeExito = heroe.getNombre()
                + " es sigiloso";

        System.out.println(mensajeExito);

        notifier.enviarMensaje(mensajeExito);
    }
}