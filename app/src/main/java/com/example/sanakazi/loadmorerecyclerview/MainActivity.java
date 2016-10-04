package com.example.sanakazi.loadmorerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sanakazi.loadmorerecyclerview.fragments.ActivityStreamFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityStreamFragment fragment = new ActivityStreamFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment, "ACTIVITYSTREAM").addToBackStack(null).commit();
    }
}
