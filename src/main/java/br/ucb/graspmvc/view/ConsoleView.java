
package br.ucb.graspmvc.view;

import br.ucb.graspmvc.model.Order;

/**
 * VIEW: ConsoleView
 * Responsável apenas por EXIBIR informações no console.
 * Mantém a View separada das camadas de domínio/serviço/controle.
 */
public class ConsoleView {

    public void printOrderSummary(Order order) {
        System.out.println("=== RESUMO DO PEDIDO ===");
        System.out.println("Cliente: " + order.getCustomer().name());
        order.getItems().forEach(i ->
            System.out.printf("- %s x%d -> R$ %.2f%n", i.getProduct().name(), i.getQuantity(), i.getSubtotal())
        );
        System.out.printf("TOTAL: R$ %.2f%n", order.getTotal());
    }
}
