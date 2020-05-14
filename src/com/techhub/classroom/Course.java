package com.techhub.classroom;

public class Course {
    /**
     * Faculty Properties
     */
    private String courseName, courseCode;
    private Faculty faculty;
    private int courseYear;
    /**
     * Getters and Setters
     */
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(int courseYear) {
        this.courseYear = courseYear;
    }

    /**
     * Contructors
     */
    public Course() {
    }

    public Course(String courseName, String courseCode,Faculty faculty, int courseYear) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.faculty = faculty;
        this.courseYear = courseYear;
    }
    /**
     * To string methods
     */
    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", faculty=" + faculty +
                ", courseYear=" + courseYear +
                '}';
    }
}
