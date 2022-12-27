package com.fahad.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
EditText search10;
TextView textView10;
Button button10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        search10=findViewById(R.id.search10);
        button10=findViewById(R.id.button10);
        textView10=findViewById(R.id.textView10);

button10.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

      float units,bill;

String sunit=search10.getText().toString();

if (sunit.length()>0){

    units=Float.parseFloat(sunit);
    bill=0;


    if (units<=50){
        bill= (float) (units*0.50);
    }else if (units<=150){
        bill= (float) (25+(units-50)*0.75);
    }else if (units<=250){
        bill= (float) (25+75+(units-150)*1.20);
    }else {
        bill= (float) (25+75+120+(units-250)*1.50);
    }
    bill= (float) (bill + bill*0.20);

    textView10.setText("total current bill = "+bill+" taka");
}else {
    search10.setError("warning");
}




































    }
});





























    }
}