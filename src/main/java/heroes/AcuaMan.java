package heroes;

import habilidades.IAcuatica;

/**
 * Clase que representa al héroe AcuaMan.
 * <p>
 * AcuaMan hereda de la clase {@code Heroe} y posee la habilidad
 * acuática, ya que implementa la interfaz {@code Iacuatica}.
 * </p>
 * <p>
 * Esto le permite participar en misiones que requieran
 * control o dominio en entornos acuáticos.
 * </p>
 *
 * @author Mateo Quintero
 * @version 1.0
 */
public class AcuaMan extends Heroe implements IAcuatica {

    /**
     * Constructor que crea un nuevo héroe AcuaMan con un nombre específico.
     *
     * @param nombre Nombre del héroe
     */
    public AcuaMan(String nombre) {
        super(nombre);
    }

    /**
     * Implementación de la habilidad acuática.
     * <p>
     * Muestra en consola un mensaje indicando que AcuaMan
     * está utilizando sus poderes acuáticos.
     * </p>
     */
    @Override
    public void acuatica() {
        System.out.println("yo soy " + this.getNombre() +
                " y controlo los mares con poderes acuáticos");
    }
}