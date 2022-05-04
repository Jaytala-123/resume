package com.jaytala.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class education2 extends AppCompatActivity {

    EditText course, school, grade, year_t;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education2);


        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String mobile = getIntent().getStringExtra("mobile");
        String gmail = getIntent().getStringExtra("gmail");
        String hobby = getIntent().getStringExtra("hobby");


        course = findViewById(R.id.course);
        school = findViewById(R.id.school);
        grade = findViewById(R.id.grade );
        year_t= findViewById(R.id.year_t);
        next = findViewById(R.id.next);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String c = course.getText().toString();
                String s = school.getText().toString();
                String g = grade.getText().toString();
                String y = year_t.getText().toString();


                Intent intent = new Intent(education2.this, experience3.class);
                intent.putExtra("name", name);
                intent.putExtra("surname", surname);
                intent.putExtra("mobile", mobile);
                intent.putExtra("gmail", gmail);
                intent.putExtra("hobby", hobby);
                intent.putExtra("course", c);
                intent.putExtra("school", s);
                intent.putExtra("grade", g);
                intent.putExtra("year_t", y);
                startActivity(intent);
            }
        });
    }
}