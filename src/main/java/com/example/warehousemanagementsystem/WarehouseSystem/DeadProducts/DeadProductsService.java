package com.example.warehousemanagementsystem.WarehouseSystem.DeadProducts;

import org.springframework.stereotype.Service;

@Service
public class DeadProductsService {

    final
    DeadProductsRepository deadProductsRepository;

    public DeadProductsService(DeadProductsRepository deadProductsRepository) {
        this.deadProductsRepository = deadProductsRepository;
    }

    public void save(DeadProducts deadProducts) {
        deadProductsRepository.save(deadProducts);
    }
}
