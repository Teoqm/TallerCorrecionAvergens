package heroes;

import misiones.Mision;

/**
 * Clase abstracta que representa un héroe dentro del sistema.
 * <p>
 * Un héroe posee un nombre y un tipo que define sus características.
 * Las clases que hereden de esta deberán implementar la lógica que
 * determine si el héroe puede realizar una misión específica.
 * </p>
 *
 * @author Juan Jose Morales
 * @version 1.0
 */
public abstract class Heroe {

    /**
     * Nombre del héroe.
     */
    private String nombre;

    /**
     * Tipo o especialidad del héroe.
     */
    private String tipo;

    /**
     * Constructor de la clase Heroe.
     *
     * @param nombre nombre del héroe
     * @param tipo tipo o especialidad del héroe
     */
    public Heroe(String nombre,String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;

    }

    /**
     * Obtiene el nombre del héroe.
     *
     * @return nombre del héroe
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el tipo del héroe.
     *
     * @return tipo del héroe
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Permite modificar el nombre del héroe.
     *
     * @param nombre nuevo nombre del héroe
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método abstracto que determina si el héroe
     * puede realizar una misión específica.
     * <p>
     * Cada subclase debe implementar la lógica que
     * valide la compatibilidad entre el héroe y la misión.
     * </p>
     *
     * @param mision misión que se desea evaluar
     * @return true si el héroe puede realizar la misión, false en caso contrario
     */
    public abstract boolean puedeRealizar(Mision mision);
}