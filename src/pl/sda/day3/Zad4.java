package pl.sda.day3;

public class Zad4 {
    private int n;
    private char[] tab = {'a', 'b', 'r', 'a', 'k', 'a', 'r', 'a', 'b', 'r', 'a'};
    // zainciowaliśmy tablice zmiennymi.

    public Zad4(int n) {
        this.n = n;

    }


    public void print() {

        int k = 0;
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                // Przed wypisaniem chcemy sprawdzić wielkość
                System.out.print(tab[(k++ % tab.length)] + " ");

            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Zad3{}";
    }

    public static void main(String[] args) {

        Zad4 zad4 = new Zad4(14); // obiekt

        zad4.print(); // wywołanie metody "print" - obiekt.metoda

    }

}

