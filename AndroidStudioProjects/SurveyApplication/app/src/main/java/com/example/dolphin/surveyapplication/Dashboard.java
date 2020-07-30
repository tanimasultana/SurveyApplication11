package com.example.dolphin.surveyapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {
    TextView tv,tv1,tv2,tv3,tv4;
    String st;
    Button response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        tv=findViewById(R.id.shownumber);
        tv1=findViewById(R.id.showfeel);
        tv2=findViewById(R.id.showyn);
        tv3=findViewById(R.id.showctgr);
        tv4=findViewById(R.id.showphone);
        //st=getIntent().getExtras().getString("value");
        //st=getIntent().getExtras().getString("value");
        tv.setText("Condition : "+secondservey.string);
        tv1.setText("Address : "+forthServey.ss);
        tv2.setText("product : "+thirdServey.rb);
        tv3.setText("Rating : "+fifthSurvey.ctgr);
        if((firstsurvey.number).length()!=0)
        {
            tv4.setText("Contact : "+firstsurvey.number);
        }
        else
        {
            tv4.setText("No number added");
        }

        response=findViewById(R.id.response);
        response.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Dashboard.this,firstsurvey.class);
                startActivity(i);
            }
        });

    }
}
