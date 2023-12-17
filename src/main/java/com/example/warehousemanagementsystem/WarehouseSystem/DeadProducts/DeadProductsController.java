package com.example.warehousemanagementsystem.WarehouseSystem.DeadProducts;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deadProducts")
public class DeadProductsController {
    final
    DeadProductsService deadProductsService;

    public DeadProductsController(DeadProductsService deadProductsService) {
        this.deadProductsService = deadProductsService;
    }

    @PostMapping("/dead")
    public void deadProducts(@RequestBody DeadProducts deadProducts){
        deadProductsService.save(deadProducts);
    }

}
