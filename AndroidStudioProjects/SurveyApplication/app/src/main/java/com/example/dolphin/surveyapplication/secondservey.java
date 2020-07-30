package com.example.dolphin.surveyapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class secondservey extends AppCompatActivity {

    String feel="";
    public static String string ;
    Button prev1,next2;
    CheckBox ch1,ch2,ch3,ch4,ch5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondservey);
        ch1=findViewById(R.id.one);
        ch2=findViewById(R.id.two);
        ch3=findViewById(R.id.three);
        ch4=findViewById(R.id.four);
        ch5=findViewById(R.id.five);
        prev1=findViewById(R.id.prev1);
        next2=findViewById(R.id.next2);
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder result=new StringBuilder();
                //result.append("You feel like ");
                if(ch1.isChecked()){
                    result.append(" Very good");

                }
                if(ch2.isChecked()){
                    result.append(" Good");

                }
                if(ch3.isChecked()){
                    result.append(" Neutral");

                }
                if(ch4.isChecked())
                {
                    result.append(" Bad");
                }
                if(ch5.isChecked())
                {
                    result.append("Very Bad");
                }

                //Displaying the message on the toast
                if(TextUtils.isEmpty(result.toString()))
                {
                    next2.setError("Please select at least one");
                    next2.setHint("Please select at least one");
                }
                else {
                    string=result.toString();
                    Intent i=new Intent(secondservey.this,thirdServey.class);
                    i.putExtra("value",string);
                    startActivity(i);
                }

            }
        });

        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(secondservey.this,firstsurvey.class);
                startActivity(ii);
            }
        });

    }


}

