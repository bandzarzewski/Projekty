package pl.sda.day9.zad3;

import java.util.ArrayList;
import java.util.HashMap;


public class BetterDictionary {
    private HashMap<String, ArrayList<String>> dictionary = new HashMap<>();

    public void addWord(String polish, String english) {
        if (dictionary.containsKey(polish)) {
            ArrayList<String> translations = dictionary.get(polish);
            translations.add(english);
        } else {
            ArrayList<String> translations = new ArrayList<>();
            translations.add(english);
            dictionary.put(polish, translations);
        }
//        dictionary.putIfAbsent(polish.toLowerCase(), english.toLowerCase()); // putIfAbsent - dodaj jesli nie istniej
    }


    public void printDictionary() {
        System.out.println(dictionary);
    }


}
