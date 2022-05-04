package com.jaytala.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class skill4 extends AppCompatActivity {

    EditText skill1, skill2, skill3, skill4;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill4);

        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String mobile = getIntent().getStringExtra("mobile");
        String gmail = getIntent().getStringExtra("gmail");
        String hobby = getIntent().getStringExtra("hobby");
        String course = getIntent().getStringExtra("course");
        String school = getIntent().getStringExtra("school");
        String grade = getIntent().getStringExtra("grade");
        String year = getIntent().getStringExtra("year");
        String company = getIntent().getStringExtra("company");
        String job = getIntent().getStringExtra("job");
        String description = getIntent().getStringExtra("description");
        String year_1 = getIntent().getStringExtra("year");


        skill1 = findViewById(R.id.skill1);
        skill2 = findViewById(R.id.skill2);
        skill3 = findViewById(R.id.skill3);
        skill4 = findViewById(R.id.skill4);
        next = findViewById(R.id.next);

     next.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

                String s1 = skill1.getText().toString();
                String s2 = skill2.getText().toString();
                String s3 = skill3.getText().toString();
                String s4 = skill4.getText().toString();

                Intent intent = new Intent(skill4.this, workprofile5.class);
                intent.putExtra("name", name);
                intent.putExtra("surname", surname);
                intent.putExtra("mobile", mobile);
                intent.putExtra("gmail", gmail);
                intent.putExtra("hobby", hobby);
                intent.putExtra("company", company);
                intent.putExtra("course", course);
                intent.putExtra("school", school);
                intent.putExtra("grade", grade);
                intent.putExtra("year", year);
                intent.putExtra("job", job);
                intent.putExtra("description", description);
                intent.putExtra("year_1", year_1);
                intent.putExtra("skill1", s1);
                intent.putExtra("skill2", s2);
                intent.putExtra("skill3", s3);
                intent.putExtra("skill4", s4);
                startActivity(intent);

            }
        });

    }
}