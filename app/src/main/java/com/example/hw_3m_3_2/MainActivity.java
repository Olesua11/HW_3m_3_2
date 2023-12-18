package com.example.hw_3m_3_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvContact;
    private ArrayList<String> contactList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        loadData();
        ContactAdapter adapter = new ContactAdapter(contactList);
        rvContact.setAdapter(adapter);
    }

    private void loadData() {
        contactList.add("Roza");
        contactList.add("Melisa");
        contactList.add("Alisa");
        contactList.add("Nastya");
        contactList.add("Cristina");
        contactList.add("Cveta");
        contactList.add("Vica");
        contactList.add("Conya");
        contactList.add("Asia");
        contactList.add("Artem");
        contactList.add("Ilia");
        contactList.add("Vlad");
        contactList.add("Victor");
        contactList.add("Misha");
        contactList.add("Den");
        contactList.add("Sasha");


    }

    private void initView() {
        rvContact = findViewById(R.id.rv_contact);
    }
}