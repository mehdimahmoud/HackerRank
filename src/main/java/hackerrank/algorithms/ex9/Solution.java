package hackerrank.algorithms.ex9;
/**
 * Created by mmik on 04/03/2017.
 * source: https://www.hackerrank.com/contests/w30/challenges/candy-replenishing-robot/submissions/code/1300894310
 * Alice is hosting a party! The party lasts for  minutes, and she puts out a bowl of  candies at the beginning of the party. During each minute , a person comes to the bowl and removes  candies.
 * <p>
 * Alice programs the following algorithm into her robot, Bob, to replenish the candy throughout the party:
 * <p>
 * If the party is ending (i.e., it's time ), do not refill the bowl.
 * If the bowl contains  candies at the end of minute  and , add  candies to the bowl.
 * For example, if , , and , then the candy bowl looks like this throughout the party:
 * <p>
 * image
 * <p>
 * Note that Bob doesn't replenish the bowl at the party's end, so a total of  candies were added during the party.
 * <p>
 * Given , , and the number of candies removed from the bowl during each minute, print the total number of new candies Bob adds to the bowl during the party.
 * <p>
 * Input Format
 * <p>
 * The first line contains two space-separated integers describing the respective values of  and .
 * The second line contains  space-separated integers describing the respective values of .
 * <p>
 * Constraints
 * <p>
 * , where  is the number of candies in the bowl at the start of minute .
 * Output Format
 * <p>
 * Print the total number of new candies Bob adds to the bowl during the party.
 * <p>
 * Sample Input 0
 * <p>
 * 8 4
 * 3 1 7 5
 * Sample Output 0
 * <p>
 * 11
 * Explanation 0
 * <p>
 * image
 * <p>
 * The party starts out with  candies in the bowl and the candies removed during each second are denoted by .
 * We break down each minute of the party like so:
 * <p>
 * <ol>
 * <li>Remove c0=3 candies, so 8-3=5 candies remain.</li>
 * <li>Remove c1=1 candies, so 5-1=4 candies remain. Because the party is still going on, Bob refills the bowl by adding 4
 * new candies so it again contains 4+4=8 candies.</li>
 * <li>Remove c2=7 candies, so 8-7=1 candy remains. Because the party is still going on, Bob refills the bowl by adding 7
 * new candies so it again contains 1+7=8 candies.</li>
 * <li>Remove c3=5 candies, so 8-5=3 candies remain. Because the party is ending during this minute, Bob does not refill
 * the bowl.</li>
 * </ol>
 * <p>
 * We then print the total number of candies added during the party, which is 4+7=11.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Solution in Java 8
        int n = in.nextInt(); // number of candies in the bowl at the starting of party
        int t = in.nextInt(); // last of party in minutes
        List<Integer> c = new ArrayList<>(); // number of candies removed

        // Checks constraints
        if(n<5 || n>100)
            throw new IllegalArgumentException("The number of candies should be between 5 and 100 candies.");
        if(t<1 || t>100)
            throw new IllegalArgumentException("The last of the party should be between 1 and 100 mn.");


        // Gets input
        IntStream.range(0,t)
                .forEach(i->
                {
                    int ci = in.nextInt();
                    if(ci<1 || ci>n)
                        throw new IllegalArgumentException("The number of candies to remove should be between 1 and "+ n +" candies.");

                    c.add(ci);
                });



        // Gets output
        int ti=1;
        int bi=n; // number of candies remains
        int cAdded=0; // number of candies added by Rob;
        List<Integer> listAdded = new ArrayList<>();

        for(int ci : c){
//            System.out.println("ti="+ti);
            if(ci>bi)
               throw new IllegalArgumentException("The candies to remove should not be greater than what it remains in the bowl.");

            bi = bi-ci; // nb remaining candies

            if(ti<t && bi<5){
                cAdded = n-bi;
                listAdded.add(cAdded);
                bi=n; // or bi=bi+cAdded;
//                System.out.println(listAdded);
            }
            ti++;
        }
        System.out.println(listAdded.stream().mapToInt(cAdd->cAdd).sum());

    }
}
