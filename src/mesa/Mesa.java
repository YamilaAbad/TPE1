package mesa;

import pedido.Pedido;

import java.util.ArrayList;

public class Mesa {
   private ArrayList<Pedido> pedidos;

   public ArrayList<Pedido> getPedidos() {
      return pedidos;
   }

   public Mesa(){
      pedidos= new ArrayList<Pedido>();
   }
   public void addPedidoMesa (Pedido p) {
      pedidos.add(p);
   }

}
