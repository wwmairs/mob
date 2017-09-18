package com.wwmairs.tinyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitName(View view) {
        // let's do something here
        EditText editText = (EditText) findViewById(R.id.userName);
        TextView textView = (TextView) findViewById(R.id.namePrompt);
        String name = editText.getText().toString();
        String newMessage = "Hello " + name;
        textView.setText(newMessage);
    }
}
