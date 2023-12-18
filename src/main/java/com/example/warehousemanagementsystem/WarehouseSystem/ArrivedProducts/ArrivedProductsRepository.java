package com.example.warehousemanagementsystem.WarehouseSystem.ArrivedProducts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ArrivedProductsRepository extends JpaRepository<ArrivedProducts, Long> {
    @Query("SELECT a.id as id, a.productId as productId, p.name as name, a.arriveDate as arriveDate, a.count as count, p.price as price from ArrivedProducts a INNER JOIN Product p ON p.id=a.productId")
    List<ArrivedProductsDTOInterface> findAllWithPrice();
}