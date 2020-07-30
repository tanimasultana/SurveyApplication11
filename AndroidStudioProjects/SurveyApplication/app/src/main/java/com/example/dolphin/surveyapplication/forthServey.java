package com.example.dolphin.surveyapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class forthServey extends AppCompatActivity {

    private Button prev3, next4;
    public static String ss;
    EditText edt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth_servey);
        prev3=findViewById(R.id.prev3);
        next4=findViewById(R.id.next4);
        edt1=findViewById(R.id.address);
        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(edt1.getText()))
                {
                    edt1.setError("Please fill the required option");
                    edt1.setHint("Please enter contact number");
                }
                else
                {
                    Intent i = new Intent(forthServey.this, fifthSurvey.class);
                    ss=edt1.getText().toString();

                    startActivity(i);

                }
            }
        });

        prev3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(forthServey.this,thirdServey.class);
                startActivity(ii);
            }
        });
    }
}
