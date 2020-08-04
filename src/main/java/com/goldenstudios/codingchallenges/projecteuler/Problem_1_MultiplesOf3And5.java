package com.goldenstudios.codingchallenges.projecteuler;

public class Problem_1_MultiplesOf3And5 {

    public static void main (String[] args) {
        int sum = 0;
        for(int i=0;i<1000; i++) {
            if( i%3 == 0 || i%5 == 0 )
                sum += i;
        }
        System.out.println("Sum of numbers below 1000 which are multiples of 3 or 5 is: " + sum);
    }

}
