package br.ucb.grasp.service;

import br.ucb.grasp.domain.Customer;
import br.ucb.grasp.domain.Order;
import br.ucb.grasp.domain.Product;
import br.ucb.grasp.repo.InMemoryDatabase;

/**
 * GRASP: Low Coupling + High Cohesion
 * - Faz a ponte entre controller e domínio.
 * - Sem regras de infraestrutura aqui.
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