package com.goldenstudios.codingchallenges.codewars.easy;

public class TriangleTester {

    public static boolean isTriangle(int a, int b, int c)
    {
        //check for each pair of side lengths added together are greater than the third with each
        boolean c1 = (a+b)>c;
        boolean c2 = (b+c)>a;
        boolean c3 = (c+a)>b;

        if( c1 && c2 && c3 ) return true;
        return false;
    }

    public  static void main(String[] args)
    {

        System.out.println(isTriangle(1,2,3));
        System.out.println(isTriangle(6,6,6));
        System.out.println(isTriangle(4,5,4));

    }

}
