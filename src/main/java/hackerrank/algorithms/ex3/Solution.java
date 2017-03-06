package hackerrank.algorithms.ex3;
/**
 * Created by mmik on 04/03/2017.
 * <p>
 * source : https://www.hackerrank.com/challenges/a-very-big-sum?h_r=next-challenge&h_v=zen
 * <p>
 * You are given an array of integers of size N. You need to print the sum of the elements in the array,
 * keeping in mind that some of those integers may be quite large.
 * <p>
 * Input Format
 * The first line of the input consists of an integer N. The next line contains N space-separated integers
 * contained in the array.
 * <p>
 * Output Format
 * Print a single value equal to the sum of the elements in the array.
 * <p>
 * Constraints
 * 1<= N <=10
 * 0<= A[i] <= 10^10
 * <p>
 * Sample Input
 * 5
 * 1000000001 1000000002 1000000003 1000000004 1000000005
 * <p>
 * Output
 * 5000000015
 * <p>
 * Note:
 * The range of the 32-bit integer is (-2^31) to (2^31-1) or [-2147483648,2147483647].
 * When we add several integer values, the resulting sum might exceed the above range. You might need to use long long int in C/C++ or long data type in Java to store such sums.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Solution in Java 8
        Integer N = in.nextInt();
        List<Long> A = new ArrayList<>();


        // Gets inputs:
        if(N<0 || N>10 || !(N instanceof Integer))
            throw new IllegalArgumentException("You can only entry up to 10 integers.");

        LongStream
                .range(0, N)
                .forEach(value -> {
                    Long nb = in.nextLong();
                    if(nb<0 || nb>Math.pow(10,10) || !(nb instanceof Long)) {
                        throw new IllegalArgumentException("The numbers are Integer type. They should be included between 0 and 10^10.");
                    }else A.add(nb);
                });


        // Sum
        System.out.println(A.stream().reduce(0L, (acc, a) -> Math.addExact(acc, a)));
    }
}
