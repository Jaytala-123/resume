package com.jaytala.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class view_9 extends AppCompatActivity {

    TextView name_a, surname_a, email_a, mobile_a, Dob_a, course_a, year_a, school_a, company_a, year_t, job_a, descriptpion_a, skill_t1, skill_t2, skill_t3, skill_t4, github_a, linkedin_a, objective_a, companyname_a, website_a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view9);

        name_a = findViewById(R.id.name_a);
        surname_a = findViewById(R.id.surname_a);
        email_a = findViewById(R.id.email_a);
        mobile_a = findViewById(R.id.mobile_a);
        Dob_a = findViewById(R.id.Dob_a);
        course_a = findViewById(R.id.course_a);
        year_a = findViewById(R.id.year_a);
        school_a = findViewById(R.id.school_a);
        company_a = findViewById(R.id.company_a);
        year_t = findViewById(R.id.year_t);
        job_a = findViewById(R.id.job_a);
        descriptpion_a = findViewById(R.id.descriptpion_a);
        skill_t1 = findViewById(R.id.skill_t1);
        skill_t2 = findViewById(R.id.skill_t2);
        skill_t3 = findViewById(R.id.skill_t3);
        skill_t4 = findViewById(R.id.skill_t4);
        github_a = findViewById(R.id.github_a);
        linkedin_a = findViewById(R.id.linkedin_a);
        companyname_a = findViewById(R.id.companyname_a);
        website_a = findViewById(R.id.website_a);
        objective_a = findViewById(R.id.objective);

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


        name_a.setText("" + name);
        surname_a.setText("" + surname);
        mobile_a.setText("" + mobile);
        email_a.setText("" + gmail);
        course_a.setText("" + course);
        year_a.setText("" + year);
        school_a.setText("" + school);
        company_a.setText("" + company);
        year_t.setText("" + year_1);
        job_a.setText("" + job);
        descriptpion_a.setText("" + description);
        skill_t1.setText("" + s1);
        skill_t2.setText("" + s2);
        skill_t3.setText("" + s3);
        skill_t4.setText("" + s4);
        github_a.setText("" + github);
        linkedin_a.setText("" + linkdin);
        companyname_a.setText("" + company_name);
        website_a.setText("" + weblink);
        objective_a.setText("" + objective);

    }
}