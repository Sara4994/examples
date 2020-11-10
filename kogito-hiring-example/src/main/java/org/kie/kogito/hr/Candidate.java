package org.kie.kogito.hr;

import java.util.Date;

public class Candidate {

    private String name;

    private String lastName;

    private Date birthDay;

    private String email;

    public Candidate() {
    }

    public Candidate(String name, String lastName, Date birthDay, String email) {
        this.name = name;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
