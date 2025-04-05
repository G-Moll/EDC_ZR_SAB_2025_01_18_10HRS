package com.rdk.models;

public class Address {
    String type;
    String streetName;
    String streetNumber;
    String country;

    public Address( String type, String streetName, String streetNumber, String country ) {
        this.type         = type;
        this.streetName   = streetName;
        this.streetNumber = streetNumber;
        this.country      = country;
    }

    public String describeAddress() {
        return "id: " + this.type + 
            ": The full adddres is, country " + this.country +
            ", the street is " + this.streetName +
            " number " +  this.streetNumber;
    }
}
