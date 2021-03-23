package com.goldenstudios.codingchallenges.geeks4geeks.math.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberInArrayTest {

    private int arrElements;
    private int[] arr;

    @Test
    public void mustReturnMissingNumberCase1() {
        // Given
        arrElements = 5;
        arr = new int[]{1, 2, 3, 4};

        // When & Then
        callAssertion(arr, arrElements, 5);

    }

    @Test
    public void mustReturnMissingNumberCase2() {
        // Given
        arrElements = 5;
        arr = new int[]{2, 3, 4, 5};

        // When & Then
        callAssertion(arr, arrElements, 1);

    }

    public void callAssertion(int[] arr, int arrElements, int expected) {
        // When
        int missingNumber = MissingNumberInArray.findMissingNumber(arr, arrElements);

        // Then
        Assertions.assertEquals(expected, missingNumber);
    }

}
