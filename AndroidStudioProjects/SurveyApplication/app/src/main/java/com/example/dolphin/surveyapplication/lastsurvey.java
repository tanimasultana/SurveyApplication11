package com.example.dolphin.surveyapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lastsurvey extends AppCompatActivity {
    Button nextlast,prevlast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lastsurvey);
        nextlast=findViewById(R.id.nextlast);
        prevlast=findViewById(R.id.prevlast);
        nextlast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(lastsurvey.this,Dashboard.class);
                startActivity(i);
            }
        });

        prevlast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii =new Intent(lastsurvey.this,fifthSurvey.class);
                startActivity(ii);
            }
        });
    }
}
