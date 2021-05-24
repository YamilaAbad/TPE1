package condicion;

import comida.Comida;

public class Porcentaje implements PorcentajeAplicado{
    private double porcentaje;

    public Porcentaje(double porcentaje){
        this.porcentaje=porcentaje;
    }
    @Override
    public double aplicar(Comida comida) {
        return ((comida.getPrecio()*porcentaje)/100);
    }
}
