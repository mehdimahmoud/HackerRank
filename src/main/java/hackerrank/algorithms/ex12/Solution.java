package hackerrank.algorithms.ex10;
/**
 * Created by mmik on 14/03/2017.
 * source: https://www.hackerrank.com/contests/w30/challenges/find-the-minimum-number
 * Jessica is learning to code and was recently introduced to the  function. This function compares two integers and returns the smaller one. This is what calling the function looks like when comparing two integers  and :
 * <p>
 * min(a, b)
 * Jessica realizes that she can also find the smallest of three integers a, b, c and  if she puts the  function inside of another  function:
 * <p>
 * min(a, min(b, c))
 * For four integers she can nest the functions once more:
 * <p>
 * min(a, min(b, min(c, d)))
 * Jessica is curious about the structure of these function calls and wants to see if she can write a program to construct a string that shows how  number of integers can be compared with nested  functions. Can you help Jessica write this program?
 * <p>
 * Input Format
 * <p>
 * The input contains a single integer  (the number of integers to be compared).
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * Print the string on a single line. Each integer in the string should be written as 'int' and the string must accurately show how  functions can be called to find the smallest of  integers.
 * <p>
 * Sample Input 0
 * <p>
 * 2
 * Sample Output 0
 * <p>
 * min(int, int)
 * Explanation 0
 * <p>
 * With an input of  we only have two integers to compare. We don't need to nest the  functions for our output because the  function can take two integers as input.
 * <p>
 * Sample Input 1
 * <p>
 * 4
 * Sample Output 1
 * <p>
 * min(int, min(int, min(int, int)))
 * Explanation 1
 * <p>
 * With  as our input we'll need to compare  integers. We'll call these integers , , , and . The  function can only call two integers at a time so we'll need to call it for the last two integers,  and . We'll refer to this first use of the  function as . We'll call the  function again to compare the result of  with the next integer, . This will be called . We'll finally call the min function again to compare the result of the  with the last number, , bringing us to a total of  calls of the  function, which is shown in the output.
 * <p>
 * If you'd like to test out your output string, implement the  function and call it with a for loop such that each previous result is passed into the next call of the  function.
 */

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    // Solution 2 in Java8
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Gets Inputs
        int n = in.nextInt(); // number of integers to be compared
        // Checks constraints
        if (n < 2 || n > 50)
            throw new IllegalArgumentException("The number of integers to be compared should be between 2 and 50.");

        System.out.print(repeat(n - 2, new StringBuilder("min(int, ")).append("min(int, int)").append(repeat(n - 2, new StringBuilder(")"))));
    }

    private static StringBuilder repeat(Integer nbNested, StringBuilder out) {
        StringBuilder outStart = new StringBuilder();
        IntStream.range(0, nbNested).forEach(v -> outStart.append(out));
        return outStart;
    }

    /*
    // Solution 1 in Java8
    static private StringBuilder outStart = new StringBuilder("");

    public StringBuilder getOutStart() {
        return outStart;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution solution = new Solution();

        // Gets Inputs
        int n = in.nextInt(); // number of integers to be compared
        // Checks constraints
        if (n < 2 || n > 50)
            throw new IllegalArgumentException("The number of integers to be compared should be between 2 and 50.");

        System.out.print(solution.repeat(n - 2, new StringBuilder("min(int, ")).repeat(1, new StringBuilder("min(int, int)")).repeat(n - 2, new StringBuilder(")")).getOutStart());
    }

    private Solution repeat(Integer nbNested, StringBuilder out) {
        IntStream.range(0,nbNested).forEach(v -> outStart.append(out));
        return this;
    }
     */

    /*
    // Solution 2 in Java7
    static private StringBuilder outStart = new StringBuilder("");

    public StringBuilder getOutStart() {
        return outStart;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution solution = new Solution();

        // Gets Inputs
        int n = in.nextInt(); // number of integers to be compared
        // Checks constraints
        if (n < 2 || n > 50)
            throw new IllegalArgumentException("The number of integers to be compared should be between 2 and 50.");

        System.out.print(solution.repeat(n - 2, new StringBuilder("min(int, ")).repeat(1, new StringBuilder("min(int, int)")).repeat(n - 2, new StringBuilder(")")).getOutStart());
    }

    private Solution repeat(Integer nbNested, StringBuilder out) {
        for (int i = 0; i < nbNested; i++) {
            outStart.append(out);
        }
        return this;
    }*/

    /*
        // Solution in Java7:
        Scanner in = new Scanner(System.in);

        // Gets Inputs
        int n = in.nextInt(); // number of integers to be compared
        StringBuilder output = new StringBuilder();
        StringBuilder outStart = new StringBuilder("min(int, ");
        StringBuilder outFinalBlock = new StringBuilder("min(int, int)");
        StringBuilder outEnd = new StringBuilder(")");
        // Checks constraints
        if(n<2 || n>50) throw new IllegalArgumentException("The number of integers to be compared should be between 2 and 50.");

        int nbNested = n - 2;
        for (int i = 0; i <nbNested ; i++) {
            output.append(outStart);
        }
        output.append(outFinalBlock);
        for (int i = 0; i <nbNested ; i++) {
            output.append(outEnd);
        }
        // Gets Output
        System.out.print(output);
        */
}
