package com.twoqubed.guava.base;

public class Person {

    final String firstName;
    final String middleName;
    final String lastName;

    public Person(String firstName, String lastName) {
        this(firstName, null, lastName);
    }

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName;
    }
}
