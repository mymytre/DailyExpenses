package com.petproject.dailyexpenses.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo
        extends JpaRepository<Product, Long> {
    @Query(value =
            "SELECT SUM(p.price) FROM Product AS p WHERE p.type = 'food'")
    double getSumByFood();
}
