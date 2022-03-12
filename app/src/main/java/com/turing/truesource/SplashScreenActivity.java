package com.turing.truesource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {
    Animation topAnim, bottomAnim, middleAnim;
    ImageView logo;
    TextView app_name, slogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        //Animation
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        middleAnim = AnimationUtils.loadAnimation(this,R.anim.middle_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        logo = (ImageView) findViewById(R.id.logo);
        app_name = (TextView) findViewById(R.id.app_name);
        slogan = (TextView) findViewById(R.id.slogan);

        logo.setAnimation(topAnim);
        app_name.setAnimation(bottomAnim);
        slogan.setAnimation(bottomAnim);

        //Handler
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);

    }
}