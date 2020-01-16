package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;



import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.bumptech.glide.Glide;

public class Btnnav extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btnnav);
        ImageButton image=findViewById(R.id.loginimage);
           Glide.with(getApplicationContext())
                   .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRvqOboCzodjQ04_nNJIdEMBE80_FFUUY2mnZ2RQQEJfR9Q_d54Iw&s")
               .into(image);

    }
}
