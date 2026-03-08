/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import heroes.AcuaMan;
import heroes.Heroe;
import heroes.Hulk;
import heroes.IronMan;
import heroes.SpiderMan;
import heroes.SuperMan;
import heroes.Thor;
import java.util.ArrayList;

/**
 *
 * @author mateo
 */
public class GestorDeHeroes {
    
    
    //se crea un lista de herores para que guarde lo heroes creados 
    private ArrayList<Heroe> heroes = new ArrayList<>();

    public GestorDeHeroes() {
    }
    
    
    
    public void crearNuevoHeroe(String tipoHeroe, String nombreNew ){
    
    switch (tipoHeroe) {

            case "AcuaMan":
                System.out.println("Creando AcuaMan: " + nombreNew);
                
                AcuaMan acuaManNew = new AcuaMan(nombreNew);
                heroes.add(acuaManNew);
                break;

            case "Hulk":
                System.out.println("Creando Hulk: " + nombreNew);
                
                Hulk hulkNew = new Hulk(nombreNew);
                
                heroes.add(hulkNew);
                
                break;

            case "IronMan":
                System.out.println("Creando IroMan: " + nombreNew);
                
                IronMan iroMan = new IronMan(nombreNew);
                
                heroes.add(iroMan);
                break;

            case "SpiderMan":
                System.out.println("Creando SpiderMan: " + nombreNew);
                
                SpiderMan spiderNew = new SpiderMan(nombreNew);
                
                heroes.add(spiderNew);
                break;

            case "Superman":
                System.out.println("Creando Superman: " + nombreNew);
                
                SuperMan superNew = new SuperMan(nombreNew);
                
                heroes.add(superNew);
                
                
                break;

            case "Thor":
                System.out.println("Creando Thor: " + nombreNew);
                
                Thor thorNew = new Thor(nombreNew); 
                heroes.add(thorNew);
                break;

            default:
                System.out.println("Opción incorrecta");
                break;
    
    
    
    }
    
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

            for(Heroe h : this.heroes){

                if(h.getNombre().equalsIgnoreCase(nombreNew)){
                    return true; // Está repetido
                }
            }

            return false; // No está repetido
        }
    
    
    
    public StringBuilder imprimirTexto(){
    
            // se va crea un cilo que tiene el objetivo de ver todos lo heroes y gusdarlos 
        //en un string para que se imprima en JT_Texto
        
        
        // Crear un StringBuilder para acumular texto
        StringBuilder texto = new StringBuilder();

        int numero = 0;

        // Recorrer la lista de héroes
        for (Heroe heroe : this.heroes) {

            texto.append(">")
                 .append(numero + 1)
                 .append(": ")
                 .append(heroe.getNombre())
                 .append(" [")
                 .append(heroe.getTipo())
                 .append("]\n");

            numero++;
        }
    
        return texto;
    }
    public ArrayList<Heroe> getHeroes() {
        return heroes;
    }
    
}
