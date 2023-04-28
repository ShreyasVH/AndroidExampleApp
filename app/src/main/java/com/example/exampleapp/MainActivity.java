package com.example.exampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        Log.i("Info", "Login Button pressed!");
        EditText userNameText = (EditText) findViewById(R.id.userName);
        EditText passwordText = (EditText) findViewById(R.id.password);

        Log.i("Username", userNameText.getText().toString());
        Log.i("Password", passwordText.getText().toString());
    }
}