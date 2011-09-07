package com.twoqubed.guava.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class ImmutableMapTest {

    @Test
    public void buildsMulitpleMaps() {
        Builder<String, Integer> builder =
                ImmutableMap.builder();

        builder.put("one", 1);
        Map<String, Integer> first = builder.build();
        builder.put("two", 2);
        Map<String, Integer> second = builder.build();

        assertEquals(1, first.size());
        assertEquals(2, second.size());
    }

}
