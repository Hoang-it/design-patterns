package com.company.filter;

public class Person {
    private String name;
    private String gender;
    private String materialStatus;

    public Person(String name, String gender, String materialStatus) {
        this.name = name;
        this.gender = gender;
        this.materialStatus = materialStatus;
    }

    public String getGender() {
        return gender;
    }

    public String getMaterialStatus() {
        return materialStatus;
    }
}
