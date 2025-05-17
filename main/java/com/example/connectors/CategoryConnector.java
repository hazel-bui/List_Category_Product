package com.example.connectors;

import android.content.Context;
import com.example.models.Category;
import com.example.models.ListCategory;

import java.util.ArrayList;

public class CategoryConnector {
    private ListCategory listCategory;

    public CategoryConnector(Context context) {
        listCategory = new ListCategory(context);
        listCategory.generate_sample_dataset();
    }

    public ArrayList<Category> get_all_categories() {
        return listCategory.getCategories();
    }

    public Category get_category_by_id(int id) {
        for (Category c : listCategory.getCategories()) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}
