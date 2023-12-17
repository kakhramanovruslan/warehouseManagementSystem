package com.example.warehousemanagementsystem.WarehouseSystem.DeadProducts;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "deadproducts")
public class DeadProducts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private int productId;

    @Column(name = "dead_date")
    private Date deadDate;

    @Column(name = "count")
    private int count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int product_id) {
        this.productId = product_id;
    }

    public Date getDeadDate() {
        return deadDate;
    }

    public void setDeadDate(Date deadDate) {
        this.deadDate = deadDate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}