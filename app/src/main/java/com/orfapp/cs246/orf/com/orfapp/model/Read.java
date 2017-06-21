package com.orfapp.cs246.orf.com.orfapp.model;

/**
 * Created by Nacher on 20/6/2017.
 */

public class Read {

    private int idTest;
    private Course course;
    private int year;
    private int month;
    private int week;
    private int WPM;
    private int errors;
    private int goalWCPM;
    private String text;

    public Read(){}

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
}
