package com.example.dolphin.surveyapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.nio.charset.Charset;

public class thirdServey extends AppCompatActivity {
    Button prev2,next3;
    RadioButton yes,no,genderradioButton;
    RadioGroup radioGroup;
    public static String rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_servey);
        yes=findViewById(R.id.y);
        no=findViewById(R.id.n);
        prev2=findViewById(R.id.prev2);
        next3=findViewById(R.id.next3);
        radioGroup=findViewById(R.id.radio1);

       next3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               int selectedId = radioGroup.getCheckedRadioButtonId();
               genderradioButton =  findViewById(selectedId);
               if(selectedId==-1){
                   next3.setError("Please select one");
                   next3.setHint("Please select one");

               }
               else{
                   final String string=((RadioButton)findViewById(radioGroup.getCheckedRadioButtonId())).getText().toString();
                   rb=string;
                   Intent i=new Intent(thirdServey.this,forthServey.class);
                   startActivity(i);


               }
           }
       });

        prev2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(thirdServey.this,secondservey.class);
                startActivity(ii);
            }
        });
    }
}
