package com.example.warehousemanagementsystem.WarehouseSystem.Product;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/warehouse")
public class ProductController {

    final
    ProductService productService;

    public ProductController(ProductService warehouseService) {
        this.productService = warehouseService;
    }

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/getProduct/{id}")
    public Product getProduct(@PathVariable Long id){
        return productService.getProduct(id);
    }

    @PostMapping("/createProduct")
    public void createProduct(@RequestBody Product product){
        productService.save(product);
    }

    @PutMapping("/updateProduct/{id}")
    public void updateProduct(@RequestBody Product product, @PathVariable Long id){
        productService.updateProduct(product, id);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }

    @GetMapping("/sort")
    public List<Product> sortByPrice(@RequestParam(value = "sort", required = false) String sort){
       List<Product> products = productService.getAllProducts();
       return productService.sortByPrice(sort, products);
    }
}
