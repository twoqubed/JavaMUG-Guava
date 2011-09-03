package com.twoqubed.guava.base;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuavaPersonTest extends PersonTest {

    protected Person createPerson(String firstName, String lastName) {
        return new GuavaPerson(firstName, lastName);
    }

    @Override
    protected Person createPerson(String firstName, String middleName, String lastName) {
        return new GuavaPerson(firstName, middleName, lastName);
    }

}
