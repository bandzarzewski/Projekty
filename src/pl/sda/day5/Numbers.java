// zad 2 dzien 5
package pl.sda.day5;


import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private int n;

    public Numbers(int n) {
        this.n = n;
    }

    // odds - liczby nieparzyste

    public void printOdds() {
        // tworzymy liste
        List<Integer> list = new ArrayList<>();

        // list.get(0); -- pierwszy element listy
        // tablica[0]; -- pierwszy element tablicy

        for (int i = 1; i < n; i++) {
            if (i % 2 == 1) {
                list.add(i);
            }
        }
        System.out.println(list);
    }

    public void printEverAndDivBySeven() {
        // tworzymy liste
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < n; i++) {   // i % 2 == 0 reszta z dzielenia jest równa 0
            if ((i % 2 == 0) || (i % 7 == 0)) { // liczby parzyste i podzielne przez 7
                list.add(i);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        Numbers nums = new Numbers(50);
        nums.printOdds();
        nums.printEverAndDivBySeven();
    }
}
