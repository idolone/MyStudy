package com.example.myedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.et);
        Button  bnt = findViewById(R.id.button_id);
        bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String text = et.getText().toString();
             Log.e("KIN"," "+text);
            }
        });
    }
}