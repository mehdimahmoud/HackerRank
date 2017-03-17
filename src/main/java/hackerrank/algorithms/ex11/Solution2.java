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

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution2 {

    static List<String> vowels = new LinkedList<>(Arrays.asList("a", "e", "i", "o", "u"));
    static List<String> consnts = new LinkedList<>(Arrays.asList("b", "c", "d", "f", "g", "h", "j", "k", "l", "m",
            "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"));
    static List<String> hacks = new LinkedList<>();
    static int n = 0;

    // Solution 1 in Java7
    public static void main(String[] args) {
        long startMilli = System.currentTimeMillis();
        long startNano = System.nanoTime();
        Scanner in = new Scanner(System.in);
        // Gets Inputs and Constraints
        n = in.nextInt(); // length of the password
        if (n < 1 || n > 6)
            throw new IllegalArgumentException("The length of the password should be between 1 and 6.");
        // Gets output
        generatePasswords(n);
        System.out.println("hacks size = "+hacks.size());
        long endMilli = System.currentTimeMillis();
        long endNano = System.nanoTime();
        System.out.println("Time execution in milliSec = "+(endMilli-startMilli));
        System.out.println("Time execution in nanoSec = "+(endNano-startNano));
    }

    private static void generatePasswords(int n) {repeat(n, "");}

    private static String repeat(int i, String s) {
        List<String> listLetters = new LinkedList<>();
        // Special Processing for n=1
        if(n==1) {
            listLetters.addAll(0,vowels);
            listLetters.addAll(vowels.size(),consnts);
        }else if (i % 2 == 0) listLetters = vowels;
              else listLetters = consnts;

        for (String c : listLetters) {
            String pwd = "";
            if(i>1) s = s.concat(c);
            else if(i==1) {
                pwd = s.concat(c);
                System.out.println(pwd);  hacks.add(pwd);
                if(pwd.length()>1 && !pwd.equals(reverse(pwd))) {
                    System.out.println(reverse(pwd)); hacks.add(reverse(pwd));
                }
            }
            i--;
            if(i>0) { // i = [1,n]
                s = repeat(i,s);
            }else i=0;
            if(i>=1) s = s.substring(0,(s.length()-1));
            i++;
        }
        return s;
    }

    public static String reverse(String input) {
        char[] in = input.toCharArray();
        int start = 0;
        int end = in.length - 1;
        char temp;
        while (end > start) {
            temp = in[start];
            in[start] = in[end];
            in[end] = temp;
            end--;
            start++;
        }
        return new String(in);
    }
}
