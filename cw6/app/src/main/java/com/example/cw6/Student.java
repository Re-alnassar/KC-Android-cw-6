package com.example.cw6;

public class Student {


    private String studentName;
    private int studentAge;
    private int studentPhoto;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentPhoto() {
        return studentPhoto;
    }

    public void setStudentPhoto(int studentPhoto) {
        this.studentPhoto = studentPhoto;
    }

    public  Student(String studentName, int studentAge, int studentPhoto) {

        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentPhoto = studentPhoto;





    }

}
