package com.example.warehousemanagementsystem.WarehouseSystem.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    void deleteById(Long id);

}