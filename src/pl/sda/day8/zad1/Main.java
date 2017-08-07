package pl.sda.day8.zad1;

/**
 * Created by RENT on 2017-07-06.
 */
public class Main {
    public static void main(String[] args) {
        Place komin = new Place("Krzywy komin", 4);
        Place hex = new Place("Hex", 1);
        Place czajownia = new Place("Czajownia", 3);

//        System.out.println("--------");
//        komin.getName();
//        System.out.println("--------");

        Trip czwartek = new Trip(); // prawdobnie tu inicjalizujemy Arraylist ?

        czwartek.addPlace(komin);
        czwartek.addPlace(hex);
        czwartek.addPlace(czajownia);


//        czwartek.printRoute();


        System.out.println();

        czwartek.removePlace(komin);

        System.out.println();

        czwartek.printRoute();

        System.out.println("Zwiedzanie zajmie " + czwartek.calculateDuration() + " godziny");

        Place noweHoryzonty = new Place("NoweHoryzinty", 2);
        Place rynek = new Place("Rynek", 4);

        czwartek.setPlace(0, noweHoryzonty);
        czwartek.setPlace(10, rynek);

        czwartek.printRoute();


    }
}
