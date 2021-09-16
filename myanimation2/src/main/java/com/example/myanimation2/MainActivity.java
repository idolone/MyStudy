package com.example.myanimation2;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ValueAnimator valueani= ValueAnimator.ofFloat(0f,1f);
       valueani.setDuration(2000);
       valueani.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
           @Override
           public void onAnimationUpdate(ValueAnimator animation) {
               float value = (float) animation.getAnimatedValue();
               Log.e("","animation ..."+value);
           }
       });

       valueani.start();

        TextView textView = findViewById(R.id.tv);
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(textView,"alpha",0f,1f);
        objectAnimator.setDuration(4000);
        objectAnimator.start();
        objectAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animation) {
                super.onAnimationCancel(animation);
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                super.onAnimationRepeat(animation);
            }

            @Override
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation);
            }

            @Override
            public void onAnimationPause(Animator animation) {
                super.onAnimationPause(animation);
            }

            @Override
            public void onAnimationResume(Animator animation) {
                super.onAnimationResume(animation);
            }
        });




    }
}