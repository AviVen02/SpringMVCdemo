package com.example.form_data.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class student {
    String firstname;
    String lastname;
    String county;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}
