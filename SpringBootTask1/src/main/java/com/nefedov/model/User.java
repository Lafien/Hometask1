package com.nefedov.model;

import com.nefedov.annotation.*;


public class User {

    @LastNameConstraint
    private String lastName;

    @FirstNameConstraint
    private String firstName;

    @SecondNameConstraint
    private String secondName;

    @AgeConstraint
    private Integer age;

    @SalaryConstraint
    private int salary;

    @EmailConstraint
    private String email;

    @PlaceOfWorkConstraint
    private String placeOfWork;

    public User() {
    }

    public User(String lastName, String firstName, String secondName, Integer age, int salary, String email, String placeOfWork) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.salary = salary;
        this.email = email;
        this.placeOfWork = placeOfWork;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }
}
