package misiones;

public class Mision {

    private String nombre;
    private TipoHabilidad habilidadRequerida;

    public Mision(String nombre, TipoHabilidad habilidadRequerida) {
        this.nombre = nombre;
        this.habilidadRequerida = habilidadRequerida;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoHabilidad getHabilidadRequerida() {
        return habilidadRequerida;
    }

    @Override
    public String toString() {
        return "Mision: " + nombre +
                "\nHabilidad requerida: " + habilidadRequerida;
    }
}