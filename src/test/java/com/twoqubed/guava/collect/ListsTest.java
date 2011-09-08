package com.twoqubed.guava.collect;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ListsTest {

    @Test
    public void createsListWithValues() {
        List<String> strings =
                Lists.newArrayList("foo", "bar", "baz");

        assertEquals(3, strings.size());
    }
}
