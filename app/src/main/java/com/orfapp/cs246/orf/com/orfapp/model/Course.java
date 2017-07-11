package com.orfapp.cs246.orf.com.orfapp.model;

import java.util.List;

/**
 * Created by Nacher on 20/6/2017.
 * We will have courses that contain students, teachers, and years.
 * Each course will have one teacher, multiple students, and one year.
 * This will help the teacher to search for a specific student and
 * their information inside of the course.
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
