package com.goldenstudios.codingchallenges.codewars.easy;

public class Positive {

    public static int sum(int[] arr)
    {

        int sum = 0;

        for(int i =0; i < arr.length; i++)
            if (arr[i] > 0) sum+=arr[i];

        return sum;
    }

    public static void main(String[] arg)
    {
        System.out.println(sum(new int[]{1,-7,3,7,-3}));
    }
}
