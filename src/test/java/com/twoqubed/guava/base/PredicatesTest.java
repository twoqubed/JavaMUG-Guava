package com.twoqubed.guava.base;

import com.google.common.base.Predicate;
import org.junit.Test;

import static org.junit.Assert.*;

public class PredicatesTest {

    @Test
    public void indicatesIfNumberIsPositive() {
        PositivePredicate predicate = new PositivePredicate();

        assertTrue(predicate.apply(1));
        assertFalse(predicate.apply(0));
    }

    @Test
    public void indicatesIfStringStartsWithSubstring() {
        StartWithPredicate predicate = new StartWithPredicate("A");

        assertTrue(predicate.apply("ABC"));
        assertFalse(predicate.apply("DEF"));
    }

    public static class PositivePredicate implements Predicate<Integer> {

        @Override
        public boolean apply(Integer input) {
            return input.intValue() > 0;
        }
    }

    public static class StartWithPredicate implements Predicate<String> {

        private final String substring;

        public StartWithPredicate(String substring) {
            this.substring = substring;
        }

        @Override
        public boolean apply(String input) {
            return input.startsWith(substring);
        }
    }
}
