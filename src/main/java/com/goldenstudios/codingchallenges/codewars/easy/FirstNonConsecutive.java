package com.goldenstudios.codingchallenges.codewars.easy;

public class FirstNonConsecutive {

    //Coding challenge at https://www.codewars.com/kata/58f8a3a27a5c28d92e000144/solutions/java
    static Integer find(final int[] array) {

        for(int i = 1; i < array.length ; i++) {
            if(array[i-1]+1 != array[i])
                return array[i];
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{1,2,3,4,5,6,7,8,10}));
        System.out.println(find(new int[]{1,2,3,5,6,7,8,10}));
        System.out.println(find(new int[]{1,2,3,4,5,6,7,8,9,10}));
        System.out.println(find(new int[]{1,2,3,4,5,6,8,10}));
        System.out.println(find(new int[]{1,3,4,5,6,7,8,10}));

    }

}
