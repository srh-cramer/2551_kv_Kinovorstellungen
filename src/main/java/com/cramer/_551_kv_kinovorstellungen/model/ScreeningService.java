package com.cramer._551_kv_kinovorstellungen.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ScreeningService {

    private List<Screening> screenings;

    public ScreeningService(){
        screenings = new ArrayList<>();

        screenings.add(new Screening("Fluch der Karibik", Room.ROOM_1, "14:00", 0));
        screenings.add(new Screening("Matrix", Room.ROOM_3, "16:00", 9));
        screenings.add(new Screening("Notting Hill", Room.ROOM_1, "18:00", 12));
        screenings.add(new Screening("Interstellar", Room.ROOM_2, "15:00", 3));
        screenings.add(new Screening("Dune", Room.ROOM_2, "19:00", 0));
        screenings.add(new Screening("Stolz und Vorurteil", Room.ROOM_3, "20:00", 30));
        screenings.add(new Screening("Batman Begins", Room.ROOM_1, "21:00", 0));
    }

    public List<Screening> getAllScreenings() {
        return screenings;
    }

    public List<Screening> getAvailableScreenings() {
        // TODO: Aufgabe 1
        return screenings.stream().filter(movie -> movie.freeSeats() > 0).toList();
    }

    // TODO: Aufgabe 2
    public Optional<Screening> getScreeningByTitle(String title){
        return screenings.stream().filter(movie -> movie.title().equals(title)).findFirst();
    }
}
