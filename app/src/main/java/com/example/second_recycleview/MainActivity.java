package com.example.second_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        Adapter adapter = new Adapter(names);
        recyclerView = findViewById(R.id.recycle);
        recyclerView.setAdapter(adapter);

    }
    public void loadData(){
        names = new ArrayList<>();
        names.add("Monkey D Luffy");
        names.add("Monkey D Luffy");
        names.add("Monkey D Luffy");
        names.add("Monkey D Luffy");
        names.add("Monkey D Luffy");
        names.add("Monkey D Luffy");
        names.add("Monkey D Luffy");
        names.add("Monkey D Luffy");
        names.add("Monkey D Luffy");
        names.add("Monkey D Luffy");
        names.add("Monkey D Luffy");
        names.add("Monkey D Luffy");
        names.add("Monkey D Luffy");
        names.add("Monkey D Luffy");
        names.add("Monkey D Luffy");
        names.add("Monkey D Luffy");
        names.add("Monkey D Luffy");
    }
}