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
 *
 * @author juanb
 */
public class GestorDeMisiones {
    // lista donde se guardan las misiones creadas
    private ArrayList<Mision> misiones = new ArrayList<>();

    public GestorDeMisiones() {
    }

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

    public ArrayList<Mision> getMisiones(){
        return misiones;
    }

    public StringBuilder imprimirMisiones(){

        StringBuilder texto = new StringBuilder();

        int numero = 0;

        for(Mision m : misiones){

            texto.append(">")
                 .append(numero + 1)
                 .append(": ")
                 .append(m.getNombre())
                 .append(" [")
                 //.append(m.getHabilidadRequerida().getSimpleName())
                 .append("]\n");

            numero++;
        }

        return texto;
    }
    
    public boolean ValidarTexto(String nombreNew){
        
        // Validar que no esté vacío
        if (nombreNew == null || nombreNew.isEmpty()) {
            System.out.println("Debe ingresar un nombre");
            return false;
        }
        
        return true;
                
        
    }
    
        public boolean nombreRepetido(String nombreNew){

            for(Mision h : this.misiones){

                if(h.getNombre().equalsIgnoreCase(nombreNew)){
                    return true; // Está repetido
                }
            }

            return false; // No está repetido
        }
    
}