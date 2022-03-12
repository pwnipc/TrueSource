package com.turing.truesource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signup = (Button) findViewById(R.id.signup);
        signup.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view == signup){
            Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
            startActivity(intent);
        }

    }
}