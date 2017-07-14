package com.orfapp.cs246.orf.com.orfapp.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Nacher on 20/6/2017.
 * We will have courses that contain students, teachers, and years.
 * Each course will have one teacher, multiple students, and one year.
 * This will help the teacher to search for a specific student and
 * their information inside of the course.
 */

@DatabaseTable(tableName = "course")
public class Course implements Serializable {

    @DatabaseField(generatedId = true)
    private int idClass;

    @DatabaseField
    private Teacher teacher;

    @ForeignCollectionField
    List<Student> students;

    @DatabaseField
    private int year;

    public Course(){

    }

    //<editor-fold desc=" Getters and Setters ">

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

    //</editor-fold>

    //<editor-fold desc=" Hash and equals ">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (idClass != course.idClass) return false;
        if (year != course.year) return false;
        if (teacher != null ? !teacher.equals(course.teacher) : course.teacher != null)
            return false;
        return students != null ? students.equals(course.students) : course.students == null;

    }

    @Override
    public int hashCode() {
        int result = idClass;
        result = 31 * result + (teacher != null ? teacher.hashCode() : 0);
        result = 31 * result + (students != null ? students.hashCode() : 0);
        result = 31 * result + year;
        return result;
    }

    //</editor-fold>

}
