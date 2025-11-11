
package br.ucb.graspmvc.view;

import br.ucb.graspmvc.controller.OrderController;
import br.ucb.graspmvc.model.Order;

import java.util.Scanner;

/**
 * VIEW: MenuView
 * Responsável por interagir com o usuário (entrada) e delegar ações ao Controller.
 * Sem lógica de negócio aqui (apenas IO e navegação do menu).
 */
public class MenuView {

    private final OrderController controller = new OrderController();
    private final ConsoleView consoleView = new ConsoleView();

    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==== SISTEMA DE PEDIDOS (MVC/GRASP) ====");
            System.out.println("1) Criar pedido demo");
            System.out.println("2) Sair");
            System.out.print(">> ");
            String opt = sc.nextLine();

            switch (opt) {
                case "1" -> {
                    Order order = controller.createDemoOrder();
                    consoleView.printOrderSummary(order);
                }
                case "2" -> {
                    System.out.println("Encerrando...");
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
            System.out.println();
        }
    }
}
