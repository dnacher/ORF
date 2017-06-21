package com.orfapp.cs246.orf.com.orfapp.model;

import java.util.List;

/**
 * Created by Nacher on 20/6/2017.
 */

public class Student {

    private int idStudent;
    private List<Read> reads;

    public Student(){}

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
}
