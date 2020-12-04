package com.fivefour.addtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     TextView tv;
     EditText et1,et2,et3;
     Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        summ();
    }
    public void summ(){
        et1= findViewById(R.id.editTextNumber1);
        et2= findViewById(R.id.editTextNumber2);
        et3= findViewById(R.id.editTextNumber3);
        tv=findViewById(R.id.textView1);
        bt=findViewById(R.id.button1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum=0,a=0,b=0,c=0,check;
                String myString = null;

                if (et1.getText().toString().equals("")){a=0;}
                 else {
                a=Integer.parseInt(et1.getText().toString());}

                if (et2.getText().toString().equals("")){b=0;}
                else {
                b=Integer.parseInt(et2.getText().toString());}

                if (et3.getText().toString().equals("")){c=0;}
                else {
                c=Integer.parseInt(et3.getText().toString());}


                sum=a+b+c;
                tv.setText(String.valueOf(sum +""));


            }
        });
    }
}