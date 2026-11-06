package com.cramer._551_kv_kinovorstellungen.model;

public enum Room {
    ROOM_1("Saal 1"),
    ROOM_2("Saal 2"),
    ROOM_3("Saal 3");

    private String displayName;

    Room(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
