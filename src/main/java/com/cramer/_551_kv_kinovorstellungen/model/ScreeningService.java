package com.cramer._551_kv_kinovorstellungen.model;

import java.util.ArrayList;
import java.util.List;

public class ScreeningService {

    private List<Screening> screenings;

    public ScreeningService(){
        screenings = new ArrayList<>();

        screenings.add(new Screening("Fluch der Karibik", "Raum 1", "14:00", 0));
        screenings.add(new Screening("Matrix", "Raum 3", "16:00", 9));
        screenings.add(new Screening("Notting Hill", "Raum 1", "18:00", 12));
        screenings.add(new Screening("Interstellar", "Raum 2", "15:00", 3));
        screenings.add(new Screening("Dune", "Raum 2", "19:00", 0));
        screenings.add(new Screening("Stolz und Vorurteil", "Raum 3", "20:00", 30));
        screenings.add(new Screening("Batman Begins", "Raum 1", "21:00", 0));
    }

    public List<Screening> getAllScreenings() {
        return screenings;
    }

//    TODO: Aufgabe 1
//    public List<Screening> getAvailableScreenings() {
//    }

    // TODO: Aufgabe 2

}
