package SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.domain;

import java.time.LocalDate;

/**
 * Created by Isanbet on 30.10.2018.
 */

public class Person {
    protected String surName;
    protected String givenName;
    private String patronymic;
    private LocalDate dateOfBirth;
    private Address address;

    public String getPersonString(){
        return surName + " " + givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

