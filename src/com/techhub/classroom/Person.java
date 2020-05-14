package com.techhub.classroom;

public class Person {
    /**
     * Person fields
     */
    protected String name,gender;
    protected int registrationNumber;

    public Person() {
    }

    /**
     * GEtters and setters
     */

    public Person(String name, String gender, int registrationNumber) {
        this.name = name;
        this.gender = gender;
        this.registrationNumber = registrationNumber;
    }

    /**
     *
     * @return
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int  getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
