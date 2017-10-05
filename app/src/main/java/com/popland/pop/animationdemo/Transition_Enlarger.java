package com.popland.pop.animationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class Transition_Enlarger extends AppCompatActivity {
ViewGroup viewGroup;
View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition__enlarger);
        viewGroup = (ViewGroup)findViewById(R.id.activity_transition__enlarger);
        view = (View)findViewById(R.id.btn);

        viewGroup.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                moveButton();
                return true;
            }
        });
    }

    public void moveButton(){
        TransitionManager.beginDelayedTransition(viewGroup);//API 19
        //move Button to parent bottom right
        RelativeLayout.LayoutParams positionRule = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        positionRule.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM,RelativeLayout.TRUE);
        positionRule.addRule(RelativeLayout.ALIGN_PARENT_RIGHT,RelativeLayout.TRUE);
        view.setLayoutParams(positionRule);
        //enlarge Button
        ViewGroup.LayoutParams sizeRule = view.getLayoutParams();
        sizeRule.width = 450;
        sizeRule.height = 150;
        view.setLayoutParams(sizeRule);
    }
}
