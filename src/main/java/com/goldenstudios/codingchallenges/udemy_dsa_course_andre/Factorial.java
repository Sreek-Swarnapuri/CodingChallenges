package com.goldenstudios.codingchallenges.udemy_dsa_course_andre;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(new Factorial().findFactorialRecursively(5));
        System.out.println(new Factorial().findFactorialRecursively(8));
        System.out.println(new Factorial().findFactorialRecursively(25));
        System.out.println(new Factorial().findFactorialRecursively(26));
        System.out.println(new Factorial().findFactorialRecursively(27));
        System.out.println(new Factorial().findFactorialRecursively(28));
        System.out.println(new Factorial().findFactorialRecursively(29));

    }

    public long findFactorialRecursively(long factorialNumber) {

        if(factorialNumber == 1)
            return factorialNumber;

        return factorialNumber * (findFactorialRecursively(factorialNumber - 1));
    }
}
