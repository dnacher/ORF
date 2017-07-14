package com.orfapp.cs246.orf.com.orfapp.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Nacher on 20/6/2017.
 */

@DatabaseTable(tableName = "teacher")
public class Teacher implements Serializable {

    @DatabaseField(generatedId = true)
    private int idTeacher;

    @DatabaseField(index = true, canBeNull = false)
    private String name;

    @DatabaseField
    private String phone;

    @ForeignCollectionField
    private List<Course> courses;

    public Teacher(){}

    //<editor-fold desc=" Getters and Setters ">

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    //</editor-fold>

    //<editor-fold desc=" Hash and equals ">

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        if (idTeacher != teacher.idTeacher) return false;
        if (name != null ? !name.equals(teacher.name) : teacher.name != null) return false;
        if (phone != null ? !phone.equals(teacher.phone) : teacher.phone != null) return false;
        if (courses != null ? !courses.equals(teacher.courses) : teacher.courses != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTeacher;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (courses != null ? courses.hashCode() : 0);
        return result;
    }

    //</editor-fold>

}
