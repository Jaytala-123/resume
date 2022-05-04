package com.jaytala.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class reference7 extends AppCompatActivity {

    EditText company_name, weblink;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference7);

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


        company_name = findViewById(R.id.company_name);
        weblink = findViewById(R.id.weblink);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String cn = company_name.getText().toString();
                String cw = weblink.getText().toString();

                Intent intent = new Intent(reference7.this, format8.class);
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
                intent.putExtra("company_name", cn);
                intent.putExtra("weblink", cw);

                startActivity(intent);

            }
        });
    }
}