package com.goldenstudios.codingchallenges.codewars.easy;

public class FakeBinary {

    public static String fakeBin(String num){

        char[] a = new char[num.length()];

        for(int i =0;i<num.length();i++)
        {
            if(Integer.parseInt(String.valueOf(num.charAt(i))) <5)
            {
                a[i] = '0';
            }
            else
            {
                a[i] = '1';
            }
        }

        return String.valueOf(a);
    }

    public static void main(String[] args)
    {
        System.out.println(fakeBin("0123456789"));
    }

}
