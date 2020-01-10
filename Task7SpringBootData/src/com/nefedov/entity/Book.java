package com.nefedov.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book")
    private int id;

    @Column(name = "name_book")
    private String name;

    @Column(name = "costs")
    private BigDecimal costs;

    @Column(name = "warehouse")
    private String warehouse;

    @Column(name = "quantity")
    private int quantity;

    public Book() {
    }

    public Book(String name, BigDecimal costs, String warehouse, int quantity) {
        this.name = name;
        this.costs = costs;
        this.warehouse = warehouse;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCosts() {
        return costs;
    }

    public void setCosts(BigDecimal costs) {
        this.costs = costs;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", costs=" + costs +
                ", warehouse='" + warehouse + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
