package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView sisiImg = (ImageView) findViewById(R.id.imageView);
        sisiImg.setX(-100);
        sisiImg.animate().translationXBy(1500).rotation(3600).setDuration(2000);
    }

//    boolean sisimanuIsShowing = true;
    public void change(View view){

        Log.i("info", "Image Tapped !");
        ImageView sisiImg = (ImageView) findViewById(R.id.imageView);
        ImageView sinzoImg = (ImageView) findViewById(R.id.imageView2);

//        sisiImg.animate().translationXBy(-1500).setDuration(2000);
//        sisiImg.animate().rotation(1800).alpha(0).setDuration(1000);
//        sisiImg.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);

//        sisiImg.animate().alpha(1).scaleX(0.5f).scaleY(0.5f).translationXBy(1500).setDuration(2000);
//        if(sisimanuIsShowing){
//            sisimanuIsShowing = false;
//            sisiImg.animate().alpha(0).setDuration(2000);
//            sinzoImg.animate().alpha(1).setDuration(2000);
//        }else{
//            sisimanuIsShowing = true;
//            sisiImg.animate().alpha(1).setDuration(2000);
//            sinzoImg.animate().alpha(0).setDuration(2000);
//        }


    }
}