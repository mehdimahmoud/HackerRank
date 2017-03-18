package hackerrank.algorithms.ex12;
/**
 * Created by mmik on 17/03/2017.
 * source: https://www.hackerrank.com/contests/w30/challenges/poles
 * Kevin was thinking about telephone poles and came up with an idea for a fun programming challenge.
 * There are n telephone poles ascending a mountain and each pole has a weight and a unique altitude.
 * Our program must move the poles into k number of stacks, but we can only rearrange the poles
 * according to certain criteria:
 * <p>
 * <ul>
 * <li>Poles can only be moved from higher altitudes to lower altitudes.</li>
 * <li>Stacks can only be formed at the initial pole altitudes.</li>
 * <li>A stack must consist of at least one pole.</li>
 * <li>The image below shows how poles can be moved into 2 stacks at altitudes 35 and 5.</li>
 * </ul>
 * <p>
 * image
 * Moving the poles down the mountain also costs money. Moving a pole with weight wi and altitude xi to an altitude of
 * where (xi>xj) costs wi x (xi-xj).
 * <p>
 * Write a program to determine the least amount of money needed to rearrange the poles into k stacks.
 * <p>
 * Input Format
 * <p>
 * The first line of input contains two integers  (the number of poles) and  (the number of stacks needed).
 * <p>
 * Each of the next n lines include two integers xi indicating the ith pole's altitude and wi indicating the ith pole's weight. The poles will always be listed from lowest to highest altitude.
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * Print the minimum cost of rearranging the poles into k stacks.
 * <p>
 * Sample Input 0
 * <p>
 * 3 1
 * 20 1
 * 30 1
 * 40 1
 * Sample Output 0
 * <p>
 * 30
 * Explanation 0
 * <p>
 * This test case has 3 poles and needs 1 stack. We cannot move the bottom pole to the altitudes above it so
 * we'll need to move the other poles to the bottom. The cost to move the highest pole to the bottom is 1x[40-20]=20
 * and the cost to move the middle pole to the bottom is [1x(30-20)]=10. This makes our total cost 30.
 * <p>
 * Sample Input 1
 * <p>
 * 6 2
 * 10 15
 * 12 17
 * 16 18
 * 18 13
 * 30 10
 * 32 1
 * Sample Output 1
 * <p>
 * 216
 * Explanation 1
 * <p>
 * The optimal rearrangement for this test case is to create a stack at altitude 16 and another at altitude 10.
 * Our final cost will therefore be:
 * <p>
 * [1x(32-16)]+[10x(30-16)]+[13x(18-16)]+[17x(12-10)]
 * 16+140+26+34
 * 216
 */

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class Solution {

    // Solution 2 in Java8
    public static void main(String[] args) {
        long startMilli = System.currentTimeMillis();
        long startNano = System.nanoTime();

        Scanner in = new Scanner(System.in);

        // Gets Inputs
        int n = in.nextInt(); // number of poles
        int k = in.nextInt(); // number of stacks needed
        // Checks constraints
        if (k < 0 || n > 5000 || n < k)
            throw new IllegalArgumentException("The number of telephone poles and needed stacks should be between " +
                    "1 and 5000. \n The number of poles should of course greater than the number of stacks needed.");

        List<Integer> x_w = new ArrayList<>();
        IntStream.range(0, n)
                .forEach(i -> {
                    int x_i = in.nextInt(); int w_i = in.nextInt();
                    if (x_i < 0 || x_i > Math.pow(10,6) || w_i < 0 || w_i > Math.pow(10,6))
                        throw new IllegalArgumentException("The altitude and the weight of pole should be between 1 and 10^6.");
                    x_w.add(x_i);
                });

        long endMilli = System.currentTimeMillis();
        long endNano = System.nanoTime();
        System.out.println("Time execution in milliSec = " + (endMilli - startMilli));
        System.out.println("Time execution in nanoSec = " + (endNano - startNano));
        /*
        6 2
10 15
12 17
16 18
18 13
30 10
32 1
         */
    }

    private int delta(int x_i, int x_j){
        return x_i - x_j;
    }

    private long cost(int w_i, int delta){
        return w_i*delta;
    }
}
