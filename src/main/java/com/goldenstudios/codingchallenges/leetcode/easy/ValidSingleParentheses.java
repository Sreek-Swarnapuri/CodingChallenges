package com.goldenstudios.codingchallenges.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSingleParentheses {

    public static void main(String[] args) {
        ValidSingleParentheses v1 = new ValidSingleParentheses();

        System.out.println(v1.isValid("")); // true
        System.out.println(v1.isValid("(((")); // false
        System.out.println(v1.isValid("()")); // true
        System.out.println(v1.isValid(")))")); // false
        System.out.println(v1.isValid("()()(())")); //true
        System.out.println(v1.isValid("()()()()()()")); // true
        System.out.println(v1.isValid("(((()))))")); // false
        char a = 'a';
        System.out.println(a != 'a');
        char one = '1';
        char seven = '7';
        int pos = (int) seven - one;
        System.out.println(pos);

        Set<Character>[] rows = new HashSet[9];
        for(int i= 0; i< 9; i++) {
            rows[i] = new HashSet<Character>();
        }

        rows[0].add('e');

        System.out.println(rows[0].contains('e'));

        HashMap<Integer, Integer> maps = new HashMap<>();



    }

    public boolean isValid(String word) {
        int left = 0;

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == '(')
                left++;
            else {
                left--;
            }
        }

        return left == 0;

    }
}
