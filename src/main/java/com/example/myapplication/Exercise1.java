package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;



public class Exercise1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);

        final TextView textview = findViewById(R.id.textview);
        EditText  editText = findViewById(R.id.editText);
      editText.addTextChangedListener(
              new TextWatcher() {
                  @Override
                  public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                  }

                  @Override
                  public void onTextChanged(CharSequence s, int start, int before, int count) {
                      String radius=s.toString();
                      try {
                          int r = Integer.parseInt(radius);
                          double area = 3.142 * Math.pow(r, 2);
                          textview.setText("A = "+ String.valueOf(area));
                      }
                      catch (Exception ex)
                      {
                          textview.setText("A=0");
                      }

                  }

                  @Override
                  public void afterTextChanged(Editable s) {

                  }
              }
      );



    }


}
