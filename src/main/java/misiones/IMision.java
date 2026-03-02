package misiones;

import heroes.Heroe;

/**
 * Interfaz que define el comportamiento general de una misión.
 * <p>
 * Toda clase que represente una misión dentro del sistema
 * debe implementar este contrato y definir la lógica del
 * método {@code ejecutar}.
 * </p>
 * <p>
 * El diseño permite aplicar polimorfismo, ya que diferentes
 * tipos de misiones pueden ser ejecutadas sobre un objeto
 * {@code Heroe} sin conocer su implementación concreta.
 * </p>
 *
 * @author Juan Jose Morales
 * @version 1.0
 */
public interface IMision {

    /**
     * Ejecuta la misión con el héroe proporcionado.
     *
     * @param heroe Héroe que intentará ejecutar la misión
     * @throws Exception Puede lanzar una excepción si el héroe
     *                   no cumple con los requisitos de la misión
     */
    void ejecutar(Heroe heroe) throws Exception;

}