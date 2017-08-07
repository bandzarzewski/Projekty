package pl.sda.day9.zad3;

/**
 * Created by RENT on 2017-07-07.
 */
public class Main {
    public static void main(String[] args) {
        Dictionary polEngDict = new Dictionary();
        polEngDict.addWord("Rower", "Bike");
        polEngDict.addWord("Pies", "Dog");
        polEngDict.addWord("Samochod", "Car");

        polEngDict.addWord("Pies", "Dog");

        polEngDict.printDictionary();
        polEngDict.replaceWord("Kot", "Kitten");
        polEngDict.replaceWord("Lis", "Fox");
        polEngDict.removeWord("Rower");

        polEngDict.removeTranslation("dog");

//        polEngDict.printDictionary();

        BetterDictionary betterDictionary = new BetterDictionary();
        betterDictionary.addWord("kot", "cat");
        betterDictionary.addWord("kot", "kitten");
        betterDictionary.addWord("pies", "dog");

        betterDictionary.printDictionary();
    }
}
