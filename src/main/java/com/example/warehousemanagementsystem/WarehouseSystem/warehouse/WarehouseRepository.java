package com.example.warehousemanagementsystem.WarehouseSystem.warehouse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
    @Query("SELECT w.productId as productId, p.name as name, w.count as count FROM Warehouse w INNER JOIN Product p ON w.productId = p.id")
    List<WarehouseDTOInterface> findWarehouseData();
}