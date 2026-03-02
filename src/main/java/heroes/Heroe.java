package heroes;

/**
 * Clase abstracta que representa un héroe dentro del sistema.
 * <p>
 * Define las características básicas comunes a todos los héroes,
 * como su nombre. Esta clase sirve como base para que las clases
 * concretas (por ejemplo, Thor, Hulk, SpiderMan, etc.) hereden
 * sus atributos y comportamientos generales.
 * </p>
 * <p>
 * Al ser una clase abstracta, no puede ser instanciada directamente.
 * Solo puede ser utilizada como clase base para otros héroes.
 * </p>
 *
 * @author Mateo Quintero
 * @version 1.0
 */
public abstract class Heroe {

    /**
     * Nombre del héroe.
     */
    private String nombre;

    /**
     * Constructor que inicializa el nombre del héroe.
     *
     * @param nombre Nombre del héroe
     */
    public Heroe(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre del héroe.
     *
     * @return Nombre actual del héroe
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del héroe.
     *
     * @param nombre Nuevo nombre del héroe
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}