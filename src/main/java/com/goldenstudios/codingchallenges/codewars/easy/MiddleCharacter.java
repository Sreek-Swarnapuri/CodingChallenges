package com.goldenstudios.codingchallenges.codewars.easy;

public class MiddleCharacter {

    /* Problem statement:

    You are going to be given a word. Your job is to return the middle character of the word.
    If the word's length is odd, return the middle character.
    If the word's length is even, return the middle 2 characters.

    #Examples:
    Kata.getMiddle("test") should return "es"
    Kata.getMiddle("testing") should return "t"
    Kata.getMiddle("middle") should return "dd"
    Kata.getMiddle("A") should return "A"

     */

    //My version
    public static String getMiddle(String word){

        String ret;

        int mIndex = word.length() / 2;


        if(word.length() % 2 ==0)
            ret = String.valueOf(word.charAt(mIndex-1)) + String.valueOf(word.charAt(mIndex)) ;
        else
            ret = String.valueOf(word.charAt(mIndex));

        return ret;
    }



    public static void main(String[] args){

        System.out.println(getMiddle("abcd"));
        System.out.println(getMiddle("abcde"));
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("A"));
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("testing"));

    }




}
