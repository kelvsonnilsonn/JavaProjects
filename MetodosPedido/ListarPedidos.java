package Projetos.Restaurante.MetodosPedido;

import java.util.List;

import Projetos.Restaurante.Estruturas.PedidoStruct;

public class ListarPedidos {
    public static void listarPedidos(List<PedidoStruct> pedidoList){
        for(PedidoStruct pedido : pedidoList){
            System.out.println(pedido);
        }
    }
}
