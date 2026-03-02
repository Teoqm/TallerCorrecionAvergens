package misiones;

import excepciones.HeroeIncompatibleException;
import habilidades.IVolar;
import heroes.Heroe;
import notificaciones.TelegramNotifier;

/**
 * Representa una misión que requiere la habilidad de volar.
 *
 * <p>
 * Esta misión solo puede ser ejecutada por héroes que implementen
 * la interfaz {@link IVolar}.
 * </p>
 *
 * <p>
 * También envía una notificación mediante TelegramNotifier.
 * </p>
 *
 * @author Mateo Quintero
 * @version 1.0
 */
public class MisionVolar implements IMision {

    /**
     * Objeto encargado de enviar notificaciones.
     */
    private TelegramNotifier notifier =
            new TelegramNotifier();


    /**
     * Ejecuta la misión de volar.
     *
     * @param heroe héroe que ejecutará la misión
     *
     * @throws HeroeIncompatibleException
     * si el héroe no tiene la habilidad de volar
     */
    @Override
    public void ejecutar(Heroe heroe)
            throws HeroeIncompatibleException {

        if (!(heroe instanceof IVolar)) {

            notifier.enviarMensaje(
                    heroe.getNombre()
                            + " incompatible con misión volar");

            throw new HeroeIncompatibleException(
                    heroe.getNombre()
                            + " incompatible con misión volar");
        }

        System.out.println(
                heroe.getNombre()
                        + " está volando");

        notifier.enviarMensaje(
                heroe.getNombre()
                        + " está volando");

    }

}