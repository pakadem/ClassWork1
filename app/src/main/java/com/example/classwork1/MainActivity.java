package com.example.classwork1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText message;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = findViewById(R.id.editTextMessage);
        next = findViewById(R.id.Next);
        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                String textmessage = message.getText().toString();

                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("keymessage", textmessage);
                startActivity(intent);
            }
        });
    }

}