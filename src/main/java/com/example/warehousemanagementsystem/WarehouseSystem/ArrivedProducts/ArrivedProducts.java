package com.example.warehousemanagementsystem.WarehouseSystem.ArrivedProducts;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "arrivedproducts")
public class ArrivedProducts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private int productId;

    @Column(name = "arrive_date")
    private Date arriveDate;

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

    public Date getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Date arrive_date) {
        this.arriveDate = arrive_date;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}