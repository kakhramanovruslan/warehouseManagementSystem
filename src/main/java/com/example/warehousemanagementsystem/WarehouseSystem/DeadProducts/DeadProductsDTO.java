package com.example.warehousemanagementsystem.WarehouseSystem.DeadProducts;


import com.example.warehousemanagementsystem.WarehouseSystem.Analytics.ProductsDTOInterface;

import java.util.Date;


public class DeadProductsDTO implements ProductsDTOInterface {

    private Long id;

    private int productId;

    private String name;

    private Date date;

    private int price;

    private int count;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public int getProductId() {
        return productId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getCount() {
        return count;
    }
}
