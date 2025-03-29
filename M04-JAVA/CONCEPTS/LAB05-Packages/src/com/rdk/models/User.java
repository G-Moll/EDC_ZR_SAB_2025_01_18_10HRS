package com.rdk.models;

public class User {
    int id;
    String name;
    String lastname;
    int age;

    public User( int id, String name, String lastname, int age ) {
        this.id       = id;
        this.name     = name;
        this.lastname = lastname;
        this.age      = age;
    }

    public String describeUser() {
        return "id: "     + this.id +
            ", name "     + this.name +
            ", lastname " + this.lastname +
            ", age "      + this.age;
    }
}
