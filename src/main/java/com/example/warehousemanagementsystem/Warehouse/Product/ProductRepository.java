package com.example.warehousemanagementsystem.Warehouse.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    void deleteById(Long id);

}