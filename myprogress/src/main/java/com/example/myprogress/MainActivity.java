package com.example.myprogress;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity {
    private ProgressBar pb;
    private ProgressBar pb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         pb = findViewById(R.id.pb);
         pb1 = findViewById(R.id.pb);
        Button btn = findViewById(R.id.btn);
        Button btn1 = findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pb.getVisibility() == v.GONE)
                {
                    pb.setVisibility(v.VISIBLE);
                }
                else {
                    pb.setVisibility(v.GONE);
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int progress = pb1.getProgress();
                Log.e("KIN","progress" + progress);
                progress += 10;

                pb1.setProgress(100);
            }
        });

    }
}