package com.fahad.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
EditText form1,form2,form3,form4,form5;
Button button3,next4;
TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        next4=findViewById(R.id.next4);
        form1=findViewById(R.id.form1);
        form2=findViewById(R.id.form2);
        form3=findViewById(R.id.form3);
        form4=findViewById(R.id.form4);
        form5=findViewById(R.id.form5);
        button3=findViewById(R.id.button3);
        textView3=findViewById(R.id.textView3);



next4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity4.this,MainActivity5.class);
        startActivity(intent);
    }
});


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                String sform1=form1.getText().toString();
                String sform2=form2.getText().toString();
                String sform3=form3.getText().toString();
                String sform4=form4.getText().toString();
                String sform5=form5.getText().toString();

if (sform1.length()<=100 && sform2.length()<=100 && sform3.length()<=100 && sform4.length()<=100 && sform5.length()<=100){

    float  percentage1=Float.parseFloat(sform1);
    float percentage2=Float.parseFloat(sform2);
    float  percentage3=Float.parseFloat(sform3);
    float percentage4=Float.parseFloat(sform4);
    float  percentage5=Float.parseFloat(sform5);

    float my_percent=(percentage1+percentage2+percentage3+percentage4+percentage5)/5;


    if (my_percent >= 90 ){

        textView3.setText("Congratulation your number is = "+my_percent+"\nyour grade is A+" );
    }else if (my_percent >=80 ){
        textView3.setText("Congratulation your number is = "+my_percent+"\nyour grade is A" );
    }else if (my_percent >= 70){
        textView3.setText("Congratulation your number is = "+my_percent+"\nyour grade is A-" );
    }else if (my_percent >= 60){
        textView3.setText("Congratulation your number is = "+my_percent+"\nyour grade is B" );
    }else if (my_percent >= 40){
        textView3.setText("Congratulation your number is = "+my_percent+"\nyour grade is C" );
    }else {
        textView3.setText("sorry..you are fail.your number is = "+my_percent+"\nyour grade is F" );
    }



}else {
    form1.setError("Warning");
    form2.setError("Warning");
    form3.setError("Warning");
    form4.setError("Warning");
    form5.setError("Warning");


    textView3.setText("fill up the gaps");
}


            }
        });














    }
}