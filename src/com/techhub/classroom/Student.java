package com.techhub.classroom;

public class Student extends Person{
    /**
     * Fields or properties
     */
    private String phoneNumber, username, password;
    private Course course;
    /**
     *Constructors
     *
     */
        //No argument
    public Student() {
    }
        //@parameterized
    public Student(String name, String gender, int registrationNumber, String phoneNumber, String username, String password, Course course) {
        super(name,gender,registrationNumber);
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        this.course = course;
    }

    /**
     * Getters and Setters
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                " name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", registrationNumber=" + registrationNumber +
                "phoneNumber='" + phoneNumber + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", course=" + course +
                '}';
    }
}
