package misiones;

public class Mision {

    private String nombre;
    private String descripcion;
    private TipoHabilidad habilidadRequerida;

    public Mision(String nombre, String descripcion, TipoHabilidad habilidadRequerida) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.habilidadRequerida = habilidadRequerida;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public TipoHabilidad getHabilidadRequerida() {
        return habilidadRequerida;
    }

    @Override
    public String toString() {
        return "Mision: " + nombre +
                "\nDescripcion: " + descripcion +
                "\nHabilidad requerida: " + habilidadRequerida;
    }
}