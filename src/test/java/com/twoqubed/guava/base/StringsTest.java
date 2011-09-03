package com.twoqubed.guava.base;

import com.google.common.base.Strings;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class StringsTest {

    @Test
    public void testPadStart() {
        String foo = "foo";

        String paddedFoo = Strings.padStart(foo, 5, ' ');

        assertEquals("  foo", paddedFoo);
    }

    @Test
    public void testPadEnd() {
        String foo = "foo";

        String paddedFoo = Strings.padEnd(foo, 10, '.');

        assertEquals("foo.......", paddedFoo);
    }
}
