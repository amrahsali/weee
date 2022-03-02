package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView view;
    String  courses[]
        = {"amrah", "uthman", "sali"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(R.id.list);
        ArrayAdapter<String> arr;
        arr
                =new ArrayAdapter<String>(
                        this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,courses);
        view.setAdapter(arr);
    }
}