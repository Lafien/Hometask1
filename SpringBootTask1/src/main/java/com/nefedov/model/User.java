package com.nefedov.model;

public class User {
    private String lastName;
    private String firstName;
    private String secondName;
    private int age;
    private int salary;
    private String email;
    private String PlaceOfWork;

    public User() {
    }

    public User(String lastName, String firstName, String secondName, int age, int salary, String email, String placeOfWork) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.salary = salary;
        this.email = email;
        PlaceOfWork = placeOfWork;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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
        return PlaceOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.PlaceOfWork = placeOfWork;
    }
}
