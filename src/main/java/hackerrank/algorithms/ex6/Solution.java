package hackerrank.algorithms.ex6;
/**
 * Created by mmik on 04/03/2017.
 * source: https://www.hackerrank.com/contests/w29/challenges/day-of-the-programmer?utm_source=w30-reminder-3-day&utm_medium=email&utm_campaign=w30
 * Marie invented a Time Machine and wants to test it by time-traveling to visit Russia on the Day of the Programmer (the  day of the year) during a year in the inclusive range from  to .
 * <p>
 * From  to , Russia's official calendar was the Julian calendar; since  they used the Gregorian calendar system. The transition from the Julian to Gregorian calendar system occurred in , when the next day after January  was February . This means that in , February  was the  day of the year in Russia.
 * <p>
 * In both calendar systems, February is the only month with a variable amount of days; it has  days during a leap year, and  days during all other years. In the Julian calendar, leap years are divisible by ; in the Gregorian calendar, leap years are either of the following:
 * <p>
 * Divisible by .
 * Divisible by  and not divisible by .
 * Given a year, , find the date of the  day of that year according to the official Russian calendar during that year. Then print it in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit month, and yyyy is .
 * <p>
 * Input Format
 * <p>
 * A single integer denoting year .
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * Print the full date of Day of the Programmer during year  in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit month, and yyyy is .
 * <p>
 * Sample Input 0
 * <p>
 * 2017
 * Sample Output 0
 * <p>
 * 13.09.2017
 * Explanation 0
 * <p>
 * In the year , January has  days, February has  days, March has  days, April has  days, May has days, June has  days, July has  days, and August has  days. When we sum the total number of days in the first eight months, we get . Day of the Programmer is the day, so then calculate  to determine that it falls on day  of the  month (September). We then print the full date in the specified format, which is 13.09.2017.
 * <p>
 * Sample Input 1
 * <p>
 * 2016
 * Sample Output 1
 * <p>
 * 12.09.2016
 * Explanation 1
 * <p>
 * Year  is a leap year, so February has  days but all the other months have the same number of days as in . When we sum the total number of days in the first eight months, we get . Day of the Programmer is the  day, so then calculate  to determine that it falls on day  of the  month (September). We then print the full date in the specified format, which is 12.09.2016.
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Solution in Java 8
        int y = in.nextInt(); // year
        String date = "13.09.";

        if(y<1700 || y>2700)
            throw new IllegalArgumentException("The year should be between 1700 and 2700.");

        // Gets output
        if(y==1918) System.out.println("26.09.1918"); // 5x31 + 2x30 + 15 = 230 => 256-230 = 26
        if( (y < 1918 && (y%4==0)) // on Julian Calendar: Leap year is just multiple of 4
            || (y>=1919 && ((y%4==0 && y%100!=0) || y%400==0)) // on Gregorian Calendar, condition different
                ) System.out.println("12.09."+y);
        else if(y!=1918) System.out.println(date+y);
    }
}
