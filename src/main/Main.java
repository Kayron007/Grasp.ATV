package br.ucb.grasp;

import br.ucb.grasp.controller.OrderController;

/**
 * Main – ponto de entrada da aplicação.
 * Aplica GRASP (Controller): delega o caso de uso "realizar pedido" ao OrderController.
 */
public class Main {
    public static void main(String[] args) {
        OrderController controller = new OrderController();
        controller.demo();
    }
}

//Organização