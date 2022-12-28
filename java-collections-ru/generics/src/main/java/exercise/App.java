package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
public class App {

    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> bookWhere) {
        List<Map<String, String>> foundBooks = new ArrayList<>();

        for (Map<String, String> book: books) {
            if (bookContains(book, bookWhere)) {
                foundBooks.add(book);
            }
        }

        return foundBooks;
    }

    private static boolean bookContains(Map<String, String> book, Map<String, String> bookWhere) {

        for (String key: bookWhere.keySet()) {
            if (!book.containsValue(bookWhere.get(key))) {
                return false;
            }
        }

        return true;
    }
}
//END
