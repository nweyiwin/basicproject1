package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SpannerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spanner);
        Spinner spinner=findViewById(R.id.spinner4);
        ArrayList<String> month=new ArrayList<String>();
        month.add("January");
        month.add("February");
        month.add("Mach");
        month.add("April");
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_dropdown_item_1line,month);
        spinner.setAdapter(arrayAdapter);


    }
}
