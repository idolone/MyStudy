package com.example.myrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<ListItem> data = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i = 0; i < 100;i++)
        {
            ListItem  listItem = new ListItem();
            //listItem.setName("list" + i);
            listItem.setName("list" + i);
            listItem.setId(" "+ i);
            listItem.setCHId("  CH"+ i);
            data.add(listItem);
        }

        RecyclerView recycleView = findViewById(R.id.rv);

        LinearLayoutManager  linearLayoutManager = new LinearLayoutManager(this);
        recycleView.setLayoutManager(linearLayoutManager);

        MyAdapter myAdapter =  new MyAdapter(data,this);
        recycleView.setAdapter(myAdapter);
    }
}