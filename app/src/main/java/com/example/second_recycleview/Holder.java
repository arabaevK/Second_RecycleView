package com.example.second_recycleview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder {
    private TextView tv_persons;

    public Holder(@NonNull View itemView) {
        super(itemView);
    tv_persons = itemView.findViewById(R.id.names);
    }

    public void bind(String name){
        tv_persons.setText(name);
    }
}
