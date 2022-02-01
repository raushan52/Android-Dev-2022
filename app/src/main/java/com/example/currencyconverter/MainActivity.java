package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cnv(View view){

        Log.i("info","button clicked.");
        EditText input = (EditText) findViewById(R.id.editTextTextPersonName);

        double inr = Double.parseDouble(input.getText().toString());
        double usd = inr /75;
//        String prnt = Double.toString(usd);

        String formatedStr = String.format("%.2f",usd);


        Toast.makeText(this,"$ " + formatedStr,Toast.LENGTH_SHORT).show();
    }
}