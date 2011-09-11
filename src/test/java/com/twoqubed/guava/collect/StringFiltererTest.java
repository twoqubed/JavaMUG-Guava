package com.twoqubed.guava.collect;

import org.junit.Test;

import java.util.Set;

import static com.google.common.collect.Sets.*;
import static org.junit.Assert.*;

public class StringFiltererTest {

    @Test
    public void filterString() {
        Set<String> unfiltered = newHashSet(
                "ant", "alpha", "ducks", "eggs", "octopus"
        );

        Set<String> filtered = StringFilterer.filter(unfiltered);

        assertEquals(2, filtered.size());
        assertTrue(filtered.contains("alpha"));
        assertTrue(filtered.contains("octopus"));
    }
}
