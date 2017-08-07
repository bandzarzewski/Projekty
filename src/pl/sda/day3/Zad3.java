package pl.sda.day3;

public class Zad3 {
    private int n;

    public Zad3(int n) {
        this.n = n;
    }

    // choinka
    public void print() {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }


    @Override
    public String toString() {
        return "Zad3{}";
    }

    public static void main(String[] args) {

        Zad3 zad3 = new Zad3(6); // obiekt

        zad3.print(); // wywołanie metody "print" - obiekt.metoda


    }


}
