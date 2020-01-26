package com.goldenstudios.codingchallenges.codewars.easy;

import java.util.Arrays;

public class FormTheMinimum {
    /*
    Given a list of digits, return the smallest number that could be formed from these digits, using the digits only once (ignore duplicates).

    Notes:
    Only positive integers will be passed to the function (> 0 ), no negatives or zeros.
    Input >> Output Examples
    minValue ({1, 3, 1})  ==> return (13)
    Explanation:
    (13) is the minimum number could be formed from {1, 3, 1} , Without duplications

    minValue({5, 7, 5, 9, 7})  ==> return (579)
    Explanation:
    (579) is the minimum number could be formed from {5, 7, 5, 9, 7} , Without duplications

    minValue({1, 9, 3, 1, 7, 4, 6, 6, 7}) return  ==> (134679)
    Explanation:
    (134679) is the minimum number could be formed from {1, 9, 3, 1, 7, 4, 6, 6, 7} , Without duplications
     */

    //Crude method
    public static int minValueWithArraySort(int[] values)
    {

        Arrays.sort(values);

        int prev = values[0];
        int f = prev;

        for (int x: values
             ) {

            if(x>prev) {
                f = 10 * f + x;
                prev = x;
            }

        }

        return f;

    }

    //Crude method
    public static int minValue(int[] values)
    {

        int prev = values[0];
        int f = prev;
        // 5 4 7 5 9
        for (int x: values
        ) {

            if(x>prev) {
                f = 10 * f + x;
                prev = x;
            }
            else if(x<prev){
                f = 10*x + f;
                prev = x;
            }

        }

        return f;

    }

    public static void main(String args[]){

        System.out.println(minValueWithArraySort(new int[]{4,2,5,1,2,3,3,3}));
        System.out.println(minValue(new int[]{4,2,5,1,2,3,3,3}));
    }



}
