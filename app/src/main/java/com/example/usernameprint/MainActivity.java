package com.example.usernameprint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(View view){

        EditText userName = (EditText) findViewById(R.id.editTextTextPersonName);

        TextView displayTxt = findViewById(R.id.textView2);
        String str = userName.getText().toString();
        displayTxt.setText("Hi " + str);

        Toast.makeText(this, "Hi " + userName.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}