package com.example.warehousemanagementsystem.WarehouseSystem.warehouse;

import jakarta.persistence.*;

@Entity
@Table(name = "warehouse")
public class Warehouse {

    @Id
    @Column(name = "product_id")
    private Long product_id;

    @Column(name = "count")
    private int count;

    public Long getId() {
        return product_id;
    }

    public void setId(Long id) {
        this.product_id = product_id;
    }

    public int getCount() {
        return count;
    }

    public void setCount() {
        this.count = count;
    }



}
