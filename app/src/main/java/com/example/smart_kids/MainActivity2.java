package com.example.smart_kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void intentScreenAnggur(View view) {
        Intent myIntent = new Intent(this, MainActivity3.class);
        startActivity(myIntent);
    }

    public void intentScreenKiwi(View view) {
        Intent myIntent = new Intent(this, MainActivity4.class);
        startActivity(myIntent);
    }

    public void intentScreenLemon(View view) {
        Intent myIntent = new Intent(this, MainActivity5.class);
        startActivity(myIntent);

    }
    public void intentScreenNanas(View view){
        Intent myIntent = new Intent(this,MainActivity6.class);
        startActivity(myIntent);
    }
    public void intentScreenPir(View view){
        Intent myIntent = new Intent(this,MainActivity7.class);
        startActivity(myIntent);
    }
    public void intentScreenPisang(View view){
        Intent myIntent = new Intent(this,MainActivity8.class);
        startActivity(myIntent);
    }
    public void intentScreenSemangka(View view){
        Intent myIntent = new Intent(this,MainActivity9.class);
        startActivity(myIntent);
    }
    public void intentScreenStroberry(View view){
        Intent myIntent = new Intent(this,MainActivity10.class);
        startActivity(myIntent);
    }
    public void intentScreenbackAyomulai(View view){
        Intent myIntent = new Intent(this, HomeActivity.class);
        startActivity(myIntent);
    }


}
