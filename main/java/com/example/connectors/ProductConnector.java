package com.example.connectors;

import android.content.Context;

import com.example.models.ListProduct;
import com.example.models.Product;

import java.util.ArrayList;

public class ProductConnector {
    private ListProduct listProduct;

    public ProductConnector(Context context) {
        listProduct = new ListProduct(context);
        listProduct.generateSampleData();
    }

    public ArrayList<Product> getAllProducts() {
        return listProduct.getProducts();
    }

    public ArrayList<Product> getProductsByCategoryId(int cate_id) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product p : listProduct.getProducts()) {
            if (p.getCate_id() == cate_id) {
                result.add(p);
            }
        }
        return result;
    }

    public Product getProductById(int id) {
        for (Product p : listProduct.getProducts()) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
