package com.goldenstudios.codingchallenges.educative.java_coding_interviews;

public class RemoveEvenIntegersFromArray {

    public static void main(String[] args) {
        int[] res = removeEven(new int[]{1,2,3});
        for (int r: res) {
            System.out.println(r);
        }
    }

    public static int[] removeEven(int[] arr) {

        int[] result;
        int resultSize = 0;

        for (int r: arr) {
            if(r % 2 != 0)
                resultSize++;
        }

        result = new int[resultSize];

        int r_i = 0;

        for (int j : arr) {
            if ((j % 2) != 0)
                result[r_i++] = j;
        }
        return result;

    }

}
