package com.goldenstudios.codingchallenges.leetcode.easy;


/**
 * 14. Longest Common Prefix
 * Solved
 * Easy
 * Topics
 * Companies
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 *
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        // My Solution
        System.out.println("lcp for set 1 {\"flower\",\"flow\",\"flight\"} - " + longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println("lcp for set 2 {\"dog\",\"racecar\",\"car\"} - " + longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println("lcp for set 3 {\"cir\",\"car\"} - " + longestCommonPrefix(new String[]{"cir","car"}));

        // Leetcode editorial solution uses the indexOf method to find the substring and then determine the prefix for each string in the array
        System.out.println("Index of : " + "Java is awesome".indexOf("Java"));
        System.out.println("Index of : " + "Java is awesome".indexOf(" "));
        System.out.println("Index of : " + "Java is awesome".indexOf("is"));
        System.out.println("Index of : " + "Java is awesome".indexOf("Awe"));
        System.out.println("Index of : " + "Java is awesome".indexOf("awesome"));

        System.out.println("lcp for set 1 {\"flower\",\"flow\",\"flight\"} of leetcode solution - " + longestCommonPrefixLeetCodeEditorial(new String[]{"flower","flow","flight"}));

    }

    public static String longestCommonPrefix(String[] strs) {

        String lcp = strs[0];

        for (int i = 1; i < strs.length; i++) {

            int innerLoopMax = (Math.min(lcp.length(), strs[i].length()));

            StringBuilder updatedStr = new StringBuilder();
            for (int j = 0; j < innerLoopMax; j++) {
                if(lcp.charAt(j) == strs[i].charAt(j))
                    updatedStr.append(lcp.charAt(j));
                else
                    break;
            }

            lcp = updatedStr.toString();

        }

        return lcp;
    }

    /***
     * Complexity Analysis
     *
     * Time complexity : O(S) , where S is the sum of all characters in all strings.
     *
     * In the worst case all n strings are the same. The algorithm compares the string S1S1S1 with the other strings [S2…Sn][S_2 \ldots S_n][S2
     * ​
     *  …S
     * n
     * ​
     *  ] There are S character comparisons, where S is the sum of all characters in the input array.
     *
     * Space complexity : O(1). We only used constant extra space.
     * @param strs
     * @return
     */
    public static String longestCommonPrefixLeetCodeEditorial(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

}
