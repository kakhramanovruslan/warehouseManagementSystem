package com.example.warehousemanagementsystem.WarehouseSystem.ArrivedProducts;

import java.util.Date;

public interface ArrivedProductsDTOInterface {
    Long getId();
    int getProductId();
    String getName();
    Date getArriveDate();
    int getPrice();
    int getCount();
}
