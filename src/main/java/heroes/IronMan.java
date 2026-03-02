package heroes;

import habilidades.IcontrolaFuego;

/**
 * Clase que representa al héroe IronMan.
 * <p>
 * IronMan hereda de la clase {@code Heroe} y posee la habilidad
 * de controlar fuego, ya que implementa la interfaz
 * {@code IcontrolaFuego}.
 * </p>
 * <p>
 * Esto le permite participar en misiones que requieran
 * la manipulación o control del fuego.
 * </p>
 *
 * @author Mateo Quintero
 * @version 1.0
 */
public class IronMan extends Heroe implements IcontrolaFuego {

    /**
     * Constructor que crea un nuevo héroe IronMan con un nombre específico.
     *
     * @param nombre Nombre del héroe
     */
    public IronMan(String nombre) {
        super(nombre);
    }

    /**
     * Implementación de la habilidad de controlar fuego.
     * <p>
     * Muestra en consola un mensaje indicando que IronMan
     * está ejecutando la acción de controlar fuego.
     * </p>
     */
    @Override
    public void controlaFuego() {
        System.out.println("yo soy " + this.getNombre() + " voy a controlar el fuego");
    }
}