package com.example.warehousemanagementsystem.WarehouseSystem.Category;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    final
    CategoryService categoryService;

    public CategoryController(CategoryService warehouseService) {
        this.categoryService = warehouseService;
    }

    @GetMapping("/getAllCategories")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @PostMapping("/createCategory")
    public void createCategory(@RequestBody Category category){
        categoryService.save(category);
    }

    @DeleteMapping("/deleteCategory/{id}")
    public void deleteCategory(@PathVariable Long id){
        categoryService.deleteCategory(id);
    }

}
