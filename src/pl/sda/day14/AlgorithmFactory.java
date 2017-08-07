package pl.sda.day14;

import pl.sda.day14.Algorithms.*;

/**
 * Created by jake on 21.07.2017.
 */

public class AlgorithmFactory {
    public AbstractAlgorithm getAlgorithm(String name) throws Exception {
        switch (name.toLowerCase()) {
            case "test":
                return new Test();
            case "biednycamelcase":
                return new BiednyCamelCase();
            case "syfrcezara":
                return new SzyfrCezara();
            case "zad1palindrome":
                return new Zad1_Palindrom();
            case "zad1palindrom":
                return new Zad1_Palindrom();
            case "testowanielisty":
                return new TestowanieListy();

            default:
                throw new Exception("Nie ma takiego algorytmu!");
        }
    }
}
