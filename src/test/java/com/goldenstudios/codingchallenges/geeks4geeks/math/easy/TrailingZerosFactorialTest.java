package com.goldenstudios.codingchallenges.geeks4geeks.math.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrailingZerosFactorialTest {

    @Test
    public void testCase1() {
        // Given
        int n = 5;

        // When & Then
        callAssertion(n, 1);

    }


    @Test
    public void testCase2() {
        // Given
        int n = 4;

        // When & Then
        callAssertion(n, 0);

    }

    @Test
    public void testCase3() {
        // Given
        int n = 10;

        // When & Then
        callAssertion(n, 2);

    }

    @Test
    public void testCase5() {
        // Given
        int n = 384;

        // When & Then
        callAssertion(n, 94);

    }

    public void callAssertion(int input, int expected) {
        Assertions.assertEquals(expected,TrailingZerosFactorial.trailingZeros(input));
    }

}
