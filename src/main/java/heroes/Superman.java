package heroes;

import habilidades.ISigilo;

/**
 * Clase que representa al héroe Superman.
 * <p>
 * Superman hereda de la clase {@code Heroe} y posee la habilidad
 * de sigilo, ya que implementa la interfaz {@code Isigilo}.
 * </p>
 * <p>
 * Esto le permite participar en misiones que requieran
 * habilidades relacionadas con el sigilo.
 * </p>
 *
 * @author Mateo Quintero
 * @version 1.0
 */
public class Superman extends Heroe implements ISigilo {

    /**
     * Constructor que crea un nuevo héroe Superman con un nombre específico.
     *
     * @param nombre Nombre del héroe
     */
    public Superman(String nombre) {
        super(nombre);
    }

    /**
     * Implementación de la habilidad de sigilo.
     * <p>
     * Muestra en consola un mensaje indicando que Superman
     * está ejecutando una acción sigilosa.
     * </p>
     */
    @Override
    public void sigilo() {
        System.out.println("yo soy " + this.getNombre() +
                " y soy sigiloso por mis super habilidades");
    }
}