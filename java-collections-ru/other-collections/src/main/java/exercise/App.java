package exercise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// BEGIN
public class App {

    public static Map<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        var set1 = data1.entrySet();
        var set2 = data2.entrySet();
        return Stream.concat(set1.stream(), set2.stream())
                .collect(Collectors.toMap(Map.Entry::getKey, x -> set1.contains(x) ? "deleted" : "added"
                        , (v1, v2) -> v1.equals(v2) ? "unchanged" : "changed", LinkedHashMap::new));
    }
}
//END
