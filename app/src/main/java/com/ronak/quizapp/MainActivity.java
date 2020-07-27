package com.ronak.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button strt;
    //protected TextView t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        strt = (Button) findViewById(R.id.start_quiz);

        strt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                openNewActivity();
            }
        });
    }
    public void openNewActivity()
    {
        Intent intent = new Intent(this, ques1.class);
        startActivity(intent);
    }

}
