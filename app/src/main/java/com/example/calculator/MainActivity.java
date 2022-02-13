package com.example.calculator;

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

    public void sum(View view){

        EditText firstNum = (EditText) findViewById(R.id.firstNumber);
        EditText secondNum = (EditText) findViewById(R.id.secondNumber);
        int num1 = Integer.parseInt(firstNum.getText().toString());
        int num2 = Integer.parseInt(secondNum.getText().toString());

        int result = num1+num2;

        TextView res = findViewById(R.id.result);
        res.setText(Integer.toString(result));

    }

    public void subtract(View view){

        EditText firstNum = (EditText) findViewById(R.id.firstNumber);
        EditText secondNum = (EditText) findViewById(R.id.secondNumber);

        int num1 = Integer.parseInt(firstNum.getText().toString());
        int num2 = Integer.parseInt(secondNum.getText().toString());

        int result = num1-num2;

        TextView res = findViewById(R.id.result);
        res.setText(Integer.toString(result));

    }

    public void multiply(View view){
        EditText firstNum = (EditText) findViewById(R.id.firstNumber);
        EditText secondNum = (EditText) findViewById(R.id.secondNumber);

        int num1 = Integer.parseInt(firstNum.getText().toString());
        int num2 = Integer.parseInt(secondNum.getText().toString());

        int result = num1*num2;

        TextView res = findViewById(R.id.result);
        res.setText(Integer.toString(result));

    }

    public void divide(View view){

        EditText firstNum = (EditText) findViewById(R.id.firstNumber);
        EditText secondNum = (EditText) findViewById(R.id.secondNumber);
        int num1 = Integer.parseInt(firstNum.getText().toString());
        int num2 = Integer.parseInt(secondNum.getText().toString());

        int result = num1/num2;

        TextView res = findViewById(R.id.result);
        res.setText(Integer.toString(result));

    }


}