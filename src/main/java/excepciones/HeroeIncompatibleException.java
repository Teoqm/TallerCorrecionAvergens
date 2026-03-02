package excepciones;

/**
 * Excepción personalizada que se lanza cuando un héroe
 * no cumple con los requisitos necesarios para ejecutar
 * una misión específica.
 * <p>
 * Esta excepción permite manejar de forma controlada los
 * casos en los que un héroe no posee la habilidad requerida
 * para determinada misión.
 * </p>
 * <p>
 * Forma parte del mecanismo de validación del sistema de
 * misiones, reforzando el principio de responsabilidad única
 * y el manejo adecuado de errores.
 * </p>
 *
 * @author Juan Jose Morales
 * @version 1.0
 */
public class HeroeIncompatibleException extends Exception {

    /**
     * Construye una nueva excepción con el mensaje
     * descriptivo del error.
     *
     * @param mensaje descripción del motivo por el cual
     *                el héroe no es compatible con la misión
     */
    public HeroeIncompatibleException(String mensaje) {
        super(mensaje);
    }

}