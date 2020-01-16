package com.example.myapplication;


import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CheckOutTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out_test);
    }

    public void btnCheck(View view) {
        CheckBox checkstatus=findViewById(R.id.checkstatus);
        RadioButton female=findViewById(R.id.femaleradio);
        RadioButton male=findViewById(R.id.maleradio);
        Switch swgrad=findViewById(R.id.Isgrad);
        TextView textresult=findViewById(R.id.txtresult);

        StringBuffer str=new StringBuffer();
        if(checkstatus.isChecked())
        {
            str.append("Person is Married!");
        }
        else {
            str.append("Person is not Married!");
        }
        if (male.isChecked())
        {
            str.append("He is Male.");
        }
        else {
            str.append("She is Female.");
        }
        if (swgrad.isChecked())
        {
            str.append("Person is Graduated.");
        }
        else
            {
            str.append("Person is not Graduated.");
        }
        textresult.setText(str.toString());
    }
}
