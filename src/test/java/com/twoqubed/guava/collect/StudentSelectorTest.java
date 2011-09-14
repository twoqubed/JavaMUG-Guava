package com.twoqubed.guava.collect;

import org.junit.Test;

import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Iterables.*;
import static com.google.common.collect.Lists.*;
import static com.twoqubed.guava.collect.Year.*;
import static org.junit.Assert.*;

public class StudentSelectorTest {

    @Test
    public void selectStudentByNameAndYear() {
        List<Student> allStudents = newArrayList(
                new Student(10, "Joe", "Blow", FRESHMAN),
                new Student(20, "Mary", "Anne", SOPHOMORE),
                new Student(30, "Jaz", "Z", FRESHMAN),
                new Student(40, "George", "Washington", SOPHOMORE)
        );

        StudentSelector selector = new StudentSelector();
        Collection<Integer> selectedIds = selector.select(allStudents);

        assertEquals(1, selectedIds.size());
        assertEquals(new Integer(10), getOnlyElement(selectedIds));
    }

}
