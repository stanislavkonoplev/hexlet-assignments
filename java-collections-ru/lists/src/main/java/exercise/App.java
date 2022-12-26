package exercise;

import java.util.ArrayList;
import java.util.List;


// BEGIN
public class App {

    public static boolean scrabble(String symbolKit, String word) {
        List<String> symbols = makeList(symbolKit);
        List<String> lettersOfWord = makeList(word);

        for (String letter: lettersOfWord) {
            if (!symbols.contains(letter)) {
                return false;
            }
            symbols.remove(letter);
        }

        return true;
    }

    private static List<String> makeList(String symbolKit) {
        var symbols = symbolKit.split("");
        List<String> listOfSymbols = new ArrayList<>();

        for (String symbol: symbols) {
            listOfSymbols.add(symbol.toLowerCase());
        }

        return listOfSymbols;
    }
}
//END
