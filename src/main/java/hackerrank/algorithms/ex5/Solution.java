package hackerrank.algorithms.ex5;
/**
 * Created by mmik on 04/03/2017.
 * <p>
 * We have a list of N integers.
 * <p>
 * We will filter the list into even and odd number of lists.
 * <p>
 * Sample
 * Inputs
 * 8
 * 3 12 23 44 20 10 17 8
 * <p>
 * Outputs
 * Even Numbers : 12 44 20 10 8
 * Odd Numbers : 3 23 17
 */

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Solution in Java 8
        Integer N = in.nextInt(); // N integers to filter
        List<Integer> list = new ArrayList<>();

        // Gets inputs
        IntStream.range(1, N)
                .forEach(i -> list.add(in.nextInt()));

        // Gets output

        // Solution 1:
        /*System.out.println("Even numbers: ");
        list.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.print(e + " "));
        System.out.println("\nOdd numbers: ");
        list.stream().filter(o -> o % 2 == 1).forEach(o -> System.out.print(o + " "));*/

        // Solution 2:
        List<Integer> evenSet = new ArrayList<>();
        List<Integer> oddSet = new ArrayList<>();
            // Composed consumer made with the inner consumers
        Consumer<Integer> splitter = splitter(e -> e % 2==0, (Integer e) -> evenSet.add(e))
                .andThen(splitter(o -> o % 2==1,(Integer o) -> oddSet.add(o)));
            // The stream is consumed by the composed consumer
        list.stream().forEach(splitter);

        System.out.println(evenSet);
        System.out.println(oddSet);

    }

    /**
     * splits a stream regarding on predicate (filter, ...) to perform an action's consumer
     * @param predicate
     * @param action
     * @param <T>
     * @return
     */
    public static <T> Consumer<T> splitter(Predicate<T> predicate, Consumer<T> action) {
        return elem ->
            Stream.of(elem)
                    .filter(predicate)
                    .findAny()
                    .ifPresent(action);
    }
}
