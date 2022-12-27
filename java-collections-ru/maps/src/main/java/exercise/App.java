package exercise;

import java.util.*;

// BEGIN
public class App {

    public static Map<String, Integer> getWordCount(String sentence) {
        List<String> listOfWords = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        Map<String, Integer> wordsCount = new HashMap<>();

        for (var i = 0; i < listOfWords.size(); i++) {
            var count = 1;
            for (var j = i + 1; j < listOfWords.size(); j++) {
                if (listOfWords.get(i).equals(listOfWords.get(j))) {
                    count++;
                    listOfWords.remove(j);
                    j--;
                }
            }
            if (listOfWords.get(i).equals("")) {
                break;
            }
            wordsCount.put(listOfWords.get(i), count);
        }

        return wordsCount;
    }

    public static String toString(Map<String, Integer> wordsCount) {
        var result = "{";

        for (String key: wordsCount.keySet()) {
            result += ("\n  " + key + ": " + wordsCount.get(key));
        }

        if (wordsCount.size() != 0) {
            result += "\n";
        }
        result += "}";
        return result;
    }
}
//END
