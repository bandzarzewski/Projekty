package pracaDomowa.ZadDomNiedziela;

/**
 * Created by Maciek on 28.07.2017.
 */
public class SzyfrCezara {

    private static String[] znaki = new String[]{"" +
            "&", "6", "7", "D", "E", "F", "G", "8",};

    public static void main(String[] args) {

        String[] algorytm = new String[]{"cde", "fgh"};

        for (int i = 0; i < algorytm.length; i++) { //PRZECHODZIMY PO WSZYSTKICH WYRAZACH

            String word = algorytm[i].toUpperCase(); // ZAMIENIAMY WSZYSTKI MALE LITERY NA WIELKIE

            char[] letterInWords = word.toCharArray(); // NOWA TABELA Z POJEDYNCZYMI DUZYMI LITERKAMI

            for (int letter = 0; letter < letterInWords.length; letter++) {

                int position = getLetterPosition(Character.toString(letterInWords[letter]));//POBIERAMY POZYJCE LITERY

                int move = (position + 1) % znaki.length;
                System.out.printf("%s", znaki[move]);
            }
            System.out.print(" ");
        }

    }

    private static int getLetterPosition(String letter) {
        for (int i = 0; i < znaki.length; i++) {
            if (letter.equals(znaki[i])) {
                return i;
            }
        }
        return -1;
    }
}
