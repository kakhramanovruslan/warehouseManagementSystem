package com.example.warehousemanagementsystem.WarehouseSystem.warehouse;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {
    final
    WarehouseRepository warehouseRepository;

    public WarehouseService(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    public List<Object[]> getWarehouseData() {
        return warehouseRepository.findWarehouseData();
    }
}
