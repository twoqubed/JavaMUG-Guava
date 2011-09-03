package com.twoqubed.guava.base;

import com.google.common.base.CharMatcher;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharMatcherTest {

    @Test
    public void removesCharacters() {
        CharMatcher matcher = CharMatcher.DIGIT;

        String result = matcher.removeFrom("abc123def");

        assertEquals("abcdef", result);
    }

    @Test
    public void retainsCharacters() {
        CharMatcher matcher = CharMatcher.DIGIT;

        String result = matcher.retainFrom("abc123def");

        assertEquals("123", result);
    }

    @Test
    public void createMatcherViaNegation() {
        CharMatcher matcher = CharMatcher.DIGIT.negate();

        String result = matcher.retainFrom("abc123def");

        assertEquals("abcdef", result);
    }

    @Test
    public void createMatcherWithRange() {
        CharMatcher matcher = CharMatcher.inRange('a', 'e');

        assertTrue(matcher.matchesAnyOf("efg"));
        assertTrue(matcher.matchesAnyOf("12a"));
        assertFalse(matcher.matchesAnyOf("ghi"));
    }

    @Test
    public void orMatchers() {
        CharMatcher matcher = CharMatcher.JAVA_LETTER
                .or(CharMatcher.WHITESPACE);

        assertTrue(matcher.matchesAllOf("abc"));
        assertTrue(matcher.matchesAllOf("abc def"));
        assertFalse(matcher.matchesAllOf("abc 123"));
    }
}
