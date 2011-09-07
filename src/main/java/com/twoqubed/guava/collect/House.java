package com.twoqubed.guava.collect;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class House {

    private final List<Room> rooms;

    public House(List<Room> rooms) {
        this.rooms = ImmutableList.copyOf(rooms);
    }
}
