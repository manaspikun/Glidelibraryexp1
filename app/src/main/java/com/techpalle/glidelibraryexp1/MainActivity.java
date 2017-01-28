package com.techpalle.glidelibraryexp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= (ImageView) findViewById(R.id.imageview);
        Glide
                .with(this)
                .load("http://fakefoodjapan.net/img/min/deep_fried_oyster_curry_rice_small_size_replica.jpg")
                .placeholder(R.mipmap.ic_launcher)
                .crossFade()
                .into(imageView);
    }
}
