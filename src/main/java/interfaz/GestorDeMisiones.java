/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import java.sql.SQLOutput;
import java.util.ArrayList;
import misiones.Mision;
import misiones.TipoHabilidad;

/**
 * Clase encargada de gestionar la creación, almacenamiento
 * y consulta de las misiones dentro del sistema.
 * <p>
 * Permite registrar nuevas misiones según la habilidad requerida,
 * validar los datos ingresados y evitar la creación de misiones
 * con nombres repetidos.
 * </p>
 *
 * @author juanb
 * @version 1.0
 */
public class GestorDeMisiones {

    /**
     * Lista donde se almacenan todas las misiones creadas.
     */
    // lista donde se guardan las misiones creadas
    private ArrayList<Mision> misiones = new ArrayList<>();

    /**
     * Constructor de la clase GestorDeMisiones.
     */
    public GestorDeMisiones() {
    }

    /**
     * Crea una nueva misión y la agrega a la lista de misiones.
     * <p>
     * Dependiendo de la habilidad seleccionada, se crea una misión
     * con el tipo de habilidad correspondiente definido en
     * {@link TipoHabilidad}.
     * </p>
     *
     * @param nombreMision nombre de la misión que se desea crear
     * @param habilidad habilidad requerida para realizar la misión
     */
    public void crearNuevaMision(String nombreMision, String habilidad){

        switch (habilidad) {
            case "Acuatica":
                System.out.println("Creando mision: "+nombreMision);

                Mision nuevaMisionA = new Mision(nombreMision, TipoHabilidad.ACUATICA);
                misiones.add(nuevaMisionA);
                break;

            case "Sigilo":
                System.out.println("Creando mision: "+nombreMision);

                Mision nuevaMisionS = new Mision(nombreMision, TipoHabilidad.SIGILO);
                misiones.add(nuevaMisionS);
                break;

            case "Trepar Muros":
                System.out.println("Creando mision: "+nombreMision);

                Mision nuevaMisionTM = new Mision(nombreMision, TipoHabilidad.TREPARMUROS);
                misiones.add(nuevaMisionTM);
                break;

            case "Control FUego":
                System.out.println("Creando mision: "+nombreMision);

                Mision nuevaMisionCF = new Mision(nombreMision, TipoHabilidad.CONTROLARFUEGO);
                misiones.add(nuevaMisionCF);
                break;

            case "Volar":
                System.out.println("Creando mision: "+nombreMision);

                Mision nuevaMisionV = new Mision(nombreMision, TipoHabilidad.VOLAR);
                misiones.add(nuevaMisionV);
                break;

            default:
                System.out.println("Opción No valida");
                break;
        }

        //Mision nuevaMision = new Mision(nombreMision, habilidad);

        //misiones.add(nuevaMision);
    }

    /**
     * Obtiene la lista de misiones registradas.
     *
     * @return lista de objetos de tipo {@link Mision}
     */
    public ArrayList<Mision> getMisiones(){
        return misiones;
    }

    /**
     * Genera un texto con la lista de misiones registradas.
     * <p>
     * Este texto se utiliza generalmente para mostrar las misiones
     * en componentes de interfaz gráfica.
     * </p>
     *
     * @return StringBuilder con el listado de misiones
     */
    public StringBuilder imprimirMisiones(){

        StringBuilder texto = new StringBuilder();

        int numero = 0;

        for(Mision m : misiones){

            texto.append(">")
                    .append(numero + 1)
                    .append(": ")
                    .append(m.getNombre())
                    /*.append(" [")
                    //.append(m.getHabilidadRequerida().getSimpleName())
                    .append("]\n");*/;

            numero++;
        }

        return texto;
    }

    /**
     * Valida que el texto ingresado no esté vacío o nulo.
     *
     * @param nombreNew texto que se desea validar
     * @return true si el texto es válido, false si está vacío o es nulo
     */
    public boolean ValidarTexto(String nombreNew){

        // Validar que no esté vacío
        if (nombreNew == null || nombreNew.isEmpty()) {
            System.out.println("Debe ingresar un nombre");
            return false;
        }

        return true;


    }

    /**
     * Verifica si el nombre de una misión ya existe en la lista.
     *
     * @param nombreNew nombre de la misión a verificar
     * @return true si el nombre ya está registrado, false si no existe
     */
    public boolean nombreRepetido(String nombreNew){

        for(Mision h : this.misiones){

            if(h.getNombre().equalsIgnoreCase(nombreNew)){
                return true; // Está repetido
            }
        }

        return false; // No está repetido
    }

}