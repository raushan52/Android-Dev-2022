package com.example.listviewprv;

import androidx.appcompat.app.AppCompatActivity;

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

        ListView ll = findViewById(R.id.listView);

        ArrayList<String> friendsName = new ArrayList<String>();

        friendsName.add("Kazama");
        friendsName.add("Shiro");
        friendsName.add("Sisimanu");
        friendsName.add("Sinzo");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,friendsName);

        ll.setAdapter(arrayAdapter);

        ll.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Hello " + friendsName.get(i),Toast.LENGTH_SHORT).show();
            }
        });
    }
}