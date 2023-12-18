package com.example.warehousemanagementsystem.WarehouseSystem.warehouse;

import jakarta.persistence.*;

@Entity
@Table(name = "warehouse")
public class Warehouse {

    @Id
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "count")
    private int count;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    @Column(name = "name")
    private int name;

    public Long getId() {
        return productId;
    }

    public void setId(Long id) {
        this.productId = productId;
    }

    public int getCount() {
        return count;
    }

    public void setCount() {
        this.count = count;
    }



}
