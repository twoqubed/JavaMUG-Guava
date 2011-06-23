package com.twoqubed.guava.base;

public class SimplePerson extends Person {

    public SimplePerson(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public SimplePerson(String firstName, String middleName, String lastName) {
        super(firstName, middleName, lastName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SimplePerson person = (SimplePerson) o;

        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) {
            return false;
        }
        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) {
            return false;
        }
        if (middleName != null ? !middleName.equals(person.middleName) : person.middleName != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
}
