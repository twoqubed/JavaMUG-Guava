package com.twoqubed.guava.base;

import com.google.common.base.Objects;

public class GuavaPerson extends Person {

    public GuavaPerson(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public GuavaPerson(String firstName, String middleName, String lastName) {
        super(firstName, middleName, lastName);
    }

    @Override
    public boolean equals(Object other) {

        if (this == other) {
            return true;
        }

        if (!(other instanceof GuavaPerson)) {
            return false;
        }

        GuavaPerson that = (GuavaPerson) other;

        return Objects.equal(firstName, that.firstName) &&
                Objects.equal(middleName, that.middleName) &&
                Objects.equal(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(firstName, middleName, lastName);
    }


    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("First Name", firstName)
                .add("Middle Name", middleName)
                .add("Last Name", lastName)
                .toString();
    }

    public static void main(String[] args) {
        GuavaPerson person = new GuavaPerson("Joe", "Blow");
        System.out.println(person);
    }
}
