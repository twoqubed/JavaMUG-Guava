package com.twoqubed.guava.base;

import org.junit.Test;

import static org.junit.Assert.*;

public abstract class PersonTest {

    @Test
    public void condidersEqualIfFirstNamesAndLastNamesAreEqualAndMiddleNamesAreNull() {
        Person first = createPerson("John", "Doe");
        Person second = createPerson("John", "Doe");

        assertEquals(first, second);
    }
    @Test
    public void shouldNotConsiderEqualIfOnlyOneHasMiddleName() {
        Person first = createPerson("John", "Doe");
        Person second = createPerson("John", "Frank", "Doe");

        assertFalse(first.equals(second));
    }

    protected abstract Person createPerson(String firstName, String lastName);

    protected abstract Person createPerson(String firstName, String middleName, String lastName);
}
