package com.twoqubed.guava.base;

import org.junit.Test;

import static com.google.common.base.CaseFormat.*;
import static org.junit.Assert.*;

public class EnumsTest {

    @Test
    public void convertsCase() {
        String result = LOWER_CAMEL.to(
                UPPER_UNDERSCORE, "fooBar");

        assertEquals("FOO_BAR", result);
    }
}
