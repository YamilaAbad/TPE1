package condicion;

import comida.Comida;

public class EstacionSaleConFritas implements EstacionDeTrabajo{

    @Override
    public boolean cumple(Comida comida) {
        return true;
    }
}
