package com.goldenstudios.codingchallenges.udemy_dsa_course_andre;

public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("0 - " + fibonacci.fibonacciRecursive(0));
        System.out.println("1 - " + fibonacci.fibonacciRecursive(1));
        System.out.println("2 - " + fibonacci.fibonacciRecursive(2));
        System.out.println("3 - " + fibonacci.fibonacciRecursive(3));
        System.out.println("4 - " + fibonacci.fibonacciRecursive(4));
        System.out.println("5 - " + fibonacci.fibonacciRecursive(5));
        System.out.println("6 - " + fibonacci.fibonacciRecursive(6));
    }

    public int fibonacciRecursive(int n) {
        if(n < 2)
            return n;

        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }



}
