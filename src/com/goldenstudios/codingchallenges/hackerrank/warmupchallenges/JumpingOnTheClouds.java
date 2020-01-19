package com.goldenstudios.codingchallenges.hackerrank.warmupchallenges;

import java.util.Scanner;

public class JumpingOnTheClouds {


    static int jumpingOnClouds(int[] c) {

        if (c.length == 0)
            return 0;

        int jumps = 0;

        int i = 0;

        while (i < c.length - 1) {
            if (
                    (i + 2) < c.length &&
                            c[i + 2] == 0
            ) {
                jumps += 1;
                i += 2;
            } else if (
                    (i + 1) < c.length &&
                            c[i + 1] == 0
            ) {
                jumps += 1;
                i++;
            } else
                i++;

        }


        return jumps;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }


        int result = jumpingOnClouds(c);


        scanner.close();
    }


}
