package com.example.practice5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Result extends Activity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        TextView temp = (TextView)findViewById(R.id.textView);
        final int Stone = 1;
        final int Paper = 2;
        final int Scissor = 3;
        int CPU = getIntent().getIntExtra("CPU",-1);
        int Player = getIntent().getIntExtra("Player",-1);
        if(CPU==Player && Player == CPU)
            temp.setText("Draw");
        else if(CPU==Stone && Player== Scissor)
            temp.setText("You Lost");
        else if(CPU==Paper && Player== Stone)
            temp.setText("You Lost");
        else if(CPU==Scissor && Player == Paper)
            temp.setText("You Lost");
        else
            temp.setText("You Won");
        Toast.makeText(this, "CPU was : " + CPU, Toast.LENGTH_SHORT).show();
    }
    public void close(View v)
    {
        this.finish();
    }
}
