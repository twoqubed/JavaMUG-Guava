package com.twoqubed.guava.collect;

import com.google.common.base.CharMatcher;
import com.google.common.base.Function;
import com.google.common.base.Predicate;

public class Student {

    private final Integer id;
    private final String firstName;
    private final String lastName;
    private final Year year;

    public Student(Integer id, String firstName, String lastName, Year year) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Year getYear() {
        return year;
    }

}
