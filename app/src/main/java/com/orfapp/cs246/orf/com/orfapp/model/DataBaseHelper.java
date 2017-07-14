package com.orfapp.cs246.orf.com.orfapp.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.orfapp.cs246.orf.R;

import java.sql.SQLException;

/**
 * Created by Nacher on 13/07/2017.
 */

public class DataBaseHelper extends OrmLiteSqliteOpenHelper {


    private static final String DATABASE_NAME = "ORF.db";
    private static final int DATABASE_VERSION = 1;

    private Dao<Teacher, Integer> teacherDAO = null;
    private RuntimeExceptionDao<Teacher, Integer> teacherRuntimeDAO=null;

    private Dao<User, Integer> userDAO = null;
    private RuntimeExceptionDao<User, Integer> userRuntimeDAO=null;

    private Dao<Student, Integer> studentDAO = null;
    private RuntimeExceptionDao<Student, Integer> studentRuntimeDAO=null;

    private Dao<Read, Integer> readDAO = null;
    private RuntimeExceptionDao<Read, Integer> readRuntimeDAO=null;

    private Dao<Course, Integer> courseDAO = null;
    private RuntimeExceptionDao<Course, Integer> courseRuntimeDAO=null;

    public DataBaseHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            Log.i(DataBaseHelper.class.getSimpleName(), "onCreate()");
            TableUtils.createTable(connectionSource,Teacher.class);
            TableUtils.createTable(connectionSource,User.class);
            TableUtils.createTable(connectionSource,Student.class);
            TableUtils.createTable(connectionSource,Read.class);
            TableUtils.createTable(connectionSource,Course.class);
        } catch (Exception ex) {
            Log.e(DataBaseHelper.class.getName(), "Can´t create the data base", ex);
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            Log.i(DataBaseHelper.class.getSimpleName(), "onUpgrade()");
            TableUtils.dropTable(connectionSource,Teacher.class,true);
            TableUtils.dropTable(connectionSource,Course.class,true);
            TableUtils.dropTable(connectionSource,Read.class,true);
            TableUtils.dropTable(connectionSource,Student.class,true);
            TableUtils.dropTable(connectionSource,User.class,true);
            onCreate(database,connectionSource);
        } catch (Exception ex) {
            Log.e(DataBaseHelper.class.getName(), "Can´t delete the data base", ex);
            throw new RuntimeException(ex);
        }
    }

    public Dao<Course, Integer> getCourseDAO() throws SQLException {
        if(teacherDAO==null){
            courseDAO= getDao(Course.class);
        }
        return courseDAO;
    }

    public Dao<Read, Integer> getReadDAO() throws SQLException {
        if(readDAO==null){
           readDAO= getDao(Read.class);
        }
        return readDAO;
    }

    public Dao<Student, Integer> getStudentDAO() throws SQLException {
        if(studentDAO==null){
            studentDAO= getDao(Student.class);
        }
        return studentDAO;
    }

    public Dao<Teacher, Integer> getTeacherDAO() throws SQLException {
        if(teacherDAO==null){
            teacherDAO= getDao(Teacher.class);
        }
        return teacherDAO;
    }

    public Dao<User, Integer> getUserDAO() throws SQLException {
        if(userDAO==null){
            userDAO= getDao(User.class);
        }
        return userDAO;
    }

    public RuntimeExceptionDao<Course,Integer> getCourseRuntimeDAO(){
        if(courseRuntimeDAO==null){
            courseRuntimeDAO = getRuntimeExceptionDao(Course.class);
        }
        return courseRuntimeDAO;
    }

    public RuntimeExceptionDao<Read,Integer> getReadRuntimeDAO(){
        if(readRuntimeDAO==null){
            readRuntimeDAO = getRuntimeExceptionDao(Read.class);
        }
        return readRuntimeDAO;
    }

    public RuntimeExceptionDao<Student,Integer> getStudentRuntimeDAO(){
        if(studentRuntimeDAO==null){
            studentRuntimeDAO = getRuntimeExceptionDao(Student.class);
        }
        return studentRuntimeDAO;
    }

    public RuntimeExceptionDao<Teacher,Integer> getTeacherRuntimeDAO(){
        if(teacherRuntimeDAO==null){
            teacherRuntimeDAO = getRuntimeExceptionDao(Teacher.class);
        }
        return teacherRuntimeDAO;
    }

    public RuntimeExceptionDao<User,Integer> getUserRuntimeDAO(){
        if(userRuntimeDAO==null){
            userRuntimeDAO = getRuntimeExceptionDao(User.class);
        }
        return userRuntimeDAO;
    }

    @Override
    public void close(){
        super.close();
        courseRuntimeDAO=null;
        courseDAO=null;

        readRuntimeDAO=null;
        readDAO=null;

        studentRuntimeDAO=null;
        studentDAO=null;

        teacherRuntimeDAO=null;
        teacherDAO=null;

        userRuntimeDAO=null;
        userDAO=null;
    }
}
