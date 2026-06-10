package com.example.Validationdemo.Model;

import jakarta.validation.constraints.*;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    String Firstname;

    @NotNull(message ="is required")
    @Size(min = 1, message = "is required")
    String Lastname="";

    @Min(value=0, message="must be greater than or equal to zero")
    @Max(value=10, message="must be less than or equal to 10")
    private int freePasses;

    @Pattern(regexp ="^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalcode;

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) Lastname = lastname;
    }

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }
}
