package com.goldenstudios.codingchallenges.codewars.easy;

public class Bumps {

    //https://www.codewars.com/kata/57ed30dde7728215300005fa/train/java
    public static String bumps(final String road) {

        int count = 0;

        for(char c: road.toCharArray()) {
            if(c=='n')
                count++;
        }

        if(count>15)
            return "Car Dead";

        return "Woohoo!";

    }

    //Using lambda Expressions
    public static String bumpsLambda(final String road) {
        return road.chars().filter(ch -> ch =='n').count()>15? "Car Dead" : "Woohoo!";
    }

    public static void main(String[] args) {
        System.out.println(bumps("n"));
    }

}
