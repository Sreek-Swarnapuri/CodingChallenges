package com.goldenstudios.codingchallenges.leetcode.medium;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses vl = new ValidParentheses();
        System.out.println(vl.isValid("{}{"));
        System.out.println(vl.isValid("()"));
    }

    public boolean isValid(String s) {
        Stack<Character> characters = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(isLeftParentheses(s.charAt(i)))
                characters.push(s.charAt(i));
            else {
                // peek the stack and see if the top of the stack is the left of the right paran (curr character)
                if(characters.peek().equals(getLeftParentheses(s.charAt(i))))
                    characters.pop();
            }

        }

        return characters.isEmpty();
    }

    public boolean isLeftParentheses(Character ch) {
        return ch.equals('(') || ch.equals('{') || ch.equals('[');
    }

    public Character getLeftParentheses(Character ch) {
        if( ch.equals(')') ) return '(';
        if( ch.equals('}') ) return '{';
        if( ch.equals(']') ) return '[';
        return null;
    }

}
