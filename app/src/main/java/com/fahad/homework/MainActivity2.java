package com.fahad.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.time.Year;

public class MainActivity2 extends AppCompatActivity {
EditText search1;
Button button1,next1;
TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        next1=findViewById(R.id.next1);
        search1=findViewById(R.id.search1);
        button1=findViewById(R.id.button1);
        textView1=findViewById(R.id.textView1);




        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             int year;

             String syear=search1.getText().toString();

             if (syear.length()>0){

                 year=Integer.parseInt(syear);

                 if (year%400 == 0){
                     textView1.setText(year+" is leap year");

                 }else if (year%4 == 0 && year%100 != 0){
                     textView1.setText(year+" is leap year");
                 }else {
                     textView1.setText(year+"  is  not leap year");
                 }


             }else {
                 search1.setError("Warning");
                 textView1.setText(" fill up the gap");
             }





            }
        });














    }
}