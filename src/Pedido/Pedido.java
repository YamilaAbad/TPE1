package Pedido;

import Comida.Comida;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Comida> comidas;
    private int mesa;
    private String mozo;
    private double costoTotal;

    public Pedido(int mesa, String mozo, double costoTotal) {
        this.mesa = mesa;
        this.mozo = mozo;
        this.costoTotal = costoTotal;
        ArrayList<Comida> comidas= new ArrayList<>();
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

    //REVISAR SI ES NECESARIO DEJARLO!
    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }


}
