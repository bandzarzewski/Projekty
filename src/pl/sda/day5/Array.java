// Zad 1.dzien 5

package pl.sda.day5;

/**
 * Created by RENT on 2017-07-03.
 */

import java.util.Random;


public class Array {
    private double[] array;
    private double avg; // nowe pole średnia

    public Array(int n) { // argumentem jest wielkosc tablicy
        this.array = new double[n];

        // losujemy liczby
        Random rand = new Random(); // nowu obiekt generator liczb losowych
        // double gerneruje liczbe z zakresu od 0 do 1 !
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextDouble() * 100; // metoda wybiera jakie liczby chcemy losować
        }
    }

    public void print() {
        for (double v : array) {
            System.out.print(String.format("%3.2f ", v));
        }
        System.out.println();
    }

    public void printMinAndMax() {
        double min = Double.MAX_VALUE;
        double max = -Double.MAX_VALUE;

        for (double v : array) {
            if (v < min) {
                min = v;
            }
            if (v > max) {
                max = v;
            }
        }
        System.out.println(String.format("min: %3.2f ,max: %3.2f ", min, max));
    }

    public void printAvg() {
        double sum = 0.0; // zmiena ktora zapamieta sume

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        avg = sum / array.length;
        System.out.print(String.format("avg: %3.2f", avg));
        System.out.println();
    }

    public void printQuartiels() {

        System.out.print("less than avg "); // mniejszy od avg
        int i = 0;
        while (i < array.length) { // to jest toi samo co petla for .
            if (array[i] < avg) {
                System.out.print(String.format("%3.2f ", array[i]));
            }
            i++;
        }
        System.out.println();
        System.out.println("gt avg ");
        i = 0;
        while (i < array.length) { // to jest toi samo co petla for .
            if (array[i] >= avg) {
                System.out.print(String.format("%3.2f ", array[i]));
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Array arr = new Array(5);


        arr.print();
        arr.printMinAndMax();
        arr.printAvg();
        arr.printQuartiels();
    }

}
