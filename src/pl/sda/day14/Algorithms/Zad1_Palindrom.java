package pl.sda.day14.Algorithms;

/**
 * Created by Maciek on 29.07.2017.
 */
public class Zad1_Palindrom extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "Zad 1 Palindrom ";
    }

    @Override
    public void runAlgorithm(String[] input) {

        // WEJSCIE: 3, 28
        int n = input.length - 1;
        int[] tabela = new int[n];
        for (int i = 0; i < tabela.length; i++) {
            tabela[i] = Integer.parseInt(input[i + 1]);
            // System.out.print(" " + tabela[i]);
            int number = tabela[i];
            reverseAndAdd(number);
        }
    }

    private int reverseNumber(int number) {
        int reverse = 0;
        int rem = 0;
        while (number != 0) {
            rem = number % 10;
            reverse = (reverse * 10) + rem;
            number = number / 10;
        }
        return reverse;
    }

    private boolean checkPalindrome(int number) {
        int reverse = reverseNumber(number);
        if (reverse == number) {
            return true;
        } else {
            return false;
        }
    }

    private void reverseAndAdd(int number) {
        int licznik = 1;
        if (checkPalindrome(number)) {
            System.out.println(" Twoja liczba jest palindromem");
        } else {
            while (!checkPalindrome(number)) {
                int reverse = reverseNumber(number);
                int sum = number + reverse;
                System.out.println(number + "+" + reverse + "=" + sum + " Licznik: " + licznik);
                licznik++;
                number = sum;
            }
        }

    }
}


