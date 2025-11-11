package br.ucb.grasp.controller;

import br.ucb.grasp.domain.Customer;
import br.ucb.grasp.domain.Product;
import br.ucb.grasp.domain.Order;
import br.ucb.grasp.service.OrderService;

/**
 * GRASP: Controller
 * - Centraliza o caso de uso "criar pedido e adicionar itens".
 * - Evita lógica de negócio na camada de interface.
 */
public class OrderController {

    private final OrderService orderService = new OrderService();

    public void demo() {
        Customer c = new Customer(1L, "Cliente Demo");
        Product p1 = new Product(100L, "Café 500g", 24.90);
        Product p2 = new Product(101L, "Filtro de Papel", 7.50);

        Order order = orderService.createOrder(c);
        orderService.addItem(order, p1, 2);
        orderService.addItem(order, p2, 3);
        orderService.save(order);

        System.out.println("=== RESUMO DO PEDIDO ===");
        System.out.println("Cliente: " + order.getCustomer().name());
        order.getItems().forEach(i ->
            System.out.printf("- %s x%d -> R$ %.2f%n", i.getProduct().name(), i.getQuantity(), i.getSubtotal())
        );
        System.out.printf("TOTAL: R$ %.2f%n", order.getTotal());
    }
}
