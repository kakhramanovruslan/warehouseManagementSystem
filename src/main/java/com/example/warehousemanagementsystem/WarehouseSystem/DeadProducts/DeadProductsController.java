package com.example.warehousemanagementsystem.WarehouseSystem.DeadProducts;


import com.example.warehousemanagementsystem.WarehouseSystem.ArrivedProducts.ArrivedProductsDTOInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("")
    public List<DeadProductsDTOInterface> getDeadProducts(){
        return deadProductsService.getDeadProducts();
    }


}
