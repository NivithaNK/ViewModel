package com.example.viewmodel;

import static androidx.lifecycle.ViewModelProvider.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;


import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = findViewById(R.id.textview);
        RandomNumber model = new RandomNumber();
        model = new ViewModelProvider(MainActivity.this).get(RandomNumber.class);
        String value = model.getNumber();
        textview.setText(value);
    }
}