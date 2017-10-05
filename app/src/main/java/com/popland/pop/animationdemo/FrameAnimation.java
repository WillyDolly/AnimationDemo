package com.popland.pop.animationdemo;

import android.app.Dialog;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FrameAnimation extends AppCompatActivity {
ImageView ivAnimation;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);
        ivAnimation = (ImageView) findViewById(R.id.ivAnimation);
        btn = (Button)findViewById(R.id.btn);

        ivAnimation.setBackgroundResource(R.drawable.animation_list);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(FrameAnimation.this);
                dialog.setContentView(R.layout.activity_transition__enlarger);
                dialog.setCanceledOnTouchOutside(true);
                dialog.show();
            }
        });
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        AnimationDrawable animationDrawable = (AnimationDrawable) ivAnimation.getBackground();
        if(hasFocus)
            animationDrawable.start();
        else
            animationDrawable.stop();
    }

}
