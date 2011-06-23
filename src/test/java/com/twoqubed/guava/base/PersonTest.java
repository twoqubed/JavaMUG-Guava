package com.twoqubed.guava.base;

import org.junit.Test;

import static org.junit.Assert.*;

public abstract class PersonTest {

    @Test
    public void shouldCondiderEqualIfFirstNamesAndLastNamesAreEqualAndMiddleNamesAreNull() {
        Person first = createPerson("John", "Doe");
        Person second = createPerson("John", "Doe");

        assertEquals(first, second);
    }

    protected abstract Person createPerson(String firstName, String lastName);
}
