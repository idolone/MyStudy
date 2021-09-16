package com.example.mytoolbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.tb);

         toolbar.setNavigationOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Log.e("KIN","toolbar on click");
             }
         });

         Toolbar toolbar1 = findViewById(R.id.tb1);

         toolbar1.setTitle("标题");
         toolbar1.setNavigationIcon(R.drawable.ic_baseline_arrow_back_ios_24);


    }
}