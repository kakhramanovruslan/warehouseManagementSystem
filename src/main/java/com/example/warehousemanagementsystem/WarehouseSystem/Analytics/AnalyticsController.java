package com.example.warehousemanagementsystem.WarehouseSystem.Analytics;


import com.example.warehousemanagementsystem.WarehouseSystem.ArrivedProducts.ArrivedProducts;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/analytics")
public class AnalyticsController {

    final
    AnalyticsService analyticsService;

    public AnalyticsController(AnalyticsService analyticsService) {
        this.analyticsService = analyticsService;
    }

    @GetMapping("amountArrive")
    public StatisticsDTO getAmountArrivedProducts(){
        return analyticsService.getAmountArrivedProducts();
    }

    @GetMapping("amountDead")
    public StatisticsDTO getAmountDeadProducts(){
        return analyticsService.getAmountDeadProducts();
    }

}
