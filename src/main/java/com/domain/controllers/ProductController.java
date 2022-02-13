package com.domain.controllers;

import com.domain.models.entities.Product;
import com.domain.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products")
public class ProductController {
    
    @Autowired // controller -> services -> repository
    private ProductService productService;
    
    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.create(product);
    }
}
