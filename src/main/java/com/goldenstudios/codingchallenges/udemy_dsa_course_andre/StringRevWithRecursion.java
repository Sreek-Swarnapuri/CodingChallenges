package com.goldenstudios.codingchallenges.udemy_dsa_course_andre;

public class StringRevWithRecursion {

    public static void main(String[] args) {
        String abc = "abcd";
        System.out.println(abc.charAt(abc.length()-1));
        System.out.println(rev(abc));
    }

    public static String rev(String str) {

        if(str.length() == 1)
            return str;

        return str.charAt(str.length()-1) + rev(str.substring(0, str.length()-1));
    }

}
