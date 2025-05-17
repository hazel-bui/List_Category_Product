package com.example.models;

import android.content.Context;

import java.io.Serializable;
import java.util.ArrayList;
import com.example.k22411csampleproject.R;

public class ListProduct implements Serializable {
    private ArrayList<Product> products;
    private Context context;

    public ListProduct(Context context) {
        this.context = context;
        this.products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void generateSampleData() {
        products.clear();

        // Coffee Hot (cate_id = 1)
        products.add(new Product(1, context.getString(R.string.espresso), 10, 35.0, 1, context.getString(R.string.espresso_desc)));
        products.add(new Product(2, context.getString(R.string.cappuccino), 8, 40.0, 1, context.getString(R.string.cappuccino_desc)));

        // Coffee Iced (cate_id = 2)
        products.add(new Product(3, context.getString(R.string.iced_latte), 12, 45.0, 2, context.getString(R.string.iced_latte_desc)));
        products.add(new Product(4, context.getString(R.string.iced_americano), 15, 38.0, 2, context.getString(R.string.iced_americano_desc)));

        // Milk Tea (cate_id = 3)
        products.add(new Product(5, context.getString(R.string.classic_milk_tea), 20, 30.0, 3, context.getString(R.string.classic_milk_tea_desc)));
        products.add(new Product(6, context.getString(R.string.taro_milk_tea), 18, 35.0, 3, context.getString(R.string.taro_milk_tea_desc)));

        // Smoothie (cate_id = 4)
        products.add(new Product(7, context.getString(R.string.mango_smoothie), 15, 40.0, 4, context.getString(R.string.mango_smoothie_desc)));
        products.add(new Product(8, context.getString(R.string.berry_blast_smoothie), 14, 42.0, 4, context.getString(R.string.berry_blast_smoothie_desc)));

        // Fruit Juice (cate_id = 5)
        products.add(new Product(9, context.getString(R.string.orange_juice), 25, 28.0, 5, context.getString(R.string.orange_juice_desc)));
        products.add(new Product(10, context.getString(R.string.watermelon_juice), 22, 27.0, 5, context.getString(R.string.watermelon_juice_desc)));

        // Snack (cate_id = 6)
        products.add(new Product(11, context.getString(R.string.chocolate_chip_cookie), 30, 15.0, 6, context.getString(R.string.chocolate_chip_cookie_desc)));
        products.add(new Product(12, context.getString(R.string.almond_biscuit), 25, 20.0, 6, context.getString(R.string.almond_biscuit_desc)));
    }
}
