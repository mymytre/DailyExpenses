package com.petproject.dailyexpenses.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepo productRepo;

    @Autowired
    ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }


    public void addExpense(String type, Double price) {
        productRepo.save(new Product(type, price));
    }
}
