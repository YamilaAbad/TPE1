package Mesa;

import Pedido.Pedido;

import java.util.ArrayList;

public class Mesa {
   private ArrayList<Pedido> pedidos;

   public Mesa(){
      pedidos= new ArrayList<Pedido>();
   }

   public void addPedidoMesa (Pedido p){
      pedidos.add(p);
   }

}
