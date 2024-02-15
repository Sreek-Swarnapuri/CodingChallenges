package com.goldenstudios.codingchallenges.leetcode.easy;

public class IndexOfFirstOccurrenceInAString {


    // This failed for a case where haystack: mississippi and needle: issip -> my algorithm was not able to go back to a starting point in the haystack for the current iteration.
    public static int failedAttempt(String haystack, String needle) {

        // sadbutsad   sad
        // leetcode  leeto
        // leetlode l
        // leet  leeto
        // leep  leet
        // leleet   leet
        // l   leet
        // mississippi issip

        // j pointer indicating postion in needle - 0
        // finalIndex = -1

        // loop through each char of haystack -> i going from 0 to hastack.length
        // h.i == n.j, yes i++ j++, no j=0 finalIndex = -1
        // finalIndex is set

        int finalIndex = -1;
        int j = 0;

        if (needle.length() > haystack.length())
            return -1;

        for (int i = 0; i < haystack.length(); i++) {

            if (haystack.charAt(i) == needle.charAt(j)) {
                if (j == 0)
                    finalIndex = i;
                j++;
            } else {
                j = 0;
                finalIndex = -1;
            }
            if (j >= needle.length())
                return finalIndex;

        }
        return -1;
    }
}
