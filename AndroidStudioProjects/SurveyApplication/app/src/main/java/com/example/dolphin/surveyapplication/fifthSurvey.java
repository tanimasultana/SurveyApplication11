package com.example.dolphin.surveyapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class fifthSurvey extends AppCompatActivity {

    Button next5, prev4;
    public static String ctgr;
    TextView tev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_survey);
        next5 = findViewById(R.id.next5);
        prev4 = findViewById(R.id.prev4);
        tev = findViewById(R.id.fifthtextview);


        final Spinner spinner = (Spinner) findViewById(R.id.spinner1);



        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Choose Options");
        categories.add("Very Often");
        categories.add("Often");
        categories.add("Moderate");
        categories.add("Not much");
        categories.add("Never Used");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("Choose Options")) {
                    ctgr="";

                } else {
                    final String item = parent.getItemAtPosition(position).toString();
                    ctgr=item;



                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ctgr.length()!=0)
                {
                    Intent i = new Intent(fifthSurvey.this, lastsurvey.class);

                    startActivity(i);
                }
                else
                {
                    tev.setError("Please choose one");
                    tev.setHint("Please choose one");
                }


            }
        });

        prev4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(fifthSurvey.this,forthServey.class);
                startActivity(ii);
            }
        });

    }




}



