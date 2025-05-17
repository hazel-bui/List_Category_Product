package com.example.k22411csampleproject;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.connectors.ProductConnector;
import com.example.models.Product;

import java.util.ArrayList;

public class ProductManagementActivity extends AppCompatActivity {

    ListView lvProduct;
    ArrayAdapter<Product> adapter;
    ProductConnector productConnector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_management);

        lvProduct = findViewById(R.id.lvProduct);

        productConnector = new ProductConnector(this);
        ArrayList<Product> productList = productConnector.getAllProducts();

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, productList);

        lvProduct.setAdapter(adapter);
    }
}
