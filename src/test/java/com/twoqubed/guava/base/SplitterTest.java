package com.twoqubed.guava.base;

import com.google.common.base.Splitter;
import org.junit.Test;

import static com.google.common.collect.Lists.*;
import static org.junit.Assert.*;

public class SplitterTest {

    @Test
    public void shouldOmitEmptyStrings() {
       Splitter splitter = Splitter.on(',')
               .omitEmptyStrings();

        Iterable<String> result = splitter.split("foo,bar,,baz");

        assertEquals(newArrayList("foo", "bar", "baz"), newArrayList(result));
    }

    @Test
    public void shouldTrimWhiteSpaceStrings() {
       Splitter splitter = Splitter.on(',')
               .trimResults();

        Iterable<String> result = splitter.split("foo, bar, baz");

        assertEquals(newArrayList("foo", "bar", "baz"), newArrayList(result));
    }
}
