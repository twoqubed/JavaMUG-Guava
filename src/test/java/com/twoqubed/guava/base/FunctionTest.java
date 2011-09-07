package com.twoqubed.guava.base;

import com.google.common.base.Function;
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionTest {

    @Test
    public void shouldReverseString() {
        ReverseFunction function = new ReverseFunction();

        String result = function.apply("abc");

        assertEquals(result, "cba");
    }

    public static class ReverseFunction implements Function<String, String> {

        @Override
        public String apply(String input) {
            StringBuilder reversed = new StringBuilder(input.length());
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed.append(input.charAt(i));
            }
            return reversed.toString();
        }
    }
}
