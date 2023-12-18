package com.example.warehousemanagementsystem.WarehouseSystem.DeadProducts;

import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<DeadProductsDTOInterface> getDeadProducts() {
        return deadProductsRepository.findAllWithPrice();
    }
}
