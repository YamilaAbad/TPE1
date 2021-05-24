package condicion;

import comida.Comida;

public class EstacionTemporal implements EstacionDeTrabajo{
    private int tiempoPreparacion;

    public EstacionTemporal(int tiempoPreparacion){
        this.tiempoPreparacion=tiempoPreparacion;
    }

    @Override
    public boolean cumple(Comida comida) {
        return comida.getTiempoPreparacion()<tiempoPreparacion;
    }
}
