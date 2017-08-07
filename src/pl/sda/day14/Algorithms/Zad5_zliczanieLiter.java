package pl.sda.day14.Algorithms;

import java.util.HashMap;
import java.util.Map;

public class Zad5_zliczanieLiter {
    public static void main(String[] args) {
        String[] input = new String[]{"Ala ma duzego kota ", " Zosia ma malego psa"};
        Map<Character, Integer> mapa = new HashMap<Character, Integer>();
        for (int i = 0; i < input.length; i++) {
            StringBuilder text = new StringBuilder(input[i]);
            for (int j = 0; j < text.length(); j++) {
                char literka = text.charAt(j);
                if (!mapa.containsKey(literka)) {
                    mapa.put(literka, 1);
                }
                mapa.put(literka, mapa.get(literka) + 1);
            }
            for (Map.Entry<Character, Integer> entry : mapa.entrySet()) {
                System.out.println((entry.getKey() + ":" + entry.getValue()));
            }
        }
    }
}
