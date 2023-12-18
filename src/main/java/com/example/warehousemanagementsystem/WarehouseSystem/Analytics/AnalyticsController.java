package com.example.warehousemanagementsystem.WarehouseSystem.Analytics;


import org.springframework.web.bind.annotation.*;

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
    public Map<String, StatisticsDTO> getAmountArrivedProducts(){
        return analyticsService.getAmountArrivedProducts();
    }

    @GetMapping("amountDead")
    public Map<String, StatisticsDTO> getAmountDeadProducts(){
        return analyticsService.getAmountDeadProducts();
    }

}
