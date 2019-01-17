package com.puseletsomaraba.nalediyoutube;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //a list to store all the products
    List<Product> productList;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list

        productList.add(
                new Product(
                        1,
                        "Barbie Girl",
                        "babambkjabjhdkjhdjaha",
                        R.drawable.barbie));

        productList.add(
                new Product(
                        2,
                        "Frozen ",
                        "frozen sg;jd;jfgdjglkjdfslkgjdf",
                        R.drawable.frozen));


        productList.add(
                new Product(
                        3,
                        "english ",
                        "english englis;ds sg;jd;jfgdjglkjdfslkgjdf",
                        R.drawable.english));

        productList.add(
                new Product(
                        4,
                        "maths ",
                        "english englis;ds sg;jd;jfgdjglkjdfslkgjdf",
                        R.drawable.maths));

        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);


    }
}
