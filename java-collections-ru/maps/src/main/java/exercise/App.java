package exercise;

import java.util.*;

// BEGIN
public class App {

    public static Map<String, Integer> getWordCount(String sentence) {
        String[] listOfWords = sentence.split(" ");
        Map<String, Integer> wordsCount = new HashMap<>();

        if (sentence.length() == 0) {
            return  wordsCount;
        }

        for (String word: listOfWords) {
            int count = (int) wordsCount.getOrDefault(word, 0);
            count++;
            wordsCount.put(word, count);
        }

        return wordsCount;
    }

    public static String toString(Map<String, Integer> wordsCount) {
        if (wordsCount.size() == 0) {
            return "{}";
        }
        var result = "{";

        for (String key: wordsCount.keySet()) {
            result += ("\n  " + key + ": " + wordsCount.get(key));
        }

        result += "\n}";
        return result;
    }
}
//END
