// Zad. Sprawdzić czy dany znak jest palidrome

package pl.sda.day4;

/**
 * Created by Maciek on 30.06.2017.
 */

public class Palindrome {
    private String text;
    private String textPrepared;

    public Palindrome(String text) {
        this.text = text;
        //this.textPrepared = text.toLowerCase(); // metoda zamieni wszystko na małe litery
        prepareString();
    }

    private void prepareString() { // nic nie zwraca
        // Z.D StringBuilder, sb.append(), sb.toString()

        String tmp = "";
        int len = text.length();

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ') {
                tmp += text.charAt(i);  //tmp = tmp + text.charAt(i);
            }
        }
        this.textPrepared = tmp.toLowerCase();
    }


    public boolean check() {
        int len = textPrepared.length(); // to jest długość
        int len2 = len / 2;

        for (int i = 0; i < len2; i++) { // sprawdzamy cały wyraz do połowy
            if (textPrepared.charAt(i) != textPrepared.charAt(len - i - 1)) {  // metoda charAt()
                return false;
            }
        }
        return true;
    }

    // druga metoda replaceAll

    public boolean checkFaster() {
        String trimmed = text.replaceAll(" ", "").toLowerCase();
        String reversed = new StringBuilder(trimmed).reverse().toString(); // StringBuilder() to jest klasa
        return trimmed.equals(reversed); // poczytać o metodzie equals !
    }


    @Override
    public String toString() {
        return text;
    }

    public static void main(String[] args) {
        Palindrome p1 = new Palindrome("Kajak");
        Palindrome p2 = new Palindrome("kajak");
        Palindrome p3 = new Palindrome("kobyla ma maly bok");
        Palindrome p4 = new Palindrome("Kobylama malybok");
        Palindrome p5 = new Palindrome("1");
        Palindrome p6 = new Palindrome("12");

        // uruchamiamy metode check
        System.out.println(p1 + " : " + p1.check());
        System.out.println(p2 + " : " + p2.check());
        System.out.println(p3 + " : " + p3.check());
        System.out.println(p4 + " : " + p4.check());
        System.out.println(p5 + " : " + p5.check());
        System.out.println(p6 + " : " + p6.check());
        System.out.println();
        System.out.println(p1 + " : " + p1.checkFaster());
        System.out.println(p2 + " : " + p2.checkFaster());
        System.out.println(p3 + " : " + p3.checkFaster());
        System.out.println(p3 + " : " + p3.checkFaster());

    }
}
