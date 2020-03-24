package com.example.testdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mContentTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById();
    }


    private void findViewById() {
        mContentTv = findViewById(R.id.tv_text1);
        mContentTv.post(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
