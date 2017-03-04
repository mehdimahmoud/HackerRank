package main.java.hackerrank.challenge.day5;

import java.util.Scanner;

/**
 * Created by mehdi on 20/11/16.
 */
public class Solution {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        try {
            if(n>=2 && n<=20){
                for (int i=1;i<=10;i++){
                    System.out.println(n + " x " + i + " = "+ n*i);
                }
            }else throw new Exception();
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }
}
