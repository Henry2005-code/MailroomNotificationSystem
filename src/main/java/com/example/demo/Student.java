package com.example.demo;

public class Student {

    String firstname;
    String lastname;
    String email;

    public Student(String firstname, String lastname, String email){

        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
0
    }

    public String toString(){
        return firstname + ", " + lastname + ", " + email;
    }

}
