package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void btnLogin(View view) {
        LayoutInflater inflater=getLayoutInflater();
        View convertview= inflater.inflate(R.layout.welcomelayout,null);
        Toast mytoast =new Toast(getApplicationContext());
        mytoast.setView(convertview);
        mytoast.setDuration(Toast.LENGTH_LONG);
        mytoast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        mytoast.show();

    }
}
