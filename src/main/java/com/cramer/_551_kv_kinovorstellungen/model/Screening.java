package com.cramer._551_kv_kinovorstellungen.model;

public record Screening(
        String title,
        String room,
        String time,
        int freeSeats
) {}
