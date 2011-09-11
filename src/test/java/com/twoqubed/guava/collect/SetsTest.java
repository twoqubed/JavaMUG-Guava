package com.twoqubed.guava.collect;

import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.Set;

import static com.google.common.collect.Sets.*;
import static org.junit.Assert.*;

public class SetsTest {

    @Test
    public void performsSetOperation() {
        Set<String> set1 = newHashSet("foo", "bar");
        Set<String> set2 = newHashSet("foo", "baz");

        assertEquals(newHashSet("foo"),
                Sets.intersection(set1, set2));

        assertEquals(newHashSet("foo", "bar", "baz"),
                Sets.union(set1, set2));

        assertEquals(newHashSet("bar", "baz"),
                Sets.symmetricDifference(set1, set2));
    }
}
