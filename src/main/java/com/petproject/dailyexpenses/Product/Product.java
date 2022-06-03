package com.petproject.dailyexpenses.Product;

import javax.persistence.*;

@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(
            name = "Type",
            columnDefinition = "TEXT"
    )
    String type;

    @Column(
            name = "Price",
            columnDefinition = "double precision"
    )
    Double price;

    public Product() {

    }

    public Product(String type, Double price) {
        this.type = type;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
