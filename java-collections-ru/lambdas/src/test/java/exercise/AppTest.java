package exercise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
public class AppTest {
    @Test
    void testSorterWithoutMan() {
        String[][] image1 = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };
        String[][] expected1 = {
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
        };
        var actual1 = App.enlargeArrayImage(image1);
        Arrays.stream(image1).map(Arrays::toString).forEach(System.out::println);
        Arrays.stream(actual1).map(Arrays::toString).forEach(System.out::println);
        assertThat(actual1).isEqualTo(expected1);


        String[][] image2 = {};
        String[][] expected2 = {};
        var actual2 = App.enlargeArrayImage(image2);
        assertThat(actual2).isEqualTo(expected2);
    }
}
// END
