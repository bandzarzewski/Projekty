// Zadanie rozwiazac równanie kwadratowe

package pl.sda.day4;

/**
 * Created by Maciek on 30.06.2017.
 */
public class Equation {

    private double a;
    private double b;
    private double c;

    private double delta;
    private double x1;
    private double x2;
    private int numerOfSols; // ile jest rozwiazan
    // -1 - nieskonczenie wiele
    // 0,1,2 - rozwiazania

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void solve() {
        if (a == 0) {
            solveLinear(); // metoda roz. liniowo
        } else {
            solveQuadratic();
        }

    }

    private void solveLinear() {
        //bx+c=0 -> x=-c/b
        if (b == 0) {
            if (c == 0) {
                numerOfSols = -1;
            } else {
                numerOfSols = 0;
            }
        } else {
            numerOfSols = 1;
            x1 = -c / b;

        }
    }

    private void solveQuadratic() {
        countDelta();
        countSolutions(); // ilosc rozwiazan

        switch (numerOfSols) {
            case 2:
                double sqrtDelta = Math.sqrt(delta);
                x1 = (-b - sqrtDelta) / (2 * a);
                x2 = (-b + sqrtDelta) / (2 * a);
                break;
            case 1:
                x1 = -b / (2 * a);
                break;
            case 0:
            default:
                // do nothing
        }

    }

    private void countDelta() {
        // Math.pow(b, 2);
        delta = b * b - 4 * a * c;
    }

    private void countSolutions() {
        if (delta > 0) {
            numerOfSols = 2;
        } else if (delta == 0) {
            numerOfSols = 1;
        } else {
            numerOfSols = 0;
        }
    }

    public double getX1() {
        return x1;
    }

    public int getNumerOfSols() {
        return numerOfSols;
    }


    public static void main(String[] args) {
        Equation eg1 = new Equation(1, -2, 1);
        Equation eg2 = new Equation(1, -1, 0);
        Equation eg3 = new Equation(3, -1, -2);

        //rozwiazujemy rowania

        eg1.solve();
        eg2.solve();
        eg3.solve();

        System.out.println(eg1);
        System.out.println(eg2);
        System.out.println(eg3);
    }

    // Zad dom. przerobić na String.format();
    // switch(numOfSols) {}

    @Override
    public String toString() {
        return ("Equation{" +
                a + "x^2 + " +
                b + "x + " +
                c + "=0.0" +
                "->" +
                " x1=" + x1 +
                "  x2=" + x2 +
                '}').replaceAll("\\+ -", "- "); // replaceAll zamienia znaki 
    }
}
