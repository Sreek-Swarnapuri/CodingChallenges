package com.goldenstudios.codingchallenges.geeks4geeks.math.easy;

public class TrailingZerosFactorial {

    public static int trailingZeros(int n) {
        int trailingZeroes = 0;

        int rem = n % 5;

        n -= rem;

        while (n > 0) {
            trailingZeroes += (n / 5);
            n /= 5;
        }

        return trailingZeroes;
    }

}
