package com.project.MainteX.Entity;
import javax.persistence.*;
//technician = tecnico
@Entity
@Table(name = "technicians")
public class TechnicianEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String record; //record = legajo
    private String category;

    public TechnicianEntity() {
    }

    public TechnicianEntity(Long id, String name, String record, String category) {
        this.id = id;
        this.name = name;
        this.record = record;
        this.category = category;
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

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "TechnicianEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", record='" + record + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
