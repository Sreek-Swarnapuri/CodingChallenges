package com.goldenstudios.codingchallenges.leetcode.medium;

import java.util.*;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("bbbbbb"));
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("pwwkew"));
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("aab"));

        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstringMap("tmmzuxt"));

        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        System.out.println(charIndex['a']);
        System.out.println((int) 'a');
        System.out.println((char) 97);
        //System.out.println(Integer.valueOf("b"));

        for (int i = 0; i < 128; i++) {
            System.out.print((char) i);
            System.out.print("  ");
        }
    }


    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;

        int currMax = 0;

        HashSet<Character> characters = new HashSet<>();

        // abcabcbb
        for (int i = 0; i< s.length(); i++ ) {
            char currChar = s.charAt(i);

            if(!characters.contains(currChar)) {
                characters.add(currChar);
                currMax++;
            } else {
                characters.clear();
                currMax = 1;
                characters.add(currChar);
            }
            if(maxLength<currMax)
                maxLength = currMax;
        }

        return maxLength;
    }

    public int lengthOfLongestSubstringUsingSet(String s) {

        int maxLength = 0;
        int left = 0;

        Set<Character> characters = new HashSet<>();

        for (int right = 0; right < s.length(); right++ ) {
            char currChar = s.charAt(right);

            if(!characters.contains(currChar)) {
                characters.add(currChar);
                maxLength = Math.max(maxLength, (right-left) + 1);
            } else {
                while(characters.contains(s.charAt(right))) {
                    characters.remove(s.charAt(left));
                    left++;
                }
                characters.add(s.charAt(right));
            }

        }

        return maxLength;
    }

    public int lengthOfLongestSubstringMap(String s) {

        int maxLength = 0;
        int left = 0;

        Map<Character, Integer> characters = new HashMap<>();

        for (int right = 0; right < s.length(); right++ ) {
            char currChar = s.charAt(right);

            if(!characters.containsKey(currChar) || characters.get(currChar) < left) {
                characters.put(currChar, right);
                maxLength = Math.max(maxLength, (right-left) + 1);
            } else {
                left = characters.get(currChar) + 1;
                characters.put(s.charAt(right), right);
            }

        }

        return maxLength;
    }

    public int lengthOfLongestSubStringCharArray(String s) {

        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);



        return 0;
    }
}
