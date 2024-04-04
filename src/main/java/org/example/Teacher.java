package org.example;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private List<Teacher> teacherList = new ArrayList<>();
    private int teachersId;

    public Teacher(String name, int age, String address, int teachersId) {
        super(name, age, address);
        this.teachersId = teachersId;
    }
    public int getTeachersId() {
        return teachersId;
    }

    public void setTeachersId(int teachersId) {
        this.teachersId = teachersId;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Teacher{" +
                "teacherList=" + teacherList +
                ", teachersId=" + teachersId +
                '}';
    }
}
