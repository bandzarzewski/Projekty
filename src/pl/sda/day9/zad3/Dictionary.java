package pl.sda.day9.zad3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by RENT on 2017-07-07.
 */
public class Dictionary {


    private HashMap<String, String> dictionary = new HashMap<>();

    public void addWord(String polish, String english) {
        dictionary.putIfAbsent(polish.toLowerCase(), english.toLowerCase()); // putIfAbsent - dodaj jesli nie istniej
    }

    public void removeWord(String polish) {
        dictionary.remove(polish.toLowerCase());
    }

    public void removeTranslation(String english) {
        String toRemove = "";        // entrySet - zbiór wpisów
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            if (entry.getValue().equals(english.toLowerCase())) {
                toRemove = entry.getKey();
                break; // w tym miejscu wychodzimy z petli
            }
        }
        removeWord(toRemove);
    }

    public void replaceWord(String polish, String english) {
        if (dictionary.containsKey(polish)) {                                   // contins - sprawdza czy istnieje
            dictionary.put(polish.toLowerCase(), english.toLowerCase());
        }
    }

    public void printDictionary() {
        System.out.println(dictionary);
    }


}
