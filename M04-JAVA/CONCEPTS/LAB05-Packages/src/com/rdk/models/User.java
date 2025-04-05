package com.rdk.models;

public class User {
    int id;
    String name;
    String lastname;
    int age;
    public Address[] addresses = new Address[ 2 ]; 

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

    public void registerAddress( String type, String streetName, String streetNumber, String country ) {
        Address tempAddress = new Address( type, streetName, streetNumber, country );
        if( type.equals( "Job" ) ) {
            this.addresses[ 0 ] = tempAddress;
        }
        else {
            this.addresses[ 1 ] = tempAddress;
        }
    }

}
