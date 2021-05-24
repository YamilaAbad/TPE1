package palacio;

import comida.Comida;
import condicion.*;
import mesa.Mesa;
import pedido.Pedido;

import java.util.ArrayList;

public class Palacio {
     ArrayList<Mesa> mesas;

    public Palacio(){
        mesas = new ArrayList<Mesa>();

    }

    public void addMesa(Mesa m){
        mesas.add(m);
    }




    public static void main(String[] args) {
        Palacio palacio = new Palacio();
        Mesa m1 = new Mesa();
        Pedido p1 = new Pedido(1, "Carlos");
        Comida c1 = new Comida("Carpaccio", "Ensalada", "solo", 230.00, 15, 54);
        Comida c2 = new Comida("Margarita", "Pizza", "Horno", 187.00, 35, 180);
        Comida c3 = new Comida("Benedict", "Huevo", "Frito", 50.00, 9, 150);
        palacio.addMesa(m1);
        m1.addPedidoMesa(p1);
        p1.addPedido(c1);
        p1.addPedido(c2);
        p1.addPedido(c3);


        Mesa m2 = new Mesa();
        Pedido p2 = new Pedido(2, "Horacio");
        Comida c4 = new Comida("Carpaccio", "Ensalada", "solo", 230.00, 15, 54);
        Comida c5 = new Comida("Margarita", "Pizza", "Horno", 187.00, 35, 180);
        Comida c6 = new Comida("Benedict", "Huevo", "Frito", 50.00, 9, 150);
        palacio.addMesa(m2);
        m2.addPedidoMesa(p2);
        p2.addPedido(c4);
        p2.addPedido(c5);
        p2.addPedido(c6);


        EstacionDeTrabajo comidasMenoresA = new EstacionTemporal(30);
        EstacionDeTrabajo comidasPorModo = new EstacionModoDePreparacion("Frito");
        EstacionDeTrabajo haceptanTodo = new EstacionSaleConFritas();
        EstacionDeTrabajo ComidasPorTipo = new EstacionPorTipo("Ensalada");

        PorcentajeAplicado porPropina = new Porcentaje(10);
        PorcentajeAplicado porDiaAgitado = new Porcentaje(32);
        PorcentajeAplicado porPlatoFrances = new Porcentaje(55);

        System.out.println(m1.getPedidos());
        System.out.println(p1.BusquedaDeEstacion(comidasMenoresA));
        System.out.println("El total del pedido sumó: $"+p1.totalCuenta(porDiaAgitado)); //no se si este bien este system

        System.out.println(m2.getPedidos());
        System.out.println(p2.BusquedaDeEstacion(comidasPorModo));
        System.out.println("El total del pedido sumo: $"+p1.totalCuenta(porPlatoFrances)); //no se si este bien este system
    }
}
