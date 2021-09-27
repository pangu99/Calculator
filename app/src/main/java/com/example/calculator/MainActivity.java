package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunctionAddition(View view){
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        int str1 = Integer.parseInt(firstNumber.getText().toString());
        int str2 = Integer.parseInt(secondNumber.getText().toString());
        int result = str1 + str2;
        goToActivity2(result);
    }

    public void clickFunctionSubtraction(View view){
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        int str1 = Integer.parseInt(firstNumber.getText().toString());
        int str2 = Integer.parseInt(secondNumber.getText().toString());
        int result = str1 - str2;
        goToActivity2(result);
    }

    public void clickFunctionMultiplication(View view){
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        int str1 = Integer.parseInt(firstNumber.getText().toString());
        int str2 = Integer.parseInt(secondNumber.getText().toString());
        int result = str1 * str2;
        goToActivity2(result);
    }

    public void clickFunctionDivision(View view){
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        int str1 = Integer.parseInt(firstNumber.getText().toString());
        int str2 = Integer.parseInt(secondNumber.getText().toString());
        int result = str1 / str2;
        goToActivity2(result);
    }

    public void goToActivity2(int s){
        Intent intent = new Intent(this, MainActivity2.class);
        String str = Integer.toString(s);
        intent.putExtra("message",str);
        startActivity(intent);
    }
}