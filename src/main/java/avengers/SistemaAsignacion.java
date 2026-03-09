package avengers;

import heroes.Heroe;
import java.util.ArrayList;

import misiones.Mision;
import notificaciones.TelegramNotifier;

/**
 * Clase encargada de gestionar la asignación de misiones
 * a los diferentes héroes del sistema.
 * <p>
 * Aplica polimorfismo permitiendo que cualquier implementación
 * de {@link Mision} sea ejecutada por un objeto de tipo {@link Heroe}.
 * </p>
 * <p>
 * También centraliza el manejo de excepciones relacionadas
 * con la incompatibilidad entre héroes y misiones e integra
 * un sistema de notificación mediante {@link TelegramNotifier}.
 * </p>
 *
 * @author Juan Jose Morales
 * @version 2.0
 */
public class SistemaAsignacion {

    /**
     * Lista que almacena los héroes que ya fueron utilizados
     * para evitar que un mismo héroe sea asignado a más de una misión.
     */
    ArrayList<Heroe> heroesUsados = new ArrayList<>();


    /**
     * Método encargado de asignar misiones a los héroes disponibles.
     * <p>
     * Recorre la lista de misiones y busca un héroe que pueda realizar
     * cada una de ellas. Si encuentra un héroe compatible que no haya
     * sido utilizado previamente, se le asigna la misión y se registra
     * en la lista de héroes usados.
     * </p>
     * <p>
     * En caso de que no exista un héroe disponible para una misión,
     * el sistema lo indicará en el resultado.
     * </p>
     *
     * @param misiones Lista de misiones que se desean asignar.
     * @param heroes Lista de héroes disponibles para realizar misiones.
     * @return Cadena de texto con el resultado de las asignaciones realizadas.
     */
    public String asignarMisionInterfaz(ArrayList<Mision> misiones , ArrayList<Heroe> heroes ){


        StringBuilder resultado = new StringBuilder();

        for (Mision m : misiones) {

            boolean asignada = false;

            for (Heroe h : heroes) {

                if (!heroesUsados.contains(h) && h.puedeRealizar(m)) {

                    resultado.append("      Misión: ")
                            .append(m.getNombre())
                            .append(" -> Asignada a: ")
                            .append(h.getNombre())
                            .append("\n");

                    heroesUsados.add(h);
                    asignada = true;
                    break;
                }
            }

            if (!asignada) {
                resultado.append("Misión: ")
                        .append(m.getNombre())
                        .append(" -> No hay heroe disponible\n");
            }
        }

        return resultado.toString();
    }
}