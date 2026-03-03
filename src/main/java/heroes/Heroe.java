package heroes;

import misiones.Mision;

public abstract class Heroe {

    private String nombre;
    private String tipo;

    public Heroe(String nombre,String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract boolean puedeRealizar(Mision mision);
}