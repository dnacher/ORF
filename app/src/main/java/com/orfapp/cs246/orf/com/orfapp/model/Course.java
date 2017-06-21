package com.orfapp.cs246.orf.com.orfapp.model;

import java.util.List;

/**
 * Created by Nacher on 20/6/2017.
 */

public class Course {

    private int idClass;
    private Teacher teacher;
    List<Student> students;
    private int year;

    public Course(){

    }

    public int getIdClass() {
        return idClass;
    }

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
