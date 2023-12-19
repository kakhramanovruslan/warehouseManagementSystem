package com.example.warehousemanagementsystem.WarehouseSystem.Analytics;

import com.example.warehousemanagementsystem.WarehouseSystem.ArrivedProducts.ArrivedProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArriveStatistics extends TemplateStatistics{

    @Autowired
    ArrivedProductsService arrivedProductsService;

    @Override
    List<ProductsDTOInterface> getData() {
        return arrivedProductsService.getArrivedProducts();
    }
}
