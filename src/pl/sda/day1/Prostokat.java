package pl.sda.day1;

/**
 * Created by Maciek on 27.06.2017.
 */
public class Prostokat {
    // deklaracja parametrów
    private int a;
    private int b;

    // deklaracja konstruktora
    public Prostokat(int a, int b) {
        if (a < 0) {
            a = -a;
            a = Math.abs(a);
        }
        if (b < 0) {
            b = -b;
            b = Math.abs(b);
        }

// niejawny parametr this służy do odróźnienia parametrów od zmiennych lokalnych
        this.a = a; // wkaźnik this " pod moje pole a przypisz zmiena a
        this.b = b;
    }

    // metoda
    public int obliczPole() {
        return a * b;
    }

    public int obliczObwod() {
        return 2 * (a + b);
    }

    
}

