package pl.sda.day13;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by sp0rk on 11/07/17.
 */
public class WordCounter {

    // liczymy słowe w naszym pliku tekstowy
    public static String readFile(String name) throws IOException {
        Scanner input = null;
        String content = "";
        try {
            Path path = Paths.get(name);
            input = new Scanner(path);

            // robimy petle aby przejsc przez wszystki linie

            long start = System.nanoTime();
            while (input.hasNextLine()) {
                content = content + input.nextLine();
            }
            long stop = System.nanoTime();
            System.out.println("Reading time " + (stop - start));

        } finally {
            if (input != null) {
                input.close();
            }
        }
        return content;
    }


    public static TreeMap<String, Integer> countWords(String text) {
        TreeMap<String, Integer> counter = new TreeMap<>();

        String noWhitespace = text.trim();
        String noSpecialChars = noWhitespace.replaceAll("[\\n.,/():;_\\-+!?\\\\]", " ");
        String noDoubleSpaces = noSpecialChars.replaceAll("\\s+", " ");
        String lowerCase = noDoubleSpaces.toLowerCase();
        String[] words = lowerCase.split(" ");

        long start = System.nanoTime();
        for (String word : words) {
            if (counter.containsKey(word)) {
                int occurrences = counter.get(word);
                counter.put(word, occurrences + 1);
            } else {
                counter.put(word, 1);
            }
        }
        long stop = System.nanoTime();

        System.out.println("Creating dis " + (stop - start));
        return counter;
    }

    // poniżej robimy metode ktora zapisuje do pliku
    private static void writenMapToFile(TreeMap<String, Integer> map, String name) throws IOException {
        PrintWriter output = null;
        try {
            File file = new File(name);
            if (!file.exists()) {
                file.createNewFile();
            }
            output = new PrintWriter(file);
            // nic nie zwracamy bo chcemy tylko zapisać do pliku

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                output.printf("The word \"%s\" occurs %d times\n",
                        entry.getKey(),
                        entry.getValue());
            }
        } finally {
            output.close();
        }

    }

    public static void main(String[] args) {

        String text = null;
        try {
            text = readFile("text.txt");
            TreeMap<String, Integer> wordMap = countWords(text);
            // poniżej robimy metode ktora zapisuje do pliku
            writenMapToFile(wordMap, "dict.txt");
        } catch (IOException e) {
            System.out.println(" File handling error");
        }
    }


}
