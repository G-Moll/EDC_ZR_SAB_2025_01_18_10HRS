package com.rdk.models;

public class Address {
    int id;
    String streetName;
    String streetNumber;
    String country;

    // Constructor method
    public Address( int id, String streetName, String streetNumber, String country ) {
        this.id           = id;
        this.streetName   = streetName;
        this.streetNumber = streetNumber;
        this.country      = country;
    }

    // Methods
    public String describeAddress() {
        return "id: " + id + 
            ": The full adddres is, country " + this.country +
            ", the street is " + this.streetName +
            " number " +  this.streetNumber;
    }

    public String hello() {
        return "Hello";
    }
}
