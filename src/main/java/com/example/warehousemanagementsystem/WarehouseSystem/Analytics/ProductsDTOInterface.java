package com.example.warehousemanagementsystem.WarehouseSystem.Analytics;

import java.util.Date;

public interface ProductsDTOInterface {
    Long getId();
    int getProductId();
    String getName();
    int getPrice();
    int getCount();

    Date getDate();
}
