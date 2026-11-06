package com.cramer._551_kv_kinovorstellungen.model;

public record Screening(
        String title,
        Room room,
        String time,
        int freeSeats
) {}
