package com.jaytala.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class experience3 extends AppCompatActivity {

    EditText company, job, description, year_1;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience3);


        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String mobile = getIntent().getStringExtra("mobile");
        String gmail = getIntent().getStringExtra("gmail");
        String hobby = getIntent().getStringExtra("hobby");
        String course = getIntent().getStringExtra("course");
        String school = getIntent().getStringExtra("school");
        String grade = getIntent().getStringExtra("grade");
        String year = getIntent().getStringExtra("year");

        company = findViewById(R.id.company);
        job = findViewById(R.id.job);
        description = findViewById(R.id.description);
        year_1 = findViewById(R.id.year_1);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String c = company.getText().toString();
                String j = job.getText().toString();
                String d = description.getText().toString();
                String y = year_1.getText().toString();


                Intent intent = new Intent(experience3.this, skill4.class);
                intent.putExtra("name", name);
                intent.putExtra("surname", surname);
                intent.putExtra("mobile", mobile);
                intent.putExtra("gmail", gmail);
                intent.putExtra("hobby", hobby);
                intent.putExtra("course", course);
                intent.putExtra("school", school);
                intent.putExtra("grade", grade);
                intent.putExtra("year", year);
                intent.putExtra("course", c);
                intent.putExtra("job", j);
                intent.putExtra("description", d);
                intent.putExtra("company", c);
                intent.putExtra("year", y);
                startActivity(intent);

            }
        });

    }
}