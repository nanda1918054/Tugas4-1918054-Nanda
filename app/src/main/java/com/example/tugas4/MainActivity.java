package com.example.tugas4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private itemAdapter adapter;
    private ArrayList<item> itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        adapter = new itemAdapter(itemArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        itemArrayList = new ArrayList<>();
        itemArrayList.add(new item("Americano", "70/30", "1",R.drawable.americano));
        itemArrayList.add(new item("Avogato", "70 dan Eskrim Vanilla", "5",R.drawable.avogato));
        itemArrayList.add(new item("Cappucino", "70 dan Milk Foam", "3",R.drawable.cappucino));
        itemArrayList.add(new item("Espresso", "70/30 Robusta Arabica", "1",R.drawable.espresso));
        itemArrayList.add(new item("Latte", "70/30 arabica Robusta", "5",R.drawable.latte));
    }
}
