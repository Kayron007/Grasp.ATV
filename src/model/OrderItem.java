package br.ucb.grasp.domain;

/**
 * GRASP: Creator + Information Expert
 * - É criado pela Order.
 * - Sabe calcular seu próprio subtotal.
 */
public class OrderItem {
    private final Product product;
    private final int quantity;

    OrderItem(Product product, int quantity) {
        if (quantity <= 0) throw new IllegalArgumentException("Quantidade deve ser > 0");
        this.product = product;
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return product.price() * quantity;
    }

    public Product getProduct() { return product; }

    public int getQuantity() { return quantity; }
}