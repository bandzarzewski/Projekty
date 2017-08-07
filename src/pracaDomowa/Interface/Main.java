package pracaDomowa.Interface;

import java.util.Scanner;


public class Main {

    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        Computation computation; // CO TO JEST ?

        if (main.shouldSum()) {
            computation = new Sum(); // zaimplementuj brakującą klasę
        } else {
            computation = new Sub(); // zaimplementuj brakującą klasę
        }

        double arg1 = main.getArgument();
        double arg2 = main.getArgument();

        double result = computation.compute(arg1, arg2);
        System.out.println("Wynik" + result);
    }

    private double getArgument() {
        System.out.println("Podaj liczbe: ");
        return input.nextDouble();   // tutaj zapytaj użytkownika co chce zrobić
    }

    private boolean shouldSum() {
        System.out.println("Jaką operacje chcesz wybrac ? Wybierz S jesli chcesz sume, w każdym innym wypadku " +
                "wybierzeż róźnice");
        return input.next().equals("S");

    }
}
