package com.example.warehousemanagementsystem.Warehouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productRepository;

    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }
}
