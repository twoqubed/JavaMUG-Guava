package com.twoqubed.guava.collect;

import org.junit.Test;

import java.util.Map;

import static com.google.common.collect.Maps.*;
import static org.junit.Assert.*;

public class MapsTest {

    @Test
    public void createsEmptyMap() {
        Map<String, String> map = newHashMap();

        map.put("foo", "bar");

        assertEquals("bar", map.get("foo"));
    }
}
