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
 * Clase encargada de gestionar la creación, almacenamiento
 * y consulta de los héroes dentro del sistema.
 * <p>
 * Permite crear nuevos héroes según su tipo, validar datos
 * de entrada como el nombre y evitar duplicados.
 * También proporciona métodos para obtener y mostrar
 * la lista de héroes registrados.
 * </p>
 *
 * @author mateo
 * @version 1.0
 */
public class GestorDeHeroes {


    /**
     * Lista que almacena todos los héroes creados en el sistema.
     */
    //se crea un lista de herores para que guarde lo heroes creados
    private ArrayList<Heroe> heroes = new ArrayList<>();

    /**
     * Constructor de la clase GestorDeHeroes.
     */
    public GestorDeHeroes() {
    }



    /**
     * Crea un nuevo héroe según el tipo especificado y lo agrega a la lista.
     * <p>
     * Dependiendo del tipo recibido, se instancia la clase correspondiente
     * (AcuaMan, Hulk, IronMan, SpiderMan, SuperMan o Thor).
     * </p>
     *
     * @param tipoHeroe tipo de héroe que se desea crear
     * @param nombreNew nombre del nuevo héroe
     */
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

    /**
     * Valida que el nombre ingresado no esté vacío o nulo.
     *
     * @param nombreNew nombre que se desea validar
     * @return true si el nombre es válido, false si está vacío o es nulo
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
     * Verifica si el nombre de un héroe ya existe en la lista.
     *
     * @param nombreNew nombre que se desea verificar
     * @return true si el nombre ya está registrado, false si no existe
     */
    public boolean nombreRepetido(String nombreNew){

        for(Heroe h : this.heroes){

            if(h.getNombre().equalsIgnoreCase(nombreNew)){
                return true; // Está repetido
            }
        }

        return false; // No está repetido
    }



    /**
     * Genera un texto con la lista de héroes registrados.
     * <p>
     * El texto incluye el número del héroe, su nombre y su tipo,
     * para ser mostrado en la interfaz gráfica.
     * </p>
     *
     * @return StringBuilder con el listado de héroes
     */
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

    /**
     * Obtiene la lista de héroes registrados en el sistema.
     *
     * @return lista de objetos de tipo Heroe
     */
    public ArrayList<Heroe> getHeroes() {
        return heroes;
    }

}