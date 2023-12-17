package com.example.warehousemanagementsystem.WarehouseSystem.Product;

import java.util.List;

public class BinarySearch {
    public static Product binarySearch(List<Product> products, Long id) {
        int left = 0;
        int right = products.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product product = products.get(mid);

            if (product.getId() == id) {
                return product;
            }

            if (product.getId() < id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }
}
