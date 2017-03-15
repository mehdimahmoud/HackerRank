package hackerrank.algorithms.ex11;
/**
 * Created by mmik on 14/03/2017.
 * source: https://www.hackerrank.com/contests/w30/challenges/find-the-minimum-number
 * <p>
 * Jeremy and Clara are learning about passwords and created a game to test their "hacking" skills. Jeremy made rules for valid passwords and Clara needs to write a program to generate all possible passwords that meet those rules. Jeremy's rules are these:
 * <p>
 * <ul>
 * <li></li>
 * a password consists of exactly  lowercase English letters.
 * the password is melodious, meaning that consonants can only be next to vowels and vowels can only be next to consonants. Example: bawahaha
 * the password cannot contain the letter  (because it's both a consonant and vowel).
 * the first letter of the password can be either a vowel or consonant.
 * </ul>
 * a. melodious password : bawahaha
 * b. Non-melodious password: <span style="color:red solid 1px;">bw</span>ah<span style="color:red solid 1px;">ao</span>ha
 * <p>
 * Given the length, , of the password, print all of the possible passwords that meet the conditions above.
 * <p>
 * Input Format
 * <p>
 * The line of input contains the integer  (the length of the password).
 * <p>
 * Constraints
 * 1<= n <= 6
 * <p>
 * Output Format
 * <p>
 * Print each of the possible passwords, one per line. The order of the passwords does not matter.
 * <p>
 * Sample Input 0
 * <p>
 * 1
 * Sample Output 0
 * <p>
 * w
 * t
 * v
 * g
 * l
 * o
 * h
 * i
 * x
 * q
 * j
 * r
 * k
 * p
 * a
 * m
 * d
 * e
 * z
 * c
 * n
 * u
 * b
 * f
 * s
 * Explanation 0
 * <p>
 * The length of the password is . We can list all letters  except  for our list of possible passwords.
 */

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Solution {

    // Solution 2 in Java8
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Gets Inputs
        int n = in.nextInt(); // length of the password
        // Constraints
        if (n < 0 || n > 6)
            throw new IllegalArgumentException("The length of the password should be between 1 and 6.");
        // Gets output
        List<String> vowels = new LinkedList<>(Arrays.asList("a", "e", "i", "o", "u"));
        List<String> consnts = new LinkedList<>(Arrays.asList("b", "c", "d", "f", "g", "h", "j", "k", "l", "m",
                "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"));
        List<String> hacks = new LinkedList<>();

        System.out.println(vowels.size());
        System.out.println(consnts.size());

        repeat(vowels);
        repeat(consnts);

    }

    private static void repeat(List<String> list) {
        for (String c : list) {
            System.out.println(c);
        }
    }

    private static void hackPassword() {

    }
}
