package com.example.tempratureconversionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view){

        EditText edt = findViewById(R.id.editTextTextPersonName);

        int kel = Integer.parseInt(edt.getText().toString());
        float far = (float) ((kel*1.8)+32);

        TextView txt = findViewById(R.id.textView3);
            txt.setText(""+far);
    }
}