package misiones;

/**
 * Representa una misión dentro del sistema.
 *
 * Cada misión tiene un nombre y una habilidad específica requerida
 * para poder ser realizada por un héroe.
 *
 * La habilidad requerida permite verificar si un héroe tiene las
 * capacidades necesarias para completar la misión.
 *
 * @author mateo
 */
public class Mision {

    private String nombre;
    private TipoHabilidad habilidadRequerida;

    /**
     * Constructor de la clase Mision.
     *
     * Inicializa una misión con su nombre y la habilidad requerida
     * para poder realizarla.
     *
     * @param nombre nombre de la misión
     * @param habilidadRequerida habilidad necesaria para completar la misión
     */
    public Mision(String nombre, TipoHabilidad habilidadRequerida) {
        this.nombre = nombre;
        this.habilidadRequerida = habilidadRequerida;
    }

    /**
     * Obtiene el nombre de la misión.
     *
     * @return nombre de la misión
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la habilidad requerida para realizar la misión.
     *
     * @return habilidad requerida para la misión
     */
    public TipoHabilidad getHabilidadRequerida() {
        return habilidadRequerida;
    }

    /**
     * Devuelve una representación en texto de la misión,
     * incluyendo su nombre y la habilidad requerida.
     *
     * @return información de la misión en formato de texto
     */
    @Override
    public String toString() {
        return "Mision: " + nombre +
                "\nHabilidad requerida: " + habilidadRequerida;
    }
}