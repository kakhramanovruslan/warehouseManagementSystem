package com.example.warehousemanagementsystem.WarehouseSystem.ArrivedProducts;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArrivedProductsService {

    final
    ArrivedProductsRepository arrivedProductsRepository;

    public ArrivedProductsService(ArrivedProductsRepository arrivedProductsRepository) {
        this.arrivedProductsRepository = arrivedProductsRepository;
    }

    public void save(ArrivedProducts arrivedProducts) {
        arrivedProductsRepository.save(arrivedProducts);
    }

    public List<ArrivedProductsDTOInterface> getArrivedProducts() {
        return arrivedProductsRepository.findAllWithPrice();
    }
}
