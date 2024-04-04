package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    public static <Student> studentList = new ArrayList<>();
    private int studentId;

    public Student(String name, int age, String address, List<Student> studentList, int studentId) {
        super(name, age, address);
        this.studentList = studentList;
        this.studentId = studentId;
    }
    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "studentList=" + studentList +
                ", studentId=" + studentId +
                '}';
    }
}
