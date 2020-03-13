package com.goldenstudios.codingchallenges.hackerrank.problemsolving.Algorithms;

import java.util.Scanner;

public class SaveThePrisoner {

    /*
        This is a hacker rank problem at -
            https://www.hackerrank.com/challenges/save-the-prisoner/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
     */

    // Not a total solution - Still needs to fill up
    static int saveThePrisoner(int noP, int noS, int startPos) {
        int addToStart;
        int modToTot;
        if(noP == noS) {
            addToStart = noP;
            modToTot = noS;
        }
        else {
            addToStart = noS;
            modToTot = noP;
        }

        return (addToStart+startPos-1) % modToTot;
    }


    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nms = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nms[0]);

            int m = Integer.parseInt(nms[1]);

            int s = Integer.parseInt(nms[2]);

            int result = saveThePrisoner(n, m, s);

            System.out.println(result);
        }

        scanner.close();

    }


}
