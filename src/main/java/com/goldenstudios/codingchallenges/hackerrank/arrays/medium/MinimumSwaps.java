package com.goldenstudios.codingchallenges.hackerrank.arrays.medium;

import java.util.Scanner;

public class MinimumSwaps {


    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

        int nextPos = 0;
        int minSwaps = 0;

        while(nextPos<arr.length) {
            if(nextPos+1 == arr[nextPos]) {
                nextPos++;
                continue;
            }
            minSwaps++;
            int temp = arr[nextPos]; // 7
            arr[nextPos] = arr[temp-1]; // arr[0] = arr[6] -> 4
            arr[temp-1] = temp; // arr[6] = 7
        }

        return minSwaps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

    }

}
