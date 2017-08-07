package pl.sda.day12;

import java.util.Scanner;

/**
 * Created by sp0rk on 12/07/17.
 */
public class UserInput {
    public static void main(String[] args) {
//        readName();
//        readNumberAndSquare();
        readPoem();
    }

    private static void readName() {
        Scanner input = new Scanner(System.in); // Scanner input - to jest referencja
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.printf("Your name: %s\n", name);
    }

    private static void readPoem() {
        System.out.println("Input lines of your poem, to finish the poem input a \";\"");

        Scanner input = new Scanner(System.in);
        String poem = "";
        while (input.hasNext()) {
            String line = input.nextLine();
            if (line.equals(";")) {
                break;
            }
            poem = poem + line + "\n";
        }
        System.out.printf("Poem:\n\n%s\nThe End", poem);

    }

    private static void readNumberAndSquare() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = input.nextDouble();
        System.out.printf("%1$.2f * %1$.2f = %2$.4f", number, number * number);
    }
}
