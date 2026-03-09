package misiones;

/**
 * Enumeración que representa los diferentes tipos de habilidades
 * que un héroe puede poseer.
 *
 * Estas habilidades se utilizan para determinar si un héroe
 * puede realizar una misión determinada.
 *
 * Cada misión requiere una habilidad específica y el sistema
 * verifica si el héroe dispone de ella.
 *
 * @author mateo
 */
public enum TipoHabilidad {

    /** Habilidad que permite al héroe desenvolverse en el agua. */
    ACUATICA,

    /** Habilidad que permite al héroe controlar o manipular el fuego. */
    CONTROLARFUEGO,

    /** Habilidad que permite al héroe trepar o escalar paredes. */
    TREPARMUROS,

    /** Habilidad que permite al héroe volar. */
    VOLAR,

    /** Habilidad que permite al héroe actuar con sigilo o sin ser detectado. */
    SIGILO
}