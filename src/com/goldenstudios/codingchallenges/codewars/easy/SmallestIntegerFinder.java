package com.goldenstudios.codingchallenges.codewars.easy;

public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {

        int small = args[0];

        //loop through each element of the array starting from the second element
        for(int i = 1 ; i <args.length;i++)
        {
            //if the current element of the array is less than small, assign current element to small
            if(args[i]<small) small = args[i];
        }

        return small;

    }

    public static void main(String[] args)
    {
        System.out.println(findSmallestInt(new int[]{1,2,3,4,-1}));
    }
}
