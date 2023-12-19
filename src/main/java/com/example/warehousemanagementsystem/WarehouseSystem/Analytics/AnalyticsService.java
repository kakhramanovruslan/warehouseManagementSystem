package com.example.warehousemanagementsystem.WarehouseSystem.Analytics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AnalyticsService {

    private final AnalyticsRepository analyticsRepository;

    @Autowired
    ArriveStatistics arriveStatistics;

    @Autowired
    DeadStatistics deadStatistics;


    public AnalyticsService(AnalyticsRepository analyticsRepository) {
        this.analyticsRepository = analyticsRepository;
    }


    public StatisticsDTO getAmountArrivedProducts() {
        return arriveStatistics.templateMethod();
    }

    public StatisticsDTO getAmountDeadProducts() {
        return deadStatistics.templateMethod();
    }
}
