package com.popland.pop.animationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class TweenAnimation extends AppCompatActivity {
ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);
        iv = (ImageView)findViewById(R.id.iv);
    }

    public void Alpha(View v){
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
        iv.startAnimation(animation);
    }

    public void Scale(View v){
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
        iv.startAnimation(animation);
    }

    public void Translate(View v){
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
        iv.startAnimation(animation);
    }

    public void Rotate(View v){
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        iv.startAnimation(animation);
    }

    public void Set(View v){
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.set);
        iv.startAnimation(animation);
    }
}
