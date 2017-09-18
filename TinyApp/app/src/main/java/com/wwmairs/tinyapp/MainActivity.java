package com.wwmairs.tinyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.wwmairs.tinyapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitName(View view) {
        Intent intent = new Intent(this, WelcomeActivity.class);
        EditText editText = (EditText) findViewById(R.id.userName);
        TextView textView = (TextView) findViewById(R.id.namePrompt);
        String newMessage = "Hello " + editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, newMessage);
        startActivity(intent);
    }
}
