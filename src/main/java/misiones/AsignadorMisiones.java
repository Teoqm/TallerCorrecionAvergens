package misiones;

import java.util.List;
import heroes.Heroe;

public class AsignadorMisiones {

    public Heroe asignarMision(Mision mision, List<Heroe> heroesDisponibles) {

        for (Heroe heroe : heroesDisponibles) {
            if (heroe.puedeRealizar(mision)) {
                return heroe;
            }
        }

        return null;
    }
}