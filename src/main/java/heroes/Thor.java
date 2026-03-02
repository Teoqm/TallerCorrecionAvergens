package heroes;

import habilidades.IVolar;

/**
 * Clase que representa al héroe Thor.
 * <p>
 * Thor hereda de la clase {@code Heroe} y posee la habilidad
 * de volar, ya que implementa la interfaz {@code Ivolar}.
 * </p>
 * <p>
 * Esto permite que pueda participar en misiones que requieran
 * la capacidad de vuelo.
 * </p>
 *
 * @author Mateo Quintero
 * @version 1.0
 */
public class Thor extends Heroe implements IVolar {

    /**
     * Constructor que crea un nuevo héroe Thor con un nombre específico.
     *
     * @param nombre Nombre del héroe
     */
    public Thor(String nombre) {
        super(nombre);
    }

    /**
     * Implementación de la habilidad de volar.
     * <p>
     * Muestra en consola un mensaje indicando que Thor
     * está ejecutando la acción de volar.
     * </p>
     */
    @Override
    public void volar() {
        System.out.println("yo soy " + this.getNombre() + " voy a volar");
    }

}