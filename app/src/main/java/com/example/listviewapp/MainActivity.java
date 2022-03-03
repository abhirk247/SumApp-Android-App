package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1;

    EditText number2;
    Button Add_button;
    TextView result;
    int ans=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1=(EditText) findViewById(R.id.editTextTextPersonName3);
        number2=(EditText) findViewById(R.id.editTextTextPersonName4);
        Add_button=(Button) findViewById(R.id.button);
        result = (TextView) findViewById(R.id.textView4);

        Add_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());

                double sum = num1 + num2;

                result.setText(Double.toString(sum));
            }
        });

    }
}