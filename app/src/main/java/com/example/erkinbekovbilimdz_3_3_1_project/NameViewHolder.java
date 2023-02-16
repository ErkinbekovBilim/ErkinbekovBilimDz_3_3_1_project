package com.example.erkinbekovbilimdz_3_3_1_project;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameViewHolder extends RecyclerView.ViewHolder {

    private TextView tvWeopen;

    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        tvWeopen = itemView.findViewById(R.id.tv_weapon);
    }
    void bind(String name){
        tvWeopen.setText(name);
    }
}
