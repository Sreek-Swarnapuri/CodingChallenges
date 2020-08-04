package com.goldenstudios.codingchallenges.projecteuler_hackerrank;

import java.util.Scanner;

public class Euler_1_MultipleOf3Nd5 {

    //https://www.hackerrank.com/contests/projecteuler/challenges/euler001/problem
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            //Bruteforce solution
//            long n = in.nextInt();
//            long sum = 0L;
//            for(long j=3;j<n;j+=3)
//                sum += j;
//            for(long j=5;j<n;j+=5)
//                if(j%3L != 0)
//                sum += j;
//            System.out.println(sum);

            // Formulated solution
            int n = in.nextInt();
            long sum = 0L;
            long maxMultipleOf3UnderN = (n-1)/3;
            long maxMultipleOf5UnderN = (n-1)/5;
            long maxMultipleOf15UnderN = (n-1)/15;
            long sumOfMultiplesOf3 = 3 * returnSumOfConsecutiveNumbers(maxMultipleOf3UnderN);
            long sumOfMultiplesOf5 = 5 * returnSumOfConsecutiveNumbers(maxMultipleOf5UnderN);
            long sumOfMultiplesOf15 = 15 * returnSumOfConsecutiveNumbers(maxMultipleOf15UnderN);

            sum = sumOfMultiplesOf3 + sumOfMultiplesOf5 - sumOfMultiplesOf15;

            System.out.println(sum);
        }

    }

    public static long returnSumOfConsecutiveNumbers(long n) {
        return (n*(n+1)/2);
    }
}
