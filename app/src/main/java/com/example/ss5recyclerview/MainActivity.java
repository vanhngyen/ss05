package com.example.ss5recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Contact> listContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //b1 : data source
        initData();
        //b2 : Adapter
        ContactAdapter adapter = new ContactAdapter(listContacts, this);
        //b3 : Layout Manager
        //RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        //b4 ; Recycler View
        RecyclerView recyclerView = findViewById(R.id.rvContact);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    private void initData() {
        listContacts.add(new Contact("Nguyễn Vân Anh", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Nguyễn Thị Nhân", "012412112", R.drawable.user2));
        listContacts.add(new Contact("Thế Hoàng Yến", "012412112", R.drawable.user3));
    }
}
