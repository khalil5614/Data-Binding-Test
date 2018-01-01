package com.example.khalil.databindingtest.Models;

/**
 * Created by Khalil on 10/17/2017.
 */

public class User {
    private  String firstName;
    private final String lastName;
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
         this.firstName=firstName;
    }
    public String getLastName() {
        return this.lastName;
    }

}
