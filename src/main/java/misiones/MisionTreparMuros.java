package misiones;

import heroes.Heroe;
import habilidades.ItreparMuros;
import excepciones.HeroeIncompatibleException;
import notificaciones.TelegramNotifier;

/**
 * Clase que representa una misión en la cual el héroe
 * debe poseer la habilidad de trepar muros para poder ejecutarla.
 * <p>
 * Implementa la interfaz {@code IMision} y valida si el héroe
 * recibido implementa la interfaz {@code ItreparMuros}.
 * Si el héroe no posee dicha habilidad, se lanza una
 * {@code HeroeIncompatibleException}.
 * </p>
 *
 * @author Juan Jose Morales
 * @version 1.0
 */
public class MisionTreparMuros implements IMision {


    TelegramNotifier notifier = new TelegramNotifier();
    /**
     * Ejecuta la misión de trepar muros con el héroe proporcionado.
     * <p>
     * Se verifica si el héroe implementa la interfaz {@code ItreparMuros}.
     * Si no la implementa, se genera una excepción indicando que el héroe
     * no es compatible con esta misión.
     * </p>
     *
     * @param heroe Héroe que intentará ejecutar la misión
     * @throws HeroeIncompatibleException
     *         Se lanza cuando el héroe no tiene la habilidad de trepar muros
     */
    @Override
    public void ejecutar(Heroe heroe)
            throws HeroeIncompatibleException {

        // Verifica si el héroe NO tiene la habilidad de trepar muros
        if (!(heroe instanceof ItreparMuros)) {


            notifier.enviarMensaje(heroe.getNombre() + " Heroe incompatible con mision de trepar muros\n");

            // Lanza excepción por incompatibilidad
            throw new HeroeIncompatibleException(heroe.getNombre() + " Heroe incompatible con mision de trepar muros\n");
        }

        // Si el héroe tiene la habilidad, ejecuta la acción
        System.out.println(
                heroe.getNombre()
                        + " trepa muros");

        notifier.enviarMensaje(heroe.getNombre()
                + " trepa muros");

    }

}