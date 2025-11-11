
package br.ucb.graspmvc.service;

import br.ucb.graspmvc.model.Customer;
import br.ucb.graspmvc.model.Order;
import br.ucb.graspmvc.model.Product;
import br.ucb.graspmvc.repo.InMemoryDatabase;

/**
 * SERVICE: OrderService
 * GRASP Low Coupling + High Cohesion
 * - Coordena operações de caso de uso relacionadas a pedidos.
 * - Encapsula acesso ao repositório (infra) mantendo o domínio limpo.
 */
public class OrderService {

    private final InMemoryDatabase db = InMemoryDatabase.getInstance();

    public Order createOrder(Customer customer) {
        long newId = db.nextOrderId();
        Order order = new Order(newId, customer);
        db.attach(order);
        return order;
    }

    public void addItem(Order order, Product product, int quantity) {
        order.addItem(product, quantity);
    }

    public void save(Order order) {
        db.persist(order);
    }
}
