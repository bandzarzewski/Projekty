package pl.sda.day14.Algorithms;

import java.util.HashMap;
import java.util.Map;

public class Zad7_KabalistycznyZapisDaty {
//    private static String _numbers[] = {"1", "2", "3", "4", "5", "6"};

    public static void main(String[] args) {
        String[] input = new String[]{"efg"};
        for (int i = 0; i < input.length; i++) {
            String word = input[i].toLowerCase();
            char[] lettersInWord = word.toCharArray(); //Zamieniamy wyraz na pojedyncze literki
            for (int letter = 0; letter < lettersInWord.length; letter++) {

                HashMap<String, Integer> kalendarz = new HashMap<>();
//                kalendarz.put('a', 1);
//                kalendarz.put('b', 2);
//                kalendarz.put('c', 3);
//                kalendarz.put('d', 4);
                kalendarz.put("e", 5);
                kalendarz.put("f", 6);
                kalendarz.put("g", 7);

                String znak = "J";

                int a = kalendarz.get(input[i]);


                for (Map.Entry<String, Integer> entry : kalendarz.entrySet()) { // iterowanie po kluczu
//                    for(Character key:kalendarz.entrySet())


                    Integer number;
                    if (entry.getKey().equals(lettersInWord[i])) {
                        number = entry.getValue();
                        input[i] = String.valueOf(entry.getValue());
                        System.out.println(number);
                    }

                }
            }
        }
    }
}
