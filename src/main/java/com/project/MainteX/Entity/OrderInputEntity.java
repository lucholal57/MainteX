package com.project.MainteX.Entity;

import javax.persistence.*;

@Entity
@Table(name = "order_input")
public class OrderInputEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order")
    private OrderEntity order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_input")
    private InputEntity input;

    private int quantity;

    public OrderInputEntity() {
    }

    public OrderInputEntity(Long id, OrderEntity order, InputEntity input, int quantity) {
        this.id = id;
        this.order = order;
        this.input = input;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderEntity getOrder() {
        return order;
    }

    public void setOrder(OrderEntity order) {
        this.order = order;
    }

    public InputEntity getInput() {
        return input;
    }

    public void setInput(InputEntity input) {
        this.input = input;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderInputEntity{" +
                "id=" + id +
                ", order=" + order +
                ", input=" + input +
                ", quantity=" + quantity +
                '}';
    }
}
