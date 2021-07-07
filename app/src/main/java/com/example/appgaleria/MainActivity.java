package com.example.appgaleria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickNew(View view) {
        Intent intent = new Intent(this, ActivityPhoto.class);
        startActivity(intent);
    }

    public void clickNew2(View view) {
        Intent intent = new Intent(this, ActivityGaleria.class);
        startActivity(intent);
    }
}