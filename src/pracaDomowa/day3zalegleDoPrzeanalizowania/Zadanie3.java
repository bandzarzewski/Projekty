package pracaDomowa.day3zalegleDoPrzeanalizowania;

public class Zadanie3 {
    private int n;
    private char[] tab = {'a', 'b', 'r', 'a', 'k', 'a', 'd', 'a', 'b', 'r', 'a'};

    public Zadanie3(int n) {
        this.n = n;
    }

    public void print1() {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < 2 * n; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    public void print2() {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    public void print3() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    public void print4() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; (j < 2 * i - 1) && (j < tab.length); j++) {
                System.out.print(tab[j]);
            }
            System.out.println();
        }
    }

    public void print5() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(tab[j % tab.length]);
            }
            System.out.println();
        }
    }

    public void print6() {
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; (j < i + 1); j++) {
                System.out.print(tab[(k++ % tab.length)] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Zadanie3{}";
    }

    public static void main(String[] args) {
        Zadanie3 z3 = new Zadanie3(10);

        z3.print1();
        System.out.println();
        z3.print2();
        System.out.println();
        z3.print3();
        System.out.println();
        z3.print4();
        System.out.println();
        z3.print5();
        System.out.println();
        z3.print6();
    }
}
