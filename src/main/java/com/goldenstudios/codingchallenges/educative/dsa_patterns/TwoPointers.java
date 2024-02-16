package com.goldenstudios.codingchallenges.educative.dsa_patterns;

import java.util.Arrays;

public class TwoPointers {

    public static void main(String[] args) {
        int[] arr = new int[] {2, 3, 1};

        System.out.println("is there a sum of 6 in 2,3,1? " + findSumOfThree(arr, 6));
        arr = new int[] {1, 3, 4, 5, 6, 63, 35};
        System.out.println("is there a sum of 2 in 1, 3, 4, 5, 6, 63, 35? " + findSumOfThree(arr, 2));
    }


    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }

        return true;
    }


    public static boolean findSumOfThree(int[] nums, int target) {

        Arrays.sort(nums);

        for(int left = 0; left < nums.length - 2; left++) {
            int low = left + 1;
            int high = nums.length - 1;
            while(low != high) {
                int lowHighSum = nums[low] + nums[high];
                if(target - nums[left] == lowHighSum )
                    return true;
                else if(lowHighSum > target-nums[left])
                    high--;
                else
                    low++;
            }
        }

        // Replace this placeholder return statement with your code
        return false;
    }

}
