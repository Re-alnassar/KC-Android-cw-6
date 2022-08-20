package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Student> students = new ArrayList<>();

    int r = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView studentName = findViewById(R.id.studentName);
        TextView studentAge = findViewById(R.id.studentAge);
        ImageView studentPhoto = findViewById(R.id.studentPhoto);



        Student s1 = new Student("Yousef",14,R.drawable.frog);
        Student s2 = new Student("Salman",13,R.drawable.black);
        Student s3 = new Student("Majed",15,R.drawable.white);


        students.add(s1);
        students.add(s2);
        students.add(s3);


        studentName.setText(students.get(r).getStudentName());
        studentAge.setText(String.valueOf(students.get(r).getStudentAge()));
        studentPhoto.setImageResource(students.get(r).getStudentPhoto());







    }
}
