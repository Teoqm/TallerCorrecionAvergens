package habilidades;

/**
 * Interfaz que define la habilidad de volar.
 * <p>
 * Toda clase que implemente esta interfaz adquiere
 * la capacidad de ejecutar la acción de volar.
 * </p>
 * <p>
 * Se utiliza para aplicar el principio de segregación
 * de interfaces y permitir que solo los héroes que
 * realmente puedan volar implementen esta habilidad.
 * </p>
 *
 * @author Mateo Quintero
 * @version 1.0
 */
public interface IVolar {

    /**
     * Ejecuta la acción de volar.
     * <p>
     * La clase que implemente esta interfaz debe definir
     * el comportamiento específico de esta habilidad.
     * </p>
     */
    void volar();
}