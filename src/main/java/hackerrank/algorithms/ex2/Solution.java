package hackerrank.algorithms.ex2;
/**
 * Created by mmik on 04/03/2017.
 * <p>
 * source : https://www.hackerrank.com/challenges/compare-the-triplets
 * <p>
 * Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from  to  for three categories: problem clarity, originality, and difficulty.
 * <p>
 * We define the rating for Alice's challenge to be the triplet , and the rating for Bob's challenge to be the triplet .
 * <p>
 * Your task is to find their comparison scores by comparing  with ,  with , and  with .
 * <p>
 * If , then Alice is awarded  point.
 * If , then Bob is awarded  point.
 * If , then neither person receives a point.
 * Comparison score is the total score a person earned.
 * <p>
 * Given  and , can you compare the two challenges and print their respective comparison points?
 * <p>
 * Input Format
 * <p>
 * The first line contains  space-separated integers, , , and , describing the respective values in triplet .
 * The second line contains  space-separated integers, , , and , describing the respective values in triplet .
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * Print two space-separated integers denoting the respective comparison scores earned by Alice and Bob.
 * <p>
 * Sample Input
 * 5 6 7
 * 3 6 10
 * <p>
 * Sample Output
 * 1 1
 * Explanation
 * <p>
 * In this example:
 * <p>
 * Now, let's compare each individual score:
 * <p>
 * , so Alice receives  point.
 * , so nobody receives a point.
 * , so Bob receives  point.
 * Alice's comparison score is , and Bob's comparison score is . Thus, we print 1 1 (Alice's comparison score followed by Bob's comparison score) on a single line.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        // Solution in Java 7
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        // get Inputs
        List<Integer> A = Arrays.asList(a0, a1, a2);
        List<Integer> B = Arrays.asList(b0, b1, b2);

        // Compare ratings:
        int i = 0, j = 0;
        for (int c = 0; c < A.size(); c++) {
            if (A.get(c) > B.get(c)) i++;
            else if (A.get(c) < B.get(c)) j++;
        }
        System.out.println(i + " " + j);

    }
}
