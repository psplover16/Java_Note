package array004;

import java.util.Arrays;

public class ArrString {
    public ArrString() {
        String[] sarr = {"a", "b", "c", "d", "e", "f", "g"};
        System.out.printf("Arrays.toString(): %s%n", Arrays.toString(sarr)); // [a, b, c, d, e, f, g]
//        把字串陣列（或任意 Iterable<String >）接起來，指定分隔符
        System.out.printf("String.join(\", \", array): %s%n", String.join(", ", sarr)); // a, b, c, d, e, f, g

    }
}
