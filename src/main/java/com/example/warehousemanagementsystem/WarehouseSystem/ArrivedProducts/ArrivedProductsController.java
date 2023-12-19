package com.example.warehousemanagementsystem.WarehouseSystem.ArrivedProducts;


import com.example.warehousemanagementsystem.WarehouseSystem.Analytics.ProductsDTOInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/arrivedProducts")
public class ArrivedProductsController {
    final
    ArrivedProductsService arrivedProductsService;

    public ArrivedProductsController(ArrivedProductsService arrivedProductsService) {
        this.arrivedProductsService = arrivedProductsService;
    }

    @PostMapping("/arrive")
    public void addProducts(@RequestBody ArrivedProducts arrivedProducts){
        arrivedProductsService.save(arrivedProducts);
    }

    @GetMapping("")
    public List<ProductsDTOInterface> getArrivedProducts(){
       return arrivedProductsService.getArrivedProducts();
    }

}
