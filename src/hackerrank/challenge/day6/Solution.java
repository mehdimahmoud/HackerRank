package hackerrank.challenge.day6;

import java.util.Scanner;

/**
 * Created by mehdi on 21/11/16.
 */
public class Solution {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        try {
            int T = scan.nextInt(); // number of TestCases
            String[] S = new String[T];
            String S_even="", S_odd="";
            if (T<1 || T>10) throw new Exception();
            for (int j =0;j<=T-1;j++){
                S[j] = scan.next();
            }
            for (String Sj:S) {
                for (int i=0;i<Sj.length();i++){
                    if(i%2==0) S_even = S_even.concat(String.valueOf(Sj.charAt(i)));
                    if(i%2!=0) S_odd = S_odd.concat(String.valueOf(Sj.charAt(i)));
                }
                System.out.println(S_even+" "+S_odd);
                S_even = "";
                S_odd = "";
            }
        }catch (Exception e){
            System.out.println("Invalid input");
        }

    }
}
