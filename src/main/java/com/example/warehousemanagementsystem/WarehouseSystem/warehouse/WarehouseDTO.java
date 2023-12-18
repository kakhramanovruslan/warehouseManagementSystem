package com.example.warehousemanagementsystem.WarehouseSystem.warehouse;

public class WarehouseDTO implements WarehouseDTOInterface{
    private long productId;
    private String name;
    private int count;

    @Override
    public long getProductId() {
        return productId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCount() {
        return count;
    }
}
