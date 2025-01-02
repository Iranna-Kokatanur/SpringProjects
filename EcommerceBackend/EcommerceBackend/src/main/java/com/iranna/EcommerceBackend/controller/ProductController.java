package com.iranna.EcommerceBackend.controller;

import com.iranna.EcommerceBackend.models.Product;
import com.iranna.EcommerceBackend.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/category/{categoryId}")
    public List<Product> getAllProductsByCategory(@PathVariable Long categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }

}
