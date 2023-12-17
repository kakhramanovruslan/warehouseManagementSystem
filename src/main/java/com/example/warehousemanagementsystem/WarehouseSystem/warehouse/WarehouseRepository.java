package com.example.warehousemanagementsystem.WarehouseSystem.warehouse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
    @Query("SELECT w.product_id, p.name, w.count FROM Warehouse w INNER JOIN Category p ON w.product_id = p.id")
    List<Object[]> findWarehouseData();
}