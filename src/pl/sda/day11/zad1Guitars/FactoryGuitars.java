package pl.sda.day11.zad1Guitars;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-07-11.
 */
public class FactoryGuitars {
    String name;
    ArrayList<Guitar> guitarList = new ArrayList<>();

    public FactoryGuitars(String name) {
        this.name = name;
    }

    // m. stworz gitare
    public Guitar makeGuitar(String model, int price) {
        Guitar guitar = new Guitar(model, price);
        // dodaje ja do listy
        guitarList.add(guitar);
        return guitar;
    }

    public void testGuitars() {
        for (Guitar guitar : guitarList) {
            guitar.play();
        }

    }


}
