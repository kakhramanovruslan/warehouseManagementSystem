package com.example.warehousemanagementsystem.WarehouseSystem.Category;

import com.example.warehousemanagementsystem.WarehouseSystem.Product.BinarySearch;
import com.example.warehousemanagementsystem.WarehouseSystem.Product.BubbleSort;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Transactional
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Transactional
    public Optional<Category> getCategory(Long id) {
        return categoryRepository.findById(id);
    }

    @Transactional
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Transactional
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }


}
