package com.twoqubed.guava.base;

import com.google.common.base.Strings;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.google.common.base.Strings.isNullOrEmpty;

public class StringsExamples {

    public void nullToEmptyExample() throws SQLException {
        ResultSet rs = null;

        String firstName = rs.getString("first_name");
        String middleName = rs.getString(
                Strings.nullToEmpty("middle_name"));
        String lastName = rs.getString("last_name");

        Person person = new SimplePerson(
                firstName, middleName, lastName);
    }

    public void emptyToNullExample() throws SQLException {
        ResultSet rs = null;

        String firstName = rs.getString("first_name");
        String middleName = rs.getString(
                Strings.emptyToNull("middle_name"));
        String lastName = rs.getString("last_name");

        Person person = new SimplePerson(
                firstName, middleName, lastName);
    }
    public void emptyOrNullExample() throws SQLException {
        String aString = "";

        if (aString == null || aString.equals("")) {
            // do something
        }


        if (isNullOrEmpty(aString)) {
            // do something
        }
    }
}
