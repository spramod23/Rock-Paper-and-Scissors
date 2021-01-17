package com.example.practice5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int number = new Random().nextInt(3);
    }
    public void play(View v)
    {
        Intent i = new Intent(MainActivity.this,Result.class);
        int number = new Random().nextInt(3);
        Spinner s = (Spinner)findViewById(R.id.spinner);
        int player = (int) s.getSelectedItemId();
        i.putExtra("CPU",number + 1);
        i.putExtra("Player",player+1);
        startActivity(i);
    }
}
