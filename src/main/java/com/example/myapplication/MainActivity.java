package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void butadd(View view) {
        EditText Number1_edit=findViewById(R.id.Number1_edit);
        EditText Number2_edit=findViewById(R.id.Number2_edit);
        Button btnSelected=(Button)view;
        String num1=Number1_edit.getText().toString();
        String num2=Number2_edit.getText().toString();
        int n1=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);
        int res=0;
        switch (btnSelected.getId())
        {
            case R.id.butadd:
            {
                res=findResult(n1 ,n2,'+');
                break;
            }
            case  R.id.butsub:
            {
                res=findResult(n1 ,n2,'-');
                break;
            }
            case R.id.butmul:
            {
                res=findResult(n1,n2,'*');
                break;
            }
            case R.id.butdiv:
            {
                res=findResult(n1,n2,'/');
                break;
            }
            default:
                res=0;
        }
       EditText result_edit=findViewById(R.id.resultedit);
        result_edit.setText(String.valueOf(res));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.mainmenu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.homemenu:
                Toasty.success(getApplicationContext(),"Home Click",Toast.LENGTH_LONG).show();
                break;
            case R.id.helpmenu:
                Toasty.error(getApplicationContext(),"Help Click",Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }

    public int findResult(int x,int y,char op)
    {
        switch (op)
        {
            case '+' :return x+y;
            case '-' :return x-y;
            case '*' : return x*y;
            case '/' :return x/y;
        }
        return 0;
    }
}
