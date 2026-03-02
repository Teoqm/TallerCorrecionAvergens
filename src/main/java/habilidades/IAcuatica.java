package habilidades;

/**
 * Interfaz que define la habilidad acuática.
 * <p>
 * Toda clase que implemente esta interfaz adquiere
 * la capacidad de realizar acciones relacionadas
 * con el control o dominio del entorno acuático.
 * </p>
 * <p>
 * Esta interfaz permite aplicar el principio de
 * segregación de interfaces, asegurando que solo
 * los héroes con habilidades acuáticas implementen
 * este comportamiento.
 * </p>
 *
 * @author Mateo Quintero
 * @version 1.0
 */
public interface IAcuatica {

    /**
     * Ejecuta la acción relacionada con la habilidad acuática.
     * <p>
     * La clase que implemente esta interfaz debe definir
     * el comportamiento específico de sus poderes acuáticos.
     * </p>
     */
    void acuatica();

}