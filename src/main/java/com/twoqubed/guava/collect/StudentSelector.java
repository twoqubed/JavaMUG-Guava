package com.twoqubed.guava.collect;

import com.google.common.base.CharMatcher;

import java.util.Collection;
import java.util.Set;

import static com.google.common.collect.Sets.*;
import static com.twoqubed.guava.collect.Year.*;

public class StudentSelector {

    public Collection<Integer> select(Collection<Student> students) {
        Set<Integer> selectedIds = newHashSet();
        for (Student each : students) {
            if (each.getYear() == FRESHMAN && lastNameMatches(each)) {
                selectedIds.add(each.getId());
            }
        }
        return selectedIds;
    }

    private boolean lastNameMatches(Student each) {
        return CharMatcher.inRange('A', 'M').apply(each.getLastName().charAt(0));
    }

}
