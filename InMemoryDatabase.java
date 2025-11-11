package br.ucb.grasp.repo;

import br.ucb.grasp.domain.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * "Banco" em memória (mock).
 * Mantém o baixo acoplamento da aplicação.
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
