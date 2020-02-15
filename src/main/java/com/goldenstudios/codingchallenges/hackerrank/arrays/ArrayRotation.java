package com.goldenstudios.codingchallenges.hackerrank.arrays;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class ArrayRotation {

    /*
    Brute Force method to iterate over each element and pull the next element into the current
    Time complexity - O(m * n)
    Space complexity - O(1)
     */
    static int[] rotLeft(int[] a, int d){

        for(int i=0; i<d; i++){

            int temp = a[0];

            for(int j = 0 ; j < a.length-1; j++)
            {
                a[j] = a[j+1];
            }

            a[a.length - 1] = temp;

        }

        return a;

    }

    /*
    Uses the equation to find the new position of each element and place it into the new array
    Time complexity - O(n)
    Space complexity - O(n)
     */
    static int[] rotLeftImproved1(int[] a, int d){
        int[] b = new int[a.length];

        for(int i =0; i < b.length; i++){
            int newPos = (i + (b.length - d)) % b.length;
            b[newPos] = a[i];
        }

        return b;
    }


    static int[] rotLeftImproved2(int[] a, int d){
        int[] b = new int[a.length];

        for(int i =0; i < b.length; i++){
            int newPos = (i + d) % b.length;
            b[newPos] = a[i];
        }

        return b;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++){
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] originalArray = a.clone();

        System.out.println("Brute Force: ");
        Instant start = Instant.now();
        int[] result = rotLeft(a, d);
        Instant finish = Instant.now();

        System.out.println("Elapsed time: " + Duration.between(start,finish).toNanos());
        printOutput(result);

        System.out.println();
        System.out.println("------------------------");
        System.out.println();
        System.out.println("Improved Solution 1: ");

        start = Instant.now();
        result = rotLeftImproved1(originalArray, d);
        finish = Instant.now();

        System.out.println("Elapsed time: " + Duration.between(start,finish).toNanos());

        printOutput(result);

        System.out.println();
        System.out.println("------------------------");
        System.out.println();
        System.out.println("Improved Solution 2: ");

        start = Instant.now();
        result = rotLeftImproved2(originalArray, d);
        finish = Instant.now();

        System.out.println("Elapsed time: " + Duration.between(start,finish).toNanos());

        printOutput(result);

        System.out.println();
        System.out.println("------------------------");
        System.out.println();

        scanner.close();

    }

    static void printOutput(int[] a){
        System.out.println("Array output:");
        for (int b:
                a) {
            System.out.print(b + " ");
        }
    }

}
