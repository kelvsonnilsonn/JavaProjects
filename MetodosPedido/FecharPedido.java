package Projetos.Restaurante.MetodosPedido;

import java.util.List;

public class CalcularTotal {
    float total = 0;
    
    for(PedidoStruct pedido : pedidoList){
        total += pedido.getProductValue() * pedido.getProductQuantity();
    }
    return total;
}
