package habilidades;

/**
 * Interfaz que define la habilidad de sigilo.
 * <p>
 * Toda clase que implemente esta interfaz adquiere
 * la capacidad de realizar acciones de manera discreta
 * o silenciosa.
 * </p>
 * <p>
 * Esta interfaz permite aplicar el principio de
 * segregación de interfaces, asegurando que solo
 * los héroes que posean esta habilidad la implementen.
 * </p>
 *
 * @author Mateo Quintero
 * @version 1.0
 */
public interface Isigilo {

    /**
     * Ejecuta la acción de sigilo.
     * <p>
     * La clase que implemente esta interfaz debe definir
     * el comportamiento específico relacionado con
     * habilidades sigilosas.
     * </p>
     */
    void sigilo();
}