package pl.sda.day14.Algorithms;

public class Zad4_NowaDziałka {
    public static void main(String[] args) {
        String[] input = new String[]{"2", "5", "3"};
        for (int i = 1; i < input.length; i++) {
            int n = Integer.parseInt(input[i]);
            double pole = Math.pow(n, 2);
            System.out.println(pole);
        }

    }
}

