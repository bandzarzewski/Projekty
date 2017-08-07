// zad Kredyt - obliczenie wysokosc rat kredytu

package pl.sda.day6.credit;

/**
 * Created by RENT on 2017-07-04.
 */
public class CreditBankX implements Credit { // odwołanie do interface
    private int minValue = 1_000; // "_" ładna edycja liczb
    private int maxValue = 20_000;
    private int minTime = 6;
    private int maxTime = 48;

    // procenty
    private double rate1 = 1.025;
    private double rate2 = 1.05;
    private double rate3 = 1.1;
    private int rate1MaxRange = 12;
    private int rate2MaxRange = 24;

    @Override
    // metoda oblicza wysokosc rat
    public double calculate(int value, int months) {
        if (value > maxValue || value < minValue) {
            return 0;
        }
        if (months > maxTime || months < minTime) {
            return 0;
        }
        double sum;
        if (months <= rate1MaxRange) { // pierwszy zakres
            sum = value * rate1;
        } else if (months <= rate2MaxRange) {
            sum = value * rate2;
        } else {
            sum = value * rate3;
        }

        // zaokragklenie rat kredytu
        return Math.round(sum / months);
    }

}
