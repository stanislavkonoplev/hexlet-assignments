package exercise;


import java.util.Arrays;
import java.util.stream.Stream;


// BEGIN
public class App {
    public static String[][] enlargeArrayImage(String[][] image) {
        return Arrays.stream(image)
                .map(line -> (Arrays.stream(line)
                        .flatMap(pixel -> Stream.of(pixel, pixel))
                        .toArray(String[]::new)))
                .flatMap(line -> Stream.of(line, line))
                .toArray(String[][]::new);
    }
}
// END
