package com.goldenstudios.codingchallenges.hackerrank.warmupchallenges;

import java.util.HashSet;
import java.util.Scanner;

public class SockMerchant {


    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] arr) {

        if(n > 0) {


            int pairs = 0;

            HashSet<Integer> ps = new HashSet<Integer>();

            ps.add(arr[0]);

            for(int i=1;i<arr.length;i++) {

                if(ps.contains(arr[i])) {
                    pairs++;
                    ps.remove(arr[i]);
                }
                else
                {
                    ps.add(arr[i]);
                }

            }

            return pairs;


        }

        return 0;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);


        scanner.close();
    }


}
