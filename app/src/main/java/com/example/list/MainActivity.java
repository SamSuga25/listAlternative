package com.example.list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.list.Adapters.ListAdapter;
import com.example.list.Models.ListModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvListItem;
    List<ListModel> listModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvListItem = findViewById(R.id.rvList);

        ListModel name = new ListModel("Indonesia");
        listModelList.add(name);

        name = new ListModel("Jepang");
        listModelList.add(name);
        name = new ListModel("Jerman");
        listModelList.add(name);
        name = new ListModel("Inggris");
        listModelList.add(name);
        name = new ListModel("Selandia Baru");
        listModelList.add(name);
        name = new ListModel("Australia");
        listModelList.add(name);
        name = new ListModel("Korea Utara");
        listModelList.add(name);
        name = new ListModel("Korea Selatan");
        listModelList.add(name);
        name = new ListModel("Portugal");
        listModelList.add(name);
        name = new ListModel("Arab");
        listModelList.add(name);
        name = new ListModel("China");
        listModelList.add(name);
        name = new ListModel("Argentina");
        listModelList.add(name);
        name = new ListModel("Brazil");
        listModelList.add(name);
        name = new ListModel("Rusia");
        listModelList.add(name);
        name = new ListModel("Thailand");
        listModelList.add(name);
        name = new ListModel("Malaysia");
        listModelList.add(name);

        ListAdapter listAdapter = new ListAdapter(listModelList);

        rvListItem.setAdapter(listAdapter);
        rvListItem.setLayoutManager(new LinearLayoutManager(this));
    }
}
