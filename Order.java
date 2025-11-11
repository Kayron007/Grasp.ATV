package br.ucb.grasp.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * GRASP: Creator + Information Expert
 * - Cria e gerencia seus itens.
 * - Calcula o total.
 */
public class Order {
    private final Long id;
    private final Customer customer;
    private final List<OrderItem> items = new ArrayList<>();

    public Order(Long id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public void addItem(Product product, int quantity) {
        items.add(new OrderItem(product, quantity));
    }

    public double getTotal() {
        return items.stream().mapToDouble(OrderItem::getSubtotal).sum();
    }

    public Long getId() { return id; }

    public Customer getCustomer() { return customer; }

    public List<OrderItem> getItems() { return Collections.unmodifiableList(items); }
}
