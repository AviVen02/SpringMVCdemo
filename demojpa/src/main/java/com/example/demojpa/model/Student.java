package com.example.demojpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int rollno;
    private String name;
    private String gender;
    private String technology;

    public Student() {
    }

    public Student(int rollno, String name, String gender, String technology) {
        this.rollno = rollno;
        this.name = name;
        this.gender = gender;
        this.technology = technology;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }




}
