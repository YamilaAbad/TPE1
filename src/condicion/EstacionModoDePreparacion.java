package condicion;

import comida.Comida;

public class EstacionModoDePreparacion implements EstacionDeTrabajo{
    private String modo;

    public EstacionModoDePreparacion(String modo){
        this.modo=modo;
    }
    @Override
    public boolean cumple(Comida comida) {
        return comida.getModoPreparacion().equals(modo);
    }
}
