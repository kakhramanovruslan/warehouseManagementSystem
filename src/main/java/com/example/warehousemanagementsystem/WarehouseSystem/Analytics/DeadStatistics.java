package com.example.warehousemanagementsystem.WarehouseSystem.Analytics;

import com.example.warehousemanagementsystem.WarehouseSystem.DeadProducts.DeadProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeadStatistics extends TemplateStatistics{
    @Autowired
    DeadProductsService deadProductsService;


    @Override
    List<ProductsDTOInterface> getData() {
        return deadProductsService.getDeadProducts();
    }

}
