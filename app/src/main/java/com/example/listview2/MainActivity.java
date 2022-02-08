package com.example.listview2;

import static android.widget.Toast.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.listView);

        ArrayList<String> myFriendsList = new ArrayList<String>();

        myFriendsList.add("Sinchan");
        myFriendsList.add("Massao");
        myFriendsList.add("Kazama");
        myFriendsList.add("Boo-Chan");
        myFriendsList.add("Charlie");

        ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myFriendsList);

        myListView.setAdapter(myArrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

               Toast.makeText(getApplicationContext(), myFriendsList.get(i), Toast.LENGTH_LONG).show();
            }
        });
    }
}