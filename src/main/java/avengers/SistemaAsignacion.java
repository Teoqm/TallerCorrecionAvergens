package avengers;

import excepciones.HeroeIncompatibleException;
import heroes.Heroe;
import java.util.ArrayList;
import misiones.IMision;
import misiones.Mision;
import notificaciones.TelegramNotifier;

/**
 * Clase encargada de gestionar la asignación de misiones
 * a los diferentes héroes del sistema.
 * <p>
 * Aplica polimorfismo permitiendo que cualquier implementación
 * de {@link IMision} sea ejecutada por un objeto de tipo {@link Heroe}.
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

    
    ArrayList<Heroe> heroesUsados = new ArrayList<>();
    
    /**
     * Asigna una misión a un héroe y ejecuta la acción correspondiente.
     * <p>
     * Si el héroe no cumple con los requisitos de la misión,
     * se captura la excepción y se muestra el mensaje de error.
     * </p>
     *
     * @param heroe  héroe al que se le asignará la misión
     * @param mision misión que se desea ejecutar
     */

    
    public void asignarMision(Heroe heroe, IMision mision) {

        try {

            mision.ejecutar(heroe);
            TelegramNotifier notifier = new TelegramNotifier();

            // Mensaje simple
            notifier.enviarMensaje("Mision realizada correctamente\n");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
    
   /* ese asignar misiones es muy diferentes al anteriar ya que se el primeor es paar 
      un solo heroe y pero este nuevo sirve para asignar misiones a diferes heroes 
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
                        .append(" -> No hay héroe dispo3nible\n");
            }
        }
    
        return resultado.toString();
    }
}