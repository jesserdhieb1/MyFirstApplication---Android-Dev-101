package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
    }

    public void handleText (View v){
        EditText t = findViewById(R.id.source);
        String input = t.getText().toString();
        ((TextView)findViewById(R.id.plain)).setText("Hello "+input);
        Toast.makeText(this,"Welcome "+input,Toast.LENGTH_SHORT).show();
    }

    public void lunchSettings (View v){
        Intent i = new Intent(this,SettingsActivity2.class);
        String message = ((EditText) findViewById(R.id.source)).getText().toString();
        i.putExtra("COOL",message);
        startActivity(i);
    }

    public void composeMessage(View v){
        Intent i = new Intent(this,ComposeMessageActivity.class);
        String name = ((Button) v).getText().toString();
        i.putExtra("NAME",name);
        startActivity(i);
    }
}