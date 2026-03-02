package habilidades;

/**
 * Interfaz que define la habilidad de trepar muros.
 * <p>
 * Toda clase que implemente esta interfaz adquiere
 * la capacidad de escalar superficies verticales.
 * </p>
 * <p>
 * Se utiliza para aplicar el principio de segregación
 * de interfaces, permitiendo que solo los héroes que
 * posean esta habilidad la implementen.
 * </p>
 *
 * @author Mateo Quintero
 * @version 1.0
 */
public interface ItreparMuros {

    /**
     * Ejecuta la acción de trepar muros.
     * <p>
     * La clase que implemente esta interfaz debe definir
     * el comportamiento específico de esta habilidad.
     * </p>
     */
    void treparMuros();
}