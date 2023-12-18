package com.example.warehousemanagementsystem.WarehouseSystem.DeadProducts;

import java.util.Date;

public interface DeadProductsDTOInterface {
    Long getId();
    int getProductId();
    String getName();
    Date getDeadDate();
    int getPrice();
    int getCount();
}
