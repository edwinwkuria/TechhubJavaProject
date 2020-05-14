package com.techhub.classroom;

public class Faculty {
    /**
     * Faculty Properties
     */
    private String facultyCode;
    private String name;
    /**
     * Constructors
     */
    public Faculty(String facultyCode, String name) {
        this.facultyCode = facultyCode;
        this.name = name;
    }
    /**
     * To String method
     */
    @Override
    public String toString() {
        return "Faculty{" +
                "facultyCode='" + facultyCode + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * Accessors and Mutators
     */
    public String getFacultyCode() {
        return facultyCode;
    }

    public void setFacultyCode(String facultyCode) {
        this.facultyCode = facultyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
