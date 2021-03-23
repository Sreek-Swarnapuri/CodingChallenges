package com.goldenstudios.codingchallenges.geeks4geeks.math.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MissingNumberInArray {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(findMissingNumber(arr, n));
        }

    }

    public static int findMissingNumber(int[] arr, int n) {
        int actualSum = n * (n + 1) / 2;
        return actualSum - Arrays.stream(arr).sum();
    }

}
