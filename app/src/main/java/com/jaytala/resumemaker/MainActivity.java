package com.jaytala.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name, surname, mobile, gmail, hobby;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next = findViewById(R.id.next);
        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        mobile = findViewById(R.id.mobile);
        gmail = findViewById(R.id.gmail);
        hobby = findViewById(R.id.hobby);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n = name.getText().toString();
                String s = surname.getText().toString();
                String m = mobile.getText().toString();
                String g = gmail.getText().toString();
                String h = hobby.getText().toString();


                Intent intent = new Intent(MainActivity.this, education2.class);
                intent.putExtra("name", n);
                intent.putExtra("surname", s);
                intent.putExtra("mobile", m);
                intent.putExtra("gmail", g);
                intent.putExtra("hobby", h);
                startActivity(intent);
            }
        });


    }
}