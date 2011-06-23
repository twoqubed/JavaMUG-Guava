package com.twoqubed.guava.base;

public class GuavaPersonTest extends PersonTest {

    protected Person createPerson(String firstName, String lastName) {
        return new GuavaPerson(firstName, lastName);
    }
}
