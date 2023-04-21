package com.project.MainteX.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "asset")
public class AssetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    //brand = marca
    private String brand;
    private String model;
    //item = rubro
    private String item;
    private String type;
    private Integer inventory;
    private String description;
    private boolean status;
    //acount = cantidad
    private Integer amount;
    //series = serie
    private Integer series;

    public AssetEntity() {
    }

    public AssetEntity(Long id, String name, String brand, String model,
                       String item, String type, Integer inventory, String description,
                       boolean status, Integer amount, Integer series) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.item = item;
        this.type = type;
        this.inventory = inventory;
        this.description = description;
        this.status = status;
        this.amount = amount;
        this.series = series;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "AssetEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", item='" + item + '\'' +
                ", type='" + type + '\'' +
                ", inventory=" + inventory +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", amount=" + amount +
                ", series=" + series +
                '}';
    }
}
