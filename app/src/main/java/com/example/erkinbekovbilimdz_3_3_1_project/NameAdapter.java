package com.example.erkinbekovbilimdz_3_3_1_project;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NameAdapter extends RecyclerView.Adapter<NameViewHolder> {

    private ArrayList<String> WeaponList;

    public NameAdapter(ArrayList<String> weaponList) {
        this.WeaponList = weaponList;
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NameViewHolder(LayoutInflater.from(parent.getContext()).inflate
                (R.layout.item_name, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {

        holder.bind(WeaponList.get(position));
    }

    @Override
    public int getItemCount() {
        return WeaponList.size();
    }
}
