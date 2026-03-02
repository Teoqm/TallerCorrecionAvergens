package misiones;

import excepciones.HeroeIncompatibleException;
import habilidades.IAcuatica;
import heroes.Heroe;
import notificaciones.TelegramNotifier;

/**
 * Representa una misión que requiere la habilidad acuática.
 * <p>
 * Esta clase valida si el héroe asignado implementa la interfaz
 * {@link IAcuatica}. En caso contrario, se envía una notificación
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
public class MisionAcuatica implements IMision {

    /**
     * Servicio de notificación utilizado para informar
     * el estado de la misión.
     */
    private TelegramNotifier notifier = new TelegramNotifier();

    /**
     * Ejecuta la misión acuática con el héroe proporcionado.
     *
     * @param heroe héroe que intentará ejecutar la misión
     * @throws HeroeIncompatibleException
     *         si el héroe no implementa {@link IAcuatica}
     */
    @Override
    public void ejecutar(Heroe heroe)
            throws HeroeIncompatibleException {

        // Verifica si el héroe NO tiene la habilidad requerida
        if (!(heroe instanceof IAcuatica)) {

            String mensaje = heroe.getNombre()
                    + " Heroe incompatible con mision acuatica";

            notifier.enviarMensaje(mensaje);

            throw new HeroeIncompatibleException(mensaje);
        }

        // Si el héroe posee la habilidad, ejecuta la acción
        String mensajeExito = heroe.getNombre()
                + " es acuatico";

        System.out.println(mensajeExito);

        notifier.enviarMensaje(mensajeExito);
    }
}