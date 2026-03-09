package heroes;

import habilidades.ITreparMuros;
import misiones.Mision;
import misiones.TipoHabilidad;

/**
 * Clase que representa al héroe Hulk.
 * <p>
 * Hulk hereda de la clase {@code Heroe} y posee la habilidad
 * de trepar muros, ya que implementa la interfaz
 * {@code ITreparMuros}.
 * </p>
 * <p>
 * Esto le permite participar en misiones que requieran
 * la capacidad de escalar superficies.
 * </p>
 *
 * @author Mateo Quintero
 * @version 1.0
 */
public class Hulk extends Heroe implements ITreparMuros {

    /**
     * Constructor que crea un nuevo héroe Hulk con un nombre específico.
     *
     * @param nombre Nombre del héroe
     */
    public Hulk(String nombre) {
        super(nombre,"Hulk");
    }

    /**
     * Determina si Hulk puede realizar una misión específica.
     * <p>
     * Hulk solo puede participar en misiones que requieran
     * la habilidad {@code TREPARMUROS}.
     * </p>
     *
     * @param mision misión que se desea evaluar
     * @return {@code true} si la misión requiere la habilidad de trepar muros,
     * {@code false} en caso contrario
     */
    @Override
    public boolean puedeRealizar(Mision mision) {
        return mision.getHabilidadRequerida() == TipoHabilidad.TREPARMUROS;
    }

    /**
     * Implementación de la habilidad de trepar muros.
     * <p>
     * Muestra en consola un mensaje indicando que Hulk
     * está ejecutando la acción de escalar muros.
     * </p>
     */
    @Override
    public void treparMuros() {
        System.out.println("yo soy " + this.getNombre() + " y voy a trepar muros");
    }
}