package com.example.catimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeCat(View view){

        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.cat2);
    }
}