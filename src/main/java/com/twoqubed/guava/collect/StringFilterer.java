package com.twoqubed.guava.collect;

import com.google.common.base.CharMatcher;
import com.google.common.base.Predicate;
import com.google.common.collect.Sets;

import java.util.Set;

import static com.google.common.base.Predicates.*;

public class StringFilterer {
    
    public static Set<String> filter(Set<String> unfiltered) {
        return Sets.filter(unfiltered, and(startsWith("aeiou"), lengthAtLeast(5)));

//        Set<String> filtered = newHashSet();
//        for (String each : unfiltered) {
//            if (startsWithVowel(each) && each.length() >= 5) {
//                filtered.add(each);
//            }
//        }
//        return filtered;
    }

//    private static boolean startsWithVowel(String each) {
//        char c = each.charAt(0);
//        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
//    }


    public static Predicate<String> startsWith(final String characters) {
        return new Predicate<String>() {
            @Override
            public boolean apply(String input) {
                CharMatcher matcher = CharMatcher.anyOf(characters);
                return matcher.apply(input.charAt(0));
            }
        };
    }

    public static Predicate<String> lengthAtLeast(final int mimumumLength) {
        return new Predicate<String>() {
            @Override
            public boolean apply(String input) {
                return input.length() >= mimumumLength;
            }
        };
    }
}
