package com.example.dolphin.surveyapplication;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button sub;
    Animation frombottom,fromtop,fromtop1;
    ImageView ballon;

    private static int splasttimeout=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sub=(Button)findViewById(R.id.sub);
        ballon=(ImageView)findViewById(R.id.ballon);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this,firstqs.class);
                startActivity(i);
                finish();

            }
        },splasttimeout);
        sub=(Button)findViewById(R.id.sub);
        ballon=(ImageView)findViewById(R.id.ballon);

        frombottom= AnimationUtils.loadAnimation(this,R.anim.frombottom);
        fromtop=AnimationUtils.loadAnimation(this,R.anim.fromtop);
        fromtop1=AnimationUtils.loadAnimation(this,R.anim.uptodown);
        ballon.setAnimation(fromtop);
        sub.setAnimation(frombottom);





//        Intent i = new Intent(this, splash.class); ////imageActivity cilo ekhane
//        startActivity(i);
    }
}
