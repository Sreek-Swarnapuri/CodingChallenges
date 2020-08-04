package com.goldenstudios.codingchallenges.hackerrank.arrays.medium;

import java.util.Scanner;

public class MinimumBribes {

    // Problem location: https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
    static void minimumBribes(int[] q){
        int minBribe = 0;
        for(int i=0; i<q.length; i++) {
            if( (q[i]-(i+1)) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            else {
                for(int j = Math.max(0,q[i]-2);j<i;j++)
                    if(q[j]>q[i])
                        minBribe++;
            }
        }

        System.out.println(minBribe);

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for ( int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");

            for(int j=0; j < qItems.length; j++)
                q[j] = Integer.parseInt(qItems[j]);

            minimumBribes(q);

        }

    }



}
