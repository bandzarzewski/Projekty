package pl.sda.day6.credit;

/**
 * Created by RENT on 2017-07-04.
 */
public class CreditBankY implements Credit {
    private int maxTime = 100;
    private int minTime = 3;
    private int minValue = 10_000;

    private double rate = 1.04;

    @Override
    public double calculate(int value, int months) {
        if (months < minTime || months > maxTime) {
            return 0;
        }
        if (value < minValue) {
            return 0;
        }
// obliczenie raty kredytu

        double years = months / 12;
        double overallRate = Math.pow(rate, years);
        double sum = value * overallRate;

        return Math.round(sum / months);
    }

}
