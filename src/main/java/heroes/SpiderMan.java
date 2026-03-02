package heroes;

import habilidades.ItreparMuros;

/**
 * Clase que representa al héroe SpiderMan.
 * <p>
 * SpiderMan hereda de la clase {@code Heroe} y posee la habilidad
 * de trepar muros, ya que implementa la interfaz {@code ItreparMuros}.
 * </p>
 * <p>
 * Esto le permite participar en misiones que requieran
 * la capacidad de escalar superficies verticales.
 * </p>
 *
 * @author Mateo Quintero
 * @version 1.0
 */
public class SpiderMan extends Heroe implements ItreparMuros {

    /**
     * Constructor que crea un nuevo héroe SpiderMan con un nombre específico.
     *
     * @param nombre Nombre del héroe
     */
    public SpiderMan(String nombre) {
        super(nombre);
    }

    /**
     * Implementación de la habilidad de trepar muros.
     * <p>
     * Muestra en consola un mensaje indicando que SpiderMan
     * está ejecutando la acción de escalar muros.
     * </p>
     */
    @Override
    public void treparMuros() {
        System.out.println("yo soy " + this.getNombre() + " voy a trepar muros");
    }
}