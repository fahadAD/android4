package com.fahad.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
EditText search2;
Button button2,next2;
TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        search2=findViewById(R.id.search2);
        button2=findViewById(R.id.button2);
        textView2=findViewById(R.id.textView2);

        next2=findViewById(R.id.next2);



        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intent);


            }
        });










button2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        int number;

        String snumber=search2.getText().toString();


        if (snumber.length() <=7 ){
            number=Integer.parseInt(snumber);


            if (number == 1){

                textView2.setText(number+" is sunday ");

            }else if (number == 2){
                textView2.setText(number+" is monday ");

            }else if (number == 3){
                textView2.setText(number+" is tuesday ");

            }else if (number == 4){
                textView2.setText(number+" is wednesday ");

            }else if (number == 5){
                textView2.setText(number+" is thursday ");

            }else if (number == 6){
                textView2.setText(number+" is friday ");

            }else if (number == 7){
                textView2.setText(number+" is saturday ");
            }else {
                textView2.setText(number+" not funny ");

            }

        }else {
            search2.setError("warning");
            textView2.setText(" fill up the gaps ");

        }












    }
});





    }
}