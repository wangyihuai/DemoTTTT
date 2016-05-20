package com.example.setemptyview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> list1 = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list1.add("xxx");
        list1.add("xxx");
        list1.add("xxx");
        list1.add("xxx");

        //ssssssssssssssssss
        //ssssssssssssssssss
        //ssssssssssssssssss
        //ssssssssssssssssss
        //ssssssssssssssssss
//        View emptyView = findViewById(R.id.button);

        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, list1);

        listView.setAdapter(arrayAdapter);


        View emptyView = LayoutInflater.from(this).inflate(R.layout.empty, null);
        ((ViewGroup) listView.getParent()).addView(emptyView);
        listView.setEmptyView(emptyView);

    }
}
