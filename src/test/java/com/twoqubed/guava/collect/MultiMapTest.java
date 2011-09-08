package com.twoqubed.guava.collect;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MultiMapTest {

    @Test
    public void addsMultipleValuesWithSameKey() {
        ListMultimap<String, String> citiesByState =
                ArrayListMultimap.create();
        citiesByState.put("TX", "Austin");
        citiesByState.put("TX", "Dallas");

        List<String> cities = citiesByState.get("TX");

        assertEquals(2, cities.size());
        assertTrue(cities.contains("Dallas"));
        assertTrue(cities.contains("Austin"));
    }
}
