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
}
