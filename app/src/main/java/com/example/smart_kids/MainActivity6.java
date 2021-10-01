package com.example.smart_kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
    public void intentScreenbackNanas(View view){
        Intent myIntent = new Intent(this,MainActivity2.class);
        startActivity(myIntent);
    }
}