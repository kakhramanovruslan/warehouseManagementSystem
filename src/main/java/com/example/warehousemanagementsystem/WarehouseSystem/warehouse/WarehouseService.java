package com.example.warehousemanagementsystem.WarehouseSystem.warehouse;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class WarehouseService {
    final
    WarehouseRepository warehouseRepository;

    public WarehouseService(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    public List<WarehouseDTOInterface> getWarehouseData() {
        return warehouseRepository.findWarehouseData();
    }
}
