
package br.ucb.graspmvc.controller;

import br.ucb.graspmvc.model.Customer;
import br.ucb.graspmvc.model.Order;
import br.ucb.graspmvc.model.Product;
import br.ucb.graspmvc.service.OrderService;

/**
 * OrderController
 * Camada: CONTROLLER (MVC)
 *
 * GRASP Controller:
 *  - Recebe a intenção da View e coordena o caso de uso "criar pedido e adicionar itens".
 *  - Não implementa regra de domínio; apenas orquestra chamadas ao serviço.
 * Benefícios: Alta coesão (coordenação) e baixo acoplamento (não conhece detalhes de persistência).
 */
public class OrderController {

    private final OrderService orderService = new OrderService();

    /**
     * Cria um pedido DEMO para simplificar a execução pelo console.
     * A View invoca esse método e depois renderiza o resultado.
     */
    public Order createDemoOrder() {
        Customer c = new Customer(1L, "Cliente Demo");
        Product p1 = new Product(100L, "Café 500g", 24.90);
        Product p2 = new Product(101L, "Filtro de Papel", 7.50);

        Order order = orderService.createOrder(c);
        orderService.addItem(order, p1, 2);
        orderService.addItem(order, p2, 3);
        orderService.save(order);

        return order;
    }
}
