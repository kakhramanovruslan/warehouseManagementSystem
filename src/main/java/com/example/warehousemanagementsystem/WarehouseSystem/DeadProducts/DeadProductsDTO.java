package com.example.warehousemanagementsystem.WarehouseSystem.DeadProducts;


import com.example.warehousemanagementsystem.WarehouseSystem.ArrivedProducts.ArrivedProductsDTOInterface;

import java.util.Date;


public class DeadProductsDTO implements DeadProductsDTOInterface {

    private Long id;

    private int productId;

    private String name;

    private Date deadDate;

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
    public Date getDeadDate() {
        return deadDate;
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
