package com.ronak.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    private static TextView res;
    private String cnt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        res=(TextView) findViewById(R.id.result);
        Intent intent=getIntent();
        cnt2 = getIntent().getStringExtra("cnt1");
        res.setText("Your\nScore\nis "+cnt2+"\nBYE");


    }
    //back press overriding
    @Override
    public void onBackPressed()
    {}

}