package hackerrank.algorithms.ex4;
/**
 * Created by mmik on 04/03/2017.
 * <p>
 * source : https://www.hackerrank.com/challenges/camelcase
 * <p>
 * Alice wrote a sequence of words in CamelCase as a string of letters, , having the following properties:
 * <p>
 * It is a concatenation of one or more words consisting of English letters.
 * All letters in the first word are lowercase.
 * For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
 * Given , print the number of words in  on a new line.
 * <p>
 * Input Format
 * <p>
 * A single line containing string .
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * Print the number of words in string .
 * <p>
 * Sample Input
 * <p>
 * saveChangesInTheEditor
 * Sample Output
 * <p>
 * 5
 * Explanation
 * <p>
 * String saveChangesInTheEditor contains five words:
 * <p>
 * save
 * Changes
 * In
 * The
 * Editor
 *
 * Thus, we print  on a new line.
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Solution in Java 8
        String stCC = in.nextLine(); // string in camelCase
        String regex = "(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])";

        // Gets inputs and checks :
        if (stCC == null || stCC.isEmpty())
            throw new IllegalArgumentException("Your sequence of words should not be empty or null !");
        if (stCC.length() > Math.pow(10, 5))
            throw new IllegalArgumentException("The string size should not be greater than 10^5 characters.");
        if (stCC.matches("^[A-Z].*"))
            throw new IllegalArgumentException("The string should not begin in uppercase.");
        if (stCC.matches(".*[^a-zA-Z].*"))
            throw new IllegalArgumentException("The string should contain only letter.");

        System.out.println( Pattern.compile(regex).splitAsStream(stCC).count());
        /*long count = Pattern.compile(regex).splitAsStream(stCC).count();
        System.out.println(count);
        System.out.println(String.format("String %s contains %d words: \n", stCC, count));
        Pattern.compile(regex).splitAsStream(stCC).forEach((st) -> System.out.println(String.format("%s \n", st)));
        */
    }
}
