package misiones;

import excepciones.HeroeIncompatibleException;
import habilidades.Iacuatica;
import heroes.Heroe;
import notificaciones.TelegramNotifier;

/**
 * Clase que representa una misión que requiere la habilidad
 * acuática para poder ser ejecutada.
 * <p>
 * Implementa la interfaz {@code IMision} y valida si el héroe
 * proporcionado posee la habilidad {@code Iacuatica}.
 * Si el héroe no implementa dicha interfaz, se lanza una
 * {@code HeroeIncompatibleException}.
 * </p>
 *
 * @author Juan Jose Morales
 * @version 1.0
 */
public class MisionAcuatica implements IMision {

    TelegramNotifier notifier = new TelegramNotifier();
    /**
     * Ejecuta la misión acuática con el héroe recibido.
     * <p>
     * Se verifica si el héroe implementa la interfaz {@code Iacuatica}.
     * En caso contrario, se genera una excepción indicando que el héroe
     * es incompatible con la misión.
     * </p>
     *
     * @param heroe Héroe que intentará ejecutar la misión
     * @throws HeroeIncompatibleException
     *         Se lanza cuando el héroe no posee la habilidad acuática
     */
    @Override
    public void ejecutar(Heroe heroe)
            throws HeroeIncompatibleException {

        // Verifica si el héroe NO tiene la habilidad acuática
        if (!(heroe instanceof Iacuatica)) {


            notifier.enviarMensaje(heroe.getNombre() + " Heroe incompatible con mision acuatica\n");

            // Lanza excepción por incompatibilidad
            throw new HeroeIncompatibleException(
                    heroe.getNombre() + " Heroe incompatible con mision acuatica\n");

        }



        // Si el héroe posee la habilidad, ejecuta la acción
        System.out.println(


                heroe.getNombre()
                        + " es acuatico");


        notifier.enviarMensaje(

                heroe.getNombre()
                        + " es acuatico");
    }
}