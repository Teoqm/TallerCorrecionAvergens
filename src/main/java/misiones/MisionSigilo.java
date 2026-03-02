package misiones;

import excepciones.HeroeIncompatibleException;
import habilidades.Isigilo;
import heroes.Heroe;
import notificaciones.TelegramNotifier;

/**
 * Clase que representa una misión que requiere la habilidad
 * de sigilo para poder ser ejecutada.
 * <p>
 * Implementa la interfaz {@code IMision} y valida si el héroe
 * recibido posee la habilidad {@code Isigilo}. Si el héroe no
 * implementa dicha interfaz, se lanza una excepción indicando
 * que es incompatible con la misión.
 * </p>
 *
 * @author Juan Jose Morales
 * @version 1.0
 */
public class MisionSigilo implements IMision {
    TelegramNotifier notifier = new TelegramNotifier();
    /**
     * Ejecuta la misión de sigilo con el héroe proporcionado.
     * <p>
     * Se verifica si el héroe implementa la interfaz {@code Isigilo}.
     * En caso contrario, se lanza una excepción
     * {@code HeroeIncompatibleException}.
     * </p>
     *
     * @param heroe Héroe que intentará ejecutar la misión
     * @throws HeroeIncompatibleException
     *         Se lanza cuando el héroe no posee la habilidad de sigilo
     */
    @Override
    public void ejecutar(Heroe heroe)
            throws HeroeIncompatibleException {

        // Verifica si el héroe NO tiene la habilidad de sigilo
        if (!(heroe instanceof Isigilo)) {



            notifier.enviarMensaje(heroe.getNombre() + " Heroe incompatible con mision de sigilo\n");

            // Lanza excepción por incompatibilidad
            throw new HeroeIncompatibleException(
                    heroe.getNombre() + " Heroe incompatible con mision de sigilo\n");
        }

        // Si el héroe tiene la habilidad, ejecuta la acción
        System.out.println(
                heroe.getNombre()
                        + " es sigiloso");

        notifier.enviarMensaje(heroe.getNombre()
                + " es sigiloso");

    }
}