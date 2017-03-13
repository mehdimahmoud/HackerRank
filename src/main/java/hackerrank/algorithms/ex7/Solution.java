package hackerrank.algorithms.ex7;
/**
 * Created by mmik on 04/03/2017.
 * source: https://www.hackerrank.com/contests/w29/challenges/big-sorting?utm_source=w30-reminder-1&utm_medium=email&utm_campaign=w30
 * Consider an array of numeric strings, , where each string is a positive number with anywhere from  to  digits. Sort the array's elements in non-decreasing (i.e., ascending) order of their real-world integer values and print each element of the sorted array on a new line.
 * <p>
 * Input Format
 * <p>
 * The first line contains an integer, , denoting the number of strings in .
 * Each of the  subsequent lines contains a string of integers describing an element of the array.
 * <p>
 * Constraints
 * <p>
 * <ul>
 * <li>1<= n <= 2x10^5</li>
 * <li>Each string is guaranteed to represent a positive integer without leading zeros.</li>
 * <li>The total number of digits across all strings in  is between  and  (inclusive).</li>
 * </ul>
 * <p>
 * Output Format
 * <p>
 * Print each element of the sorted array on a new line.
 * <p>
 * Sample Input 0
 * <p>
 * 6
 * 31415926535897932384626433832795
 * 1
 * 3
 * 10
 * 3
 * 5
 * Sample Output 0
 * <p>
 * 1
 * 3
 * 3
 * 5
 * 10
 * 31415926535897932384626433832795
 * Explanation 0
 * <p>
 * The initial array of strings is unsorted = [31415926535897932384626433832795,1,3,10,3,5]. When we order each string
 * by the real-world integer value it represents, we get:
 * 1 <= 3 <= 3 <= 5 <= 10 <= 31415926535897932384626433832795
 * <p>
 * We then print each value on a new line, from smallest to largest.
 */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Solution in Java 8
        int n = in.nextInt(); // number of integer strings
        List<String> unsorted = new ArrayList(); // Array of number Strings

        // Checks constraints
        if (n < 1 || n > 2 * Math.pow(10, 5))
            throw new IllegalArgumentException("Choose a number between 1 and 10^5");

        // Gets input
        IntStream.range(0, n)
                .forEach(i -> {
                    String next = in.next();
                    // Checks constraints
                    if (next == null || next.isEmpty() || next.startsWith("0"))
                        throw new IllegalArgumentException("Please enter a valid positive number and without leading zeros.");

                    unsorted.add(next);

                    // Checks the number of all string digits
                    long sumDigit = unsorted.stream().mapToInt(s -> s.length()).sum();
                    if (sumDigit < 1 || sumDigit > Math.pow(10, 6)) {
                        throw new IllegalArgumentException("The total number of digits across all strings should be between 1 and 10^6 inclusive. ");
                    }
                });
        // Lets sort the list
        unsorted.stream()
                .map(s -> new BigInteger(s))
                .sorted()
                .forEach(System.out::println);
    }
}
