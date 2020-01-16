package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class dialogActivity extends AppCompatActivity {
     static TextView txtresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        txtresult=findViewById(R.id.txttimeresult);
    }

    public void buShow(View view) {
        PopUp mypopup=new PopUp();
        mypopup.show(getSupportFragmentManager(),"Show PopUp");
    }
}
