package com.orfapp.cs246.orf.com.orfapp.model;

import java.util.List;

/**
 * Created by Nacher on 20/6/2017.
 */

public class Teacher {

    private String phone;
    private List<Course> courses;

    public Teacher(){}

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
