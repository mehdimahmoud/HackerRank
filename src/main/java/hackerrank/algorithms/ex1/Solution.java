package hackerrank.algorithms.ex1;
/**
 * Source https://www.hackerrank.com/challenges/simple-array-sum?h_r=next-challenge&h_v=zen
 * <p>
 * Given an array of  integers, can you find the sum of its elements?
 * <p>
 * Input Format
 * <p>
 * The first line contains an integer, , denoting the size of the array.
 * The second line contains  space-separated integers representing the array's elements.
 * <p>
 * Output Format
 * <p>
 * Print the sum of the array's elements as a single integer.
 * <p>
 * Sample Input:
 * 6
 * 1 2 3 4 10 11
 * <p>
 * Sample Output:
 * 31
 * Explanation
 * <p>
 * We print the sum of the array's elements, which is: .
 */


import java.util.*;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        List<Integer> t = new ArrayList();

       /* int i1 = scan.nextInt();

        while(scan.hasNext()){
            t.add(scan.nextInt());
        }*/
        int i1 = scan.nextInt();
        IntStream
                .range(0, i1)
                .forEach(i -> t.add(scan.nextInt()));


        System.out.println(t.stream().mapToInt(i -> i.intValue()).sum());

    }
}
