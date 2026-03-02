package habilidades;

/**
 * Interfaz que define la habilidad de controlar fuego.
 * <p>
 * Toda clase que implemente esta interfaz adquiere
 * la capacidad de manipular o generar fuego como
 * parte de sus habilidades.
 * </p>
 * <p>
 * Permite aplicar el principio de segregación de interfaces,
 * garantizando que únicamente los héroes que posean esta
 * capacidad implementen este comportamiento.
 * </p>
 *
 * @author Mateo Quintero
 * @version 1.0
 */
public interface IcontrolaFuego {

    /**
     * Ejecuta la acción de controlar fuego.
     * <p>
     * La clase que implemente esta interfaz debe definir
     * el comportamiento específico relacionado con el
     * control del fuego.
     * </p>
     */
    void controlaFuego();

}