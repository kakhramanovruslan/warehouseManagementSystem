package com.example.warehousemanagementsystem.WarehouseSystem.ArrivedProducts;


import java.util.Date;


public class ArrivedProductsDTO implements ArrivedProductsDTOInterface{

    private Long id;

    private int productId;

    private String name;

    private Date arriveDate;

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
    public Date getArriveDate() {
        return arriveDate;
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
