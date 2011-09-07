package com.twoqubed.guava.collect;

import com.google.common.collect.ImmutableSortedSet;
import org.junit.Test;

import java.util.Iterator;
import java.util.SortedSet;

import static org.junit.Assert.assertEquals;

public class ImmutableSortSetTest {

    @Test
    public void buildSetWithCoparator() {
        SortedSet<String> set = ImmutableSortedSet
                .<String>reverseOrder()
                .add("foo", "bar", "baz")
                .build();

        Iterator<String> i = set.iterator();

        assertEquals(3, set.size());
        assertEquals("foo", i.next());
        assertEquals("baz", i.next());
        assertEquals("bar", i.next());
    }

}
