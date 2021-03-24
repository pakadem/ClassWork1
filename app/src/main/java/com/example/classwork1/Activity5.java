package com.example.classwork1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity5 extends AppCompatActivity {

    private EditText message;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        message = findViewById(R.id.editTextMessage);
        next = findViewById(R.id.Next);

        String textmessage = getIntent().getStringExtra("keymessage") + " I have read the Message";

        message.setText(textmessage);

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                String textmessage = message.getText().toString();

                Intent intent = new Intent( Activity5.this, MainActivity.class);
                intent.putExtra("keymessage", textmessage);
                startActivity(intent);
            }
        });
    }
}