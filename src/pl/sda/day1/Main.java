package pl.sda.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {

    // zamiast logger zamiazst System.out...
    // inicjanowanie loggera, więcej informacji w linku poniżej 
    // http://kobietydokodu.pl/praktyczna-java-biblioteki-do-logowania/
    private static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        // to jest część do klasy Prosokąt!
        // Prostokat f1 = new Prostokat(10, -30); // konstruktor klasy Prostokąt, jest szczególny typ obiektu który
        // ma już zadeklarowane parametry.

        //System.out.println(f1.obliczObwod()); // tego nie powinno się tego używać w aplikacjach webowych
        // zamiast tego używamy Loggera !
        // System.out.println(f1.obliczPole());

       /* Logger log=Logger.getLogger(Klasa.class.getName());
       log.fine("metoda zakończona");
       log.warning("błąd" + zmienna);

*/ // tworzymy liste

        List<Uczestnik> lista = new ArrayList<>(); // ta lista zawiera 4 obiekty
        // dodawanie nowych uczestnikow
        lista.add(new Uczestnik("Maciek", 14));    //
        lista.add(new Uczestnik("Jan", 44));
        lista.add(new Uczestnik("Zofia", 28));
        lista.add(new Uczestnik("Adam", 19));

        // "u" nazwa

/*
        for (Uczestnik u : lista) {
            // u.ustawObecnosc(); - ustawiamy obecność
            log.info(u.toString());
        }
*/
        for (int i = 0; i < lista.size(); i++) {
            log.info(lista.get(i).toString());
        }

    }

}