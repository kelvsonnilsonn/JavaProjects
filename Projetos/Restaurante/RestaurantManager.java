package Projetos.Restaurante;

import java.util.Scanner;

import Projetos.Restaurante.Classes.Pedido; 

public class RestaurantManager {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        Pedido start = new Pedido(leitor);

        start.menu();
    }
}
