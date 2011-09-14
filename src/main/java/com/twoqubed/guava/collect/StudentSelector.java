package com.twoqubed.guava.collect;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static com.twoqubed.guava.collect.Year.*;

public class StudentSelector {

    public Collection<Integer> select(Collection<Student> students) {
        Set<Integer> selectedIds = new HashSet<Integer>();
        for (Student each : students) {
            if (each.getYear() == FRESHMAN && lastNameMatches(each)) {
                selectedIds.add(each.getId());
            }
        }
        return selectedIds;
    }

    private boolean lastNameMatches(Student each) {
        char firstChar = each.getLastName().charAt(0);
        return firstChar >= 'A' && firstChar <= 'M';
    }

}
