package com.domain.services;

import java.util.List;
import javax.transaction.Transactional;
import com.domain.models.entities.Product;
import com.domain.models.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService {
    
    @Autowired
    private ProductRepo productRepo;

    public Product create(Product product) {
        return productRepo.save(product);
    }

    public Product findOne(Long id) { 
        return productRepo.findById(id).get();
    }

    public Iterable<Product> findAll() {
        return productRepo.findAll();
    }

    public List<Product> findByName(String name) {
        return productRepo.findByNameContains(name);
    } 

    public void removeOne(Long id) {
        productRepo.deleteById(id);
    }
}
