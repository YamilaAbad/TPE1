package condicion;

import comida.Comida;

public class EstacionPorTipo implements EstacionDeTrabajo{
    private String tipo;

    public EstacionPorTipo(String tipo){
        this.tipo=tipo;
    }
    @Override
    public boolean cumple(Comida comida) {
        return comida.getTipo().equals(tipo);
    }
}
