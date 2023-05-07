package com.project.MainteX.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "inputs")
public class InputEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String description;
    private Integer amount; // amount = cantidad
    private String supplier; // supplier = proveedor
    private  Double price;
    @OneToMany(mappedBy = "input")
    private Set<OrderInputEntity> orderInputs = new HashSet<>();


    public InputEntity() {
    }

    public InputEntity(Long id, String name, String description, Integer amount, String supplier, Double price, Set<OrderInputEntity> orderInputs) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.supplier = supplier;
        this.price = price;
        this.orderInputs = orderInputs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Set<OrderInputEntity> getOrderInputs() {
        return orderInputs;
    }

    public void setOrderInputs(Set<OrderInputEntity> orderInputs) {
        this.orderInputs = orderInputs;
    }

    @Override
    public String toString() {
        return "InputEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", supplier='" + supplier + '\'' +
                ", price=" + price +
                ", orderInputs=" + orderInputs +
                '}';
    }
}
