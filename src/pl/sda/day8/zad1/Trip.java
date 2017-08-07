package pl.sda.day8.zad1;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-07-06.
 */
public class Trip {

    private ArrayList<Place> route = new ArrayList<>();

    public void addPlace(Place place) { // typ Place, nazwa place
        route.add(place);
    }

    // usuwanie
    public void removePlace(Place place) {
        route.remove(place);
    }


    public void printRoute() {
        for (Place place : route) {
            System.out.println(place);
        }
    }


    public void setPlace(int index, Place place) { // Zamiana miejsc odwiedzanych w czasie tripu
        if (index >= route.size()) { // sprawdz czy index ma odpowiedni rozmiar
            addPlace(place);
        } else {
            route.set(index, place);
        }
    }

    public int calculateDuration() { //obliczmy czas wycieczki
        int sum = 0;
        for (Place place : route) {
            sum += place.getDuration(); // sum = sum + place.getDuration()
        }
        return sum;

    }

}

