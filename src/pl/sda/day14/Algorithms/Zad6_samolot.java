package pl.sda.day14.Algorithms;


public class Zad6_samolot {
    public static void main(String[] args) {
        String[] input = new String[]{"2", "5", "3", "20"};
//        for (int i = 0; i < input.length; i++) {
//        }
        int n1 = Integer.parseInt(input[0]);
        int k1 = Integer.parseInt(input[1]);
        int n2 = Integer.parseInt(input[2]);
        int k2 = Integer.parseInt(input[3]);

        int NumberOfSeats = (n1 * k1) + (n2 * k2);

        System.out.print("Liczba miejsc siedzących w samolocie wynosi: " + NumberOfSeats);
//            break;


    }
}
