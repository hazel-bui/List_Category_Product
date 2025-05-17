package com.example.k22411csampleproject;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.connectors.CategoryConnector;
import com.example.models.Category;

public class CategoryManagementActivity extends AppCompatActivity {

    ListView lvCategory;
    ArrayAdapter<Category> adapter;
    CategoryConnector connector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_management);

        lvCategory = findViewById(R.id.lvCategory);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);

        connector = new CategoryConnector(this);
        adapter.addAll(connector.get_all_categories());

        lvCategory.setAdapter(adapter);

        lvCategory.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Category selected = adapter.getItem(i);
                adapter.remove(selected);
                return false;
            }
        });
    }
}
