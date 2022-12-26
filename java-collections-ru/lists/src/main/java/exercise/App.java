package exercise;

import java.util.ArrayList;
import java.util.List;


// BEGIN
public class App {

    public static boolean scrabble(String symbolKit, String word) {
        boolean result = false;
        List<String> symbolListOfSymbolKit = makeList(symbolKit);
        List<String> symbolListOfWord = makeList(word);

        for (String letter: symbolListOfWord) {
            if (symbolListOfSymbolKit.contains(letter)) {
                result = true;
            } else {
                result = false;
                break;
            }
            symbolListOfSymbolKit.remove(letter);
        }

        return result;
    }

    private static List<String> makeList(String symbolKit) {
        var charsSymbolKit = symbolKit.toCharArray();
        List<String> listOfSymbolKit = new ArrayList<>();

        for (char symbol: charsSymbolKit) {
            listOfSymbolKit.add(String.valueOf(symbol).toLowerCase());
        }

        return listOfSymbolKit;
    }
}
//END
