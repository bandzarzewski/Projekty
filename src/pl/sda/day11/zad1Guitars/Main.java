package pl.sda.day11.zad1Guitars;

/**
 * Created by RENT on 2017-07-11.
 */
public class Main {
    public static void main(String[] args) {

        FactoryGuitars fender = new FactoryGuitars("Fender");
        FactoryGuitars gibson = new FactoryGuitars("Gibson");

        fender.makeGuitar("Stratocaster", 4500);
        gibson.makeGuitar("Les paul", 5600);
        fender.makeGuitar("Telecaster", 1400);
        gibson.makeGuitar("Suitcaster", 3576);

        for (Guitar guitar : fender.guitarList) {
            System.out.println(guitar.getModel() + guitar.getSerialNumber());
            guitar.play();
        }
        System.out.println();
        for (Guitar guitar : gibson.guitarList) {
            System.out.println(guitar.getModel() + guitar.getSerialNumber());
        }
        gibson.testGuitars();
    }
}
