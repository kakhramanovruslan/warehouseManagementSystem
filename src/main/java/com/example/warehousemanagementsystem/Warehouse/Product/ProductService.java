package com.example.warehousemanagementsystem.Warehouse.Product;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Transactional
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Transactional
    public void save(Product product) {
        productRepository.save(product);
    }
    @Transactional
    public void updateProduct(Product updatedProduct, Long id) {
        Product existingProduct = productRepository.findById(id);
        existingProduct.setName(updatedProduct.getName());
        existingProduct.setCategoryId(updatedProduct.getCategoryId());
        existingProduct.setPrice(updatedProduct.getPrice());
        productRepository.save(existingProduct);
    }
    @Transactional
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public Product getProduct(Long id) {
        return productRepository.findById(id);
    }
}
