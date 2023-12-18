package com.example.warehousemanagementsystem.WarehouseSystem.Analytics;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AnalyticsService {

    private final AnalyticsRepository analyticsRepository;


    public AnalyticsService(AnalyticsRepository analyticsRepository) {
        this.analyticsRepository = analyticsRepository;
    }


    public Map<String, StatisticsDTO> getAmountArrivedProducts() {
        return analyticsRepository.getAmountArrivedProducts();
    }

    public Map<String, StatisticsDTO> getAmountDeadProducts() {
        return analyticsRepository.getAmountDeadProducts();
    }
}
