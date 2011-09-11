package com.twoqubed.guava.collect;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Lists.*;
import static org.junit.Assert.*;

public class ListsTest {

    @Test
    public void transformsList() {
        List<String> lowerCase =
                newArrayList("foo", "bar", "baz");
    
        List<String> result = transform(lowerCase,
                new Function<String, String>() {
                    @Override
                    public String apply(String input) {
                        return input.toUpperCase();
                    }
                });

        assertEquals(newArrayList("FOO", "BAR", "BAZ"),
                result);
    }

}
