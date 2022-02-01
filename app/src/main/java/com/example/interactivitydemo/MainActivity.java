package com.example.interactivitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void click(View view){
        EditText userName = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText pass = (EditText) findViewById(R.id.editTextTextPassword);
        Log.i("info","Button clicked !");
        Log.i("UserName",userName.getText().toString());
        Log.i("Password",pass.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}