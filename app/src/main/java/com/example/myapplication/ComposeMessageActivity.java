package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ComposeMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose_message);
        Intent i = getIntent();
        String name = i.getStringExtra("NAME");
        if (name==null){
            ((TextView) findViewById(R.id.textView2)).setText("composing message");
        }else{
            ((TextView) findViewById(R.id.textView2)).setText(name);
        }

    }
}