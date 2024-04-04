package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentCourses {
    private List<Student>studentList;
    private List<Course>coursesList;
    private List<Teacher>teachersList;
    private int courseId;
    private int score;
    private char grade;

    public StudentCourses(List<Student> studentList, List<Course> coursesList, List<Teacher> teachersList, int courseId, int score, char grade) {
        studentList = new ArrayList<>();
        coursesList = new ArrayList<>();
        teachersList = new ArrayList<>();
        this.coursesList = coursesList;
        this.courseId = courseId;
        this.score = score;
        this.grade = grade;
    }
   // method to enroll student and courses
    public void enrollStudents (int courseId, int studentId){
        Course course = courseId;
        Student student = studentId;
        if (course != null && student != null ){
            course.enrollStudent(student);
            student.enrollCourse(course);
            System.out.println("Student " + student.getName() + " enrolled in course " + course.getName());
        }
        else {
            System.out.println("error");
        }

       //method to assign teacher and courses

        public void assignTeacher (int teacherId, int courseId){
            Teacher teacher = teacherId;
            Course course = courseId;
            if (teacherlist != null && courseList != null){
                teacherlist.assignCourse(courseList);
                courseList.assignTeacher(teacherlist);
                else{
                    System.out.println("invalid");
                }
            }
        }

    }














    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Courses> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Courses> coursesList) {
        this.coursesList = coursesList;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public List<Teachers> getTeachersList() {
        return teachersList;
    }

    public void setTeachersList(List<Teachers> teachersList) {
        this.teachersList = teachersList;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "StudentCourses{" +
                "studentList=" + studentList +
                ", coursesList=" + coursesList +
                ", courseId=" + courseId +
                ", score=" + score +
                ", grade=" + grade +
                '}';
    }
}
