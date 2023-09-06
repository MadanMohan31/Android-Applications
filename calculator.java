package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int number1, number2;
    TextView Output;
    EditText no1, no2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        no1 = (EditText) findViewById(R.id.edit1);
        no2 = (EditText) findViewById(R.id.edit2);
        Output =(TextView) findViewById(R.id.output);
    }
    public void add(View view)
    {
        number1 = Integer.parseInt (no1.getText().toString());
        number2 = Integer.parseInt (no2.getText() .toString ());
        Output.setText(String.valueOf (number1+number2));
}
    public void sub (View view)
    {
        number1 = Integer.parseInt (no1.getText().toString());
        number2 = Integer.parseInt(no2.getText().toString());
        Output. setText(String.valueOf(number1-number2));
    }
    public void mul (View view) {
        number1 = Integer.parseInt(no1.getText().toString());
        number2 = Integer.parseInt(no2.getText().toString());
        Output.setText(String.valueOf(number1*number2));
    }
    public void div(View view)
    {
        number1 = Integer.parseInt (no1. getText() . toString());
        number2 = Integer.parseInt (no2.getText () .toString());
        Output. setText(String.valueOf(number1/number2));
    }
}
