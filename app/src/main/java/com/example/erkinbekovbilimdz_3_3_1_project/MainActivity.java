package com.example.erkinbekovbilimdz_3_3_1_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> weaponList;

    private NameAdapter adapter;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_weapon);
        loadData();
        adapter = new NameAdapter(weaponList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        weaponList = new ArrayList<>();
        weaponList.add("Пистолет");
        weaponList.add("Револьвер");
        weaponList.add("Дробовик");
        weaponList.add("Карабин");
        weaponList.add("Штурмовые винтовки");
        weaponList.add("Пистолет-пулемет");
        weaponList.add("Пулемет");
        weaponList.add("Всё взято с интернета");
        weaponList.add("Холодное");
        weaponList.add("Огнемёт");
    }
}