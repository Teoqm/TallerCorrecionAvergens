package heroes;

import misiones.Mision;

public abstract class Heroe {

    private String nombre;

    public Heroe(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract boolean puedeRealizar(Mision mision);
}