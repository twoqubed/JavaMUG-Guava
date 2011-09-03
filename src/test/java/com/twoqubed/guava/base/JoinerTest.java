package com.twoqubed.guava.base;

import com.google.common.base.Joiner;
import org.junit.Test;

import static org.junit.Assert.*;

public class JoinerTest {

    @Test
    public void shouldHandleNulls() {
        String result = Joiner.on("|")
                .skipNulls()
                .join("foo", null, "bar");

        assertEquals("foo|bar", result);
    }

    @Test
    public void joinsObjects() {
        String result = Joiner.on(",")
                .join(new Person("Joe", "Blow"),
                new Person("Jane", "Doe"));

        assertEquals("Joe Blow,Jane Doe", result);
    }

    @Test
    public void appendsJoinedString() {
        Joiner joiner = Joiner.on(",");
        StringBuilder builder = new StringBuilder("Numbers: ");
        joiner.appendTo(builder, 1, 2);

        String result = builder.toString();
        assertEquals("Numbers: 1,2", result);
    }
}
