package com.example.warehousemanagementsystem.WarehouseSystem.DeadProducts;

import com.example.warehousemanagementsystem.WarehouseSystem.Analytics.ProductsDTOInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface DeadProductsRepository extends JpaRepository<DeadProducts, Long> {
    @Query("SELECT d.id as id, d.productId as productId, p.name as name, d.deadDate as date, d.count as count, p.price as price from DeadProducts d INNER JOIN Product p ON p.id=d.productId")
    List<ProductsDTOInterface> findAllWithPrice();
}