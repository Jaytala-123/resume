package com.jaytala.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class format8 extends AppCompatActivity {

    ImageView t1, t2, t3, t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_format8);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);

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
        String s1 = getIntent().getStringExtra("skill1");
        String s2 = getIntent().getStringExtra("skill2");
        String s3 = getIntent().getStringExtra("skill3");
        String s4 = getIntent().getStringExtra("skill4");
        String github = getIntent().getStringExtra("github");
        String linkdin = getIntent().getStringExtra("linkdin");
        String objective = getIntent().getStringExtra("objective");
        String company_name = getIntent().getStringExtra("company_name");
        String weblink = getIntent().getStringExtra("weblink");


        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(format8.this, view_9.class);
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
                intent.putExtra("github", github);
                intent.putExtra("linkdin", linkdin);
                intent.putExtra("objective", objective);
                intent.putExtra("company_name", company_name);
                intent.putExtra("weblink", weblink);
                startActivity(intent);

            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(format8.this, view_9.class);
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
                intent.putExtra("github", github);
                intent.putExtra("linkdin", linkdin);
                intent.putExtra("objective", objective);
                intent.putExtra("company_name", company_name);
                intent.putExtra("weblink", weblink);
                startActivity(intent);

            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(format8.this, view_9.class);
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
                intent.putExtra("github", github);
                intent.putExtra("linkdin", linkdin);
                intent.putExtra("objective", objective);
                intent.putExtra("company_name", company_name);
                intent.putExtra("weblink", weblink);
                startActivity(intent);

            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(format8.this, view_9.class);
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
                intent.putExtra("github", github);
                intent.putExtra("linkdin", linkdin);
                intent.putExtra("objective", objective);
                intent.putExtra("company_name", company_name);
                intent.putExtra("weblink", weblink);
                startActivity(intent);

            }
        });
    }
}