package org.example;

public class Course {
    private int courseId;
    private String courseTittle;
    private int courseCode;

    public Course(int courseId, String courseTittle, int courseCode) {
        this.courseId = courseId;
        this.courseTittle = courseTittle;
        this.courseCode = courseCode;
    }
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseTittle() {
        return courseTittle;
    }

    public void setCourseTittle(String courseTittle) {
        this.courseTittle = courseTittle;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseTittle='" + courseTittle + '\'' +
                ", courseCode=" + courseCode +
                '}';
    }
}
