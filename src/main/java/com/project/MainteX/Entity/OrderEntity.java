package com.project.MainteX.Entity;

import com.project.MainteX.Enum.FrequencyEnum;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

//order = orden de trabajo
@Entity
@Table(name = "ordes")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_asset")
    private AssetEntity id_asset;
    @OneToMany(mappedBy = "order")
    private Set<OrderInputEntity> orderInputs = new HashSet<>();
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_technician")
    private TechnicianEntity id_technician;
    private String description;
    private String type;
    @Enumerated(EnumType.STRING)
    private FrequencyEnum frequency;
    private Date dateFinish;

    public OrderEntity() {
    }

    public OrderEntity(Long id, AssetEntity id_asset, Set<OrderInputEntity> orderInputs, TechnicianEntity id_technician, String description, String type, FrequencyEnum frequency, Date dateFinish) {
        this.id = id;
        this.id_asset = id_asset;
        this.orderInputs = orderInputs;
        this.id_technician = id_technician;
        this.description = description;
        this.type = type;
        this.frequency = frequency;
        this.dateFinish = dateFinish;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AssetEntity getId_asset() {
        return id_asset;
    }

    public void setId_asset(AssetEntity id_asset) {
        this.id_asset = id_asset;
    }

    public Set<OrderInputEntity> getOrderInputs() {
        return orderInputs;
    }

    public void setOrderInputs(Set<OrderInputEntity> orderInputs) {
        this.orderInputs = orderInputs;
    }

    public TechnicianEntity getId_technician() {
        return id_technician;
    }

    public void setId_technician(TechnicianEntity id_technician) {
        this.id_technician = id_technician;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FrequencyEnum getFrequency() {
        return frequency;
    }

    public void setFrequency(FrequencyEnum frequency) {
        this.frequency = frequency;
    }

    public Date getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(Date dateFinish) {
        this.dateFinish = dateFinish;
    }

    @Override
    public String toString() {
        return "OrderEntity{" +
                "id=" + id +
                ", id_asset=" + id_asset +
                ", orderInputs=" + orderInputs +
                ", id_technician=" + id_technician +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", frequency=" + frequency +
                ", dateFinish=" + dateFinish +
                '}';
    }
}
