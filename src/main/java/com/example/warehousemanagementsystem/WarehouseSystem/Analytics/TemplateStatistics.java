package com.example.warehousemanagementsystem.WarehouseSystem.Analytics;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public abstract class TemplateStatistics {


    StatisticsDTO templateMethod(){
        List<ProductsDTOInterface> data = getData();
        return getStatistics(data);
    }

    abstract List<ProductsDTOInterface> getData();

    StatisticsDTO getStatistics (List<ProductsDTOInterface> data){
        StatisticsDTO statisticsDTO = new StatisticsDTO();

        int totalAmount = 0;

        for (ProductsDTOInterface product : data) {
            totalAmount += product.getCount() * product.getPrice();
        }

        statisticsDTO.setAmountProducts(totalAmount);
        return statisticsDTO;
    }


}
