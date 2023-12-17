package com.example.warehousemanagementsystem.WarehouseSystem.Product;

import java.util.List;

public class BubbleSort {
    public static List<Product> bubbleSort(List<Product> products) {
        int n = products.size();
        Product temp = null;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (products.get(j - 1).getPrice() > products.get(j).getPrice()) {
                    temp = products.get(j - 1);                     // swap products
                    products.set(j - 1, products.get(j));
                    products.set(j, temp);
                }
            }
        }

        return products;
    }
}