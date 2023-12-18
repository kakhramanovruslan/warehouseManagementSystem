package com.example.warehousemanagementsystem.WarehouseSystem.Analytics;

import com.example.warehousemanagementsystem.WarehouseSystem.warehouse.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Map;

public interface AnalyticsRepository extends JpaRepository<Warehouse, Long> {

    @Query("SELECT sum(p.price*a.count) as amountArrivedProducts FROM ArrivedProducts a INNER JOIN Product p ON a.productId = p.id")
    Map<String, StatisticsDTO> getAmountArrivedProducts();

    @Query("SELECT sum(p.price*d.count) as amountDeadProducts FROM DeadProducts d INNER JOIN Product p ON d.productId = p.id")
    Map<String, StatisticsDTO> getAmountDeadProducts();
}