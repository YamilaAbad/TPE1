package pedido;

import comida.Comida;
import condicion.EstacionDeTrabajo;
import condicion.PorcentajeAplicado;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Comida> comidas;
    private int mesa;
    private String mozo;
    private double costoTotal;

    public Pedido(int mesa, String mozo) {
        this.mesa = mesa;
        this.mozo = mozo;
        comidas= new ArrayList<Comida>();
    }

    public void addPedido (Comida c){
            comidas.add(c);
    }

    public int getMesa() {
        return mesa;
    }

    public String getMozo() {
        return mozo;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    //calcula el costo total SIN el porcentaje que se le aplica a cada plato
    public double setCostoTotal() {
       double total=0;
       for (Comida c: comidas){
           total= total+c.getPrecio();
       }
       return total;
    }

    public double totalCuenta(PorcentajeAplicado porcentaje ){
        double totalAplicado=0,porcentajequeda,valorcomida;
        for(Comida c: comidas){
           porcentajequeda = porcentaje.aplicar(c);
           valorcomida = c.getPrecio()+porcentajequeda;
            totalAplicado= totalAplicado+valorcomida;

        }
        return totalAplicado;

    }

    public ArrayList<Comida> BusquedaDeEstacion(EstacionDeTrabajo condicion){
        ArrayList<Comida> listaEstaciones = new ArrayList<Comida>();

        for(Comida c: comidas){
            if(condicion.cumple(c)){
                listaEstaciones.add(c);
            }
        }
        return listaEstaciones;
    }



    @Override
    public String toString() {
        return "Pedido de mesa n°" + mesa + ", " + "Mozo que atendió: " + mozo;
    }


}
