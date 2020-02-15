package com.goldenstudios.codingchallenges.codewars.easy;

public class XO {

    public static boolean getXO(String arg)
    {

        boolean output = false;

        int oCount=0, xCount=0;

        arg = arg.toLowerCase();

        for(int i =0; i < arg.length();i++)
        {
            if(arg.charAt(i) == 'x') xCount++;
            if(arg.charAt(i) == 'o') oCount++;
        }

        if(xCount == oCount) output = true;

        return output;
    }

    public static void main(String[] args)
    {
        System.out.println("Hello Code Wars!");
        System.out.println(getXO("ooxx"));
        System.out.println(getXO("xooxx"));
        System.out.println(getXO("ooxXm"));
        System.out.println(getXO("zpzpzpp"));
        System.out.println(getXO("zzoo"));
    }
}
