package com.goldenstudios.codingchallenges.hackerrank.arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

public class PrintReverseArray {

    //Coding challenge at https://www.hackerrank.com/challenges/arrays-ds/problem
    static int[] reverseArray(int[] arr){

        int[] revArr = new int[arr.length];

        for(int i=arr.length -1, j =0 ; i>=0 && j<arr.length; i--,j++ ){
            revArr[j] = arr[i];
        }

        return revArr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] res = reverseArray(arr);


        System.out.println(Arrays.toString(res));

    }

}
