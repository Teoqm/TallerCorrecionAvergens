package heroes;

import habilidades.ISigilo;
import misiones.Mision;
import misiones.TipoHabilidad;

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
public class SuperMan extends Heroe implements ISigilo {

    /**
     * Constructor que crea un nuevo héroe Superman con un nombre específico.
     *
     * @param nombre Nombre del héroe
     */
    public SuperMan(String nombre) {
        super(nombre,"Superman");
    }

    /**
     * Determina si Superman puede realizar una misión específica.
     * <p>
     * Superman solo puede participar en misiones que requieran
     * la habilidad {@code SIGILO}.
     * </p>
     *
     * @param mision misión que se desea evaluar
     * @return {@code true} si la misión requiere sigilo,
     * {@code false} en caso contrario
     */
    @Override
    public boolean puedeRealizar(Mision mision) {
        return mision.getHabilidadRequerida() == TipoHabilidad.SIGILO;
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