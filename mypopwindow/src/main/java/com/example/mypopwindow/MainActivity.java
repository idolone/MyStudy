package com.example.mypopwindow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void kinclick(View view) {

           View  popview = getLayoutInflater().inflate(R.layout.pop_view,null);
//        PopupWindow popwindow = new PopupWindow(popview, ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.MATCH_PARENT);
        PopupWindow popwindow = new PopupWindow(popview, 600,
               600,true);
         popwindow.showAsDropDown(view);


    }
}