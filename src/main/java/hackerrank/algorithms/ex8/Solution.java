package hackerrank.algorithms.ex8;
/**
 * Created by mmik on 04/03/2017.
 * source: https://www.hackerrank.com/contests/hourrank-18/challenges/wheres-the-marble
 * Jill and Bob are playing the following game:
 * <p>
 * There are  cups on saucers arranged in a straight line. Each saucer is numbered sequentially from  to .
 * The game starts when Jill watches Bob place a marble inside the cup on saucer number .
 * Bob then takes  turns. In each turn, he swaps the cups on a pair of saucers numbered  and , where . The diagram below shows an example:
 * image
 * <p>
 * After Bob completes all his turns, Jill chooses an integer from  to  denoting the saucer where she think the cup with the marble is located.
 * Given  and Bob's sequence of moves, print the saucer number denoting the marble's location at the end of the game.
 * <p>
 * Input Format
 * <p>
 * The first line contains two space-separated integers describing the respective values of  (the marble's initial location) and  (Bob's number of turns).
 * Each line  of the  subsequent lines contains two space-separated integers,  and , describing the saucer numbers for the cups Bob swaps in his  move.
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * Print an integer denoting the saucer number of the cup containing the marble at the end of the game.
 * <p>
 * Sample Input 0
 * <p>
 * 5 3
 * 2 5
 * 7 10
 * 2 9
 * Sample Output 0
 * <p>
 * 9
 * Explanation 0
 * <p>
 * Bob places the marble in the cup on saucer  and performs the following sequence of  moves:
 * <p>
 * image
 * <p>
 * Swap the cups in positions  and , so the marble is now in the cup on saucer .
 * <p>
 * image
 * <p>
 * Swap the cups in positions  and ; neither of these cups currently contains the marble, so the marble is still in the cup on saucer .
 * <p>
 * image
 * <p>
 * Swap the cups in positions  and , so the marble is now in the cup on saucer .
 * <p>
 * image
 * Because the marble is in the cup on saucer  at the end of the game, we print  as our answer.
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

        // Checks constraints

        // Gets input


        // Lets sort the list

    }
}
