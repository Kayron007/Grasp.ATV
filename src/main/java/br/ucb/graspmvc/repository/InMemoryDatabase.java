
package br.ucb.graspmvc.repo;

import br.ucb.graspmvc.model.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Infra: InMemoryDatabase
 * - Armazena dados em memória (mock) para simplificar o exemplo.
 * - Mantém baixo acoplamento com o domínio: domínio ignora como os dados são salvos.
 */
public class InMemoryDatabase {

    private static final InMemoryDatabase INSTANCE = new InMemoryDatabase();

    private final AtomicLong orderSeq = new AtomicLong(1L);
    private final Map<Long, Order> orders = new HashMap<>();

    private InMemoryDatabase() {}

    public static InMemoryDatabase getInstance() {
        return INSTANCE;
    }

    public long nextOrderId() {
        return orderSeq.getAndIncrement();
    }

    public void attach(Order order) {
        orders.put(order.getId(), order);
    }

    public void persist(Order order) {
        orders.put(order.getId(), order);
    }

    public Order findOrderById(Long id) {
        return orders.get(id);
    }
}
