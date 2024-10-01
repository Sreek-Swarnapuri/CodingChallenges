package com.goldenstudios.codingchallenges.datastructures;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class ArraysUsage {

    public static void main(String[] args) {
        // one dimentional array
        int[] nums = new int[5];
        nums[3] = 3;
        System.out.println("nums are: ");
        for (int num: nums) {
            System.out.println(num);
        }

        System.out.println("size of the array with only 1 element set at index 3 is: " + nums.length);

        System.out.println("--------------------------------------------");

        System.out.println("Multi dimentional array: ");
        // multi dimensional arrays
        int[][] matrixA = new int[5][5];
        System.out.println(matrixA[0]);
        System.out.println(Arrays.toString(matrixA[0]));

        System.out.println("--------------------------------------------");

        int[] nums2 = new int[20];
        System.out.println(nums2.length);

        System.out.println("--------------------------------------------");

        LinkedList<Integer> integers = new LinkedList<>();

        integers.add(1);
        integers.add(2,2);

        System.out.println(integers);

        Stack<Integer> integerStack = new Stack<>();




    }
}
