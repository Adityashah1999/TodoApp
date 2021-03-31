package com.aditya.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashSreen extends AppCompatActivity {

    //Variables
    Animation topAnim, bottomAnim;
    ImageView image1, image2;
    TextView rights, slogan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_sreen);

        //Animation
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animaton);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        //Hooks
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.pencil);
        slogan= findViewById(R.id.moto);
        rights = findViewById(R.id.madeBy);

        image1.setAnimation(topAnim);
        slogan.setAnimation(topAnim);
        image2.setAnimation(bottomAnim);
        rights.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashSreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 2500);
    }
}