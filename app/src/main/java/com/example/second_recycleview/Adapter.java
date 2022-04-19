package com.example.second_recycleview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Holder> {
    ArrayList<String> names;

    public Adapter(ArrayList<String> names) {
        this.names = names;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item    , parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
    holder.bind(names.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }
}
