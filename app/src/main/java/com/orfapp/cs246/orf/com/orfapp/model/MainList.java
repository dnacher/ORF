package com.orfapp.cs246.orf.com.orfapp.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nacher on 13/07/2017.
 */

public class MainList {

    private static MainList instance = null;
    private List<User> users=new ArrayList<>();
    private List<Student> students=new ArrayList<>();
    private List<Teacher> teachers=new ArrayList<>();
    private List<Course> courses=new ArrayList<>();

    protected MainList() {
        loadUsers();
        loadTeachers();
        loadCourses();
        loadStudents();
    }

    public static MainList getInstance() {
        if (instance == null) {
            instance = new MainList();
        }
        return instance;
    }

    public void loadStudents(){
        Student student=new Student();
        student.setName("Michael Jordan");
        student.setAge(8);
        student.setIdStudent(1);
        Read read=new Read();
        read.setIdStudent(1);
        Course course=new Course();
        course.setIdClass(1);
        Teacher teacher=new Teacher();
        teacher.setIdTeacher(1);
        teacher.setName("Heather James");
        teacher.setPhone("155468872");
        List<Course>coursesList=new ArrayList<>();
        teacher.setCourses(coursesList);
        teacher.getCourses().add(course);
        course.setTeacher(teacher);
        course.setIdClass(1);
        List<Read>readList=new ArrayList<>();
        student.setReads(readList);
        read.setCourse(course);
        student.getReads().add(read);
        students.add(student);
        //end
        student=new Student();
        student.setName("Steve Jobs");
        student.setAge(9);
        student.setIdStudent(2);
        read=new Read();
        read.setIdStudent(2);
        course=new Course();
        course.setIdClass(1);
        teacher=new Teacher();
        teacher.setIdTeacher(1);
        teacher.setName("Heather James");
        teacher.setPhone("155468872");
        coursesList=new ArrayList<>();
        teacher.setCourses(coursesList);
        teacher.getCourses().add(course);
        course.setTeacher(teacher);
        course.setIdClass(1);
        read.setCourse(course);
        readList=new ArrayList<>();
        student.setReads(readList);
        student.getReads().add(read);
        students.add(student);
        //end
        student=new Student();
        student.setName("Bill Gates");
        student.setAge(8);
        student.setIdStudent(3);
        read=new Read();
        read.setIdStudent(3);
        course=new Course();
        course.setIdClass(1);
        teacher=new Teacher();
        teacher.setIdTeacher(1);
        teacher.setName("Heather James");
        teacher.setPhone("155468872");
        coursesList=new ArrayList<>();
        teacher.setCourses(coursesList);
        teacher.getCourses().add(course);
        course.setTeacher(teacher);
        course.setIdClass(1);
        read.setCourse(course);
        readList=new ArrayList<>();
        student.setReads(readList);
        student.getReads().add(read);
        students.add(student);
        //end
    }

    public void loadTeachers(){
        Course course=new Course();
        course.setIdClass(1);
        Teacher teacher=new Teacher();
        teacher.setIdTeacher(1);
        teacher.setName("Heather James");
        teacher.setPhone("155468872");
        List<Course>coursesList=new ArrayList<>();
        teacher.setCourses(coursesList);
        teacher.getCourses().add(course);
        teachers.add(teacher);
    }

    public void loadCourses(){
        Course course=new Course();
        course.setIdClass(1);
        courses.add(course);
    }

    public void loadUsers(){
        User user=new User();
        user.setName("admin");
        user.setIdTeacher(1);
        user.setActive(true);
        user.setPassword("admin");
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}

