package com.fahad.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText search;
Button button,next;
TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next=findViewById(R.id.next);
        search=findViewById(R.id.search);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);



     next.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent=new Intent(MainActivity.this,MainActivity2.class);
             startActivity(intent);
         }
     });



button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        int number;

        String S_number=search.getText().toString();

        if (S_number.length()>0){
            number=Integer.parseInt(S_number);


            if (number%5 == 0 && number%11 == 0){

                textView.setText(number+" is divisible by 5 & 11");
            }else if (number%5 == 0){

                textView.setText(number+" is divisible by 5 .but this number is not divisible by  11");
            }else  if (number%11 == 0){

                textView.setText(number+" is divisible by 11 .but this number is not divisible by  5 ");
            }else {
                textView.setText(number+" not equal");
            }

        }else {
            search.setError("Warning");
            textView.setText(" fill up the gap");
        }


    }
});


















    }
}