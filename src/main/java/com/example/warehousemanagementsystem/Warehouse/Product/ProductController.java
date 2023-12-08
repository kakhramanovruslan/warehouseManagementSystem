package com.example.warehousemanagementsystem.Warehouse.Product;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/warehouse")
public class ProductController {

    final
    ProductService warehouseService;

    public ProductController(ProductService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts(){
        return warehouseService.getAllProducts();
    }

    @GetMapping("/getProduct/{id}")
    public Product getProduct(@PathVariable Long id){
        return warehouseService.getProduct(id);
    }

    @PostMapping("/createProduct")
    public void createProduct(@RequestBody Product product){
        warehouseService.save(product);
    }

    @PutMapping("/updateProduct/{id}")
    public void updateProduct(@RequestBody Product product, @PathVariable Long id){
        warehouseService.updateProduct(product, id);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable Long id){
        warehouseService.deleteProduct(id);
    }

    @GetMapping("/sort")
    public List<Product> sortByPrice(@RequestParam(value = "sort", required = false) String sort){
       List<Product> products = warehouseService.getAllProducts();
       return warehouseService.sortByPrice(sort, products);
    }
}
