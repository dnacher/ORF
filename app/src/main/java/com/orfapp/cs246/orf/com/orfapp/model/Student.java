package com.orfapp.cs246.orf.com.orfapp.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Nacher on 20/6/2017.
 */

@DatabaseTable(tableName = "student")
public class Student implements Serializable {

    @DatabaseField(generatedId = true)
    private int idStudent;

    @DatabaseField(index = true, canBeNull = false)
    private String name;

    @DatabaseField
    private int age;

    @ForeignCollectionField
    private List<Read> reads;

    public Student(){}

    @Override
    public String toString() {
        return  name;
    }

    //<editor-fold desc=" Getters and Setters">

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public List<Read> getReads() {
        return reads;
    }

    public void setReads(List<Read> reads) {
        this.reads = reads;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //</editor-fold>

    //<editor-fold desc=" Hash and equals ">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (idStudent != student.idStudent) return false;
        if (age != student.age) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return reads != null ? reads.equals(student.reads) : student.reads == null;

    }

    @Override
    public int hashCode() {
        int result = idStudent;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (reads != null ? reads.hashCode() : 0);
        return result;
    }

    //</editor-fold>

}
