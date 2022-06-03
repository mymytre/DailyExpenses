package com.petproject.dailyexpenses.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/test")
    public String test() {
        return "Test";
    }

    @PostMapping("/add")
    @ResponseBody
    public void addExpense(
            @RequestParam(name = "type") String type,
            @RequestParam(name = "price") Double price
    ) {
        productService.addExpense(type, price);
    }
}
