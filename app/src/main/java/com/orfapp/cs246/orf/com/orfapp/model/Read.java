package com.orfapp.cs246.orf.com.orfapp.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * Created by Nacher on 20/6/2017.
 */

@DatabaseTable(tableName = "read")
public class Read implements Serializable {

    @DatabaseField(generatedId = true)
    private int idTest;

    @DatabaseField
    private Course course;

    @DatabaseField
    private int idStudent;

    @DatabaseField
    private int year;

    @DatabaseField
    private int month;

    @DatabaseField
    private int week;

    @DatabaseField
    private int WPM;

    @DatabaseField
    private int errors;

    @DatabaseField
    private int goalWCPM;

    @DatabaseField
    private String text;

    public Read(){}

    //<editor-fold desc=" Getters and Setters ">

    public int getIdTest() {
        return idTest;
    }

    public void setIdTest(int idTest) {
        this.idTest = idTest;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getWPM() {
        return WPM;
    }

    public void setWPM(int WPM) {
        this.WPM = WPM;
    }

    public int getErrors() {
        return errors;
    }

    public void setErrors(int errors) {
        this.errors = errors;
    }

    public int getGoalWCPM() {
        return goalWCPM;
    }

    public void setGoalWCPM(int goalWCPM) {
        this.goalWCPM = goalWCPM;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    //</editor-fold>


    //<editor-fold desc=" Hash and equals ">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Read read = (Read) o;

        if (idTest != read.idTest) return false;
        if (idStudent != read.idStudent) return false;
        if (year != read.year) return false;
        if (month != read.month) return false;
        if (week != read.week) return false;
        if (WPM != read.WPM) return false;
        if (errors != read.errors) return false;
        if (goalWCPM != read.goalWCPM) return false;
        if (course != null ? !course.equals(read.course) : read.course != null) return false;
        return text != null ? text.equals(read.text) : read.text == null;

    }

    @Override
    public int hashCode() {
        int result = idTest;
        result = 31 * result + (course != null ? course.hashCode() : 0);
        result = 31 * result + idStudent;
        result = 31 * result + year;
        result = 31 * result + month;
        result = 31 * result + week;
        result = 31 * result + WPM;
        result = 31 * result + errors;
        result = 31 * result + goalWCPM;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }

    //</editor-fold>

}
