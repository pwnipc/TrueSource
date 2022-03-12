package com.turing.truesource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OptionsActivity extends AppCompatActivity implements View.OnClickListener {
    Button articleAdd, articleRead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        articleAdd = (Button) findViewById(R.id.add_article);
        articleRead = (Button) findViewById(R.id.read_article);

        articleRead.setOnClickListener(this);
        articleAdd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == articleAdd){
            Intent intent = new Intent(this, AddActivity.class);
            startActivity(intent);
        }else if(view == articleRead){
            Intent intent = new Intent(this, ReadActivity.class);
            startActivity(intent);
        }else {
            Toast.makeText(this, "We don't do that here", Toast.LENGTH_LONG).show();
        }

    }
}