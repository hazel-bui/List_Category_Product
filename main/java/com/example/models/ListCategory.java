package com.example.models;

import android.content.Context;

import com.example.k22411csampleproject.R;

import java.io.Serializable;
import java.util.ArrayList;

public class ListCategory implements Serializable {
    private ArrayList<Category> categories;
    private Context context;

    public ListCategory(Context context) {
        this.context = context;
        this.categories = new ArrayList<>();
        generate_sample_dataset();  // gọi ngay cho đỡ báo lỗi context unused
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }

    public void addCategory(Category c) {
        categories.add(c);
    }

    public void generate_sample_dataset() {
        categories.clear();
        categories.add(new Category(1, context.getString(R.string.category_coffee_hot)));
        categories.add(new Category(2, context.getString(R.string.category_coffee_iced)));
        categories.add(new Category(3, context.getString(R.string.category_milk_tea)));
        categories.add(new Category(4, context.getString(R.string.category_smoothie)));
        categories.add(new Category(5, context.getString(R.string.category_fruit_juice)));
        categories.add(new Category(6, context.getString(R.string.category_snack)));
    }
}
