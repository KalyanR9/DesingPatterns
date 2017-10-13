package com.designpattern.inventyfy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.designpattern.inventyfy.behavioral.BehavioralActivity;
import com.designpattern.inventyfy.creational.CreationalActivity;
import com.designpattern.inventyfy.structural.StructuralActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button creationalPattern;
    private Button structuralPattern;
    private Button behaviouralPattern;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        creationalPattern = findViewById(R.id.btn_creational);
        creationalPattern.setOnClickListener(this);

        structuralPattern = findViewById(R.id.btn_structural);
        structuralPattern.setOnClickListener(this);

        behaviouralPattern = findViewById(R.id.btn_behavioural);
        behaviouralPattern.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_creational:
                Intent creationalIntent = new Intent(this, CreationalActivity.class);
                startActivity(creationalIntent);
                break;
            case R.id.btn_structural:
                Intent structuralIntent = new Intent(this, StructuralActivity.class);
                startActivity(structuralIntent);
                break;
            case R.id.btn_behavioural:
                Intent behavioralIntent = new Intent(this, BehavioralActivity.class);
                startActivity(behavioralIntent);
                break;
        }
    }
}
