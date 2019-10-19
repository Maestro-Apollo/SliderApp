package com.example.sliderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

public class Main2Activity extends AppCompatActivity {

    private SlidrInterface slidr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        slidr = Slidr.attach(this);
    }

    public void LockBtn(View view) {
        slidr.lock();

    }

    public void UnlockBtn(View view) {
        slidr.unlock();
    }
}
