package com.twoqubed.guava.collect;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.rmi.server.ExportException;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.rules.ExpectedException.none;

public class BiMapTest {

    @Rule public ExpectedException thrown = none();

    @Test
    public void createsBiMap() {
        BiMap<String, Integer> stringKey = HashBiMap.create();
        stringKey.put("one", 1);
        Map<Integer, String> integerKey = stringKey.inverse();

        assertEquals("one", integerKey.get(1));
    }

    @Test
    public void cannotAddDuplicateValue() {
        BiMap<String, Integer> stringKey = HashBiMap.create();
        stringKey.put("one", 1);

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("value already present");
        
        stringKey.put("ONE", 1);
    }
}
