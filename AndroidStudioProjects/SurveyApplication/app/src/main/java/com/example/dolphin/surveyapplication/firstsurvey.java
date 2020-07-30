package com.example.dolphin.surveyapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class firstsurvey extends AppCompatActivity {

    private Button  next1;
    EditText edt;
    public static String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstsurvey);

        next1=findViewById(R.id.next1);
        edt=findViewById(R.id.phonenumber);

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                number=edt.getText().toString();
                if(number.length()==11 || number.length()==0)
                {

                    Intent i = new Intent(getApplicationContext(), secondservey.class);
                    startActivity(i);

                }
                else
                {

                    int p=number.length();
                    edt.setError("Please enter valid contact number");
                    edt.setHint("Please enter valid contact number");

                }
            }
        });

    }
}
