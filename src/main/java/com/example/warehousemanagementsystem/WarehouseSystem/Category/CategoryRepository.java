package com.example.warehousemanagementsystem.WarehouseSystem.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    void deleteById(Long id);
}